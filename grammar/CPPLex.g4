lexer grammar CPPLex;

//falta ______
ID                      : [a-zA-Z][a-zA-Z0-9_]* ;

COMMENT                 : '/*' .*? '*/' -> skip ;
LINE_COMMENT            : '//' ~[\r\n]* -> skip ;
WS		                : [ \t\r\n]+ -> skip ;
INT                     : [0-9]+;
LONG                    : [0-9]+[lL];
LONGLONG                : [0-9]+[lL][lL];
CHAR                    : ('\'') (~['\''] | ['\\'a-z]) ('\'');
DOUBLE                  : [0-9]+[.][0-9]+;
BOOL                    : 'true' | 'false' ;
STRING                  : ('\'' | '"') ~['\'"']* ('\'' | '"');