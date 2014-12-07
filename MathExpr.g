grammar MathExpr;
 
options {
  language=Java;
  output=AST;
  ASTLabelType = Ast.AstNode;
  backtrack=true;
  memoize=true;
}


tokens {
  UNKNOWN                   ;
  BLOCK                     ;
  PARAMS                    ;
  CALL                      ;
  CONVERT                   ;
  IF          = 'if'        ;
  ELSE        = 'else'      ;
  FOR         = 'for'       ;
  WHILE       = 'while'     ;
  AND         = '&&'        ;
  OR          = '||'        ;
  NOT         = '!'         ;
  XOR         = 'xor'       ;
  INT_DIV     = 'div'       ;
  INT_MOD     = 'mod'       ;
  SHR         = 'shr'       ;
  SHL         = 'shl'       ;
  IN          = 'in'        ;
  VAR         = 'var'       ;
  RETURN      = 'return'    ;
  ARRAY       = 'array'	    ;
  FUNCTION    = 'function'  ;
  PROGRAM     = 'program'   ;
  TRUE        = 'true'      ;
  FALSE       = 'false'     ;
  DO	      = 'do'    	;
  COUNT       = 'count'     ;
}

WS: ( ' ' | '\t' | '\f' | '\r' | '\n' )+ { $channel=HIDDEN;} ;


COMMENT: '/*' ( options { greedy=false; } : . )* '*/' { $channel=HIDDEN;} ;

fragment DIGIT: '0'..'9';
fragment LETTER: 'a'..'z' | 'A'..'Z' | '_' ;

NUMBER: DIGIT+ ('.' DIGIT+)? ;
STRING: '"' ('\\"' | '\\\\' | ~'"')* '"' ;

IDENTIFIER: LETTER (LETTER | DIGIT)*;

ADD:      '+'   ;
SUB:      '-'   ;
MUL:      '*'   ;
DIV:      '/'   ;
BIT_AND:  '&'   ;
BIT_OR:   '|'   ;
ASSIGN:	  '='   ;
NOTEQUALS:'!='  ;
EQUALS:   '=='  ;
GT:       '>'   ;
LT:       '<'   ;
GE:       '>='  ;
LE:       '<='  ;


identifier: IDENTIFIER ;

group:
  '('! term ')'!
  | DIGIT
  | TRUE
  | FALSE
  | identifier
  | call
;

parameters: ( term (','! term)* )?  ;

call: identifier '(' parameters ')'  -> ^(CALL identifier ^(PARAMS parameters?)) ;

not_logic:   group | NOT^ not_logic ;

multiplex:  not_logic ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD )^ not_logic )*  ;

add:   multiplex  ( ( ADD | SUB | BIT_OR )^ multiplex  )*                   ;

compare: add ( ( GE | LE |  NOTEQUALS | EQUALS | GT | LT )^ add )?   ;

and_logic: compare ( AND^ compare )*    ;

or_logic: and_logic ( OR^ and_logic )*  ;

term: or_logic  ;

varDeclaration: identifier (ASSIGN^ term)?;

varsDeclaration: identifier varDeclaration ( ',' varDeclaration )* -> ^(VAR ^(identifier varDeclaration+)) ;


blockExpr: '{'! expressionsList '}'! ;

termOrTrue:
  term
  | ( ) -> TRUE
;

expressionBase:
  identifier ASSIGN^ term
| call
| varsDeclaration
;

expression:
  expressionBase ';'!
| IF^ '('! term ')'! expression (ELSE! expression)?
| WHILE^ '('! term ')'! expression
| FOR^ '('! expressionsList2 ';'! termOrTrue ';'! expressionsList2 ')'! expression
| DO^ expression WHILE '(' term ')' -> ^(DO expression ^(WHILE term ))
| RETURN^ term ';'!
| call ';'!
| blockExpr
| array_declaration
;

expressionsList: ( expression ( ';'* expression )* )? ';'*  ->  ^(BLOCK expression*)  ;
expressionsList2: ( expressionBase ( ',' expressionBase )* )?  ->  ^(BLOCK expressionBase*)  ;

array_type: identifier '[' term? ']' -> ^(ARRAY identifier ^(COUNT term?) );
array_initialising: identifier ('<' term (',' term)* '>')? -> ^(identifier term*);
array_declaration:
  array_type array_initialising (',' array_initialising)* -> ^(array_type array_initialising+)
;

parameterDeclaration: identifier^ identifier ;
parametersDeclaration: parameterDeclaration ( ','! parameterDeclaration )* ;
func_return_type: identifier;
functionDeclaration:
 func_return_type identifier '(' parametersDeclaration? ')'
  '{' expressionsList '}'
  -> ^(FUNCTION func_return_type identifier ^(PARAMS parametersDeclaration?) expressionsList)
;

expressionOrFunctionDeclaration: functionDeclaration | expression ;

program: ( expressionOrFunctionDeclaration ';'!* )* ;

result: program -> ^(PROGRAM program) ;

execute:
  result
;

