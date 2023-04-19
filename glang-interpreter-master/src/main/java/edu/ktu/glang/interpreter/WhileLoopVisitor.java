package edu.ktu.glang.interpreter;

import gen.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class WhileLoopVisitor extends GLangBaseVisitor<Object> {

    private final InterpreterVisitor parent;

    public WhileLoopVisitor(InterpreterVisitor parent) {
        this.parent = parent;
    }

    @Override
    public Object visitWhileLoop(GLangParser.WhileLoopContext ctx) {
        // Get the condition expression from the context
        Object condition = parent.visit(ctx.expression());

        // Loop while the condition is true
        while (resolveCondition(condition)) {
            // Execute the loop body statement
            parent.visit((ParseTree) ctx.statement());
        }

        return null;
    }

    private static boolean resolveCondition(Object condition) {
        // The condition should evaluate to a boolean value
        if (!(condition instanceof Integer)) {
            throw new RuntimeException("Condition must evaluate to a boolean value.");
        }

        return (Boolean) condition;

    }
}
