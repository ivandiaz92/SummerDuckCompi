grammar summerDuck;


PROG: 'programa';
MAIN: 'principal';
INT: 'entero';
FLOAT: 'real';
CHAR: 'char';
BOOL: 'boleano';
RETURN: 'regresa';
FUNCTION: 'modulo';
IF: 'si';
ELSE: 'sino';
WHILE: 'mientras';
THEN: 'haz';
DO: 'repite';
UNTIL: 'hasta';
SCAN: 'lee';
PRINT: 'escribe';
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
LP: '(';
RP: ')';
LB: '[';
RB: ']';
LK: '{';
RK: '}';
DP: ':';
PC: ';';
COMA: ',';
PUNTO: '.';
MOD: '%';
IGUAL: '=';
MAYOR: '>';
MENOR: '<';
MAYORI: '>=';
MENORI: '<=';
EQUIV: '==';
NEG: '¡';
DIF: '!=';
AND: '&';
OR: '|';

CTE_I: [0-9];
CTE_F: [0-9]* '.' [0-9]+;
CTE_C: '"'[a-zA-Z] '"';
ID: [a-zA-Z0-9]+;

summerduck: PROG ID PC vardec fundef main
	;

main: MAIN LP RP LK vardec statements
	;

vardec:
	| type DP var vardecaux
	;

vardecaux: PC vardec
		 | COMA var vardecaux
		 ;

type: INT
	| FLOAT
	| CHAR
	| BOOL
	;

var: ID varaux
	;

varaux:
	  | LB CTE_I RB varaux
	  ;

fundef:
	| FUNCTION type ID LP params RP PC LK vardec statements RETURN LP exp RP PC RK fundef
	;

params:
	| paramsaux
	;

paramsaux: type DP var paramsaux2
		;

paramsaux2:
		| COMA paramsaux
		;

statements:
		| var IGUAL exp PC statements
		| leer
		| escribir
		| ifelse
		| while_statement
		| dowhile
		;

leer: SCAN LP leeraux RP PC
	;

leeraux: var leeraux2
	;

leeraux2:
		| COMA leeraux
		;

escribir: PRINT LP exp RP PC
		;

ifelse: IF LP exp RP LK statements RK ifelseaux
	;

ifelseaux:
		| ELSE LK statements RK
		;

while_statement: WHILE LP exp RP THEN RK statements LK
		;

dowhile: DO LK statements RK UNTIL LP exp RP PC
		;

exp: exor expaux
	;

expaux:
	| AND exp
	;

exor: exnot exoraux
	;

exoraux:
	| OR exor
	;

exnot: exlog exnotaux
	;

exnotaux:
	| NEG  exnot
	;

exlog: exmod exlogaux
	;

exlogaux:
		| MAYOR exlog
		| MENOR exlog
		| MAYORI exlog
		| MENORI exlog
		| EQUIV exlog
		| DIF exlog
		;

exmod: ex exmodaux
	;

exmodaux:
		| MOD exmod
		;

ex: termino exaux
	;

exaux:
	| SUMA ex
	| RESTA ex
	;

termino: factor terminoaux
	;

terminoaux:
		| MULT termino
		| DIV termino
		;

factor:
	| LP exp RP
	| functioncall
	| ID
	| CTE_I
	| CTE_F
	| CTE_C
	;

functioncall: ID LP exp functioncallaux RP
		;

functioncallaux:
		| COMA exp functioncallaux
		;