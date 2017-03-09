grammar cplusplus;
import cplusplusLex;

s                       : global* main global* EOF ;


global                  : globalstatements
                        | func
                        | func_declaration
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


func_sign               : datatype ID '(' parameters? ')'
                        | 'void' ID '(' parameters? ')'
                        ;
func_declaration        : func_sign ';' ;
func_body               : '{' instruction '}' ;
func                    : func_sign func_body ;

parameters              : datatype ID (',' datatype ID)* ;

integer_type            : 'char' | 'short' | 'int' | 'long' | 'long' 'long' ;
float_type              : 'float' | 'double' | 'long' 'double' ;
bool_type               : 'bool' ;

instruction             : 'hola' ;

main                    : 'int'? 'main' '(' parameters? ')' func_body ;





