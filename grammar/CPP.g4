grammar CPP;
import CPPLex;

// TODO
// namespaces
// using namespaces
// ::

cpp                     : global* main global* EOF ;

global                  : include
                        | typedef
                        | structClass
                        | assignmentBlock
                        //                        | define
                        | declarationBlock
                        | function
                        ;

id                      : '*'* ('&&' | '&')? ID ;
include                 : '#' 'include' '<' ID ('.' ID)? '>' ;
typedef                 : 'typedef' datatype ID ';';

datatype                : id ('<' datatype '>')?
                        | 'unsigned'? integerType
                        | floatType
                        | boolType
                        ;

template                : 'template' '<' ('class' | 'typename') id '>' ;
function                : template? datatype id '(' parameters? ')' functionRem
                        | 'void' id '(' parameters? ')' functionBody
                        ;
functionRem             : functionBody
                        | ';'
                        ;
functionBody            : '{' instruction* '}' ;

parameters              : datatype id (',' datatype id)* ;

structClass             : template? ('struct' | 'class') id inheritance?
                          structClassBody ;

inheritance             : ':' encapsulation? id ('<' datatype '>')?
                         (',' encapsulation? id ('<' datatype '>')?)* ;
encapsulation           : 'private' | 'protected' | 'public' ;
structClassBody         : '{' globalClass* '}' ';' ;
globalClass             : encapsulation ':'
                        | classConstructor
                        | global
                        ;
classConstructor        : ID '(' parameters? ')'
                          (':' id '(' expression ')' (',' id '(' expression ')')*)? scope ;

integerType             : 'char' | 'short' | 'int' | 'long' | 'long' 'long' ;
floatType               : 'float' | 'double' | 'long' 'double' ;
boolType                : 'bool' ;

instruction             : declarationBlock
                        | assignmentBlock
                        | ifBlock
                        | whileBlock
                        | doWhileBlock
                        | forBlock
                        | switchBlock
                        | callSomething ';'
                        | scope
                        | ';'
                        | 'break' ';'
                        | 'continue' ';'
                        | 'return' expression? ';'
                        ;

scope                   : '{' instruction* '}' ;

declarationBlock        : 'const'? 'static'? declaration ';' ;
declaration             : datatype id declarationType? (',' id declarationType?)* ;
declarationType         : properAssignment
                        | '(' expression (',' expression)* ')'
                        | ('[' expression? ']')+
                        ;

assignmentBlock         : assignment (',' assignment)* ';' ;

ifBlock                 : 'if' '(' expression ')' controlStructureBody
                          ('else' controlStructureBody)? ;

whileBlock              : 'while' '(' expression ')' controlStructureBody ;
doWhileBlock            : 'do' doWhileBody 'while' '(' expression ')' ';' ;
doWhileBody             : scope
                        | instruction
                        ;

forBlock                : 'for' '(' forExpression? ';' expression? ';' forExpression? ')'
                          controlStructureBody ;
forExpression           : primaryExpression (',' primaryExpression)* ;

switchBlock             : 'switch' '(' primaryExpression ')' switchBody ;
switchBody              : instruction
                        | '{' switchInstruction* ('default' ':' instruction+)? '}'
                        ;
switchInstruction       : instruction
                        | 'case' primaryExpression ':'
                        | 'break' ';'
                        ;

primaryExpression       : expression
                        | assignment
                        | declaration
                        ;

controlStructureBody    : scope
                        | instruction
                        | ';'
                        ;

//                        | '.' '->' '[]'

assignment              : callSomething properAssignment ;
properAssignment        : (assignmentOp callSomething)* assignmentOp expression ;

expression              : expression binOp expression
                        | assignment
                        | unOp1 expression
                        | unOp2 expression2
                        | expression2
                        ;

expression2             : '(' expression ')'
                        | datatype ('(' functionArguments? ')')? ('[' expression ']')*
                        | value
                        | callSomething
                        | 'sizeof' expression
                        | '(' datatype ')' expression
                        ;

callSomething           : id callFunction? (accessBrackets? accessOp callSomething)? accessBrackets* increaseOp?;
callFunction            : '(' functionArguments? ')' ;
functionArguments       : expression (',' expression)* ;

value                   : INT | LONG | LONGLONG | CHAR | BOOL | DOUBLE | STRING ;

accessOp                : '.' | '->' ;
accessBrackets          : ('[' expression ']')+  ;

binOp                   : '==' | '!=' | '<' | '>' | '<=' | '>='
                        | '+' | '-' | '*' | '/'
                        | '>>' | '<<' | '&' | '|' | '^' | 'and' | 'or' | 'xor'
                        | '&&' | '||' ;

assignmentOp            : '=' | '+=' | '-=' | '/=' | '*='
                        | '&=' | '|=' | '^=' | '>>=' | '<<=' ;

unOp1                   : '!' | '~' ;
unOp2                   : '-' | '+' | increaseOp ;

increaseOp              : '--' | '++' ;

main                    : 'int'? 'main' '(' parameters? ')' functionBody ;





