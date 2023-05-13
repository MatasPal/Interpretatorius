
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
        parent.visitVariableDeclaration(ctx.variableDeclaration());
        Object left = parent.visit(ctx.expression(0));
        Object right = parent.visit(ctx.expression(1));
        TerminalNode relOpNode = (TerminalNode) ctx.relationOp().getChild(0);
        String relOp = relOpNode.getText();
        boolean condition = true;
        if(left != null && right != null) {
            condition = resolveCondition(left, right, relOp);
        }

        while (condition) {
            for (GLangParser.StatementContext statement : ctx.statement()) {
                //System.out.println("AA");
                parent.visit(statement);
            }
            //System.out.println("AA");

            parent.visit(ctx.assignment());
             left = parent.visit(ctx.expression(0));
             right = parent.visit(ctx.expression(1));
             relOpNode = (TerminalNode) ctx.relationOp().getChild(0);
             relOp = relOpNode.getText();
             condition = resolveCondition(left, right, relOp);
        }
        return null;
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