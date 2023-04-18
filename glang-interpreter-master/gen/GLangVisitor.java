// Generated from C:/Studijos/2 kursas/2 semestras/Programavimo kalbu teorija/Grupes projektas/glang-interpreter-master/2/glang-interpreter-master/glang-interpreter-master/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by the {@code intExpression}
	 * labeled alternative in {@link GLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(GLangParser.IntExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link GLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#relationOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOp(GLangParser.RelationOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GLangParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(GLangParser.PrintStatementContext ctx);
}