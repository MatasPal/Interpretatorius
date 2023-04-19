
// Generated from C:/Users/Vartotojas/interpretatorius/Interpretatorius/glang-interpreter-master/src/main/antlr4/edu/ktu/glang\GLang.g4 by ANTLR 4.12.0

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 

		T__17=18, T__18=19, TYPE=20, PRINT=21, ID=22, INT=23, DOUBLE=24, COMMENT=25, 

		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 

			"T__17", "T__18", "TYPE", "PRINT", "ID", "INT", "DOUBLE", "COMMENT", 

			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {


			null, "';'", "'='", "'++'", "'('", "')'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'if'", "'{'", "'}'", "'else'", "'for'", "'=='", "'!='", "'<'", 
			"'>'", null, "'print'"


		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 

			null, null, null, null, null, null, null, null, "TYPE", "PRINT", "ID", 
			"INT", "DOUBLE", "COMMENT", "WS"

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


		"\u0004\u0000\u001a\u00b8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+

		"\u0004\u0000\u001a\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+


		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"r\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0004\u0015{\b\u0015\u000b\u0015\f\u0015|\u0001"+
		"\u0016\u0004\u0016\u0080\b\u0016\u000b\u0016\f\u0016\u0081\u0001\u0017"+
		"\u0004\u0017\u0085\b\u0017\u000b\u0017\f\u0017\u0086\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u008b\b\u0017\u000b\u0017\f\u0017\u008c\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0091\b\u0017\u0001\u0017\u0004\u0017\u0094\b"+
		"\u0017\u000b\u0017\f\u0017\u0095\u0003\u0017\u0098\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u009e\b\u0018\n\u0018"+
		"\f\u0018\u00a1\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u00a7\b\u0018\n\u0018\f\u0018\u00aa\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00ae\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004"+
		"\u0019\u00b3\b\u0019\u000b\u0019\f\u0019\u00b4\u0001\u0019\u0001\u0019"+
		"\u0001\u00a8\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0006\u0002"+
		"\u0000AZaz\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0002\u0000\n"+
		"\n\r\r\u0003\u0000\t\n\r\r  \u00c4\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000"+
		"\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007"+
		"<\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rB\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000"+
		"\u0011F\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J"+
		"\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019O\u0001\u0000"+
		"\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000"+
		"\u001fZ\u0001\u0000\u0000\u0000!]\u0001\u0000\u0000\u0000#`\u0001\u0000"+
		"\u0000\u0000%b\u0001\u0000\u0000\u0000\'q\u0001\u0000\u0000\u0000)s\u0001"+
		"\u0000\u0000\u0000+z\u0001\u0000\u0000\u0000-\u007f\u0001\u0000\u0000"+
		"\u0000/\u0084\u0001\u0000\u0000\u00001\u00ad\u0001\u0000\u0000\u00003"+
		"\u00b2\u0001\u0000\u0000\u000056\u0005;\u0000\u00006\u0002\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"+\u0000\u0000:;\u0005+\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005"+
		"(\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?\n\u0001"+
		"\u0000\u0000\u0000@A\u0005*\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005"+
		"/\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005%\u0000\u0000E\u0010"+
		"\u0001\u0000\u0000\u0000FG\u0005+\u0000\u0000G\u0012\u0001\u0000\u0000"+
		"\u0000HI\u0005-\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005i\u0000"+
		"\u0000KL\u0005f\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MN\u0005{\u0000"+
		"\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005}\u0000\u0000P\u001a\u0001"+
		"\u0000\u0000\u0000QR\u0005e\u0000\u0000RS\u0005l\u0000\u0000ST\u0005s"+
		"\u0000\u0000TU\u0005e\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VW\u0005"+
		"f\u0000\u0000WX\u0005o\u0000\u0000XY\u0005r\u0000\u0000Y\u001e\u0001\u0000"+
		"\u0000\u0000Z[\u0005=\u0000\u0000[\\\u0005=\u0000\u0000\\ \u0001\u0000"+
		"\u0000\u0000]^\u0005!\u0000\u0000^_\u0005=\u0000\u0000_\"\u0001\u0000"+
		"\u0000\u0000`a\u0005<\u0000\u0000a$\u0001\u0000\u0000\u0000bc\u0005>\u0000"+
		"\u0000c&\u0001\u0000\u0000\u0000de\u0005i\u0000\u0000ef\u0005n\u0000\u0000"+
		"fr\u0005t\u0000\u0000gh\u0005b\u0000\u0000hi\u0005o\u0000\u0000ij\u0005"+
		"o\u0000\u0000jr\u0005l\u0000\u0000kl\u0005d\u0000\u0000lm\u0005o\u0000"+
		"\u0000mn\u0005u\u0000\u0000no\u0005b\u0000\u0000op\u0005l\u0000\u0000"+
		"pr\u0005e\u0000\u0000qd\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000\u0000"+
		"qk\u0001\u0000\u0000\u0000r(\u0001\u0000\u0000\u0000st\u0005p\u0000\u0000"+
		"tu\u0005r\u0000\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000wx\u0005"+
		"t\u0000\u0000x*\u0001\u0000\u0000\u0000y{\u0007\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000},\u0001\u0000\u0000\u0000~\u0080\u0007\u0001"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082.\u0001\u0000\u0000\u0000\u0083\u0085\u0007\u0001\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0005.\u0000\u0000\u0089"+
		"\u008b\u0007\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u0097\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0007\u0002\u0000\u0000\u008f\u0091\u0007\u0003\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0001\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u00980\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005/\u0000\u0000\u009a\u009b\u0005/\u0000\u0000\u009b\u009f\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\b\u0004\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005/\u0000\u0000"+
		"\u00a3\u00a4\u0005*\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\t\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005*\u0000\u0000\u00ac\u00ae\u0005"+
		"/\u0000\u0000\u00ad\u0099\u0001\u0000\u0000\u0000\u00ad\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0006\u0018"+
		"\u0000\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0005\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0019\u0000"+
		"\u0000\u00b74\u0001\u0000\u0000\u0000\r\u0000q|\u0081\u0086\u008c\u0090"+
		"\u0095\u0097\u009f\u00a8\u00ad\u00b4\u0001\u0006\u0000\u0000";

		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013q\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0004\u0015z\b\u0015\u000b\u0015\f\u0015{\u0001\u0016\u0004"+
		"\u0016\u007f\b\u0016\u000b\u0016\f\u0016\u0080\u0001\u0017\u0004\u0017"+
		"\u0084\b\u0017\u000b\u0017\f\u0017\u0085\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u008a\b\u0017\u000b\u0017\f\u0017\u008b\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0092\b\u0018\n\u0018\f\u0018\u0095"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u009b"+
		"\b\u0018\n\u0018\f\u0018\u009e\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00a2\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00a7\b"+
		"\u0019\u000b\u0019\f\u0019\u00a8\u0001\u0019\u0001\u0019\u0001\u009c\u0000"+
		"\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009"+
		"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00b5\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001"+
		"\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000"+
		"\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b"+
		"?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000"+
		"\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000"+
		"\u0015J\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019N"+
		"\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dV\u0001\u0000"+
		"\u0000\u0000\u001fY\u0001\u0000\u0000\u0000![\u0001\u0000\u0000\u0000"+
		"#]\u0001\u0000\u0000\u0000%`\u0001\u0000\u0000\u0000\'p\u0001\u0000\u0000"+
		"\u0000)r\u0001\u0000\u0000\u0000+y\u0001\u0000\u0000\u0000-~\u0001\u0000"+
		"\u0000\u0000/\u0083\u0001\u0000\u0000\u00001\u00a1\u0001\u0000\u0000\u0000"+
		"3\u00a6\u0001\u0000\u0000\u000056\u0005;\u0000\u00006\u0002\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001"+
		"\u0000\u0000\u0000=>\u0005*\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		"/\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005%\u0000\u0000B\u000e\u0001"+
		"\u0000\u0000\u0000CD\u0005+\u0000\u0000D\u0010\u0001\u0000\u0000\u0000"+
		"EF\u0005-\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000"+
		"HI\u0005f\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005{\u0000\u0000"+
		"K\u0016\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000M\u0018\u0001\u0000"+
		"\u0000\u0000NO\u0005e\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005s\u0000"+
		"\u0000QR\u0005e\u0000\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005=\u0000"+
		"\u0000TU\u0005=\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VW\u0005!\u0000"+
		"\u0000WX\u0005=\u0000\u0000X\u001e\u0001\u0000\u0000\u0000YZ\u0005>\u0000"+
		"\u0000Z \u0001\u0000\u0000\u0000[\\\u0005<\u0000\u0000\\\"\u0001\u0000"+
		"\u0000\u0000]^\u0005>\u0000\u0000^_\u0005=\u0000\u0000_$\u0001\u0000\u0000"+
		"\u0000`a\u0005<\u0000\u0000ab\u0005=\u0000\u0000b&\u0001\u0000\u0000\u0000"+
		"cd\u0005i\u0000\u0000de\u0005n\u0000\u0000eq\u0005t\u0000\u0000fg\u0005"+
		"b\u0000\u0000gh\u0005o\u0000\u0000hi\u0005o\u0000\u0000iq\u0005l\u0000"+
		"\u0000jk\u0005d\u0000\u0000kl\u0005o\u0000\u0000lm\u0005u\u0000\u0000"+
		"mn\u0005b\u0000\u0000no\u0005l\u0000\u0000oq\u0005e\u0000\u0000pc\u0001"+
		"\u0000\u0000\u0000pf\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000"+
		"q(\u0001\u0000\u0000\u0000rs\u0005p\u0000\u0000st\u0005r\u0000\u0000t"+
		"u\u0005i\u0000\u0000uv\u0005n\u0000\u0000vw\u0005t\u0000\u0000w*\u0001"+
		"\u0000\u0000\u0000xz\u0007\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|,\u0001\u0000\u0000\u0000}\u007f\u0007\u0001\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081.\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0007\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0005.\u0000\u0000\u0088\u008a\u0007\u0001\u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c0\u0001\u0000\u0000\u0000\u008d\u008e\u0005/\u0000\u0000\u008e\u008f"+
		"\u0005/\u0000\u0000\u008f\u0093\u0001\u0000\u0000\u0000\u0090\u0092\b"+
		"\u0002\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u00a2\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005/\u0000\u0000\u0097\u0098\u0005*\u0000"+
		"\u0000\u0098\u009c\u0001\u0000\u0000\u0000\u0099\u009b\t\u0000\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005*\u0000\u0000\u00a0\u00a2\u0005/\u0000\u0000\u00a1\u008d"+
		"\u0001\u0000\u0000\u0000\u00a1\u0096\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0018\u0000\u0000\u00a42\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0007\u0003\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0006\u0019\u0000\u0000\u00ab4\u0001\u0000"+
		"\u0000\u0000\n\u0000p{\u0080\u0085\u008b\u0093\u009c\u00a1\u00a8\u0001"+
		"\u0006\u0000\u0000";

	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}