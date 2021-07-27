grammar Decaf;

/*
 * Reglas lexicas
 */

// Palabras clave

IF                  : 'if';

ELSE                : 'else';

FOR                 : 'for';

WHILE               : 'while';

BREAK               : 'break';

CONTINUE            : 'continue';

CHAR                : 'char';

STRING              : 'string';


// Simbolos de apostrofe y comillas

QUOTES              : '"';

APOSTROPHE          : '\'';


// Nombres de variables

ID                  : ALPHA ALPHA_NUM*; 

ALPHA      : [a-zA-Z_];

CHAR_LITERAL        : APOSTROPHE ( '\\' [btnfr"'\\] | ~[\r\n\\"] ) APOSTROPHE;

DECIMAL_LITERAL     : [0-9]+;

DIGIT      : [0-9];

HEX_LITERAL         : '0'[xX][0-9a-fA-F]+;

BOOL_LITERAL        : 'True' | 'False';

STRING_LITERAL      : '"' ( '\\' [btnfr"'\\] | ~[\r\n\\"] )* '"';

ALPHA_NUM           : ALPHA | DIGIT;

HEX_DIGIT  : '0'[xX]([0-9] | [a-fA-F]);

LINE_COMMENT        : '//' .*? '\n' -> skip;

COMMENT             : '/*' .*? '*/' -> skip; 

NEWLINE				: ('\r'? '\n' | '\r')+ -> skip;


/*
 * Parser Rules
 */

program		    : 'class' 'Program' '{' (declaration)* '}';

declaration     : structDeclaration | method_declr | field_declr | vardeclr ;

vardeclr            : (var_type field_var) (',' var_type field_var)* ';';

field_declr         : var_type field_var (',' field_var)* ';';

array_id            : ID '[' literal ']';

field_var           : var_id | array_id;

var_id              : ID;

structDeclaration   : 'struct' var_id '{' (vardeclr)* '}' ';';

method_declr        : return_type method_name '(' ((var_type (var_id)?) (',' var_type var_id)*)? ')' block;

return_type         : (var_type | 'void');

block               : '{' vardeclr* statement* '}';

statement           : location assign_op expr
                    | location assign_op expr ';'
                    | method_call
                    | IF '(' expr ')' block (ELSE block)?
                    | WHILE '(' expr ')' block
                    | location '=' expr ';'
                    | 'return' expr ';'
                    | FOR '(' var_id ('=' int_literal)? ',' ((var_id ('=' int_literal)?) | int_literal) ')' block
                    | BREAK ';';

method_call_inter   : method_name '(' (expr (',' expr)*)? ')';

method_call         : method_call_inter
                    | method_call_inter ';'
                    | 'callout' '(' STRING_LITERAL (',' callout_arg (',' callout_arg)*)? ')' ';';

expr                : location
                    | literal
                    | expr bin_op expr
                    | '-' expr
                    | method_call
                    | '!' expr
                    | '(' expr ')';

location            : (var_id | array_id )('.' location)?;

callout_arg         : expr | STRING_LITERAL;

int_literal         : DECIMAL_LITERAL | HEX_LITERAL;

rel_op              : '>' | '<' | '<=' | '>=';

eq_op               : '==' | '!=';

cond_op             : '&&' | '||';

literal             : int_literal | CHAR_LITERAL | BOOL_LITERAL | var_id;

bin_op              : arith_op | rel_op | eq_op | cond_op;

arith_op            : '+' | '-' | '*' | '/' | '%';

var_type            : 'int' | 'boolean' | 'void' | 'struct' var_id | structDeclaration;

assign_op           : '='
                    | '+='
                    | '-=';

method_name         : ID;

WHITESPACE			: [ \t\r\n] -> skip ;

