lexer grammar cplusplusLex;

ID                      : [a-zA-Z][a-zA-Z0-9_]* ;
//LIB                     : [<][a-zA-Z][a-zA-Z0-9_]*([.][a-z]+)?[>] ;
//COMMENT                 : '\??' ~[\r\n]* -> skip ;
WS                      : [ \t\r\n]+ -> skip ;