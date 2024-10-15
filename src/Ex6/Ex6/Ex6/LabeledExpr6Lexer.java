// Generated from C:/Users/jgasp/OneDrive/Documents/4º Semestre/LPROG/src/Ex6/Ex6/Ex6\LabeledExpr6.g4 by ANTLR 4.10.1
package Ex6.Ex6.Ex6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExpr6Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, NORMAL=2, RECURSO=3, SETEMBRO=4, TRABALHO=5, NUMERO=6, LETRA=7, 
		VIRGULA=8, NEWLINE=9, NOTA=10, TURMA=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "NORMAL", "RECURSO", "SETEMBRO", "TRABALHO", "NUMERO", "LETRA", 
			"VIRGULA", "NEWLINE", "NOTA", "TURMA"
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


	public LabeledExpr6Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000bc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004"+
		"\bO\b\b\u000b\b\f\bP\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bY\b\b\u0001\t\u0004\t\\\b\t\u000b\t\f\t]\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000"+
		"\u0004\u0001\u000009\u0001\u0000AZ\u0002\u0000\n\n\r\r\u0001\u0000\n\n"+
		"h\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000\u0000\u0003\u001c"+
		"\u0001\u0000\u0000\u0000\u0005$\u0001\u0000\u0000\u0000\u0007-\u0001\u0000"+
		"\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000"+
		"\rI\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011X\u0001"+
		"\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000"+
		"\u0000\u0017\u001b\u0003\u0003\u0001\u0000\u0018\u001b\u0003\u0005\u0002"+
		"\u0000\u0019\u001b\u0003\u0007\u0003\u0000\u001a\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001d\u0005N\u0000\u0000"+
		"\u001d\u001e\u0005O\u0000\u0000\u001e\u001f\u0005R\u0000\u0000\u001f "+
		"\u0005M\u0000\u0000 !\u0005A\u0000\u0000!\"\u0005L\u0000\u0000\"#\u0005"+
		":\u0000\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005R\u0000\u0000%&\u0005"+
		"E\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005U\u0000\u0000()\u0005R\u0000"+
		"\u0000)*\u0005S\u0000\u0000*+\u0005O\u0000\u0000+,\u0005:\u0000\u0000"+
		",\u0006\u0001\u0000\u0000\u0000-.\u0005S\u0000\u0000./\u0005E\u0000\u0000"+
		"/0\u0005T\u0000\u000001\u0005E\u0000\u000012\u0005M\u0000\u000023\u0005"+
		"B\u0000\u000034\u0005R\u0000\u000045\u0005O\u0000\u000056\u0005:\u0000"+
		"\u00006\b\u0001\u0000\u0000\u000078\u0005T\u0000\u000089\u0005R\u0000"+
		"\u00009:\u0005A\u0000\u0000:;\u0005B\u0000\u0000;<\u0005A\u0000\u0000"+
		"<=\u0005L\u0000\u0000=>\u0005H\u0000\u0000>?\u00050\u0000\u0000?@\u0005"+
		":\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000BC\u0007"+
		"\u0000\u0000\u0000CD\u0007\u0000\u0000\u0000DE\u0007\u0000\u0000\u0000"+
		"EF\u0007\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000GH\u0007\u0000\u0000"+
		"\u0000H\f\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000J\u000e\u0001"+
		"\u0000\u0000\u0000KL\u0005,\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MO\u0007\u0002\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QY\u0001\u0000"+
		"\u0000\u0000RY\u0007\u0003\u0000\u0000ST\u0005<\u0000\u0000TU\u0005E\u0000"+
		"\u0000UV\u0005O\u0000\u0000VW\u0005F\u0000\u0000WY\u0005>\u0000\u0000"+
		"XN\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000"+
		"\u0000Y\u0012\u0001\u0000\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u0014\u0001\u0000\u0000\u0000_`\u0007\u0000"+
		"\u0000\u0000`a\u0007\u0001\u0000\u0000ab\u0007\u0001\u0000\u0000b\u0016"+
		"\u0001\u0000\u0000\u0000\u0005\u0000\u001aPX]\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}