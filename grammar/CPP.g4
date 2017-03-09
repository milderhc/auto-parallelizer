grammar CPP;
import CPPLex;

cpp                     : global* main global* EOF ;

global                  : globalstatements
                        | func
                        ;

globalstatements        : include                                       //# include
                        | typedef                                       //# typedef
//                        | define
//                        | assignment
                        ;

include                 : '#' 'include' '<' ID ('.' ID)? '>' ;
typedef                 : 'typedef' datatype ID ';';

datatype                : ID ('<' datatype '>')?
                        | 'unsigned'? integer_type
                        | float_type
                        | bool_type
                        ;

template                : 'template' '<' ('class' | 'typename') ID '>' ;
func                    : template? datatype ID '(' parameters? ')' func_rem
                        | 'void' ID '(' parameters? ')' func_body
                        ;
func_rem                : func_body
                        | ';'
                        ;
func_body               : '{' instruction '}' ;

parameters              : datatype ID (',' datatype parameter_type ID)* ;
parameter_type          : '&' | '*' | '**' | ;

integer_type            : 'char' | 'short' | 'int' | 'long' | 'long' 'long' ;
float_type              : 'float' | 'double' | 'long' 'double' ;
bool_type               : 'bool' ;

instruction             : 'hola' ;

main                    : 'int'? 'main' '(' parameters? ')' func_body ;





