grammar hussar;

//tokens
WHITESPACE: [ \t\r\n] -> skip;
PASS: 'nic';
BEGIN: 'zacznij';
NEWLINE: 'enter' | 'Enter' | 'ENTER';

PLUS: '+';
MINUS: '-';
MOD: ' modulo ';
INCREMENT: '++';
DECREMENT: '--';
MULTIPLICATION: '*';
DIVIDE: '/';
POWER: '^';

EQ: '=';
NOTEQ: '/=';
LESSER: '<';
LESSEREQ: '<=';
GREATER: '>';
GREATEREQ: '>=';

L_BRACKET: '(';
R_BRACKET: ')';
L_BUCKLE: '{';
R_BUCKLE: '}';

IF_SYM: 'czy' | 'jezeli';
FOR_SYM: 'dla';
WHILE_SYM: 'dopoki';
PRINT_SYM: 'pokaz';

ID_NAME: [a-zA-Z] ([a-zA-Z0-9] | '_')*;
ID_NUMBER: 'liczba ';
ID_CHAR: 'litera ' | 'znak ';
ID_STRING: 'slowo ' | 'wyraz ';

REDECLARATION: 'zmien ';
REDECLARATION_TO: 'na ';
//ID_ARRAY: 'lista';

DOT_SYM: '.';
COMA_SYM: ',';
COLON_SYM: ':';
SEMICOLON_SYM: ';';
APOSTROPHE_SYM: '\'';
L_ARROW_SYM: '<-';
R_ARROW_SYM: '->';

INT: ('-')?[0-9]+;
CHAR: '"'[a-zA-Z]'"';
STRING: '"'[a-zA-Z0-9 \t\r\n]+'"';

program_sym: start_block hussar_expr* end_block EOF;

start_block: BEGIN then_sym |
            IF_SYM condition then_sym |
            FOR_SYM for_range then_sym |
            WHILE_SYM condition then_sym;

end_block: DOT_SYM;

hussar_expr: var_decl | var_redecl | loop_expr | supreme_math_expr | print | PASS;

var_decl: int_decl | char_decl | string_decl;

int_decl: ID_NUMBER ID_NAME (EQ supreme_math_expr)?;

char_decl: ID_CHAR ID_NAME (EQ CHAR)?;

string_decl: ID_STRING ID_NAME (EQ STRING)?;

var_redecl: REDECLARATION ID_NAME REDECLARATION_TO (int_redecl | char_redecl | string_redecl);

int_redecl: supreme_math_expr;
char_redecl: CHAR;
string_redecl: STRING;

math_symbol_prio0: PLUS | MINUS | MOD;
math_symbol_prio1: MULTIPLICATION | DIVIDE;
math_symbol_prio2: POWER ;

start_bracket: L_BRACKET;
end_bracket: R_BRACKET;
start_bracket_fake_power: ;
end_bracket_fake: ;
end_semicolon: ;
base: INT | ID_NAME | start_bracket math_expr end_bracket;
//factor: base (math_symbol_prio2 base)*;
factor: base | start_bracket_fake_power base math_symbol_prio2 base end_bracket_fake;
component: factor (math_symbol_prio1 factor)*;
math_expr: component (math_symbol_prio0? component)*;
supreme_math_expr: math_expr end_semicolon;

loop_expr: start_block hussar_expr* end_block;

then_sym: COLON_SYM;

is_equal: EQ;

compare_sym: is_equal |
             NOTEQ |
             LESSER |
             LESSEREQ |
             GREATER |
             GREATEREQ;

condition: math_expr compare_sym math_expr;

for_range: INT R_ARROW_SYM INT;

print_separator: COMA_SYM;

print_string: STRING;

print_char: CHAR;

print_newline: NEWLINE;

print: PRINT_SYM L_BRACKET (print_string | math_expr | print_char | print_newline)
(print_separator (print_string | math_expr | print_char | print_newline))* R_BRACKET end_bracket_fake end_semicolon;


