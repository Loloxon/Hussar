grammar hsr;

//tokens
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

IF_SYM: 'if';
FOR_SYM: 'for';
WHILE_SYM: 'while';
PRINT_SYM: 'print';

//utility tokens
LETTER: [a-zA-Z];
NUMBER: [1-9][0-9]*;

ID_NAME: LETTER (NUMBER | LETTER | '_')*;
ID_NUMBER: 'liczba';
ID_CHAR: 'litera';
ID_STRING: 'wyraz';
//ID_ARRAY: 'lista';

DOT_SYM: '.';
COMA_SYM: ',';
COLON_SYM: ':';
SEMICOLON_SYM: ';';
APOSTROPHE_SYM: '\'';
L_ARROW_SYM: '<-';
R_ARROW_SYM: '->';

//unknown(Color.PURPLE_BACKGROUND.colorCode, ""),
//blank(Color.RESET.colorCode, " "),
//EOF(Color.RESET.colorCode, "");

program_sym: start_expr hussar_expr* end_expr EOF;

end_expr: DOT_SYM;

start_expr: 'zacznij';

hussar_expr: var_decl | loop_expr | math_expr;

var_decl: ID_NUMBER | ID_CHAR | ID_STRING ID_NAME;

math_symbol: MULTIPLICATION | POWER | PLUS | MINUS | DIVIDE;

math_expr: math_expr math_symbol math_expr | NUMBER;

loop_expr: IF_SYM if_condition then_sym hussar_expr end_expr|
           FOR_SYM for_condition then_sym hussar_expr end_expr |
           WHILE_SYM while_condition then_sym hussar_expr end_expr;

if_condition: ' ';

for_condition: NUMBER R_ARROW_SYM NUMBER;

while_condition: ' ';

then_sym: COLON_SYM;




