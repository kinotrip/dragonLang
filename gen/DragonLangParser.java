// Generated from /Users/julien/IdeaProjects/dragonLang/src/main/resources/DragonLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DragonLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING=2, NULL=3, IF=4, ELSEIF=5, ELSE=6, RETURN=7, TRUE=8, 
		FALSE=9, LOOP=10, CONTINUE=11, BREAK=12, GREATER_EQUAL=13, LESS_EQUAL=14, 
		EQUAL_EQUAL=15, NOT_EUQAL=16, OR_SIGN=17, PLUS_ASSIGN=18, PLUS_ONE=19, 
		MINUS_ASSIGN=20, MINUS_ONE=21, WORD=22, GREATER_THAN=23, LESS_THAN=24, 
		PLUS_SIGN=25, MINUS_SIGN=26, MULTIPLICATION=27, DIVISION=28, PERCENT=29, 
		AND_SIGN=30, VERTICAL_BAR=31, EXCLAMATION=32, EQUAL=33, COLON=34, SEMICOLON=35, 
		POINT=36, COMMA=37, BRACKET_LEFT=38, BRACKET_RIGHT=39, BRACE_LEFT=40, 
		BRACE_RIGHT=41, SQUARE_LEFT=42, SQUARE_RIGHT=43, QUOTATION_LEFT=44, QUOTATION_RIGHT=45, 
		AT_SIGN=46, DOLLAR=47, WS=48, RT=49, COMMENT=50, LINE_COMMENT=51;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_loopInit = 2, RULE_loopJudge = 3, 
		RULE_loopIncrease = 4, RULE_loopBlock = 5, RULE_callParam = 6, RULE_callBody = 7, 
		RULE_expr = 8, RULE_otherExpr = 9, RULE_ifexpr = 10, RULE_elseif = 11, 
		RULE_otherelse = 12, RULE_function = 13, RULE_ifBlockInKH = 14, RULE_blockInKH = 15, 
		RULE_params = 16, RULE_param = 17, RULE_array = 18, RULE_arraySub = 19, 
		RULE_object = 20, RULE_objectSub = 21, RULE_pair = 22, RULE_objectFunc = 23, 
		RULE_var = 24, RULE_varGetter = 25;
	public static final String[] ruleNames = {
		"start", "line", "loopInit", "loopJudge", "loopIncrease", "loopBlock", 
		"callParam", "callBody", "expr", "otherExpr", "ifexpr", "elseif", "otherelse", 
		"function", "ifBlockInKH", "blockInKH", "params", "param", "array", "arraySub", 
		"object", "objectSub", "pair", "objectFunc", "var", "varGetter"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "STRING", "NULL", "IF", "ELSEIF", "ELSE", "RETURN", "TRUE", 
		"FALSE", "LOOP", "CONTINUE", "BREAK", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL_EQUAL", 
		"NOT_EUQAL", "OR_SIGN", "PLUS_ASSIGN", "PLUS_ONE", "MINUS_ASSIGN", "MINUS_ONE", 
		"WORD", "GREATER_THAN", "LESS_THAN", "PLUS_SIGN", "MINUS_SIGN", "MULTIPLICATION", 
		"DIVISION", "PERCENT", "AND_SIGN", "VERTICAL_BAR", "EXCLAMATION", "EQUAL", 
		"COLON", "SEMICOLON", "POINT", "COMMA", "BRACKET_LEFT", "BRACKET_RIGHT", 
		"BRACE_LEFT", "BRACE_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "QUOTATION_LEFT", 
		"QUOTATION_RIGHT", "AT_SIGN", "DOLLAR", "WS", "RT", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DragonLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DragonLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode EOF() { return getToken(DragonLangParser.EOF, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(52);
				match(RT);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			line();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(59);
						match(RT);
						}
						}
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==RT );
					setState(64);
					line();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(70);
				match(RT);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineContinueContext extends LineContext {
		public TerminalNode CONTINUE() { return getToken(DragonLangParser.CONTINUE, 0); }
		public LineContinueContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineReturnContext extends LineContext {
		public TerminalNode RETURN() { return getToken(DragonLangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineReturnContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineBreakContext extends LineContext {
		public TerminalNode BREAK() { return getToken(DragonLangParser.BREAK, 0); }
		public LineBreakContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineIfContext extends LineContext {
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineClassContext extends LineContext {
		public Token name;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(DragonLangParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(DragonLangParser.WORD, i);
		}
		public TerminalNode COLON() { return getToken(DragonLangParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DragonLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DragonLangParser.COMMA, i);
		}
		public LineClassContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineRawCallContext extends LineContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode COLON() { return getToken(DragonLangParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(DragonLangParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DragonLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DragonLangParser.COMMA, i);
		}
		public LineRawCallContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineRawCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineRawCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineRawCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineExprContext extends LineContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineExprContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineFuncContext extends LineContext {
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode POINT() { return getToken(DragonLangParser.POINT, 0); }
		public TerminalNode DOLLAR() { return getToken(DragonLangParser.DOLLAR, 0); }
		public LineFuncContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineLoopContext extends LineContext {
		public TerminalNode LOOP() { return getToken(DragonLangParser.LOOP, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(DragonLangParser.BRACKET_LEFT, 0); }
		public LoopJudgeContext loopJudge() {
			return getRuleContext(LoopJudgeContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(DragonLangParser.BRACKET_RIGHT, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopInitContext loopInit() {
			return getRuleContext(LoopInitContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DragonLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DragonLangParser.SEMICOLON, i);
		}
		public LoopIncreaseContext loopIncrease() {
			return getRuleContext(LoopIncreaseContext.class,0);
		}
		public LineLoopContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLineLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLineLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLineLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LineExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				expr(0);
				}
				break;
			case 2:
				_localctx = new LineReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(RETURN);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
					{
					setState(80);
					expr(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new LineFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT || _la==DOLLAR) {
					{
					setState(83);
					_la = _input.LA(1);
					if ( !(_la==POINT || _la==DOLLAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(86);
				match(WORD);
				setState(87);
				function();
				}
				break;
			case 4:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				ifexpr();
				}
				break;
			case 5:
				_localctx = new LineClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				((LineClassContext)_localctx).name = match(WORD);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(90);
					match(COLON);
					setState(91);
					match(WORD);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(92);
						match(COMMA);
						setState(93);
						match(WORD);
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(101);
				object();
				}
				break;
			case 6:
				_localctx = new LineLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(LOOP);
				setState(103);
				match(BRACKET_LEFT);
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					loopInit();
					setState(105);
					match(SEMICOLON);
					}
					break;
				}
				setState(109);
				loopJudge();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(110);
					match(SEMICOLON);
					setState(111);
					loopIncrease();
					}
				}

				setState(114);
				match(BRACKET_RIGHT);
				setState(115);
				loopBlock();
				}
				break;
			case 7:
				_localctx = new LineContinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(CONTINUE);
				}
				break;
			case 8:
				_localctx = new LineBreakContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(BREAK);
				}
				break;
			case 9:
				_localctx = new LineRawCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(119);
					var();
					setState(120);
					match(EQUAL);
					}
					break;
				}
				setState(124);
				var();
				setState(125);
				match(COLON);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
					{
					setState(126);
					expr(0);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(127);
						match(COMMA);
						setState(128);
						expr(0);
						}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

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

	public static class LoopInitContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLoopInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLoopInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLoopInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopInitContext loopInit() throws RecognitionException {
		LoopInitContext _localctx = new LoopInitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loopInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expr(0);
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

	public static class LoopJudgeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopJudgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopJudge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLoopJudge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLoopJudge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLoopJudge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopJudgeContext loopJudge() throws RecognitionException {
		LoopJudgeContext _localctx = new LoopJudgeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopJudge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr(0);
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

	public static class LoopIncreaseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LoopIncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopIncrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLoopIncrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLoopIncrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLoopIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopIncreaseContext loopIncrease() throws RecognitionException {
		LoopIncreaseContext _localctx = new LoopIncreaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopIncrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expr(0);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public BlockInKHContext blockInKH() {
			return getRuleContext(BlockInKHContext.class,0);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			blockInKH();
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

	public static class CallParamContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DragonLangParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public CallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamContext callParam() throws RecognitionException {
		CallParamContext _localctx = new CallParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(146);
				match(RT);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(COMMA);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(153);
				match(RT);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			expr(0);
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

	public static class CallBodyContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(DragonLangParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(DragonLangParser.BRACKET_RIGHT, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CallParamContext> callParam() {
			return getRuleContexts(CallParamContext.class);
		}
		public CallParamContext callParam(int i) {
			return getRuleContext(CallParamContext.class,i);
		}
		public CallBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterCallBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitCallBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitCallBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallBodyContext callBody() throws RecognitionException {
		CallBodyContext _localctx = new CallBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(BRACKET_LEFT);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(RT);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
				{
				setState(168);
				expr(0);
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						callParam();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(177);
				match(RT);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(BRACKET_RIGHT);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAndSubContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OtherExprContext otherExpr() {
			return getRuleContext(OtherExprContext.class,0);
		}
		public ExprAndSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprAndSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprAndSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprAndSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusOneContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode MINUS_ONE() { return getToken(DragonLangParser.MINUS_ONE, 0); }
		public ExprMinusOneContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprMinusOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprMinusOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprMinusOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(DragonLangParser.GREATER_THAN, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprGreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivRmdContext extends ExprContext {
		public Token mul;
		public Token div;
		public Token rmd;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(DragonLangParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(DragonLangParser.DIVISION, 0); }
		public TerminalNode PERCENT() { return getToken(DragonLangParser.PERCENT, 0); }
		public ExprMulDivRmdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprMulDivRmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprMulDivRmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprMulDivRmd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddAssignContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(DragonLangParser.PLUS_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprAddAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprAddAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprAddAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprAddAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAssignContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(DragonLangParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(DragonLangParser.NUMBER, 0); }
		public ExprNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNagativeContext extends ExprContext {
		public TerminalNode MINUS_SIGN() { return getToken(DragonLangParser.MINUS_SIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNagativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprNagative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprNagative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprNagative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(DragonLangParser.NULL, 0); }
		public ExprNullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR_SIGN() { return getToken(DragonLangParser.OR_SIGN, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubtractAssignContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode MINUS_ASSIGN() { return getToken(DragonLangParser.MINUS_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprSubtractAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprSubtractAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprSubtractAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprSubtractAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> AND_SIGN() { return getTokens(DragonLangParser.AND_SIGN); }
		public TerminalNode AND_SIGN(int i) {
			return getToken(DragonLangParser.AND_SIGN, i);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqualEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(DragonLangParser.EQUAL_EQUAL, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprEqualEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprEqualEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprEqualEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprEqualEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGreaterEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(DragonLangParser.GREATER_EQUAL, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprGreaterEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubtractContext extends ExprContext {
		public Token add;
		public Token sub;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS_SIGN() { return getToken(DragonLangParser.PLUS_SIGN, 0); }
		public TerminalNode MINUS_SIGN() { return getToken(DragonLangParser.MINUS_SIGN, 0); }
		public ExprAddSubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprAddSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprAddSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprAddSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(DragonLangParser.LESS_THAN, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprLessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExprFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode EXCLAMATION() { return getToken(DragonLangParser.EXCLAMATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprObjectContext extends ExprContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExprObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(DragonLangParser.LESS_EQUAL, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprLessEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(DragonLangParser.TRUE, 0); }
		public ExprTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_EUQAL() { return getToken(DragonLangParser.NOT_EUQAL, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprNotEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBracketContext extends ExprContext {
		public TerminalNode BRACKET_LEFT() { return getToken(DragonLangParser.BRACKET_LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(DragonLangParser.BRACKET_RIGHT, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprBracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallBodyContext callBody() {
			return getRuleContext(CallBodyContext.class,0);
		}
		public ExprCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusOneContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PLUS_ONE() { return getToken(DragonLangParser.PLUS_ONE, 0); }
		public ExprPlusOneContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprPlusOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprPlusOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprPlusOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(DragonLangParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(DragonLangParser.FALSE, 0); }
		public ExprFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayContext extends ExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				var();
				}
				break;
			case 2:
				{
				_localctx = new ExprObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				object();
				}
				break;
			case 3:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				array();
				}
				break;
			case 4:
				{
				_localctx = new ExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				function();
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new ExprTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new ExprFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(FALSE);
				}
				break;
			case 9:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(NULL);
				}
				break;
			case 10:
				{
				_localctx = new ExprNagativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(MINUS_SIGN);
				setState(196);
				expr(19);
				}
				break;
			case 11:
				{
				_localctx = new ExprPlusOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				var();
				setState(198);
				match(PLUS_ONE);
				}
				break;
			case 12:
				{
				_localctx = new ExprMinusOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				var();
				setState(201);
				match(MINUS_ONE);
				}
				break;
			case 13:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(EXCLAMATION);
				setState(204);
				expr(8);
				}
				break;
			case 14:
				{
				_localctx = new ExprAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				var();
				setState(206);
				match(EQUAL);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(207);
					match(RT);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				expr(5);
				}
				break;
			case 15:
				{
				_localctx = new ExprAddAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				var();
				setState(216);
				match(PLUS_ASSIGN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(217);
					match(RT);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				expr(4);
				}
				break;
			case 16:
				{
				_localctx = new ExprSubtractAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				var();
				setState(226);
				match(MINUS_ASSIGN);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(227);
					match(RT);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				expr(3);
				}
				break;
			case 17:
				{
				_localctx = new ExprBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(BRACKET_LEFT);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(236);
					match(RT);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				expr(0);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(243);
					match(RT);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(BRACKET_RIGHT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivRmdContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(257);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULTIPLICATION:
							{
							setState(254);
							((ExprMulDivRmdContext)_localctx).mul = match(MULTIPLICATION);
							}
							break;
						case DIVISION:
							{
							setState(255);
							((ExprMulDivRmdContext)_localctx).div = match(DIVISION);
							}
							break;
						case PERCENT:
							{
							setState(256);
							((ExprMulDivRmdContext)_localctx).rmd = match(PERCENT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(259);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(263);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS_SIGN:
							{
							setState(261);
							((ExprAddSubtractContext)_localctx).add = match(PLUS_SIGN);
							}
							break;
						case MINUS_SIGN:
							{
							setState(262);
							((ExprAddSubtractContext)_localctx).sub = match(MINUS_SIGN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(265);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprGreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(267);
						match(GREATER_THAN);
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(268);
							match(RT);
							}
							}
							setState(273);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(274);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprGreaterEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(276);
						match(GREATER_EQUAL);
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(277);
							match(RT);
							}
							}
							setState(282);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(283);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprLessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(285);
						match(LESS_THAN);
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(286);
							match(RT);
							}
							}
							setState(291);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(292);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprLessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(294);
						match(LESS_EQUAL);
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(295);
							match(RT);
							}
							}
							setState(300);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(301);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprEqualEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(303);
						match(EQUAL_EQUAL);
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(304);
							match(RT);
							}
							}
							setState(309);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(310);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprNotEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(312);
						match(NOT_EUQAL);
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(313);
							match(RT);
							}
							}
							setState(318);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(319);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(321);
						match(AND_SIGN);
						setState(322);
						match(AND_SIGN);
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(323);
							match(RT);
							}
							}
							setState(328);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(329);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(331);
						match(OR_SIGN);
						setState(335);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(332);
							match(RT);
							}
							}
							setState(337);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(338);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new ExprCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(340);
						callBody();
						}
						break;
					case 12:
						{
						_localctx = new ExprAndSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(342);
						otherExpr();
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class OtherExprContext extends ParserRuleContext {
		public TerminalNode VERTICAL_BAR() { return getToken(DragonLangParser.VERTICAL_BAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OtherExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterOtherExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitOtherExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitOtherExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExprContext otherExpr() throws RecognitionException {
		OtherExprContext _localctx = new OtherExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_otherExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(VERTICAL_BAR);
			setState(349);
			expr(0);
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

	public static class IfexprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DragonLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfBlockInKHContext ifBlockInKH() {
			return getRuleContext(IfBlockInKHContext.class,0);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public OtherelseContext otherelse() {
			return getRuleContext(OtherelseContext.class,0);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterIfexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitIfexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IF);
			setState(352);
			expr(0);
			setState(353);
			ifBlockInKH();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(354);
				elseif();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(360);
				otherelse();
				}
			}

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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(DragonLangParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfBlockInKHContext ifBlockInKH() {
			return getRuleContext(IfBlockInKHContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ELSEIF);
			setState(364);
			expr(0);
			setState(365);
			ifBlockInKH();
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

	public static class OtherelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DragonLangParser.ELSE, 0); }
		public IfBlockInKHContext ifBlockInKH() {
			return getRuleContext(IfBlockInKHContext.class,0);
		}
		public OtherelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterOtherelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitOtherelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitOtherelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherelseContext otherelse() throws RecognitionException {
		OtherelseContext _localctx = new OtherelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_otherelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ELSE);
			setState(368);
			ifBlockInKH();
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

	public static class FunctionContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockInKHContext blockInKH() {
			return getRuleContext(BlockInKHContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			params();
			setState(371);
			blockInKH();
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

	public static class IfBlockInKHContext extends ParserRuleContext {
		public BlockInKHContext blockInKH() {
			return getRuleContext(BlockInKHContext.class,0);
		}
		public IfBlockInKHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlockInKH; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterIfBlockInKH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitIfBlockInKH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitIfBlockInKH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockInKHContext ifBlockInKH() throws RecognitionException {
		IfBlockInKHContext _localctx = new IfBlockInKHContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBlockInKH);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			blockInKH();
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

	public static class BlockInKHContext extends ParserRuleContext {
		public TerminalNode BRACE_LEFT() { return getToken(DragonLangParser.BRACE_LEFT, 0); }
		public TerminalNode BRACE_RIGHT() { return getToken(DragonLangParser.BRACE_RIGHT, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public BlockInKHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockInKH; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterBlockInKH(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitBlockInKH(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitBlockInKH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockInKHContext blockInKH() throws RecognitionException {
		BlockInKHContext _localctx = new BlockInKHContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockInKH);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(BRACE_LEFT);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << IF) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << LOOP) | (1L << CONTINUE) | (1L << BREAK) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
				{
				setState(376);
				line();
				}
			}

			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(379);
					match(RT);
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << IF) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << LOOP) | (1L << CONTINUE) | (1L << BREAK) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
						{
						setState(380);
						line();
						}
					}

					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(388);
				match(RT);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(BRACE_RIGHT);
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(DragonLangParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(DragonLangParser.BRACKET_RIGHT, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DragonLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DragonLangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(BRACKET_LEFT);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					match(RT);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(403);
				param();
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(404);
							match(RT);
							}
							}
							setState(409);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(410);
						match(COMMA);
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==RT) {
							{
							{
							setState(411);
							match(RT);
							}
							}
							setState(416);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(417);
						param();
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(425);
				match(RT);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(BRACKET_RIGHT);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public TerminalNode EQUAL() { return getToken(DragonLangParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WORD);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(434);
				match(EQUAL);
				setState(435);
				expr(0);
				}
			}

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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode SQUARE_LEFT() { return getToken(DragonLangParser.SQUARE_LEFT, 0); }
		public TerminalNode SQUARE_RIGHT() { return getToken(DragonLangParser.SQUARE_RIGHT, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ArraySubContext> arraySub() {
			return getRuleContexts(ArraySubContext.class);
		}
		public ArraySubContext arraySub(int i) {
			return getRuleContext(ArraySubContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(SQUARE_LEFT);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					match(RT);
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
				{
				setState(445);
				expr(0);
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(446);
						arraySub();
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
			}

			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(454);
				match(RT);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(SQUARE_RIGHT);
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

	public static class ArraySubContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DragonLangParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ArraySubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterArraySub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitArraySub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitArraySub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySubContext arraySub() throws RecognitionException {
		ArraySubContext _localctx = new ArraySubContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arraySub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(462);
				match(RT);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(COMMA);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(469);
				match(RT);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			expr(0);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode BRACE_LEFT() { return getToken(DragonLangParser.BRACE_LEFT, 0); }
		public TerminalNode BRACE_RIGHT() { return getToken(DragonLangParser.BRACE_RIGHT, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public ObjectFuncContext objectFunc() {
			return getRuleContext(ObjectFuncContext.class,0);
		}
		public List<ObjectSubContext> objectSub() {
			return getRuleContexts(ObjectSubContext.class);
		}
		public ObjectSubContext objectSub(int i) {
			return getRuleContext(ObjectSubContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(BRACE_LEFT);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(RT);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(484);
					pair();
					}
					break;
				case 2:
					{
					setState(485);
					objectFunc();
					}
					break;
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(488);
						objectSub();
						}
						} 
					}
					setState(493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RT) {
				{
				{
				setState(496);
				match(RT);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(BRACE_RIGHT);
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

	public static class ObjectSubContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DragonLangParser.COMMA, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public ObjectFuncContext objectFunc() {
			return getRuleContext(ObjectFuncContext.class,0);
		}
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public ObjectSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterObjectSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitObjectSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitObjectSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectSubContext objectSub() throws RecognitionException {
		ObjectSubContext _localctx = new ObjectSubContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(504);
				match(COMMA);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(505);
					match(RT);
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RT:
				{
				setState(512); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(511);
					match(RT);
					}
					}
					setState(514); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(518);
				pair();
				}
				break;
			case 2:
				{
				setState(519);
				objectFunc();
				}
				break;
			}
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public List<TerminalNode> RT() { return getTokens(DragonLangParser.RT); }
		public TerminalNode RT(int i) {
			return getToken(DragonLangParser.RT, i);
		}
		public TerminalNode COLON() { return getToken(DragonLangParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pair);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(WORD);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(RT);
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(529);
				match(COLON);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RT) {
					{
					{
					setState(530);
					match(RT);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				expr(0);
				}
			}

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

	public static class ObjectFuncContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockInKHContext blockInKH() {
			return getRuleContext(BlockInKHContext.class,0);
		}
		public ObjectFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterObjectFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitObjectFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitObjectFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFuncContext objectFunc() throws RecognitionException {
		ObjectFuncContext _localctx = new ObjectFuncContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_objectFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(WORD);
			setState(540);
			params();
			setState(541);
			blockInKH();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(DragonLangParser.NUMBER, 0); }
		public List<VarGetterContext> varGetter() {
			return getRuleContexts(VarGetterContext.class);
		}
		public VarGetterContext varGetter(int i) {
			return getRuleContext(VarGetterContext.class,i);
		}
		public TerminalNode POINT() { return getToken(DragonLangParser.POINT, 0); }
		public TerminalNode DOLLAR() { return getToken(DragonLangParser.DOLLAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
			case POINT:
			case DOLLAR:
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT || _la==DOLLAR) {
					{
					setState(543);
					_la = _input.LA(1);
					if ( !(_la==POINT || _la==DOLLAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(546);
				match(WORD);
				}
				break;
			case NUMBER:
				{
				setState(547);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					varGetter();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
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

	public static class VarGetterContext extends ParserRuleContext {
		public VarGetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGetter; }
	 
		public VarGetterContext() { }
		public void copyFrom(VarGetterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarPointContext extends VarGetterContext {
		public TerminalNode POINT() { return getToken(DragonLangParser.POINT, 0); }
		public TerminalNode WORD() { return getToken(DragonLangParser.WORD, 0); }
		public VarPointContext(VarGetterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterVarPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitVarPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitVarPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIndexContext extends VarGetterContext {
		public TerminalNode SQUARE_LEFT() { return getToken(DragonLangParser.SQUARE_LEFT, 0); }
		public TerminalNode SQUARE_RIGHT() { return getToken(DragonLangParser.SQUARE_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarIndexContext(VarGetterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).enterVarIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DragonLangListener ) ((DragonLangListener)listener).exitVarIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DragonLangVisitor ) return ((DragonLangVisitor<? extends T>)visitor).visitVarIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarGetterContext varGetter() throws RecognitionException {
		VarGetterContext _localctx = new VarGetterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varGetter);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				_localctx = new VarPointContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(POINT);
				setState(557);
				match(WORD);
				}
				break;
			case SQUARE_LEFT:
				_localctx = new VarIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(SQUARE_LEFT);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WORD) | (1L << MINUS_SIGN) | (1L << EXCLAMATION) | (1L << POINT) | (1L << BRACKET_LEFT) | (1L << BRACE_LEFT) | (1L << SQUARE_LEFT) | (1L << DOLLAR))) != 0)) {
					{
					setState(559);
					expr(0);
					}
				}

				setState(562);
				match(SQUARE_RIGHT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 25);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0238\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3T\n\3\3\3\5\3W\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"a\n\3\f\3\16\3d\13\3\5\3f\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\3\3"+
		"\3\3\5\3s\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3}\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3\5\3\u0089\n\3\5\3\u008b\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\b"+
		"\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3\b\3\b\3\t\3\t\7\t\u00a6\n\t\f"+
		"\t\16\t\u00a9\13\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\5\t\u00b2"+
		"\n\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00d3\n\n\f\n\16\n\u00d6\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u00dd\n\n"+
		"\f\n\16\n\u00e0\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e7\n\n\f\n\16\n\u00ea"+
		"\13\n\3\n\3\n\3\n\3\n\7\n\u00f0\n\n\f\n\16\n\u00f3\13\n\3\n\3\n\7\n\u00f7"+
		"\n\n\f\n\16\n\u00fa\13\n\3\n\3\n\5\n\u00fe\n\n\3\n\3\n\3\n\3\n\5\n\u0104"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u010a\n\n\3\n\3\n\3\n\3\n\7\n\u0110\n\n\f\n\16"+
		"\n\u0113\13\n\3\n\3\n\3\n\3\n\7\n\u0119\n\n\f\n\16\n\u011c\13\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0122\n\n\f\n\16\n\u0125\13\n\3\n\3\n\3\n\3\n\7\n\u012b"+
		"\n\n\f\n\16\n\u012e\13\n\3\n\3\n\3\n\3\n\7\n\u0134\n\n\f\n\16\n\u0137"+
		"\13\n\3\n\3\n\3\n\3\n\7\n\u013d\n\n\f\n\16\n\u0140\13\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u0147\n\n\f\n\16\n\u014a\13\n\3\n\3\n\3\n\3\n\7\n\u0150\n\n"+
		"\f\n\16\n\u0153\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u015a\n\n\f\n\16\n\u015d"+
		"\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0166\n\f\f\f\16\f\u0169\13\f"+
		"\3\f\5\f\u016c\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\5\21\u017c\n\21\3\21\3\21\5\21\u0180\n\21\7\21\u0182\n"+
		"\21\f\21\16\21\u0185\13\21\3\21\7\21\u0188\n\21\f\21\16\21\u018b\13\21"+
		"\3\21\3\21\3\22\3\22\7\22\u0191\n\22\f\22\16\22\u0194\13\22\3\22\3\22"+
		"\7\22\u0198\n\22\f\22\16\22\u019b\13\22\3\22\3\22\7\22\u019f\n\22\f\22"+
		"\16\22\u01a2\13\22\3\22\7\22\u01a5\n\22\f\22\16\22\u01a8\13\22\5\22\u01aa"+
		"\n\22\3\22\7\22\u01ad\n\22\f\22\16\22\u01b0\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u01b7\n\23\3\24\3\24\7\24\u01bb\n\24\f\24\16\24\u01be\13\24"+
		"\3\24\3\24\7\24\u01c2\n\24\f\24\16\24\u01c5\13\24\5\24\u01c7\n\24\3\24"+
		"\7\24\u01ca\n\24\f\24\16\24\u01cd\13\24\3\24\3\24\3\25\7\25\u01d2\n\25"+
		"\f\25\16\25\u01d5\13\25\3\25\3\25\7\25\u01d9\n\25\f\25\16\25\u01dc\13"+
		"\25\3\25\3\25\3\26\3\26\7\26\u01e2\n\26\f\26\16\26\u01e5\13\26\3\26\3"+
		"\26\5\26\u01e9\n\26\3\26\7\26\u01ec\n\26\f\26\16\26\u01ef\13\26\5\26\u01f1"+
		"\n\26\3\26\7\26\u01f4\n\26\f\26\16\26\u01f7\13\26\3\26\3\26\3\27\3\27"+
		"\7\27\u01fd\n\27\f\27\16\27\u0200\13\27\3\27\6\27\u0203\n\27\r\27\16\27"+
		"\u0204\5\27\u0207\n\27\3\27\3\27\5\27\u020b\n\27\3\30\3\30\7\30\u020f"+
		"\n\30\f\30\16\30\u0212\13\30\3\30\3\30\7\30\u0216\n\30\f\30\16\30\u0219"+
		"\13\30\3\30\5\30\u021c\n\30\3\31\3\31\3\31\3\31\3\32\5\32\u0223\n\32\3"+
		"\32\3\32\5\32\u0227\n\32\3\32\7\32\u022a\n\32\f\32\16\32\u022d\13\32\3"+
		"\33\3\33\3\33\3\33\5\33\u0233\n\33\3\33\5\33\u0236\n\33\3\33\2\3\22\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2&&\61"+
		"\61\2\u0288\29\3\2\2\2\4\u008a\3\2\2\2\6\u008c\3\2\2\2\b\u008e\3\2\2\2"+
		"\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u0097\3\2\2\2\20\u00a3\3\2\2\2\22"+
		"\u00fd\3\2\2\2\24\u015e\3\2\2\2\26\u0161\3\2\2\2\30\u016d\3\2\2\2\32\u0171"+
		"\3\2\2\2\34\u0174\3\2\2\2\36\u0177\3\2\2\2 \u0179\3\2\2\2\"\u018e\3\2"+
		"\2\2$\u01b3\3\2\2\2&\u01b8\3\2\2\2(\u01d3\3\2\2\2*\u01df\3\2\2\2,\u0206"+
		"\3\2\2\2.\u020c\3\2\2\2\60\u021d\3\2\2\2\62\u0226\3\2\2\2\64\u0235\3\2"+
		"\2\2\668\7\63\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2"+
		"\2\2;9\3\2\2\2<E\5\4\3\2=?\7\63\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2AB\3\2\2\2BD\5\4\3\2C>\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3"+
		"\2\2\2GE\3\2\2\2HJ\7\63\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN"+
		"\3\2\2\2MK\3\2\2\2NO\7\2\2\3O\3\3\2\2\2P\u008b\5\22\n\2QS\7\t\2\2RT\5"+
		"\22\n\2SR\3\2\2\2ST\3\2\2\2T\u008b\3\2\2\2UW\t\2\2\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\30\2\2Y\u008b\5\34\17\2Z\u008b\5\26\f\2[e\7\30\2\2\\"+
		"]\7$\2\2]b\7\30\2\2^_\7\'\2\2_a\7\30\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e\\\3\2\2\2ef\3\2\2\2fg\3\2\2\2g\u008b\5"+
		"*\26\2hi\7\f\2\2im\7(\2\2jk\5\6\4\2kl\7%\2\2ln\3\2\2\2mj\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2or\5\b\5\2pq\7%\2\2qs\5\n\6\2rp\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\7)\2\2uv\5\f\7\2v\u008b\3\2\2\2w\u008b\7\r\2\2x\u008b\7\16\2\2"+
		"yz\5\62\32\2z{\7#\2\2{}\3\2\2\2|y\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\62"+
		"\32\2\177\u0088\7$\2\2\u0080\u0085\5\22\n\2\u0081\u0082\7\'\2\2\u0082"+
		"\u0084\5\22\n\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0080\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008aP\3\2\2\2"+
		"\u008aQ\3\2\2\2\u008aV\3\2\2\2\u008aZ\3\2\2\2\u008a[\3\2\2\2\u008ah\3"+
		"\2\2\2\u008aw\3\2\2\2\u008ax\3\2\2\2\u008a|\3\2\2\2\u008b\5\3\2\2\2\u008c"+
		"\u008d\5\22\n\2\u008d\7\3\2\2\2\u008e\u008f\5\22\n\2\u008f\t\3\2\2\2\u0090"+
		"\u0091\5\22\n\2\u0091\13\3\2\2\2\u0092\u0093\5 \21\2\u0093\r\3\2\2\2\u0094"+
		"\u0096\7\63\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009e\7\'\2\2\u009b\u009d\7\63\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\5\22\n\2\u00a2\17\3\2\2\2\u00a3\u00a7\7(\2"+
		"\2\u00a4\u00a6\7\63\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ae\5\22\n\2\u00ab\u00ad\5\16\b\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b6\3\2\2\2\u00b3\u00b5\7\63\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7)\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\b\n\1\2"+
		"\u00bc\u00fe\5\62\32\2\u00bd\u00fe\5*\26\2\u00be\u00fe\5&\24\2\u00bf\u00fe"+
		"\5\34\17\2\u00c0\u00fe\7\4\2\2\u00c1\u00fe\7\3\2\2\u00c2\u00fe\7\n\2\2"+
		"\u00c3\u00fe\7\13\2\2\u00c4\u00fe\7\5\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00fe"+
		"\5\22\n\25\u00c7\u00c8\5\62\32\2\u00c8\u00c9\7\25\2\2\u00c9\u00fe\3\2"+
		"\2\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc\7\27\2\2\u00cc\u00fe\3\2\2\2\u00cd"+
		"\u00ce\7\"\2\2\u00ce\u00fe\5\22\n\n\u00cf\u00d0\5\62\32\2\u00d0\u00d4"+
		"\7#\2\2\u00d1\u00d3\7\63\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\5\22\n\7\u00d8\u00fe\3\2\2\2\u00d9\u00da\5\62\32\2\u00da"+
		"\u00de\7\24\2\2\u00db\u00dd\7\63\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\5\22\n\6\u00e2\u00fe\3\2\2\2\u00e3\u00e4\5"+
		"\62\32\2\u00e4\u00e8\7\26\2\2\u00e5\u00e7\7\63\2\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\22\n\5\u00ec\u00fe\3\2\2\2"+
		"\u00ed\u00f1\7(\2\2\u00ee\u00f0\7\63\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f8\5\22\n\2\u00f5\u00f7\7\63\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00bb\3\2\2\2\u00fd\u00bd\3\2\2\2\u00fd\u00be\3\2\2\2\u00fd"+
		"\u00bf\3\2\2\2\u00fd\u00c0\3\2\2\2\u00fd\u00c1\3\2\2\2\u00fd\u00c2\3\2"+
		"\2\2\u00fd\u00c3\3\2\2\2\u00fd\u00c4\3\2\2\2\u00fd\u00c5\3\2\2\2\u00fd"+
		"\u00c7\3\2\2\2\u00fd\u00ca\3\2\2\2\u00fd\u00cd\3\2\2\2\u00fd\u00cf\3\2"+
		"\2\2\u00fd\u00d9\3\2\2\2\u00fd\u00e3\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fe"+
		"\u015b\3\2\2\2\u00ff\u0103\f\22\2\2\u0100\u0104\7\35\2\2\u0101\u0104\7"+
		"\36\2\2\u0102\u0104\7\37\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u015a\5\22\n\23\u0106\u0109\f"+
		"\21\2\2\u0107\u010a\7\33\2\2\u0108\u010a\7\34\2\2\u0109\u0107\3\2\2\2"+
		"\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u015a\5\22\n\22\u010c\u010d"+
		"\f\20\2\2\u010d\u0111\7\31\2\2\u010e\u0110\7\63\2\2\u010f\u010e\3\2\2"+
		"\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u015a\5\22\n\21\u0115\u0116\f\17\2"+
		"\2\u0116\u011a\7\17\2\2\u0117\u0119\7\63\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u015a\5\22\n\20\u011e\u011f\f\16\2\2\u011f"+
		"\u0123\7\32\2\2\u0120\u0122\7\63\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u015a\5\22\n\17\u0127\u0128\f\r\2\2\u0128\u012c\7"+
		"\20\2\2\u0129\u012b\7\63\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u015a\5\22\n\16\u0130\u0131\f\f\2\2\u0131\u0135\7\21\2\2\u0132"+
		"\u0134\7\63\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u015a\5\22\n\r\u0139\u013a\f\13\2\2\u013a\u013e\7\22\2\2\u013b\u013d"+
		"\7\63\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u015a"+
		"\5\22\n\f\u0142\u0143\f\t\2\2\u0143\u0144\7 \2\2\u0144\u0148\7 \2\2\u0145"+
		"\u0147\7\63\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u015a\5\22\n\n\u014c\u014d\f\b\2\2\u014d\u0151\7\23\2\2\u014e\u0150\7"+
		"\63\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u015a\5\22"+
		"\n\t\u0155\u0156\f\33\2\2\u0156\u015a\5\20\t\2\u0157\u0158\f\3\2\2\u0158"+
		"\u015a\5\24\13\2\u0159\u00ff\3\2\2\2\u0159\u0106\3\2\2\2\u0159\u010c\3"+
		"\2\2\2\u0159\u0115\3\2\2\2\u0159\u011e\3\2\2\2\u0159\u0127\3\2\2\2\u0159"+
		"\u0130\3\2\2\2\u0159\u0139\3\2\2\2\u0159\u0142\3\2\2\2\u0159\u014c\3\2"+
		"\2\2\u0159\u0155\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\23\3\2\2\2\u015d\u015b\3\2\2"+
		"\2\u015e\u015f\7!\2\2\u015f\u0160\5\22\n\2\u0160\25\3\2\2\2\u0161\u0162"+
		"\7\6\2\2\u0162\u0163\5\22\n\2\u0163\u0167\5\36\20\2\u0164\u0166\5\30\r"+
		"\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\5\32\16\2"+
		"\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\27\3\2\2\2\u016d\u016e"+
		"\7\7\2\2\u016e\u016f\5\22\n\2\u016f\u0170\5\36\20\2\u0170\31\3\2\2\2\u0171"+
		"\u0172\7\b\2\2\u0172\u0173\5\36\20\2\u0173\33\3\2\2\2\u0174\u0175\5\""+
		"\22\2\u0175\u0176\5 \21\2\u0176\35\3\2\2\2\u0177\u0178\5 \21\2\u0178\37"+
		"\3\2\2\2\u0179\u017b\7*\2\2\u017a\u017c\5\4\3\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u0183\3\2\2\2\u017d\u017f\7\63\2\2\u017e\u0180\5"+
		"\4\3\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0189\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\7\63\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7+\2\2\u018d"+
		"!\3\2\2\2\u018e\u0192\7(\2\2\u018f\u0191\7\63\2\2\u0190\u018f\3\2\2\2"+
		"\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01a9"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u01a6\5$\23\2\u0196\u0198\7\63\2\2"+
		"\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0\7\'\2\2\u019d"+
		"\u019f\7\63\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a5\5$\23\2\u01a4\u0199\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u0195\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2\2\2\u01ab\u01ad\7\63"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7)"+
		"\2\2\u01b2#\3\2\2\2\u01b3\u01b6\7\30\2\2\u01b4\u01b5\7#\2\2\u01b5\u01b7"+
		"\5\22\n\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7%\3\2\2\2\u01b8"+
		"\u01bc\7,\2\2\u01b9\u01bb\7\63\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c6\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c3\5\22\n\2\u01c0\u01c2\5(\25\2\u01c1\u01c0\3"+
		"\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01ca\7\63\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7-\2\2\u01cf\'\3\2\2\2\u01d0\u01d2"+
		"\7\63\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01da"+
		"\7\'\2\2\u01d7\u01d9\7\63\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2"+
		"\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dd\u01de\5\22\n\2\u01de)\3\2\2\2\u01df\u01e3\7*\2\2\u01e0"+
		"\u01e2\7\63\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3"+
		"\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01f0\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e9\5.\30\2\u01e7\u01e9\5\60\31\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3"+
		"\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01ec\5,\27\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f5\3\2\2\2\u01f2\u01f4\7\63\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3"+
		"\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01f9\7+\2\2\u01f9+\3\2\2\2\u01fa\u01fe\7\'\2\2\u01fb"+
		"\u01fd\7\63\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0207\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0203\7\63\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3"+
		"\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u01fa\3\2\2\2\u0206"+
		"\u0202\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u020b\5.\30\2\u0209\u020b\5\60"+
		"\31\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b-\3\2\2\2\u020c\u0210"+
		"\7\30\2\2\u020d\u020f\7\63\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2"+
		"\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u021b\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0213\u0217\7$\2\2\u0214\u0216\7\63\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021c\5\22\n\2\u021b\u0213\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c/\3\2\2\2\u021d\u021e\7\30\2\2\u021e\u021f\5\"\22"+
		"\2\u021f\u0220\5 \21\2\u0220\61\3\2\2\2\u0221\u0223\t\2\2\2\u0222\u0221"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\7\30\2\2"+
		"\u0225\u0227\7\3\2\2\u0226\u0222\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u022b"+
		"\3\2\2\2\u0228\u022a\5\64\33\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2"+
		"\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\63\3\2\2\2\u022d\u022b"+
		"\3\2\2\2\u022e\u022f\7&\2\2\u022f\u0236\7\30\2\2\u0230\u0232\7,\2\2\u0231"+
		"\u0233\5\22\n\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3"+
		"\2\2\2\u0234\u0236\7-\2\2\u0235\u022e\3\2\2\2\u0235\u0230\3\2\2\2\u0236"+
		"\65\3\2\2\2L9@EKSVbemr|\u0085\u0088\u008a\u0097\u009e\u00a7\u00ae\u00b1"+
		"\u00b6\u00d4\u00de\u00e8\u00f1\u00f8\u00fd\u0103\u0109\u0111\u011a\u0123"+
		"\u012c\u0135\u013e\u0148\u0151\u0159\u015b\u0167\u016b\u017b\u017f\u0183"+
		"\u0189\u0192\u0199\u01a0\u01a6\u01a9\u01ae\u01b6\u01bc\u01c3\u01c6\u01cb"+
		"\u01d3\u01da\u01e3\u01e8\u01ed\u01f0\u01f5\u01fe\u0204\u0206\u020a\u0210"+
		"\u0217\u021b\u0222\u0226\u022b\u0232\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}