// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/Ex6/Ex6/Ex6\LabeledExpr6.g4 by ANTLR 4.10.1
package Ex6.Ex6.Ex6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExpr6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, NORMAL=2, RECURSO=3, SETEMBRO=4, TRABALHO=5, NUMERO=6, LETRA=7, 
		VIRGULA=8, NEWLINE=9, NOTA=10, TURMA=11;
	public static final int
		RULE_prog = 0, RULE_stat = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'NORMAL:'", "'RECURSO:'", "'SETEMBRO:'", "'TRABALH0:'", 
			null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "NORMAL", "RECURSO", "SETEMBRO", "TRABALHO", "NUMERO", 
			"LETRA", "VIRGULA", "NEWLINE", "NOTA", "TURMA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "LabeledExpr6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExpr6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr6Visitor ) return ((LabeledExpr6Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			stat();
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HighergradeContext extends StatContext {
		public TerminalNode TIPO() { return getToken(LabeledExpr6Parser.TIPO, 0); }
		public List<TerminalNode> NOTA() { return getTokens(LabeledExpr6Parser.NOTA); }
		public TerminalNode NOTA(int i) {
			return getToken(LabeledExpr6Parser.NOTA, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LabeledExpr6Parser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LabeledExpr6Parser.VIRGULA, i);
		}
		public TerminalNode TRABALHO() { return getToken(LabeledExpr6Parser.TRABALHO, 0); }
		public TerminalNode NUMERO() { return getToken(LabeledExpr6Parser.NUMERO, 0); }
		public TerminalNode TURMA() { return getToken(LabeledExpr6Parser.TURMA, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExpr6Parser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public HighergradeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).enterHighergrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).exitHighergrade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr6Visitor ) return ((LabeledExpr6Visitor<? extends T>)visitor).visitHighergrade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExpr6Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr6Listener ) ((LabeledExpr6Listener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr6Visitor ) return ((LabeledExpr6Visitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			int _alt;
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				_localctx = new HighergradeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(TIPO);
				setState(7);
				match(NOTA);
				setState(8);
				match(VIRGULA);
				setState(9);
				match(TRABALHO);
				setState(10);
				match(NOTA);
				setState(11);
				match(VIRGULA);
				setState(12);
				match(NUMERO);
				setState(13);
				match(VIRGULA);
				setState(14);
				match(TURMA);
				setState(16); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(15);
						stat();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(18); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(20);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(NEWLINE);
				setState(23);
				stat();
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u0011\b\u0001\u000b\u0001\f\u0001\u0012\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000\u001a\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0001\u0001\u0000\u0000\u0000\u0006\u0007\u0005\u0001\u0000"+
		"\u0000\u0007\b\u0005\n\u0000\u0000\b\t\u0005\b\u0000\u0000\t\n\u0005\u0005"+
		"\u0000\u0000\n\u000b\u0005\n\u0000\u0000\u000b\f\u0005\b\u0000\u0000\f"+
		"\r\u0005\u0006\u0000\u0000\r\u000e\u0005\b\u0000\u0000\u000e\u0010\u0005"+
		"\u000b\u0000\u0000\u000f\u0011\u0003\u0002\u0001\u0000\u0010\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\t\u0000\u0000\u0015\u0019\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\t\u0000\u0000\u0017\u0019\u0003\u0002\u0001"+
		"\u0000\u0018\u0006\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u0002\u0012\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}