grammar GLang;

program : statement+ EOF ;

statement
    : variableDeclaration ';'
    | assignment ';'
    | ifStatement
    | printStatement ';'
    | printFStatement ';'
    | whileLoop
    | forLoop
    | queueDeclaration ';'
    | enqueueStatement ';'
    | dequeueStatement ';'
    ;

variableDeclaration : TYPE ID '=' expression;

assignment
           : ID '=' expression
           ;

queueDeclaration : 'queue' ID '=' '[' ']' ;

enqueueStatement : ID '.' 'enqueue' '(' expression ')' ;

dequeueStatement : ID '.' 'dequeue' '(' ')' ;

expression
    : INT                               #intExpression
    | ID                                #idExpression
    | DOUBLE                            #doubleExpression
    | BOOLEAN                           #booleanExpression
    | STRING                            #stringExpression
    | OPERATOR                          #operatorExpression
    | '(' expression ')'                #parenthesesExpression
    | expression intMultiOp expression  #intMultiOpExpression
    | expression intAddOp expression    #intAddOpExpression
    | expression doubleMultiOp expression  #doubleMultiOpExpression
    | expression doubleAddOp expression    #doubleAddOpExpression
    ;

intMultiOp : '*' | '/' | '%' ;
intAddOp : '+' | '-' | '*' | '/' | '%' | ID ;

doubleMultiOp : '*' | '/' | '%' ;
doubleAddOp : '+' | '-' ;

whileLoop : 'while' '(' expression relationOp expression ')' '{' statement* '}' ;

ifStatement : 'if' '(' expression relationOp expression ')' '{' statement '}'
    ('else' '{' statement '}') ;

forLoop : 'for' '(' variableDeclaration? ';' expression relationOp expression ';' assignment ')' '{' statement+ '}' ;

relationOp : '==' | '!=' | '>' | '<' | '>=' | '<=';

printFStatement : PRINTF '('STRING','expression')' ;

printStatement : PRINT '(' expression ')' ;



TYPE    : 'int'
        | 'boolean'
        | 'double'
        | 'string'
        | 'operator'
        ;

STRING   : '"' (~["\r\n\\] | '\\' .)* '"' ; // string literal
BOOLEAN  : 'true' | 'false';
PRINT    : 'print';
PRINTF   : 'printf';
ID       : [a-zA-Z]+ ;
INT      : [0-9]+ ;
DOUBLE   : [0-9]+'.'[0-9]+ ;
OPERATOR : '|+|' | '|-|' | '|*|' | '|/|' | '|%|' ;

COMMENT : ( '//' ~[\r\n]* | '/' .? '*/' ) -> skip ;
WS      : [ \t\r\n]+ -> skip ;
