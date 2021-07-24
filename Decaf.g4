grammar Decaf;

/*
 * Lexer Rules
 */

// Keyword specification

IF                  : 'if';

ELSE                : 'else';

FOR                 : 'for';

WHILE               : 'while';

BREAK               : 'break';

CONTINUE            : 'continue';

CHAR                : 'char';

STRING              : 'string';

CALLOUT             : 'callout';

// Symbol Specification

QUOTES              : '"';

APOSTROPHE          : '\'';


// Variable names & literal specification

ID                  : ALPHA ALPHA_NUM*; // for variable name

ALPHA      : [a-zA-Z_];

CHAR_LITERAL        : APOSTROPHE ( '\\' [btnfr"'\\] | ~[\r\n\\"] ) APOSTROPHE;

DECIMAL_LITERAL     : [0-9]+;

DIGIT      : [0-9];

HEX_LITERAL         : '0'[xX][0-9a-fA-F]+;

BOOL_LITERAL        : 'True' | 'False';

STRING_LITERAL      : '"' ( '\\' [btnfr"'\\] | ~[\r\n\\"] )* '"';

ALPHA_NUM           : ALPHA | DIGIT;

HEX_DIGIT  : '0'[xX]([0-9] | [a-fA-F]);

LINE_COMMENT        : '//' .*? '\n' -> skip; // skip single line comments starting from // and ending with new line

COMMENT             : '/*' .*? '*/' -> skip; // skip mutliple comments

//SPACE               : ' ' -> skip; // ignore spaces

NEWLINE				: ('\r'? '\n' | '\r')+ -> skip;


/*
 * Parser Rules
 */

program		    : 'class Program{' field_declr* method_declr* '}';

vardeclr            : (var_type field_var) (',' var_type field_var)* ';';

field_declr         : var_type field_var (',' field_var)* ';';

array_id            : ID '[' int_literal ']';

field_var           : var_id | array_id;

var_id              : ID;

method_declr        : return_type method_name '(' ((var_type var_id) (',' var_type var_id)*)? ')' block;

return_type         : (var_type | 'void');

block               : '{' vardeclr* statement* '}';

statement           : location assign_op expr
                    | location assign_op expr ';'
                    | method_call
                    | IF '(' expr ')' block (ELSE block)?
                    | WHILE '(' expr ')' block
                    | var_id '=' expr ';'
                    | 'return' expr ';'
                    // ending value can be a variable or integer literal
                    | FOR '(' var_id ('=' int_literal)? ',' ((var_id ('=' int_literal)?) | int_literal) ')' block
                    | BREAK ';';

// intermediate rule for method call
method_call_inter   : method_name '(' (expr (',' expr)*)? ')';

method_call         : method_call_inter
                    | method_call_inter ';'
                    | CALLOUT '(' STRING_LITERAL (',' callout_arg (',' callout_arg)*)? ')' ';';

expr                : location
                    | literal
                    | expr bin_op expr
                    | '-' expr
                    | method_call
                    | '!' expr
                    | '(' expr ')';

location            : var_id | array_id;

callout_arg         : expr | STRING_LITERAL;

int_literal         : DECIMAL_LITERAL | HEX_LITERAL;

rel_op              : '>' | '<' | '<=' | '>=';

eq_op               : '==' | '!=';

cond_op             : '&&' | '||';

literal             : int_literal | CHAR_LITERAL | BOOL_LITERAL;

bin_op              : arith_op | rel_op | eq_op | cond_op;

arith_op            : '+' | '-' | '*' | '/' | '%';

var_type            : 'int' | 'boolean';

assign_op           : '='
                    | '+='
                    | '-=';

method_name         : ID;

// recognize the whitespace at the end to prevent string concatenation due to elemination of all sapces
WHITESPACE			: [ \t\r\n] -> skip ;

