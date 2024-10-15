// Generated from C:/Users/jgasp/OneDrive/Documents/4� Semestre/LPROG/src/ex1/ex1/ex2/ex1/ex1/ex2\LabeledExpr2.g4 by ANTLR 4.10.1
package Ex2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExpr2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, NUMBER=3, MENOR=4, MAIOR=5, IGUAL=6, DIFERENTE=7;
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
			null, "' '", null, null, "'<'", "'>'", "'='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "NUMBER", "MENOR", "MAIOR", "IGUAL", "DIFERENTE"
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
	public String getGrammarFileName() { return "LabeledExpr2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExpr2Parser(TokenStream input) {
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
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitProg(this);
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
	public static class ValidateMaiorContext extends StatContext {
		public List<TerminalNode> NUMBER() { return getTokens(LabeledExpr2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LabeledExpr2Parser.NUMBER, i);
		}
		public TerminalNode MAIOR() { return getToken(LabeledExpr2Parser.MAIOR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExpr2Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ValidateMaiorContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterValidateMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitValidateMaior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitValidateMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidateIgualContext extends StatContext {
		public List<TerminalNode> NUMBER() { return getTokens(LabeledExpr2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LabeledExpr2Parser.NUMBER, i);
		}
		public TerminalNode IGUAL() { return getToken(LabeledExpr2Parser.IGUAL, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExpr2Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ValidateIgualContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterValidateIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitValidateIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitValidateIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExpr2Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidateDiferenteContext extends StatContext {
		public List<TerminalNode> NUMBER() { return getTokens(LabeledExpr2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LabeledExpr2Parser.NUMBER, i);
		}
		public TerminalNode DIFERENTE() { return getToken(LabeledExpr2Parser.DIFERENTE, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExpr2Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ValidateDiferenteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterValidateDiferente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitValidateDiferente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitValidateDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidateMenorContext extends StatContext {
		public List<TerminalNode> NUMBER() { return getTokens(LabeledExpr2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LabeledExpr2Parser.NUMBER, i);
		}
		public TerminalNode MENOR() { return getToken(LabeledExpr2Parser.MENOR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExpr2Parser.NEWLINE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ValidateMenorContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterValidateMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitValidateMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitValidateMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidContext extends StatContext {
		public InvalidContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).enterInvalid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExpr2Listener ) ((LabeledExpr2Listener)listener).exitInvalid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExpr2Visitor ) return ((LabeledExpr2Visitor<? extends T>)visitor).visitInvalid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ValidateMenorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(NUMBER);
				setState(7);
				match(T__0);
				setState(8);
				match(MENOR);
				setState(9);
				match(T__0);
				setState(10);
				match(NUMBER);
				setState(11);
				match(NEWLINE);
				setState(12);
				stat();
				}
				break;
			case 2:
				_localctx = new ValidateMaiorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(NUMBER);
				setState(14);
				match(T__0);
				setState(15);
				match(MAIOR);
				setState(16);
				match(T__0);
				setState(17);
				match(NUMBER);
				setState(18);
				match(NEWLINE);
				setState(19);
				stat();
				}
				break;
			case 3:
				_localctx = new ValidateIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(NUMBER);
				setState(21);
				match(T__0);
				setState(22);
				match(IGUAL);
				setState(23);
				match(T__0);
				setState(24);
				match(NUMBER);
				setState(25);
				match(NEWLINE);
				setState(26);
				stat();
				}
				break;
			case 4:
				_localctx = new ValidateDiferenteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(NUMBER);
				setState(28);
				match(T__0);
				setState(29);
				match(DIFERENTE);
				setState(30);
				match(T__0);
				setState(31);
				match(NUMBER);
				setState(32);
				match(NEWLINE);
				setState(33);
				stat();
				}
				break;
			case 5:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				match(NEWLINE);
				setState(35);
				stat();
				}
				break;
			case 6:
				_localctx = new InvalidContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				matchWildcard();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000*\u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005"+
		"\u0001\u0001\u0000\u0000\u0000\u0006\u0007\u0005\u0003\u0000\u0000\u0007"+
		"\b\u0005\u0001\u0000\u0000\b\t\u0005\u0004\u0000\u0000\t\n\u0005\u0001"+
		"\u0000\u0000\n\u000b\u0005\u0003\u0000\u0000\u000b\f\u0005\u0002\u0000"+
		"\u0000\f&\u0003\u0002\u0001\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e"+
		"\u000f\u0005\u0001\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010"+
		"\u0011\u0005\u0001\u0000\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012"+
		"\u0013\u0005\u0002\u0000\u0000\u0013&\u0003\u0002\u0001\u0000\u0014\u0015"+
		"\u0005\u0003\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017"+
		"\u0005\u0006\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u0019"+
		"\u0005\u0003\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a&\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d\u0005"+
		"\u0001\u0000\u0000\u001d\u001e\u0005\u0007\u0000\u0000\u001e\u001f\u0005"+
		"\u0001\u0000\u0000\u001f \u0005\u0003\u0000\u0000 !\u0005\u0002\u0000"+
		"\u0000!&\u0003\u0002\u0001\u0000\"#\u0005\u0002\u0000\u0000#&\u0003\u0002"+
		"\u0001\u0000$&\t\u0000\u0000\u0000%\u0006\u0001\u0000\u0000\u0000%\r\u0001"+
		"\u0000\u0000\u0000%\u0014\u0001\u0000\u0000\u0000%\u001b\u0001\u0000\u0000"+
		"\u0000%\"\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0003\u0001"+
		"\u0000\u0000\u0000\u0001%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}