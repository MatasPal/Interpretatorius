grammar GLang;

program : statement+ EOF ;

statement
    : variableDeclaration ';'
    | assignment ';'
    | ifStatement
    | printStatement ';'
    | whileLoop
    | forLoop
    ;

variableDeclaration : TYPE ID '=' expression;

assignment
           : ID '=' expression
           ;
           //| INT '++' expression;


expression
    : INT                               #intExpression
    | ID                                #idExpression
    | DOUBLE                            #doubleExpression
    | BOOLEAN                           #booleanExpression
    | STRING                            #stringExpression
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


whileLoop : 'while' '(' expression relationOp expression ')' '{' statement* '}' ;

ifStatement : 'if' '(' expression relationOp expression ')' '{' statement '}'
    ('else' '{' statement '}') ;

forLoop : 'for' '(' variableDeclaration? ';' expression relationOp expression ';' assignment ')' '{' statement+ '}' ;



relationOp : '==' | '!=' | '>' | '<' | '>=' | '<=';


printStatement : PRINT '(' expression ')' ;

TYPE    : 'int'
        | 'boolean'
        | 'double'
        | 'string'
        ;


STRING : '"' (~["\r\n\\] | '\\' .)* '"' ; // string literal

PRINT   : 'print';
ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
BOOLEAN    : 'true' | 'false';
DOUBLE  : [0-9]+'.'[0-9]+ ;


COMMENT : ( '//' ~[\r\n]* | '/' .? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;