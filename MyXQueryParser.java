// Generated from MyXQuery.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyXQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, FILENAME=33, STRING=34, NAME=35, STAR=36, DOT=37, DOTDOT=38, 
		TEXT=39, WS=40;
	public static final int
		RULE_ap = 0, RULE_filename = 1, RULE_rp = 2, RULE_f = 3, RULE_xq = 4, 
		RULE_stringConst = 5, RULE_attList = 6, RULE_forClause = 7, RULE_letClause = 8, 
		RULE_whereClause = 9, RULE_returnClause = 10, RULE_cond = 11, RULE_var = 12;
	public static final String[] ruleNames = {
		"ap", "filename", "rp", "f", "xq", "stringConst", "attList", "forClause", 
		"letClause", "whereClause", "returnClause", "cond", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc'", "'('", "')'", "'/'", "'//'", "'@'", "'['", "']'", "','", 
		"'='", "'eq'", "'=='", "'is'", "'and'", "'or'", "'not'", "'<'", "'>'", 
		"'{'", "'}'", "'</'", "'join'", "'for'", "'in'", "'let'", "':='", "'where'", 
		"'return'", "'empty'", "'some'", "'satisfies'", "'$'", null, null, null, 
		"'*'", "'.'", "'..'", "'text()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "FILENAME", "STRING", 
		"NAME", "STAR", "DOT", "DOTDOT", "TEXT", "WS"
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
	public String getGrammarFileName() { return "MyXQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyXQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApChildrenContext extends ApContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterApChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitApChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitApChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApFindAllContext extends ApContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApFindAllContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterApFindAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitApFindAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitApFindAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(T__1);
				setState(28);
				filename();
				setState(29);
				match(T__2);
				setState(30);
				match(T__3);
				setState(31);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApFindAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__0);
				setState(34);
				match(T__1);
				setState(35);
				filename();
				setState(36);
				match(T__2);
				setState(37);
				match(T__4);
				setState(38);
				rp(0);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(MyXQueryParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FILENAME);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WildcardContext extends RpContext {
		public TerminalNode STAR() { return getToken(MyXQueryParser.STAR, 0); }
		public WildcardContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RpContext {
		public TerminalNode NAME() { return getToken(MyXQueryParser.NAME, 0); }
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpChildrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFindAllContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpFindAllContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpFindAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpFindAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpFindAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpParenthesesContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpParenthesesContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpDoubleContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpDoubleContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TerminalNode TEXT() { return getToken(MyXQueryParser.TEXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentDirContext extends RpContext {
		public TerminalNode DOTDOT() { return getToken(MyXQueryParser.DOTDOT, 0); }
		public ParentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterParentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitParentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitParentDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDirContext extends RpContext {
		public TerminalNode DOT() { return getToken(MyXQueryParser.DOT, 0); }
		public CurrentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterCurrentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitCurrentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitCurrentDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends RpContext {
		public TerminalNode NAME() { return getToken(MyXQueryParser.NAME, 0); }
		public NameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				match(NAME);
				}
				break;
			case STAR:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new CurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(DOT);
				}
				break;
			case DOTDOT:
				{
				_localctx = new ParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(DOTDOT);
				}
				break;
			case TEXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(TEXT);
				}
				break;
			case T__5:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__5);
				setState(51);
				match(NAME);
				}
				break;
			case T__1:
				{
				_localctx = new RpParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__1);
				setState(53);
				rp(0);
				setState(54);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RpChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(58);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(59);
						match(T__3);
						setState(60);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpFindAllContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(61);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(62);
						match(T__4);
						setState(63);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpDoubleContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(64);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(65);
						match(T__8);
						setState(66);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(T__6);
						setState(69);
						f(0);
						setState(70);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(76);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FParenthesesContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FParenthesesContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterFParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitFParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitFParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public EqualContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterNotF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitNotF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitNotF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public IsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FAndFContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FAndFContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterFAndF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitFAndF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitFAndF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FOrFContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FOrFContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterFOrF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitFOrF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitFOrF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpExistsContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpExistsContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterRpExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitRpExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitRpExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new RpExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				match(T__9);
				setState(81);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__10);
				setState(85);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new IsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				rp(0);
				setState(88);
				match(T__11);
				setState(89);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new IsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				rp(0);
				setState(92);
				match(T__12);
				setState(93);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__1);
				setState(96);
				f(0);
				setState(97);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new NotFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__15);
				setState(100);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndFContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						match(T__13);
						setState(105);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrFContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						match(T__14);
						setState(108);
						f(3);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MakeElemContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(MyXQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MyXQueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public MakeElemContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterMakeElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitMakeElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitMakeElem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterFLWR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitFLWR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitFLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQChildrenContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQChildrenContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQParenthesesContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQParenthesesContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQDoubleContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQDoubleContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<AttListContext> attList() {
			return getRuleContexts(AttListContext.class);
		}
		public AttListContext attList(int i) {
			return getRuleContext(AttListContext.class,i);
		}
		public JoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetXQContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterLetXQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitLetXQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitLetXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsolutePathContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public AbsolutePathContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitAbsolutePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitAbsolutePath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQFindAllContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQFindAllContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQFindAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQFindAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQFindAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MakeTextContext extends XqContext {
		public StringConstContext stringConst() {
			return getRuleContext(StringConstContext.class,0);
		}
		public MakeTextContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterMakeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitMakeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitMakeText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_xq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				var();
				}
				break;
			case STRING:
				{
				_localctx = new MakeTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				stringConst();
				}
				break;
			case T__0:
				{
				_localctx = new AbsolutePathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T__1);
				setState(119);
				xq(0);
				setState(120);
				match(T__2);
				}
				break;
			case T__16:
				{
				_localctx = new MakeElemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__16);
				setState(123);
				match(NAME);
				setState(124);
				match(T__17);
				setState(125);
				match(T__18);
				setState(126);
				xq(0);
				setState(127);
				match(T__19);
				setState(128);
				match(T__20);
				setState(129);
				match(NAME);
				setState(130);
				match(T__17);
				}
				break;
			case T__22:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				forClause();
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(133);
					letClause();
					}
					break;
				case T__26:
				case T__27:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
					{
					setState(137);
					whereClause();
					}
					break;
				case T__27:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				returnClause();
				}
				break;
			case T__24:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				letClause();
				setState(144);
				xq(2);
				}
				break;
			case T__21:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(T__21);
				setState(147);
				match(T__1);
				setState(148);
				xq(0);
				setState(149);
				match(T__8);
				setState(150);
				xq(0);
				setState(151);
				match(T__8);
				setState(152);
				attList();
				setState(153);
				match(T__8);
				setState(154);
				attList();
				setState(155);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XQDoubleContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(T__8);
						setState(161);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XQChildrenContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						match(T__3);
						setState(164);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQFindAllContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						match(T__4);
						setState(167);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(172);
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

	public static class StringConstContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyXQueryParser.STRING, 0); }
		public StringConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitStringConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitStringConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstContext stringConst() throws RecognitionException {
		StringConstContext _localctx = new StringConstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(STRING);
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

	public static class AttListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(MyXQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MyXQueryParser.NAME, i);
		}
		public AttListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterAttList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitAttList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitAttList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttListContext attList() throws RecognitionException {
		AttListContext _localctx = new AttListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__6);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(176);
				match(NAME);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(179);
				match(T__8);
				setState(180);
				match(NAME);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__7);
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__22);
			setState(189);
			var();
			setState(190);
			match(T__23);
			setState(191);
			xq(0);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(192);
				match(T__8);
				setState(193);
				var();
				setState(194);
				match(T__23);
				setState(195);
				xq(0);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__24);
			setState(203);
			var();
			setState(204);
			match(T__25);
			setState(205);
			xq(0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(206);
				match(T__8);
				setState(207);
				var();
				setState(208);
				match(T__25);
				setState(209);
				xq(0);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__26);
			setState(217);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__27);
			setState(220);
			xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XQEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondParenthesesContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondParenthesesContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterCondParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitCondParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitCondParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterNotCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitNotCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitNotCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterXQIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitXQIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitXQIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeSatisfiesContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SomeSatisfiesContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterSomeSatisfies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitSomeSatisfies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitSomeSatisfies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterCondAndCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitCondAndCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitCondAndCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterCondOrCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitCondOrCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitCondOrCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new XQEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(223);
				xq(0);
				setState(224);
				match(T__9);
				setState(225);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new XQEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				xq(0);
				setState(228);
				match(T__10);
				setState(229);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new XQIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				xq(0);
				setState(232);
				match(T__11);
				setState(233);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new XQIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				xq(0);
				setState(236);
				match(T__12);
				setState(237);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new XQEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__28);
				setState(240);
				match(T__1);
				setState(241);
				xq(0);
				setState(242);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new SomeSatisfiesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(T__29);
				setState(245);
				var();
				setState(246);
				match(T__23);
				setState(247);
				xq(0);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(248);
					match(T__8);
					setState(249);
					var();
					setState(250);
					match(T__23);
					setState(251);
					xq(0);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__30);
				setState(259);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(T__1);
				setState(262);
				cond(0);
				setState(263);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(T__15);
				setState(266);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(269);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(270);
						match(T__13);
						setState(271);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(T__14);
						setState(274);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MyXQueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyXQueryListener ) ((MyXQueryListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyXQueryVisitor ) return ((MyXQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__31);
			setState(281);
			match(NAME);
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
		case 2:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 3:
			return f_sempred((FContext)_localctx, predIndex);
		case 4:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 11:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a"+
		"\n\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00ab\n\6\f\6\16\6\u00ae\13\6\3\7\3\7\3\b\3\b\5\b\u00b4\n\b\3\b\3"+
		"\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9\13\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0100\n\r"+
		"\f\r\16\r\u0103\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\16\3\16\3"+
		"\16\3\16\2\6\6\b\n\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u013d"+
		"\2*\3\2\2\2\4,\3\2\2\2\6:\3\2\2\2\bg\3\2\2\2\n\u009f\3\2\2\2\f\u00af\3"+
		"\2\2\2\16\u00b1\3\2\2\2\20\u00be\3\2\2\2\22\u00cc\3\2\2\2\24\u00da\3\2"+
		"\2\2\26\u00dd\3\2\2\2\30\u010d\3\2\2\2\32\u011a\3\2\2\2\34\35\7\3\2\2"+
		"\35\36\7\4\2\2\36\37\5\4\3\2\37 \7\5\2\2 !\7\6\2\2!\"\5\6\4\2\"+\3\2\2"+
		"\2#$\7\3\2\2$%\7\4\2\2%&\5\4\3\2&\'\7\5\2\2\'(\7\7\2\2()\5\6\4\2)+\3\2"+
		"\2\2*\34\3\2\2\2*#\3\2\2\2+\3\3\2\2\2,-\7#\2\2-\5\3\2\2\2./\b\4\1\2/;"+
		"\7%\2\2\60;\7&\2\2\61;\7\'\2\2\62;\7(\2\2\63;\7)\2\2\64\65\7\b\2\2\65"+
		";\7%\2\2\66\67\7\4\2\2\678\5\6\4\289\7\5\2\29;\3\2\2\2:.\3\2\2\2:\60\3"+
		"\2\2\2:\61\3\2\2\2:\62\3\2\2\2:\63\3\2\2\2:\64\3\2\2\2:\66\3\2\2\2;L\3"+
		"\2\2\2<=\f\6\2\2=>\7\6\2\2>K\5\6\4\7?@\f\5\2\2@A\7\7\2\2AK\5\6\4\6BC\f"+
		"\3\2\2CD\7\13\2\2DK\5\6\4\4EF\f\4\2\2FG\7\t\2\2GH\5\b\5\2HI\7\n\2\2IK"+
		"\3\2\2\2J<\3\2\2\2J?\3\2\2\2JB\3\2\2\2JE\3\2\2\2KN\3\2\2\2LJ\3\2\2\2L"+
		"M\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\b\5\1\2Ph\5\6\4\2QR\5\6\4\2RS\7\f\2\2"+
		"ST\5\6\4\2Th\3\2\2\2UV\5\6\4\2VW\7\r\2\2WX\5\6\4\2Xh\3\2\2\2YZ\5\6\4\2"+
		"Z[\7\16\2\2[\\\5\6\4\2\\h\3\2\2\2]^\5\6\4\2^_\7\17\2\2_`\5\6\4\2`h\3\2"+
		"\2\2ab\7\4\2\2bc\5\b\5\2cd\7\5\2\2dh\3\2\2\2ef\7\22\2\2fh\5\b\5\3gO\3"+
		"\2\2\2gQ\3\2\2\2gU\3\2\2\2gY\3\2\2\2g]\3\2\2\2ga\3\2\2\2ge\3\2\2\2hq\3"+
		"\2\2\2ij\f\5\2\2jk\7\20\2\2kp\5\b\5\6lm\f\4\2\2mn\7\21\2\2np\5\b\5\5o"+
		"i\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\t\3\2\2\2sq\3\2\2\2"+
		"tu\b\6\1\2u\u00a0\5\32\16\2v\u00a0\5\f\7\2w\u00a0\5\2\2\2xy\7\4\2\2yz"+
		"\5\n\6\2z{\7\5\2\2{\u00a0\3\2\2\2|}\7\23\2\2}~\7%\2\2~\177\7\24\2\2\177"+
		"\u0080\7\25\2\2\u0080\u0081\5\n\6\2\u0081\u0082\7\26\2\2\u0082\u0083\7"+
		"\27\2\2\u0083\u0084\7%\2\2\u0084\u0085\7\24\2\2\u0085\u00a0\3\2\2\2\u0086"+
		"\u0089\5\20\t\2\u0087\u008a\5\22\n\2\u0088\u008a\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008e\5\24\13\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\5\26\f\2\u0090\u00a0\3\2\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\5\n\6\4\u0093\u00a0\3\2\2\2\u0094\u0095\7\30\2\2\u0095\u0096\7"+
		"\4\2\2\u0096\u0097\5\n\6\2\u0097\u0098\7\13\2\2\u0098\u0099\5\n\6\2\u0099"+
		"\u009a\7\13\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\13\2\2\u009c\u009d"+
		"\5\16\b\2\u009d\u009e\7\5\2\2\u009e\u00a0\3\2\2\2\u009ft\3\2\2\2\u009f"+
		"v\3\2\2\2\u009fw\3\2\2\2\u009fx\3\2\2\2\u009f|\3\2\2\2\u009f\u0086\3\2"+
		"\2\2\u009f\u0091\3\2\2\2\u009f\u0094\3\2\2\2\u00a0\u00ac\3\2\2\2\u00a1"+
		"\u00a2\f\7\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00ab\5\n\6\b\u00a4\u00a5\f"+
		"\t\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00ab\5\6\4\2\u00a7\u00a8\f\b\2\2\u00a8"+
		"\u00a9\7\7\2\2\u00a9\u00ab\5\6\4\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$\2\2"+
		"\u00b0\r\3\2\2\2\u00b1\u00b3\7\t\2\2\u00b2\u00b4\7%\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6"+
		"\u00b8\7%\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\n\2\2\u00bd\17\3\2\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\5\32"+
		"\16\2\u00c0\u00c1\7\32\2\2\u00c1\u00c9\5\n\6\2\u00c2\u00c3\7\13\2\2\u00c3"+
		"\u00c4\5\32\16\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6\5\n\6\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\33\2"+
		"\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7\34\2\2\u00cf\u00d7\5\n\6\2\u00d0"+
		"\u00d1\7\13\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4"+
		"\5\n\6\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00da\u00db\7\35\2\2\u00db\u00dc\5\30\r\2\u00dc\25\3\2\2\2\u00dd\u00de"+
		"\7\36\2\2\u00de\u00df\5\n\6\2\u00df\27\3\2\2\2\u00e0\u00e1\b\r\1\2\u00e1"+
		"\u00e2\5\n\6\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\n\6\2\u00e4\u010e\3\2"+
		"\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\7\r\2\2\u00e7\u00e8\5\n\6\2\u00e8"+
		"\u010e\3\2\2\2\u00e9\u00ea\5\n\6\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\5"+
		"\n\6\2\u00ec\u010e\3\2\2\2\u00ed\u00ee\5\n\6\2\u00ee\u00ef\7\17\2\2\u00ef"+
		"\u00f0\5\n\6\2\u00f0\u010e\3\2\2\2\u00f1\u00f2\7\37\2\2\u00f2\u00f3\7"+
		"\4\2\2\u00f3\u00f4\5\n\6\2\u00f4\u00f5\7\5\2\2\u00f5\u010e\3\2\2\2\u00f6"+
		"\u00f7\7 \2\2\u00f7\u00f8\5\32\16\2\u00f8\u00f9\7\32\2\2\u00f9\u0101\5"+
		"\n\6\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc\5\32\16\2\u00fc\u00fd\7\32\2\2"+
		"\u00fd\u00fe\5\n\6\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\7!\2\2\u0105\u0106\5\30\r\7\u0106\u010e\3\2"+
		"\2\2\u0107\u0108\7\4\2\2\u0108\u0109\5\30\r\2\u0109\u010a\7\5\2\2\u010a"+
		"\u010e\3\2\2\2\u010b\u010c\7\22\2\2\u010c\u010e\5\30\r\3\u010d\u00e0\3"+
		"\2\2\2\u010d\u00e5\3\2\2\2\u010d\u00e9\3\2\2\2\u010d\u00ed\3\2\2\2\u010d"+
		"\u00f1\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0117\3\2\2\2\u010f\u0110\f\5\2\2\u0110\u0111\7\20\2\2\u0111"+
		"\u0116\5\30\r\6\u0112\u0113\f\4\2\2\u0113\u0114\7\21\2\2\u0114\u0116\5"+
		"\30\r\5\u0115\u010f\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\31\3\2\2\2\u0119\u0117\3\2\2"+
		"\2\u011a\u011b\7\"\2\2\u011b\u011c\7%\2\2\u011c\33\3\2\2\2\26*:JLgoq\u0089"+
		"\u008d\u009f\u00aa\u00ac\u00b3\u00b9\u00c9\u00d7\u0101\u010d\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}