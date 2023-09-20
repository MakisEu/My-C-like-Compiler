// Generated from Expr.g4 by ANTLR 4.13.0

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(ExprParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ExprParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(ExprParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(ExprParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ExprParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(ExprParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExp(ExprParser.PrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContCommand(ExprParser.ContCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakCommand(ExprParser.BreakCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#elseblck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblck(ExprParser.ElseblckContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopMulDiVModExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopMulDiVModExp(ExprParser.BinopMulDiVModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopOrExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopOrExp(ExprParser.BinopOrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unopNotExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnopNotExp(ExprParser.UnopNotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unopRSExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnopRSExp(ExprParser.UnopRSExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopEqNeqExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopEqNeqExp(ExprParser.BinopEqNeqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ExprParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pexp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPexp(ExprParser.PexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopAndExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopAndExp(ExprParser.BinopAndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopCompExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopCompExp(ExprParser.BinopCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopPlusMinExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopPlusMinExp(ExprParser.BinopPlusMinExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#asop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsop(ExprParser.AsopContext ctx);
}