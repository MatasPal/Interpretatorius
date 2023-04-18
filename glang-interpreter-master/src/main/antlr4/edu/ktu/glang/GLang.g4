grammar GLang;

program : statement+ EOF ;

statement
    : variableDeclaration ';'
    | assignment ';'
    | ifStatement
    | printStatement ';'
    ;

variableDeclaration : TYPE ID '=' expression ;

assignment : ID '=' expression ;

expression
    : INT                               #intExpression
    | ID                                #idExpression
    | '(' expression ')'                #parenthesesExpression
    | expression intMultiOp expression  #intMultiOpExpression
    | expression intAddOp expression    #intAddOpExpression
    ;

intMultiOp : '*' | '/' | '%' ;
intAddOp : '+' | '-' ;

ifStatement : 'if' '(' expression relationOp expression ')' '{' statement '}'
    ('else' '{' statement '}') ;


forStatement : 'for' '(' forControl ')' '{' statement '}';

forControl : forInit ';' expression ';' forUpdate
           | forInit ';' expression
           | expression ';' forUpdate
           | forInit
           | expression
           | forUpdate;

forInit : localVariableDeclaration
        | expressionList;

localVariableDeclaration : variableModifier* type variableDeclarator (',' variableDeclarator)* ';';

variableModifier : 'final';

type : primitiveType | classOrInterfaceType | arrayType;

primitiveType : 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'char' | 'boolean';

classOrInterfaceType : Identifier ('.' Identifier)* typeArguments?;

arrayType : primitiveType squareBrackets+ | classOrInterfaceType squareBrackets+;

squareBrackets : '[' ']';

variableDeclarator : Identifier ('[' expression ']')? ('=' variableInitializer)?;

variableInitializer : arrayInitializer | expression;

arrayInitializer : '{' (variableInitializer (',' variableInitializer)*)? ','? '}';

typeArguments : '<' typeList '>';

typeList : type (',' type)*;


forUpdate : expressionList;

expressionList : expression (',' expression)*;

relationOp : '==' | '!=' ;

printStatement : PRINT '(' expression ')' ;

TYPE    : 'int'
        | 'bool'
        ;

PRINT   : 'print';
ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;

COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;