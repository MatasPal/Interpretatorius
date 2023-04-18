package gen;// Generated from C:/Studijos/2 kursas/2 semestras/Programavimo kalbu teorija/Grupes projektas/glang-interpreter-master/2/glang-interpreter-master/glang-interpreter-master/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0
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
		ID=18, INT=19, COMMENT=20, WS=21;
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
			"ID", "INT", "COMMENT", "WS"
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
			null, null, null, null, "TYPE", "PRINT", "ID", "INT", "COMMENT", "WS"
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
		"\u0004\u0000\u0015\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000fW\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011"+
		"`\b\u0011\u000b\u0011\f\u0011a\u0001\u0012\u0004\u0012e\b\u0012\u000b"+
		"\u0012\f\u0012f\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013m\b\u0013\n\u0013\f\u0013p\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013v\b\u0013\n\u0013\f\u0013y\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013}\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014\u0082\b\u0014\u000b\u0014\f\u0014\u0083\u0001\u0014"+
		"\u0001\u0014\u0001w\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u008d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000"+
		"\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071"+
		"\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"+
		"\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011;\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015@"+
		"\u0001\u0000\u0000\u0000\u0017B\u0001\u0000\u0000\u0000\u0019D\u0001\u0000"+
		"\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dL\u0001\u0000\u0000\u0000"+
		"\u001fV\u0001\u0000\u0000\u0000!X\u0001\u0000\u0000\u0000#_\u0001\u0000"+
		"\u0000\u0000%d\u0001\u0000\u0000\u0000\'|\u0001\u0000\u0000\u0000)\u0081"+
		"\u0001\u0000\u0000\u0000+,\u0005;\u0000\u0000,\u0002\u0001\u0000\u0000"+
		"\u0000-.\u0005=\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005(\u0000"+
		"\u00000\u0006\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\b\u0001\u0000"+
		"\u0000\u000034\u0005*\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005/"+
		"\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005%\u0000\u00008\u000e\u0001"+
		"\u0000\u0000\u00009:\u0005+\u0000\u0000:\u0010\u0001\u0000\u0000\u0000"+
		";<\u0005-\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000"+
		">?\u0005f\u0000\u0000?\u0014\u0001\u0000\u0000\u0000@A\u0005{\u0000\u0000"+
		"A\u0016\u0001\u0000\u0000\u0000BC\u0005}\u0000\u0000C\u0018\u0001\u0000"+
		"\u0000\u0000DE\u0005e\u0000\u0000EF\u0005l\u0000\u0000FG\u0005s\u0000"+
		"\u0000GH\u0005e\u0000\u0000H\u001a\u0001\u0000\u0000\u0000IJ\u0005=\u0000"+
		"\u0000JK\u0005=\u0000\u0000K\u001c\u0001\u0000\u0000\u0000LM\u0005!\u0000"+
		"\u0000MN\u0005=\u0000\u0000N\u001e\u0001\u0000\u0000\u0000OP\u0005i\u0000"+
		"\u0000PQ\u0005n\u0000\u0000QW\u0005t\u0000\u0000RS\u0005b\u0000\u0000"+
		"ST\u0005o\u0000\u0000TU\u0005o\u0000\u0000UW\u0005l\u0000\u0000VO\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000W \u0001\u0000\u0000\u0000"+
		"XY\u0005p\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005"+
		"n\u0000\u0000\\]\u0005t\u0000\u0000]\"\u0001\u0000\u0000\u0000^`\u0007"+
		"\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b$\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g&\u0001"+
		"\u0000\u0000\u0000hi\u0005/\u0000\u0000ij\u0005/\u0000\u0000jn\u0001\u0000"+
		"\u0000\u0000km\b\u0002\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o}\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005/\u0000\u0000rs\u0005"+
		"*\u0000\u0000sw\u0001\u0000\u0000\u0000tv\t\u0000\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0005*\u0000\u0000{}\u0005/\u0000\u0000|h\u0001\u0000\u0000\u0000"+
		"|q\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006\u0013"+
		"\u0000\u0000\u007f(\u0001\u0000\u0000\u0000\u0080\u0082\u0007\u0003\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u0014\u0000"+
		"\u0000\u0086*\u0001\u0000\u0000\u0000\b\u0000Vafnw|\u0083\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}