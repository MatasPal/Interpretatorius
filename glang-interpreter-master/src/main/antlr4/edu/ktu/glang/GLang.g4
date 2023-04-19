grammar GLang;

program : statement+ EOF ;

statement
    : variableDeclaration ';'
    | assignment ';'
    | ifStatement
    | printStatement ';'
    | forLoop
    ;

variableDeclaration : TYPE ID '=' expression ';';

assignment
           : ID '=' expression
           ;
           //| INT '++' expression;


expression
    : INT                               #intExpression
    | ID                                #idExpression
    | DOUBLE                            #doubleExpression
    | '(' expression ')'                #parenthesesExpression
    | expression intMultiOp expression  #intMultiOpExpression
    | expression intAddOp expression    #intAddOpExpression
    | expression doubleMultiOp expression  #doubleMultiOpExpression
    | expression doubleAddOp expression    #doubleAddOpExpression
    ;

intMultiOp : '*' | '/' | '%' ;
intAddOp : '+' | '-' ;

doubleMultiOp : '*' | '/' | '%' ;
doubleAddOp : '+' | '-' ;


ifStatement : 'if' '(' expression relationOp expression ')' '{' statement '}'
    ('else' '{' statement '}') ;

forLoop : 'for' '(' expression assignment ';' expression relationOp expression ';' assignment ')' '{' statement '}' ;


relationOp : '==' | '!=' | '>' | '<' | '>=' | '<=';

printStatement : PRINT '(' expression ')' ;

TYPE    : 'int'
        | 'bool'
        | 'double'
        ;

PRINT   : 'print';
ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
DOUBLE  : [0-9]+'.'[0-9]+ ;

COMMENT : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;