
package edu.ktu.glang.interpreter;

import gen.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ForLoopVisitor extends GLangBaseVisitor<Object> {

    private final InterpreterVisitor parent;

    public ForLoopVisitor(InterpreterVisitor parent) {
        this.parent = parent;
    }

    @Override
    public Object visitForLoop(GLangParser.ForLoopContext ctx) {
        Object initialization = parent.visit(ctx.expression(0));
        while (resolveCondition(parent.visit(ctx.expression(1)))) {
            parent.visit(ctx.statement());
            parent.visit(ctx.expression(1));
        }
        return null;
    }

    private static boolean resolveCondition(Object conditionValue) {
        if (conditionValue instanceof Boolean) {
            return (Boolean) conditionValue;
        } else {
            throw new RuntimeException("Invalid condition type.");
        }
    }
}