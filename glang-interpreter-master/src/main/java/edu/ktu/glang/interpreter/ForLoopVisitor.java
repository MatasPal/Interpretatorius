
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

    private static Boolean resolveCondition(Object conditionValue) {
        if (conditionValue instanceof Boolean) {
            return (Boolean) conditionValue;
        } else {
            throw new RuntimeException("Invalid condition type.");
        }
    }
    private static boolean resolveCondition(Object left, Object right, String relOp) {

        switch (relOp) {
            case "==":
                return left.equals(right);
            case "!=":
                return !left.equals(right);
            case ">":
                return compare(left, right) > 0;
            case "<":
                return compare(left, right) < 0;
            case ">=":
                return compare(left, right) >= 0;
            case "<=":
                return compare(left, right) <= 0;
            default:
                throw new RuntimeException("Unsupported operator.");
        }
    }

    private static int compare(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return Integer.compare((int) left, (int) right);
        } else if (left instanceof Double && right instanceof Double) {
            return Double.compare((double) left, (double) right);
        } else if (left instanceof String && right instanceof String) {
            return ((String) left).compareTo((String) right);
        } else {
            throw new RuntimeException("Comparison of unsupported types.");
        }

    }
}