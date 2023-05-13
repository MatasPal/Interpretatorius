package edu.ktu.glang.interpreter;

import gen.*;

import java.io.FileWriter;
import java.io.IOException;

public class InterpreterVisitor extends GLangBaseVisitor<Object> {

    private final StringBuilder SYSTEM_OUT = new StringBuilder();

    private final SymbolTable symbolTable;
    private final IfStatementVisitor ifStatementVisitor;


    private final ForLoopVisitor forLoopVisitor;

    private FileWriter fileWriter;




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

    private boolean checkTypeCompatibility(String varType, Object value) {
        switch (varType) {
            case "int":
                return value instanceof Integer;
            case "boolean":
                return value instanceof Boolean;
            case "double":
                return value instanceof Double;
            case "string":
                return value instanceof String;
            case "operator":
                return value instanceof String && isValidOperator((String) value);
            default:
                return false;
        }
    }

    private boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") ||
        operator.equals("*") || operator.equals("/") ||
        operator.equals("%");
    }
    @Override
    public Object visitVariableDeclaration(GLangParser.VariableDeclarationContext ctx) {
        String varType = ctx.TYPE().getText();
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());

        // Perform type checking
        if (!checkTypeCompatibility(varType, value)) {
            throw new RuntimeException("Type mismatch in variable declaration.");
        }

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
        String booleanValue = ctx.BOOLEAN().getText();
        if (booleanValue.equals("true")) {
            return true;
        } else if (booleanValue.equals("false")) {
            return false;
        } else {
            throw new IllegalArgumentException("Invalid boolean value: " + booleanValue);
        }
    }

    @Override
    public Object visitOperatorExpression(GLangParser.OperatorExpressionContext ctx) {
        String operator = ctx.OPERATOR().getText();
        operator = operator.substring(1, operator.length() - 1);
        return operator;
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
    public Object visitPrintFStatement(GLangParser.PrintFStatementContext ctx) {
        String filename = ctx.STRING().getText().replaceAll("\"", "");
        String text = visit(ctx.expression()).toString();
        try {
            fileWriter = new FileWriter(filename, true);
            fileWriter.append(text + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Object visitParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx) {
        Object val1 = visit(ctx.expression(0));
        Object val2 = visit(ctx.expression(1));
        String op;
        if (ctx.intAddOp().ID() != null) {
            String id = ctx.intAddOp().ID().getText();
            op = this.symbolTable.get(id).toString();
        } else {
            op = ctx.intAddOp().getText();
        }
        if (val1 instanceof Integer && val2 instanceof Integer) {
            switch (op) {
                case "+":
                    return (Integer) val1 + (Integer) val2;
                case "-":
                    return (Integer) val1 - (Integer) val2;
                case "*":
                    return (Integer) val1 * (Integer) val2;
                case "/":
                    return (Integer) val1 / (Integer) val2;
                case "%":
                    return (Integer) val1 % (Integer) val2;
                default:
                    break;
            }
        } else if (val1 instanceof Double && val2 instanceof Double) {
            switch (op) {
                case "+":
                    return (Double) val1 + (Double) val2;
                case "-":
                    return (Double) val1 - (Double) val2;
                case "*":
                    return (Double) val1 * (Double) val2;
                case "/":
                    return (Double) val1 / (Double) val2;
                case "%":
                    throw new IllegalArgumentException("Modulo operation is only defined for integer types");
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
                case "":
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

        if (!(val1 instanceof Number) || !(val2 instanceof Number)) {
            throw new IllegalArgumentException("Both values must be numbers");
        }

        Number num1 = (Number) val1;
        Number num2 = (Number) val2;

        switch (ctx.intMultiOp().getText()) {
            case "*":
                if (num1 instanceof Integer && num2 instanceof Integer) {
                    return num1.intValue() * num2.intValue();
                } else {
                    return num1.doubleValue() * num2.doubleValue();
                }
            case "/":
                if (num1 instanceof Integer && num2 instanceof Integer) {
                    return num1.intValue() / num2.intValue();
                } else {
                    return num1.doubleValue() / num2.doubleValue();
                }
            case "%":
                if (num1 instanceof Integer && num2 instanceof Integer) {
                    return num1.intValue() % num2.intValue();
                } else {
                    throw new IllegalArgumentException("Modulo operation is only defined for integer types");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + ctx.intMultiOp().getText());
        }
    }
    @Override
    public Object visitStringExpression(GLangParser.StringExpressionContext ctx) {
        return ctx.STRING().getText().replaceAll("^.(.*).$", "$1");
    }


    @Override
    public Object visitIfStatement(GLangParser.IfStatementContext ctx) {
        return this.ifStatementVisitor.visitIfStatement(ctx);
    }


    @Override
    public Object visitForLoop(GLangParser.ForLoopContext ctx) {
        return this.forLoopVisitor.visitForLoop(ctx);
    }


}
