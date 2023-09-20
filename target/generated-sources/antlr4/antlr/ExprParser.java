// Generated from Expr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		INT=17, VAR=18, PRINT=19, IF=20, ELSE=21, WHILE=22, FOR=23, CONTINUE=24, 
		BREAK=25, PLUSEQUAL=26, MINUSEQUAL=27, MULTIPLYEQUAL=28, DIVIDEQUAL=29, 
		REMAINDEREQUAL=30, GREATEREQUAL=31, LESSEREQUAL=32, EQUALS=33, NOTEQUALS=34, 
		AND=35, OR=36, ID=37, NUMBER=38, COMMENT=39, WS=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "':'", "';'", "'{'", "'<'", "'='", "'}'", "'>'", "'!'", 
		"'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'int'", "'var'", "'print'", 
		"'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'>='", "'<='", "'=='", "'!='", "'&&'", 
		"'||'", "ID", "NUMBER", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_decl = 2, RULE_vars = 3, RULE_type = 4, 
		RULE_stmts = 5, RULE_stmt = 6, RULE_simp = 7, RULE_control = 8, RULE_elseblck = 9, 
		RULE_block = 10, RULE_exp = 11, RULE_asop = 12;
	public static final String[] ruleNames = {
		"prog", "decls", "decl", "vars", "type", "stmts", "stmt", "simp", "control", 
		"elseblck", "block", "exp", "asop"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProgram(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(T__12);
			setState(27); decls(0);
			setState(28); stmts(0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29); match(T__9);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
			setState(34); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(37);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(38); decl();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(VAR);
			setState(45); match(ID);
			setState(46); vars();
			setState(47); match(T__14);
			setState(48); type();
			setState(49); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(T__1);
				setState(52); match(ID);
				setState(53); vars();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		return stmts(0);
	}

	private StmtsContext stmts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtsContext _localctx = new StmtsContext(_ctx, _parentState);
		StmtsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_stmts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmts);
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61); stmt();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public SimpContext simp() {
			return getRuleContext(SimpContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); simp();
				setState(68); match(T__13);
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); control();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpContext extends ParserRuleContext {
		public SimpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simp; }
	 
		public SimpContext() { }
		public void copyFrom(SimpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignExpContext extends SimpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AsopContext asop() {
			return getRuleContext(AsopContext.class,0);
		}
		public AssignExpContext(SimpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignExp(this);
		}
	}
	public static class PrintExpContext extends SimpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public PrintExpContext(SimpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrintExp(this);
		}
	}

	public final SimpContext simp() throws RecognitionException {
		SimpContext _localctx = new SimpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simp);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(ID);
				setState(75); asop();
				setState(76); exp(0);
				}
				break;
			case PRINT:
				_localctx = new PrintExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(PRINT);
				setState(79); exp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlContext extends ParserRuleContext {
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
	 
		public ControlContext() { }
		public void copyFrom(ControlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends ControlContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ElseblckContext elseblck() {
			return getRuleContext(ElseblckContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfStatement(this);
		}
	}
	public static class BreakCommandContext extends ControlContext {
		public TerminalNode BREAK() { return getToken(ExprParser.BREAK, 0); }
		public BreakCommandContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBreakCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBreakCommand(this);
		}
	}
	public static class ContCommandContext extends ControlContext {
		public TerminalNode CONTINUE() { return getToken(ExprParser.CONTINUE, 0); }
		public ContCommandContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterContCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitContCommand(this);
		}
	}
	public static class WhileStatementContext extends ControlContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends ControlContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<SimpContext> simp() {
			return getRuleContexts(SimpContext.class);
		}
		public SimpContext simp(int i) {
			return getRuleContext(SimpContext.class,i);
		}
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitForStatement(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_control);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(IF);
				setState(83); match(T__5);
				setState(84); exp(0);
				setState(85); match(T__4);
				setState(86); block();
				setState(87); elseblck();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(WHILE);
				setState(90); match(T__5);
				setState(91); exp(0);
				setState(92); match(T__4);
				setState(93); block();
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95); match(FOR);
				setState(96); match(T__5);
				setState(97); simp();
				setState(98); match(T__13);
				setState(99); exp(0);
				setState(100); match(T__13);
				setState(101); simp();
				setState(102); match(T__4);
				setState(103); block();
				}
				break;
			case CONTINUE:
				_localctx = new ContCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105); match(CONTINUE);
				setState(106); match(T__13);
				}
				break;
			case BREAK:
				_localctx = new BreakCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(107); match(BREAK);
				setState(108); match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseblckContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseblckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseblck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseblck(this);
		}
	}

	public final ElseblckContext elseblck() throws RecognitionException {
		ElseblckContext _localctx = new ElseblckContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseblck);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(ELSE);
				setState(112); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case T__13:
			case PRINT:
			case IF:
			case WHILE:
			case FOR:
			case CONTINUE:
			case BREAK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(T__12);
				setState(118); stmts(0);
				setState(119); match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinopMulDiVModExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopMulDiVModExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopMulDiVModExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopMulDiVModExp(this);
		}
	}
	public static class BinopOrExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopOrExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopOrExp(this);
		}
	}
	public static class VariableContext extends ExpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public VariableContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariable(this);
		}
	}
	public static class UnopNotExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnopNotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnopNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnopNotExp(this);
		}
	}
	public static class UnopRSExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnopRSExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnopRSExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnopRSExp(this);
		}
	}
	public static class BinopEqNeqExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(ExprParser.NOTEQUALS, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopEqNeqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopEqNeqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopEqNeqExp(this);
		}
	}
	public static class NumContext extends ExpContext {
		public TerminalNode NUMBER() { return getToken(ExprParser.NUMBER, 0); }
		public NumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNum(this);
		}
	}
	public static class PexpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PexpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPexp(this);
		}
	}
	public static class BinopAndExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopAndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopAndExp(this);
		}
	}
	public static class BinopCompExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode GREATEREQUAL() { return getToken(ExprParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEREQUAL() { return getToken(ExprParser.LESSEREQUAL, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopCompExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopCompExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopCompExp(this);
		}
	}
	public static class BinopPlusMinExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinopPlusMinExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBinopPlusMinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBinopPlusMinExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new UnopNotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124); match(T__7);
				setState(125); exp(8);
				}
				break;
			case T__0:
				{
				_localctx = new UnopRSExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126); match(T__0);
				setState(127); exp(7);
				}
				break;
			case T__5:
				{
				_localctx = new PexpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); match(T__5);
				setState(129); exp(0);
				setState(130); match(T__4);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132); match(NUMBER);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BinopMulDiVModExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__6) | (1L << T__3))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(138); exp(7);
						}
						break;
					case 2:
						{
						_localctx = new BinopPlusMinExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(141); exp(6);
						}
						break;
					case 3:
						{
						_localctx = new BinopCompExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__8) | (1L << GREATEREQUAL) | (1L << LESSEREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(144); exp(5);
						}
						break;
					case 4:
						{
						_localctx = new BinopEqNeqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOTEQUALS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(147); exp(4);
						}
						break;
					case 5:
						{
						_localctx = new BinopAndExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149); match(AND);
						setState(150); exp(3);
						}
						break;
					case 6:
						{
						_localctx = new BinopOrExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(152); match(OR);
						setState(153); exp(2);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AsopContext extends ParserRuleContext {
		public TerminalNode DIVIDEQUAL() { return getToken(ExprParser.DIVIDEQUAL, 0); }
		public TerminalNode REMAINDEREQUAL() { return getToken(ExprParser.REMAINDEREQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(ExprParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(ExprParser.MINUSEQUAL, 0); }
		public TerminalNode MULTIPLYEQUAL() { return getToken(ExprParser.MULTIPLYEQUAL, 0); }
		public AsopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAsop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAsop(this);
		}
	}

	public final AsopContext asop() throws RecognitionException {
		AsopContext _localctx = new AsopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << PLUSEQUAL) | (1L << MINUSEQUAL) | (1L << MULTIPLYEQUAL) | (1L << DIVIDEQUAL) | (1L << REMAINDEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return decls_sempred((DeclsContext)_localctx, predIndex);
		case 5: return stmts_sempred((StmtsContext)_localctx, predIndex);
		case 11: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmts_sempred(StmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 6);
		case 3: return precpred(_ctx, 5);
		case 4: return precpred(_ctx, 4);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 2);
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\2"+
		"\3\2\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\5\13u\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0089\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\3\16\3\16\3\16\2\5\4"+
		"\f\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\5\2\3\3\f\f\17\17\4\2\20"+
		"\20\22\22\5\2\7\7\n\n!\"\3\2#$\4\2\b\b\34 \u00ad\2\34\3\2\2\2\4&\3\2\2"+
		"\2\6.\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16J\3\2\2\2\20R\3\2\2\2"+
		"\22o\3\2\2\2\24t\3\2\2\2\26{\3\2\2\2\30\u0088\3\2\2\2\32\u00a1\3\2\2\2"+
		"\34\35\7\6\2\2\35\36\5\4\3\2\36 \5\f\7\2\37!\7\t\2\2 \37\3\2\2\2!\"\3"+
		"\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&+\b\3\1\2"+
		"\'(\f\4\2\2(*\5\6\4\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2"+
		"\2\2-+\3\2\2\2./\7\24\2\2/\60\7\'\2\2\60\61\5\b\5\2\61\62\7\4\2\2\62\63"+
		"\5\n\6\2\63\64\7\5\2\2\64\7\3\2\2\2\65\66\7\21\2\2\66\67\7\'\2\2\67:\5"+
		"\b\5\28:\3\2\2\29\65\3\2\2\298\3\2\2\2:\t\3\2\2\2;<\7\23\2\2<\13\3\2\2"+
		"\2=B\b\7\1\2>?\f\4\2\2?A\5\16\b\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2C\r\3\2\2\2DB\3\2\2\2EF\5\20\t\2FG\7\5\2\2GK\3\2\2\2HK\5\22\n\2IK"+
		"\7\5\2\2JE\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\17\3\2\2\2LM\7\'\2\2MN\5\32\16"+
		"\2NO\5\30\r\2OS\3\2\2\2PQ\7\25\2\2QS\5\30\r\2RL\3\2\2\2RP\3\2\2\2S\21"+
		"\3\2\2\2TU\7\26\2\2UV\7\r\2\2VW\5\30\r\2WX\7\16\2\2XY\5\26\f\2YZ\5\24"+
		"\13\2Zp\3\2\2\2[\\\7\30\2\2\\]\7\r\2\2]^\5\30\r\2^_\7\16\2\2_`\5\26\f"+
		"\2`p\3\2\2\2ab\7\31\2\2bc\7\r\2\2cd\5\20\t\2de\7\5\2\2ef\5\30\r\2fg\7"+
		"\5\2\2gh\5\20\t\2hi\7\16\2\2ij\5\26\f\2jp\3\2\2\2kl\7\32\2\2lp\7\5\2\2"+
		"mn\7\33\2\2np\7\5\2\2oT\3\2\2\2o[\3\2\2\2oa\3\2\2\2ok\3\2\2\2om\3\2\2"+
		"\2p\23\3\2\2\2qr\7\27\2\2ru\5\26\f\2su\3\2\2\2tq\3\2\2\2ts\3\2\2\2u\25"+
		"\3\2\2\2v|\5\16\b\2wx\7\6\2\2xy\5\f\7\2yz\7\t\2\2z|\3\2\2\2{v\3\2\2\2"+
		"{w\3\2\2\2|\27\3\2\2\2}~\b\r\1\2~\177\7\13\2\2\177\u0089\5\30\r\n\u0080"+
		"\u0081\7\22\2\2\u0081\u0089\5\30\r\t\u0082\u0083\7\r\2\2\u0083\u0084\5"+
		"\30\r\2\u0084\u0085\7\16\2\2\u0085\u0089\3\2\2\2\u0086\u0089\7(\2\2\u0087"+
		"\u0089\7\'\2\2\u0088}\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0082\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u009e\3\2\2\2\u008a\u008b"+
		"\f\b\2\2\u008b\u008c\t\2\2\2\u008c\u009d\5\30\r\t\u008d\u008e\f\7\2\2"+
		"\u008e\u008f\t\3\2\2\u008f\u009d\5\30\r\b\u0090\u0091\f\6\2\2\u0091\u0092"+
		"\t\4\2\2\u0092\u009d\5\30\r\7\u0093\u0094\f\5\2\2\u0094\u0095\t\5\2\2"+
		"\u0095\u009d\5\30\r\6\u0096\u0097\f\4\2\2\u0097\u0098\7%\2\2\u0098\u009d"+
		"\5\30\r\5\u0099\u009a\f\3\2\2\u009a\u009b\7&\2\2\u009b\u009d\5\30\r\4"+
		"\u009c\u008a\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0093"+
		"\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a2\t\6\2\2\u00a2\33\3\2\2\2\16\"+9BJRot{\u0088\u009c\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}