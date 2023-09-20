// Generated from Expr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code binopOrExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopOrExp(@NotNull ExprParser.BinopOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopOrExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopOrExp(@NotNull ExprParser.BinopOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull ExprParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(@NotNull ExprParser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(@NotNull ExprParser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unopRSExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnopRSExp(@NotNull ExprParser.UnopRSExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unopRSExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnopRSExp(@NotNull ExprParser.UnopRSExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopPlusMinExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopPlusMinExp(@NotNull ExprParser.BinopPlusMinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopPlusMinExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopPlusMinExp(@NotNull ExprParser.BinopPlusMinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopMulDiVModExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopMulDiVModExp(@NotNull ExprParser.BinopMulDiVModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopMulDiVModExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopMulDiVModExp(@NotNull ExprParser.BinopMulDiVModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterContCommand(@NotNull ExprParser.ContCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitContCommand(@NotNull ExprParser.ContCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elseblck}.
	 * @param ctx the parse tree
	 */
	void enterElseblck(@NotNull ExprParser.ElseblckContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseblck}.
	 * @param ctx the parse tree
	 */
	void exitElseblck(@NotNull ExprParser.ElseblckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pexp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPexp(@NotNull ExprParser.PexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pexp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPexp(@NotNull ExprParser.PexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopAndExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopAndExp(@NotNull ExprParser.BinopAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopAndExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopAndExp(@NotNull ExprParser.BinopAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull ExprParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull ExprParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull ExprParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull ExprParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(@NotNull ExprParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(@NotNull ExprParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterBreakCommand(@NotNull ExprParser.BreakCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitBreakCommand(@NotNull ExprParser.BreakCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unopNotExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnopNotExp(@NotNull ExprParser.UnopNotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unopNotExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnopNotExp(@NotNull ExprParser.UnopNotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull ExprParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull ExprParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopCompExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopCompExp(@NotNull ExprParser.BinopCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopCompExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopCompExp(@NotNull ExprParser.BinopCompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(@NotNull ExprParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(@NotNull ExprParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopEqNeqExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopEqNeqExp(@NotNull ExprParser.BinopEqNeqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopEqNeqExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopEqNeqExp(@NotNull ExprParser.BinopEqNeqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(@NotNull ExprParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(@NotNull ExprParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull ExprParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull ExprParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#asop}.
	 * @param ctx the parse tree
	 */
	void enterAsop(@NotNull ExprParser.AsopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#asop}.
	 * @param ctx the parse tree
	 */
	void exitAsop(@NotNull ExprParser.AsopContext ctx);
}