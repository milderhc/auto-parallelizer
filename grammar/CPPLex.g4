lexer grammar CPPLex;

ID                      : [a-zA-Z][a-zA-Z0-9_]* ;
//LIB                     : [<][a-zA-Z][a-zA-Z0-9_]*([.][a-z]+)?[>] ;

COMMENT                 : '/*' .*? '*/' -> skip ;
LINE_COMMENT            : '//' ~[\r\n]* -> skip ;
WS                      : [ \t\r\n]+ -> skip ;