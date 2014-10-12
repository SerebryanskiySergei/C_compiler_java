grammar MathExpr;
 
options {
  language=Java;
  output=AST;
  backtrack=true;
}
 
tokens {
  RETURN = 'return' ;
  IF     = 'if'     ;
  ELSE   = 'else'   ;
  WHILE  = 'while'  ;

  PROGRAM           ;
  INCLUDE           ;
  TYPE              ;
  SEMANTIC          ;
  FUNCTION          ;
  ARGUMENTS         ;
  CALL              ;
  BLOCK             ;
  INDEX             ;
}
 

WS:
  (' ' | '\t' | '\f' | '\r' | '\n')+ { $channel=HIDDEN; }
;
 
fragment DIGIT:
  '0'..'9'
;
 
fragment LETTER:
  'a'..'z' | 'A'..'Z' | '_'
;
 
NUMBER:
  DIGIT+ ('.' DIGIT+)?
;
 
STRING:
  '"' ('\\"' | '\\\\' | ~'"')* '"'
;

INCLUDE_STRING:
  '<' ~'>'* '>'
;
 
IDENTIFIER:
  LETTER (LETTER | DIGIT)*
;

DELIMITER:  ';'     ;

typeBasic:
'int' ('[' ']')*
|'char' ('[' ']')*
|'void'
|'string' ('[' ']')*
|'short' ('[' ']')*
|'long' ('[' ']')*
|'float' ('[' ']')*
|'double' ('[' ']')*
|'signed' ('[' ']')*
|'unsigned' ('[' ']')*
;

type:
  typeBasic  ->  TYPE[$type0.text]
;

term:
  NUMBER
| STRING
| lvalue
| functionCall
| '('! logic ')'!
;
 
arguments:
  (rvalue (',' rvalue)*)?  ->  ^(ARGUMENTS rvalue*)
;
functionCall:
  IDENTIFIER '(' arguments ')'  ->  ^(CALL IDENTIFIER arguments)
;

arrayIndex0:
  '['  ->  INDEX["[]"]
;
lvalue:  
  IDENTIFIER (arrayIndex0^ rvalue ']'!)*
;
 
rvalue:
  logic
;

increment:
IDENTIFIER ('++'|'--')
;

ADD:            '+'     ;
SUB:            '-'     ;
MUL:            '*'     ;
DIV:            '/'     ;
BIT_AND:        '&'     ;
BIT_OR:         '|'     ;
ASSIGN:	        '='     ;
GE_OP:          '>='    ;
LE_OP:          '<='    ;
NEQUALS:        '!='    ;
EQUALS:         '=='    ;
GT:             '>'     ;
LT:             '<'     ;

multiplex:
  term (( MUL | DIV )^ term)*
;
 
add:
  multiplex ((ADD | SUB)^ multiplex)*
;
 
logic:
  add ((EQUALS | NEQUALS | GT | LT | GE_OP | LE_OP)^ add)?
; 
 
expression:
  lvalue ASSIGN^ rvalue DELIMITER !
| type IDENTIFIER
| functionCall DELIMITER !
| RETURN^ rvalue DELIMITER !
| IF^ '('! rvalue ')'! expression (ELSE! expression)?
| FOR^ '('! IDENTIFIER '=' rvalue DELIMITER! rvalue DELIMITER! (add|increment)? DELIMITER! ')' expression
| WHILE^ '('! rvalue ')'! expression
| '{'! expressionsList '}'!
;
 
expressionsList:
  (expression DELIMITER*)*  ->  ^(BLOCK expression*)
;

argumentDeclaration:
  type IDENTIFIER^
;

argumentsDeclaration:
  (argumentDeclaration (',' argumentDeclaration)*)?  ->  ^(SEMANTIC argumentDeclaration*)
;

functionDeclaration:
  type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' DELIMITER*
    ->  ^(FUNCTION IDENTIFIER type argumentsDeclaration expressionsList)
;
 
importDeclaration:
  '#include' (s1=STRING) -> ^(INCLUDE $s1)
;
 
declaration:
  ( functionDeclaration | importDeclaration )
;
 
declarations:
  declaration*
;
 
code:
  declarations
;
 
start:
  code
  EOF
    ->  ^(PROGRAM code)
;
