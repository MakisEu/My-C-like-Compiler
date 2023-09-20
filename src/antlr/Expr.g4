grammar Expr;

@header{
	package antlr;
}

//Start variables
prog: '{' decls stmts '}' + EOF  					# Program
	;
decls: decls decl                                   
	|												
	;
decl:  VAR  ID vars ':' type ';' 
	;

vars: ',' ID vars                                   
	|												
	;

type: INT                                           
	;

stmts: stmts stmt									
	|												
	;
stmt: simp ';'										
	| control										
	| ';'											
	;
simp: ID asop exp                                   # AssignExp
	| PRINT exp										# PrintExp
	;
control: IF '(' exp ')' block elseblck				# IfStatement
	   | WHILE '(' exp ')'  block					# WhileStatement
	   | FOR '(' simp ';' exp ';' simp ')' block	# ForStatement
	   | CONTINUE ';'								# ContCommand
	   | BREAK ';'									# BreakCommand
	   ;
elseblck: ELSE block
		| 
		;
block: stmt
	 | '{' stmts '}'
	 ;
exp: '(' exp ')'									# pexp 
   | NUMBER 										# Num
   | ID												# Variable
   | '!' exp										# unopNotExp
   | '-' exp										# unopRSExp   
   | exp ('*' | '/' | '%') exp						# binopMulDiVModExp
   | exp ('+' | '-') exp							# binopPlusMinExp
   | exp ('<' | GREATEREQUAL|LESSEREQUAL | '>') exp	# binopCompExp
   | exp (EQUALS | NOTEQUALS) exp					# binopEqNeqExp
   | exp AND exp									# binopAndExp
   | exp OR exp										# binopOrExp
   ;
   
asop: MULTIPLYEQUAL									
	| DIVIDEQUAL									
	| REMAINDEREQUAL								
	| PLUSEQUAL										
	| MINUSEQUAL									
	| '='											
	;

//Start tokens


INT: 'int';
VAR: 'var';
PRINT: 'print';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
CONTINUE: 'continue';
BREAK: 'break';
PLUSEQUAL: '+=';
MINUSEQUAL: '-=';
MULTIPLYEQUAL: '*=';
DIVIDEQUAL:  '/=';
REMAINDEREQUAL:  '%=';
GREATEREQUAL: '>=';
LESSEREQUAL: '<=';
EQUALS: '==';
NOTEQUALS: '!=';
AND: '&&';
OR: '||';

ID: [a-z][a-zA-Z0-9_]*;
NUMBER: '0' | '-'?[1-9][0-9]*;

COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n]+ -> skip;