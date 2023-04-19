package edu.ktu.glang.interpreter;

import gen.*;


public class InterpreterVisitor extends GLangBaseVisitor<Object> {

    private final StringBuilder SYSTEM_OUT = new StringBuilder();

    private final SymbolTable symbolTable;
    private final IfStatementVisitor ifStatementVisitor;


    private final ForLoopVisitor forLoopVisitor;



    public InterpreterVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.ifStatementVisitor = new IfStatementVisitor(this);

        this.forLoopVisitor = new ForLoopVisitor(this);

    }

    @Override
    public Object visitProgram(GLangParser.ProgramContext ctx) {
        super.visitProgram(ctx);
        return SYSTEM_OUT.toString();
    }

    @Override
    public Object visitVariableDeclaration(GLangParser.VariableDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        if (!this.symbolTable.contains(varName)) {
            this.symbolTable.put(varName, value);
        } else {
            throw new RuntimeException("Variable already exists.");
        }
        return null;
    }

    @Override
    public Object visitAssignment(GLangParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        if (this.symbolTable.contains(varName)) {
            this.symbolTable.put(varName, value);
        } else {
            throw new RuntimeException("Undeclared variable.");
        }
        return null;
    }

    @Override
    public Object visitIntExpression(GLangParser.IntExpressionContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }
    @Override
    public Object visitDoubleExpression(GLangParser.DoubleExpressionContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Object visitBooleanExpression(GLangParser.BooleanExpressionContext ctx) {
        return Boolean.parseBoolean(ctx.BOOLEAN().getText());
    }

    @Override
    public Object visitIdExpression(GLangParser.IdExpressionContext ctx) {
        String varName = ctx.ID().getText();
        return this.symbolTable.get(varName);
    }

    @Override
    public Object visitPrintStatement(GLangParser.PrintStatementContext ctx) {
        String text = visit(ctx.expression()).toString();
        //System.out.println(text);
        SYSTEM_OUT.append(text).append("\n");
        return null;
    }

    @Override
    public Object visitParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx) {
        return visit(ctx.expression());
    }


    //@Override
    /*public Object visitIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx) {
        Object val1 = visit(ctx.expression(0));
        Object val2 = visit(ctx.expression(1));
        return switch (ctx.intAddOp().getText()) {
            case "+" -> (Integer) val1 + (Integer) val2;
            case "-" -> (Integer) val1 - (Integer) val2;
            default -> null;
        };
    }*/

    @Override
    public Object visitIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx) {
        Object val1 = visit(ctx.expression(0));
        Object val2 = visit(ctx.expression(1));
        String op = ctx.intAddOp().getText();

        if (val1 instanceof Integer && val2 instanceof Integer) {
            switch (op) {
                case "+":
                    return (Integer) val1 + (Integer) val2;
                case "-":
                    return (Integer) val1 - (Integer) val2;
                default:
                    break;
            }
        } else if (val1 instanceof Double && val2 instanceof Double) {
            switch (op) {
                case "+":
                    return (Double) val1 + (Double) val2;
                case "-":
                    return (Double) val1 - (Double) val2;
                default:
                    break;
            }
        } else if (val1 instanceof String && val2 instanceof String) {
            switch (op) {
                case "+":
                    return (String) val1 + (String) val2;
                default:
                    break;
            }
        } else if (val1 instanceof Boolean && val2 instanceof Boolean) {
            switch (op) {
                case "&&":
                    return (Boolean) val1 && (Boolean) val2;
                case "||":
                    return (Boolean) val1 || (Boolean) val2;
                default:
                    break;
            }
        }

        throw new RuntimeException("Unsupported operator or operand types.");
    }

    @Override
    public Object visitDoubleAddOpExpression(GLangParser.DoubleAddOpExpressionContext ctx) {
        Object val1 = visit(ctx.expression(0));
        Object val2 = visit(ctx.expression(1));
        return switch (ctx.doubleAddOp().getText()) {
            case "+" -> (Double) val1 + (Double) val2;
            case "-" -> (Double) val1 - (Double) val2;
            default -> null;
        };
    }

    @Override
    public Object visitIntMultiOpExpression(GLangParser.IntMultiOpExpressionContext ctx) {
        Object val1 = visit(ctx.expression(0));
        Object val2 = visit(ctx.expression(1));
        //TODO - validation etc
        return switch (ctx.intMultiOp().getText()) {
            case "*" -> (Integer) val1 * (Integer) val2;
            case "/" -> (Integer) val1 / (Integer) val2;
            case "%" -> (Integer) val1 % (Integer) val2;
            default -> null;
        };
    }

    @Override
    public Object visitIfStatement(GLangParser.IfStatementContext ctx) {
        return this.ifStatementVisitor.visitIfStatement(ctx);
    }


    @Override
    public Object visitForLoop(GLangParser.ForLoopContext ctx) {
        return this.forLoopVisitor.visitForLoop(ctx);
    }

    /*@Override
    public Object visitForStatement(GLangParser.ForStatementContext ctx) {
        visit(ctx.assignment(0));
        while ((boolean) visit(ctx.expression(0))) {
            InterpreterVisitor visitor = new InterpreterVisitor(symbolTable);
            for (GLangParser.StatementContext statement : ctx.statement().toArray(GLangParser.StatementContext[]::new)) {
                visit(statement);
            }

            visit(ctx.assignment(1));
        }
        return null;
    }

    @Override
    public Object visitForStatement(GLangParser.ForStatementContext ctx) {
        visit(ctx.assignment(0));
        while ((boolean) visit(ctx.expression(0))) {
            InterpreterVisitor visitor = new InterpreterVisitor(symbolTable);
            for (GLangParser.StatementContext statement : ctx.statement()) {
                visit(statement);
            }
            visit(ctx.assignment(1));
            if (ctx.expression().size() > 1) {
                // update loop condition
                boolean loopCondition = (boolean) visit(ctx.expression(1));
                if (!loopCondition) {
                    break;
                }
            }
        }
        return null;
    }


    private boolean evaluateBoolean(GLangParser.ExpressionContext ctx) {
        Object value = visit(ctx);
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else {
            throw new RuntimeException("Not a boolean expression.");
        }
    }


     */

}
