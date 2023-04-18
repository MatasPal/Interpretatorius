// Generated from C:/Studijos/2 kursas/2 semestras/Programavimo kalbu teorija/Grupes projektas/glang-interpreter-master/2/glang-interpreter-master/glang-interpreter-master/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLangParser}.
 */
public interface GLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(GLangParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(GLangParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(GLangParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpression(GLangParser.IntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpression(GLangParser.IntExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAddOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAddOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntAddOpExpression(GLangParser.IntAddOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intMultiOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntMultiOpExpression(GLangParser.IntMultiOpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intMultiOpExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntMultiOpExpression(GLangParser.IntMultiOpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#intMultiOp}.
	 * @param ctx the parse tree
	 */
	void enterIntMultiOp(GLangParser.IntMultiOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#intMultiOp}.
	 * @param ctx the parse tree
	 */
	void exitIntMultiOp(GLangParser.IntMultiOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#intAddOp}.
	 * @param ctx the parse tree
	 */
	void enterIntAddOp(GLangParser.IntAddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#intAddOp}.
	 * @param ctx the parse tree
	 */
	void exitIntAddOp(GLangParser.IntAddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#relationOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationOp(GLangParser.RelationOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#relationOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationOp(GLangParser.RelationOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(GLangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(GLangParser.PrintStatementContext ctx);
}