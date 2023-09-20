// Generated from Expr.g4 by ANTLR 4.13.0

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(ExprParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(ExprParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExprParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(ExprParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(ExprParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(ExprParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(ExprParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ExprParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ExprParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(ExprParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(ExprParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(ExprParser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExp}
	 * labeled alternative in {@link ExprParser#simp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(ExprParser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterContCommand(ExprParser.ContCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitContCommand(ExprParser.ContCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void enterBreakCommand(ExprParser.BreakCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakCommand}
	 * labeled alternative in {@link ExprParser#control}.
	 * @param ctx the parse tree
	 */
	void exitBreakCommand(ExprParser.BreakCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elseblck}.
	 * @param ctx the parse tree
	 */
	void enterElseblck(ExprParser.ElseblckContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseblck}.
	 * @param ctx the parse tree
	 */
	void exitElseblck(ExprParser.ElseblckContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopMulDiVModExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopMulDiVModExp(ExprParser.BinopMulDiVModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopMulDiVModExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopMulDiVModExp(ExprParser.BinopMulDiVModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopOrExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopOrExp(ExprParser.BinopOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopOrExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopOrExp(ExprParser.BinopOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unopNotExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnopNotExp(ExprParser.UnopNotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unopNotExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnopNotExp(ExprParser.UnopNotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unopRSExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnopRSExp(ExprParser.UnopRSExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unopRSExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnopRSExp(ExprParser.UnopRSExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopEqNeqExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopEqNeqExp(ExprParser.BinopEqNeqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopEqNeqExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopEqNeqExp(ExprParser.BinopEqNeqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNum(ExprParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNum(ExprParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pexp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPexp(ExprParser.PexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pexp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPexp(ExprParser.PexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopAndExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopAndExp(ExprParser.BinopAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopAndExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopAndExp(ExprParser.BinopAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopCompExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopCompExp(ExprParser.BinopCompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopCompExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopCompExp(ExprParser.BinopCompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopPlusMinExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinopPlusMinExp(ExprParser.BinopPlusMinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopPlusMinExp}
	 * labeled alternative in {@link ExprParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinopPlusMinExp(ExprParser.BinopPlusMinExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#asop}.
	 * @param ctx the parse tree
	 */
	void enterAsop(ExprParser.AsopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#asop}.
	 * @param ctx the parse tree
	 */
	void exitAsop(ExprParser.AsopContext ctx);
}