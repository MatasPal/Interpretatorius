package edu.ktu.glang.interpreter;

import gen.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.function.Function;


public class InterpreterVisitor extends GLangBaseVisitor<Object> {

    private HashMap<String, HashMap<List<String>, Function>> map;
    private final TryCatchStatementVisitor tryCatchVisitor;
    private final StringBuilder SYSTEM_OUT = new StringBuilder();

    private SymbolTable symbolTable;
    private final IfStatementVisitor ifStatementVisitor;

    private final WhileLoopVisitor whileLoopVisitor;


    private final ForLoopVisitor forLoopVisitor;

    private FileWriter fileWriter;

    private Map<String, Object> variables = new HashMap<>();



    public InterpreterVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.whileLoopVisitor = new WhileLoopVisitor(this);
        this.forLoopVisitor = new ForLoopVisitor(this);
        this.ifStatementVisitor = new IfStatementVisitor(this);
        this.tryCatchVisitor = new TryCatchStatementVisitor(this);
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

    public String parseType(String type){
        switch(type){
            case("int"):
                return "Integer";
            case("string"):
                return "String";
            case("boolean"):
                return "Boolean";
            case("double"):
                return "Double";
            //case("operator"):
               // return "Operator";
        }
        return null;
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
            this.symbolTable.put(varName, value, varType);
        } else {
            throw new RuntimeException("Variable already exists.");
        }
        return null;
    }

    @Override
    public Object visitAssignment(GLangParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        String varType = symbolTable.getType(varName);
        if (!checkTypeCompatibility(varType, value)) {
            throw new RuntimeException("Type mismatch in variable declaration.");
        }
        if (this.symbolTable.contains(varName)) {
            this.symbolTable.put(varName, value);
        } else {
            throw new RuntimeException("Undeclared variable.");
        }
        return null;
    }

    @Override
    public Object visitSumExpression(GLangParser.SumExpressionContext ctx) {
        List<GLangParser.ExpressionContext> expressions = ctx.expression();
        int sum = 0;
        for (GLangParser.ExpressionContext expression : expressions) {
            int value = (int) visit(expression); // Assuming summing integers
            sum += value;
        }
        return sum;
    }

    @Override
    public Object visitFunctionDeclaration(GLangParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.ID().getText();
        List<String> parameterTypes = new ArrayList<>();
        List<String> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (GLangParser.ParameterContext parameter : ctx.parameterList().parameter()) {
                parameterTypes.add(parseType(parameter.TYPE().getText()));
                parameters.add(parameter.ID().getText());
            }
        }
        symbolTable.put(functionName, ctx);
        return null;
    }
    
    @Override
    public Object visitFunctionCall(GLangParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();
        SymbolTable oldSymbolTable = this.symbolTable;

        if (symbolTable.contains(functionName)) {
            Object functionDeclaration = symbolTable.get(functionName);
            if (functionDeclaration instanceof GLangParser.FunctionDeclarationContext) {
                GLangParser.FunctionDeclarationContext functionDeclCtx = (GLangParser.FunctionDeclarationContext) functionDeclaration;
                List<Object> argumentValues = new ArrayList<>();
                for(GLangParser.ExpressionContext context : ctx.argumentList().expression()){
                    argumentValues.add(visit(context));
                }
                SymbolTable newSymbolTable = new SymbolTable();
                List<String> parameterNames = new ArrayList<>();
                for (GLangParser.ParameterContext parameter : functionDeclCtx.parameterList().parameter()) {
                    parameterNames.add(parameter.ID().getText());
                }
                for(int i=0; i<argumentValues.size(); i++){
                    String name = parameterNames.get(i);
                    Object value = argumentValues.get(i);
                    newSymbolTable.put(name, value);
                }

                this.symbolTable = newSymbolTable;

                // Visit the function declaration and execute its statements
                List<GLangParser.StatementContext> statements = functionDeclCtx.statement();
                for (GLangParser.StatementContext statement : statements) {
                    visit(statement);
                }
            }

        }
        else {
            System.out.println("Error: Symbol '" + functionName + "' is not a function.");
        }
        this.symbolTable = oldSymbolTable;

            return null;
    }

    /*
    @Override
    public Object visitFunctionCall(GLangParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();
        if (symbolTable == null) {
            throw new RuntimeException("mem is not initialised");}

        // Check if the function exists in memory
        if (symbolTable.contains(functionName)) {
            Object functionDeclaration = symbolTable.get(functionName);

            // Evaluate the function arguments
            GLangParser.ArgumentListContext argumentListContext = ctx.argumentList();
            Map<String, Object> arguments = new HashMap<>();
            if (argumentListContext != null) {
                for (int i = 0; i < argumentListContext.expression().size(); i++) {
                    String parameterName = functionDeclaration.parameterList().parameter(i).ID().getText();
                    Object argumentValue = visit(argumentListContext.expression(i));
                    arguments.put(parameterName, argumentValue);
                }
            }

            // Create a new local scope for the function
            Map<String, Object> previousVariables = new HashMap<>(variables);

            // Assign the function arguments to their corresponding parameter names
            for (Map.Entry<String, Object> argumentEntry : arguments.entrySet()) {
                String parameterName = argumentEntry.getKey();
                Object argumentValue = argumentEntry.getValue();
                variables.put(parameterName, argumentValue);
            }

            // Visit and execute the statements within the function declaration
            for (GLangParser.StatementContext statementCtx : functionDeclaration.statement()) {
                visit(statementCtx);
            }

            // Restore the previous variables after exiting the local scope
            variables = previousVariables;
        }

        if (!memory.containsKey(functionName)) {
            throw new RuntimeException("mem is not initialised");
        }
        return null;
    }
*/
    @Override
    public Object visitQueueDeclaration(GLangParser.QueueDeclarationContext ctx) {
        String queueName = ctx.ID().getText();
        if (!symbolTable.contains(queueName)) {

            symbolTable.put(queueName, new LinkedList<>() );
        }
        else {
            throw new RuntimeException("Queue already exists.");
        }
        return null;
    }

    @Override
    public Object visitEnqueueStatement(GLangParser.EnqueueStatementContext ctx) {
        String queueName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        if (symbolTable.contains(queueName)) {

            Queue<Object> queue = (Queue<Object>) symbolTable.get(queueName);
            queue.add(value);
        }
        else {
            throw new RuntimeException("Queues are null");
        }
        System.out.println(symbolTable.get(queueName));
        return null;
    }

    @Override
    public Object visitDequeueStatement(GLangParser.DequeueStatementContext ctx) {
        String queueName = ctx.ID().getText();
        if (symbolTable.contains(queueName)) {
            Queue<Object> queue = (Queue<Object>) symbolTable.get(queueName);
            if (!queue.isEmpty()) {
                return queue.remove();

            } else {
                throw new RuntimeException("Queue is empty.");
            }
        } else {
            throw new RuntimeException("Queue does not exist.");
        }


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
            String type = symbolTable.getType(id);
            if (!type.equals("operator")){
                throw new RuntimeException("Type is not operator.");
            }
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
    public Object visitWhileLoop(GLangParser.WhileLoopContext ctx) {
        return this.whileLoopVisitor.visitWhileLoop(ctx);
    }


    @Override
    public Object visitForLoop(GLangParser.ForLoopContext ctx) {
        return this.forLoopVisitor.visitForLoop(ctx);
    }

    @Override
    public Object visitTryCatchStatement(GLangParser.TryCatchStatementContext ctx) {
        Object exception = this.tryCatchVisitor.visitTryCatchStatement(ctx);
        if (exception != null)
            SYSTEM_OUT.append(exception).append("\n");
        return null;
    }


}
