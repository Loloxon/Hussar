grammar hussar;

//tokens
WHITESPACE: [ \t\r\n] -> skip;
PASS: 'nic';

PLUS: '+';
MINUS: '-';
INCREMENT: '++';
DECREMENT: '--';
MULTIPLICATION: '*';
DIVIDE: '/';
POWER: '^';

EQ: '=';
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
//ID_ARRAY: 'lista';

DOT_SYM: '.';
COMA_SYM: ',';
COLON_SYM: ':';
SEMICOLON_SYM: ';';
APOSTROPHE_SYM: '\'';
L_ARROW_SYM: '<-';
R_ARROW_SYM: '->';

CHAR: '"'[a-zA-Z]'"';
STRING: '"'[a-zA-Z0-9 \t\r\n]+'"';
INT: {'-'}[1-9][0-9]*;

program_sym: start_block hussar_expr* end_block EOF;

start_block: 'zacznij' then_sym |
            IF_SYM condition then_sym |
            FOR_SYM for_range then_sym |
            WHILE_SYM condition then_sym;

end_block: DOT_SYM;

hussar_expr: var_decl | loop_expr | math_expr | print | PASS;

var_decl: int_decl | char_decl | string_decl;

int_decl: ID_NUMBER ID_NAME (EQ math_expr)?;

char_decl: ID_CHAR ID_NAME (EQ CHAR)?;

string_decl: ID_STRING ID_NAME (EQ STRING)?;

math_symbol: MULTIPLICATION | POWER | PLUS | MINUS | DIVIDE;

math_expr: L_BRACKET math_expr R_BRACKET | math_expr math_symbol math_expr | INT;

loop_expr: start_block hussar_expr* end_block;

then_sym: COLON_SYM;

compare_sym: EQ |
             LESSER |
             LESSEREQ |
             GREATER |
             GREATEREQ;

condition: math_expr compare_sym math_expr;

for_range: INT R_ARROW_SYM INT;

print: PRINT_SYM L_BRACKET (STRING | math_expr | CHAR | ID_NAME) R_BRACKET;


