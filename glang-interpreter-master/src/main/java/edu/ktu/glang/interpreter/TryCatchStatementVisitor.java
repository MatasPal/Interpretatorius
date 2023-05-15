package edu.ktu.glang.interpreter;

import gen.GLangBaseVisitor;
import gen.GLangParser;

public class TryCatchStatementVisitor extends GLangBaseVisitor<Object> {

    private final InterpreterVisitor parent;

    public TryCatchStatementVisitor(InterpreterVisitor parent) {
        this.parent = parent;
    }

    @Override
    public Object visitTryCatchStatement(GLangParser.TryCatchStatementContext ctx) {
        String exception = null;
        try {
            for (GLangParser.StatementContext statement : ctx.statement()) {
                //System.out.println("AA");
                parent.visit(statement);
            }
        }
        catch (Exception e){
            exception = e.toString();
            for (GLangParser.StatementContext statement : ctx.catchClause().statement()) {
                //System.out.println("AA");
                parent.visit(statement);
            }
        }
        return exception;





    }

}