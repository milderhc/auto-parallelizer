grammar CPP;

//operators
cpp                     : global* mainBlock? EOF ;

mainBlock               : main global* ;

global                  : typedef
                        | structClass
                        | assignmentBlock
                        | declarationBlock
                        | function
                        | namespace
                        | using
                        | ';'
                        | MULTILINEMACRO
                        | DIRECTIVE
                        ;

namespace               : 'namespace' ID '{' global* '}' ;
using                   : 'using' 'namespace'? nestedNamespace ';' ;
nestedNamespace         : ID ('::' ID)* ;

id                      : '*'* ('&&' | '&')? nestedNamespace ;
path                    : ID ('/' ID)* ;
typedef                 : 'typedef' datatype ID ';';

datatype                : 'const'? datatypeDefinition ;
datatypeDefinition      : nestedNamespace ('<' datatype (',' datatype)* '>')?
                        | 'unsigned'? integerType
                        | floatType
                        | boolType
                        ;

template                : 'template' '<' ('class' | 'typename') ID '>' ;
function                : template? 'inline'? (datatype | 'void') id '(' parameters? ')' 'const'? functionRem ;
functionRem             : functionBody
                        | ';'
                        ;
functionBody            : '{' instruction* '}' ;

parameters              : datatype properDeclaration? (',' datatype properDeclaration?)* ;

structClass             : template? ('struct' | 'class') ID inheritance?
                          structClassBody ;

inheritance             : ':' encapsulation? ID ('<' datatype '>')?
                         (',' encapsulation? ID ('<' datatype '>')?)* ;
encapsulation           : 'private' | 'protected' | 'public' ;
structClassBody         : '{' globalClass* '}' (properDeclaration (',' properDeclaration)*)? ';' ;
globalClass             : encapsulation ':'
                        | classConstructor
                        | global
                        ;
classConstructor        : ID '(' parameters? ')'
                          (':' ID '(' expressionList? ')' (',' ID '(' expressionList? ')')*)? scope ;
expressionList          : expression (',' expression)* ;

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
                        | expression (',' expression)* ';'
                        ;

scope                   : '{' instruction* '}' ;

declarationBlock        : 'const'? 'static'? declaration ';' ;
declaration             : datatype properDeclaration ;
properDeclaration       : id declarationType? (',' id declarationType?)* ;
declarationType         : properAssignment
                        | accessBrackets+
                        ;

assignmentBlock         : assignment (',' assignment)* ';' ;

ifBlock                 : 'if' '(' expression ')' controlStructureBody
                          ('else' controlStructureBody)? ;

whileBlock              : 'while' '(' expression ')' controlStructureBody ;
doWhileBlock            : 'do' doWhileBody 'while' '(' expression ')' ';' ;
doWhileBody             : scope
                        | instruction
                        ;

forBlock                : 'for' '(' (classicFor | forEach) ')'
                          controlStructureBody ;
forExpression           : primaryExpression (',' primaryExpression)* ;
classicFor              : forExpression? ';' expression? ';' forExpression? ;
forEach                 : 'const'? ('auto' | datatype) id ':' callSomething ;

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

assignment              : callSomething properAssignment ;
properAssignment        : (assignmentOp callSomething)* assignmentOp expression ;

expression              : expression binOp expression
                        | assignment
                        | unOp1 expression
                        | unOp2 expression2
                        | expression2
                        | expression '?' expression ':' expression
                        ;

expression2             : '(' expression ')'
                        | callSomething
                        | datatype ('(' functionArguments? ')')? ('[' expression ']')*
                        | value
                        | 'sizeof' expression
                        | '(' datatype ')' expression
                        | '{' curlyBrackets? '}'
                        ;

curlyBrackets           : expression (',' expression)* ;
callSomething           : id callFunction? (accessBrackets* accessOp callSomething)?
                          accessBrackets* increaseOp?;
callFunction            : '(' functionArguments? ')' ;
functionArguments       : expression (',' expression)* ;

value                   : INT | LONG | LONGLONG | CHAR | BOOL | DOUBLE | STRING ;

accessOp                : '.' | '->' ;
accessBrackets          : '[' expression ']'
                        | '(' e ')'
                        ;

/* Right angle bracket (C++11) - Solution '>>' is not token, only '>'
   This fixes vector<vector<int>> issue
 */
binOp                   : '==' | '!=' | '<' | '>'('>')? | '<=' | '>='
                        | '+' | '-' | '*' | '/' | '%'
                        | '<<' | '&' | '|' | '^' | 'and' | 'or' | 'xor'
                        | '&&' | '||' ;

assignmentOp            : '=' | '+=' | '-=' | '/=' | '*=' | '%='
                        | '&=' | '|=' | '^=' | '<<=' | '>>=' ;

unOp1                   : '!' | '~' ;
unOp2                   : '-' | '+' | increaseOp ;

increaseOp              : '--' | '++' ;

main                    : 'int'? 'main' '(' parameters? ')' functionBody ;

ID                      : [a-zA-Z_][a-zA-Z0-9_]* ;

COMMENT                 : '/*' .*? '*/' -> skip ;
LINE_COMMENT            : '//' ~[\r\n]* -> skip ;
WS		                : [ \t\r\n]+ -> skip ;
INT                     : [0-9]+;
LONG                    : [0-9]+[lL];
LONGLONG                : [0-9]+[lL][lL];
CHAR                    : ('\'') (~['\''] | ['\\'a-z]) ('\'');
DOUBLE                  : [0-9]+[.][0-9]+([e][-]?[0-9]+)? | [0-9]+([e][-]?[0-9]+)? ;
BOOL                    : 'true' | 'false' ;
STRING                  : ('\'' | '"') ~['\'"']* ('\'' | '"');

MULTILINEMACRO          : '#' (~[\n]*? '\\' '\r'? '\n')+ ~[\n]+ -> channel(HIDDEN) ;
DIRECTIVE               : '#' ~[\n]* -> channel(HIDDEN) ;




