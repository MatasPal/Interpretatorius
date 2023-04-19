// Generated from C:/Studijos/2 kursas/2 semestras/Programavimo kalbu teorija/Grupes projektas/glang-interpreter-master/2/glang-interpreter-master/glang-interpreter-master/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TYPE=16, PRINT=17, 
		ID=18, INT=19, DOUBLE=20, COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TYPE", "PRINT", 
			"ID", "INT", "DOUBLE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'if'", "'{'", "'}'", "'else'", "'=='", "'!='", null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE", "PRINT", "ID", "INT", "DOUBLE", "COMMENT", 
			"WS"
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


	public GLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GLang.g4"; }

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
		"\u0004\u0000\u0016\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f_\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0004\u0011h\b\u0011\u000b\u0011\f\u0011i\u0001\u0012\u0004"+
		"\u0012m\b\u0012\u000b\u0012\f\u0012n\u0001\u0013\u0004\u0013r\b\u0013"+
		"\u000b\u0013\f\u0013s\u0001\u0013\u0001\u0013\u0004\u0013x\b\u0013\u000b"+
		"\u0013\f\u0013y\u0001\u0013\u0001\u0013\u0003\u0013~\b\u0013\u0001\u0013"+
		"\u0004\u0013\u0081\b\u0013\u000b\u0013\f\u0013\u0082\u0003\u0013\u0085"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u008b"+
		"\b\u0014\n\u0014\f\u0014\u008e\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0094\b\u0014\n\u0014\f\u0014\u0097\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u009b\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0004\u0015\u00a0\b\u0015\u000b\u0015\f\u0015\u00a1\u0001\u0015"+
		"\u0001\u0015\u0001\u0095\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0006\u0002\u0000AZaz\u0001"+
		"\u000009\u0002\u0000EEee\u0002\u0000++--\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u00b1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015B"+
		"\u0001\u0000\u0000\u0000\u0017D\u0001\u0000\u0000\u0000\u0019F\u0001\u0000"+
		"\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001dN\u0001\u0000\u0000\u0000"+
		"\u001f^\u0001\u0000\u0000\u0000!`\u0001\u0000\u0000\u0000#g\u0001\u0000"+
		"\u0000\u0000%l\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)\u009a"+
		"\u0001\u0000\u0000\u0000+\u009f\u0001\u0000\u0000\u0000-.\u0005;\u0000"+
		"\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005=\u0000\u00000\u0004\u0001"+
		"\u0000\u0000\u000012\u0005(\u0000\u00002\u0006\u0001\u0000\u0000\u0000"+
		"34\u0005)\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005*\u0000\u0000"+
		"6\n\u0001\u0000\u0000\u000078\u0005/\u0000\u00008\f\u0001\u0000\u0000"+
		"\u00009:\u0005%\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005+\u0000"+
		"\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0012\u0001"+
		"\u0000\u0000\u0000?@\u0005i\u0000\u0000@A\u0005f\u0000\u0000A\u0014\u0001"+
		"\u0000\u0000\u0000BC\u0005{\u0000\u0000C\u0016\u0001\u0000\u0000\u0000"+
		"DE\u0005}\u0000\u0000E\u0018\u0001\u0000\u0000\u0000FG\u0005e\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005e\u0000\u0000J\u001a"+
		"\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000LM\u0005=\u0000\u0000M\u001c"+
		"\u0001\u0000\u0000\u0000NO\u0005!\u0000\u0000OP\u0005=\u0000\u0000P\u001e"+
		"\u0001\u0000\u0000\u0000QR\u0005i\u0000\u0000RS\u0005n\u0000\u0000S_\u0005"+
		"t\u0000\u0000TU\u0005b\u0000\u0000UV\u0005o\u0000\u0000VW\u0005o\u0000"+
		"\u0000W_\u0005l\u0000\u0000XY\u0005d\u0000\u0000YZ\u0005o\u0000\u0000"+
		"Z[\u0005u\u0000\u0000[\\\u0005b\u0000\u0000\\]\u0005l\u0000\u0000]_\u0005"+
		"e\u0000\u0000^Q\u0001\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^X\u0001"+
		"\u0000\u0000\u0000_ \u0001\u0000\u0000\u0000`a\u0005p\u0000\u0000ab\u0005"+
		"r\u0000\u0000bc\u0005i\u0000\u0000cd\u0005n\u0000\u0000de\u0005t\u0000"+
		"\u0000e\"\u0001\u0000\u0000\u0000fh\u0007\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000j$\u0001\u0000\u0000\u0000km\u0007\u0001\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o&\u0001\u0000\u0000\u0000pr\u0007\u0001"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uw\u0005.\u0000\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u0084\u0001\u0000\u0000\u0000{}\u0007\u0002\u0000\u0000|~\u0007"+
		"\u0003\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"/\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u008c\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\b\u0004\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u009b\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005/\u0000\u0000\u0090"+
		"\u0091\u0005*\u0000\u0000\u0091\u0095\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\t\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009b\u0005/\u0000"+
		"\u0000\u009a\u0086\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0014\u0000"+
		"\u0000\u009d*\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0005\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0015\u0000\u0000"+
		"\u00a4,\u0001\u0000\u0000\u0000\r\u0000^insy}\u0082\u0084\u008c\u0095"+
		"\u009a\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}