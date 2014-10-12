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
 
type0:
  IDENTIFIER ('[' ']')*
;
type:
  type0  ->  TYPE[$type0.text]
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
  IDENTIFIER '(' arguments ')'  ->  ^(CALL IDENTIFIER ARGUMENTS)
;

arrayIndex0:
  '['  ->  INDEX["[]"]
;
lvalue:  
  IDENTIFIER (arrayIndex0^ rvalue ']'!)*
| IDENTIFIER
;
 
rvalue:
  logic
;
 
multiplex:
  term (( '*' | '/' )^ term)*
;
 
add:
  multiplex (('+' | '-')^ multiplex)*
;
 
logic:
  add (('==' | '!=' | '>' | '<' | '>=' | '<=')^ add)?
; 
 
expression:
  lvalue '='^ rvalue ';'!
| functionCall ';'!
| RETURN^ rvalue ';'!
| IF^ '('! rvalue ')'! expression (ELSE! expression)?
| WHILE^ '('! rvalue ')'! expression
| '{'! expressionsList '}'!
;
 
expressionsList:
  (expression ';'*)*  ->  ^(BLOCK expression*)
;

argumentDeclaration:
  type IDENTIFIER^
;
argumentsDeclaration:
  (argumentDeclaration (',' argumentDeclaration)*)?  ->  ^(SEMANTIC argumentDeclaration*)
;
functionDeclaration:
  type IDENTIFIER '(' argumentsDeclaration ')' '{' expressionsList '}' ';'*
    ->  ^(FUNCTION IDENTIFIER type argumentsDeclaration expressionsList)
;
 
importDeclaration:
  '#include' (s1=STRING | s2=INCLUDE_STRING)  ->  ^(INCLUDE $s1? $s2?)
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
