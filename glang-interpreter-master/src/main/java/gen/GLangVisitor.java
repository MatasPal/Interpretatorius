package gen;// Generated from C:/Studijos/2 kursas/2 semestras/Programavimo kalbu teorija/Grupes projektas/glang-interpreter-master/2/glang-interpreter-master/glang-interpreter-master/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GLangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#queueDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueDeclaration(GLangParser.QueueDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#enqueueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnqueueStatement(GLangParser.EnqueueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#dequeueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDequeueStatement(GLangParser.DequeueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(GLangParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(GLangParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpression(GLangParser.DoubleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(GLangParser.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleMultiOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleMultiOpExpression(GLangParser.DoubleMultiOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(GLangParser.IntExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleAddOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAddOpExpression(GLangParser.DoubleAddOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(GLangParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAddOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intMultiOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMultiOpExpression(GLangParser.IntMultiOpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(GLangParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#intMultiOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMultiOp(GLangParser.IntMultiOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#intAddOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAddOp(GLangParser.IntAddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#doubleMultiOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleMultiOp(GLangParser.DoubleMultiOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#doubleAddOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAddOp(GLangParser.DoubleAddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GLangParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(GLangParser.TryCatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(GLangParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(GLangParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#relationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOp(GLangParser.RelationOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#printFStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFStatement(GLangParser.PrintFStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(GLangParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GLangParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GLangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(GLangParser.ArgumentListContext ctx);
}