// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hussarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, PASS=2, BEGIN=3, NEWLINE=4, PLUS=5, MINUS=6, MOD=7, INCREMENT=8, 
		DECREMENT=9, MULTIPLICATION=10, DIVIDE=11, POWER=12, EQ=13, NOTEQ=14, 
		LESSER=15, LESSEREQ=16, GREATER=17, GREATEREQ=18, L_BRACKET=19, R_BRACKET=20, 
		L_BUCKLE=21, R_BUCKLE=22, IF_SYM=23, FOR_SYM=24, WHILE_SYM=25, PRINT_SYM=26, 
		ID_NAME=27, ID_NUMBER=28, ID_CHAR=29, ID_STRING=30, REDECLARATION=31, 
		REDECLARATION_TO=32, DOT_SYM=33, COMA_SYM=34, COLON_SYM=35, SEMICOLON_SYM=36, 
		APOSTROPHE_SYM=37, L_ARROW_SYM=38, R_ARROW_SYM=39, INT=40, CHAR=41, STRING=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "PASS", "BEGIN", "NEWLINE", "PLUS", "MINUS", "MOD", "INCREMENT", 
			"DECREMENT", "MULTIPLICATION", "DIVIDE", "POWER", "EQ", "NOTEQ", "LESSER", 
			"LESSEREQ", "GREATER", "GREATEREQ", "L_BRACKET", "R_BRACKET", "L_BUCKLE", 
			"R_BUCKLE", "IF_SYM", "FOR_SYM", "WHILE_SYM", "PRINT_SYM", "ID_NAME", 
			"ID_NUMBER", "ID_CHAR", "ID_STRING", "REDECLARATION", "REDECLARATION_TO", 
			"DOT_SYM", "COMA_SYM", "COLON_SYM", "SEMICOLON_SYM", "APOSTROPHE_SYM", 
			"L_ARROW_SYM", "R_ARROW_SYM", "INT", "CHAR", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'nic'", "'zacznij'", null, "'+'", "'-'", "' modulo '", "'++'", 
			"'--'", "'*'", "'/'", "'^'", "'='", "'/='", "'<'", "'<='", "'>'", "'>='", 
			"'('", "')'", "'{'", "'}'", null, "'dla'", "'dopoki'", "'pokaz'", null, 
			"'liczba '", null, null, "'zmien '", "'na '", "'.'", "','", "':'", "';'", 
			"'''", "'<-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "PASS", "BEGIN", "NEWLINE", "PLUS", "MINUS", "MOD", 
			"INCREMENT", "DECREMENT", "MULTIPLICATION", "DIVIDE", "POWER", "EQ", 
			"NOTEQ", "LESSER", "LESSEREQ", "GREATER", "GREATEREQ", "L_BRACKET", "R_BRACKET", 
			"L_BUCKLE", "R_BUCKLE", "IF_SYM", "FOR_SYM", "WHILE_SYM", "PRINT_SYM", 
			"ID_NAME", "ID_NUMBER", "ID_CHAR", "ID_STRING", "REDECLARATION", "REDECLARATION_TO", 
			"DOT_SYM", "COMA_SYM", "COLON_SYM", "SEMICOLON_SYM", "APOSTROPHE_SYM", 
			"L_ARROW_SYM", "R_ARROW_SYM", "INT", "CHAR", "STRING"
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


	public hussarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hussar.g4"; }

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
		"\u0004\u0000*\u011c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"u\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00b0\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u00c5\b\u001a\n\u001a"+
		"\f\u001a\u00c8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00de\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u00ec\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0003"+
		"\'\u010a\b\'\u0001\'\u0004\'\u010d\b\'\u000b\'\f\'\u010e\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0004)\u0117\b)\u000b)\f)\u0118\u0001)\u0001"+
		")\u0000\u0000*\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0006\u0000\t\n\r\r  09A"+
		"Zaz\u0124\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0001U\u0001\u0000\u0000\u0000\u0003Y\u0001\u0000\u0000"+
		"\u0000\u0005]\u0001\u0000\u0000\u0000\u0007t\u0001\u0000\u0000\u0000\t"+
		"v\u0001\u0000\u0000\u0000\u000bx\u0001\u0000\u0000\u0000\rz\u0001\u0000"+
		"\u0000\u0000\u000f\u0083\u0001\u0000\u0000\u0000\u0011\u0086\u0001\u0000"+
		"\u0000\u0000\u0013\u0089\u0001\u0000\u0000\u0000\u0015\u008b\u0001\u0000"+
		"\u0000\u0000\u0017\u008d\u0001\u0000\u0000\u0000\u0019\u008f\u0001\u0000"+
		"\u0000\u0000\u001b\u0091\u0001\u0000\u0000\u0000\u001d\u0094\u0001\u0000"+
		"\u0000\u0000\u001f\u0096\u0001\u0000\u0000\u0000!\u0099\u0001\u0000\u0000"+
		"\u0000#\u009b\u0001\u0000\u0000\u0000%\u009e\u0001\u0000\u0000\u0000\'"+
		"\u00a0\u0001\u0000\u0000\u0000)\u00a2\u0001\u0000\u0000\u0000+\u00a4\u0001"+
		"\u0000\u0000\u0000-\u00af\u0001\u0000\u0000\u0000/\u00b1\u0001\u0000\u0000"+
		"\u00001\u00b5\u0001\u0000\u0000\u00003\u00bc\u0001\u0000\u0000\u00005"+
		"\u00c2\u0001\u0000\u0000\u00007\u00c9\u0001\u0000\u0000\u00009\u00dd\u0001"+
		"\u0000\u0000\u0000;\u00eb\u0001\u0000\u0000\u0000=\u00ed\u0001\u0000\u0000"+
		"\u0000?\u00f4\u0001\u0000\u0000\u0000A\u00f8\u0001\u0000\u0000\u0000C"+
		"\u00fa\u0001\u0000\u0000\u0000E\u00fc\u0001\u0000\u0000\u0000G\u00fe\u0001"+
		"\u0000\u0000\u0000I\u0100\u0001\u0000\u0000\u0000K\u0102\u0001\u0000\u0000"+
		"\u0000M\u0105\u0001\u0000\u0000\u0000O\u0109\u0001\u0000\u0000\u0000Q"+
		"\u0110\u0001\u0000\u0000\u0000S\u0114\u0001\u0000\u0000\u0000UV\u0007"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0006\u0000\u0000\u0000"+
		"X\u0002\u0001\u0000\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005i\u0000\u0000"+
		"[\\\u0005c\u0000\u0000\\\u0004\u0001\u0000\u0000\u0000]^\u0005z\u0000"+
		"\u0000^_\u0005a\u0000\u0000_`\u0005c\u0000\u0000`a\u0005z\u0000\u0000"+
		"ab\u0005n\u0000\u0000bc\u0005i\u0000\u0000cd\u0005j\u0000\u0000d\u0006"+
		"\u0001\u0000\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000gh\u0005"+
		"t\u0000\u0000hi\u0005e\u0000\u0000iu\u0005r\u0000\u0000jk\u0005E\u0000"+
		"\u0000kl\u0005n\u0000\u0000lm\u0005t\u0000\u0000mn\u0005e\u0000\u0000"+
		"nu\u0005r\u0000\u0000op\u0005E\u0000\u0000pq\u0005N\u0000\u0000qr\u0005"+
		"T\u0000\u0000rs\u0005E\u0000\u0000su\u0005R\u0000\u0000te\u0001\u0000"+
		"\u0000\u0000tj\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000u\b\u0001"+
		"\u0000\u0000\u0000vw\u0005+\u0000\u0000w\n\u0001\u0000\u0000\u0000xy\u0005"+
		"-\u0000\u0000y\f\u0001\u0000\u0000\u0000z{\u0005 \u0000\u0000{|\u0005"+
		"m\u0000\u0000|}\u0005o\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005u"+
		"\u0000\u0000\u007f\u0080\u0005l\u0000\u0000\u0080\u0081\u0005o\u0000\u0000"+
		"\u0081\u0082\u0005 \u0000\u0000\u0082\u000e\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005+\u0000\u0000\u0084\u0085\u0005+\u0000\u0000\u0085\u0010\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005-\u0000\u0000\u0087\u0088\u0005-\u0000"+
		"\u0000\u0088\u0012\u0001\u0000\u0000\u0000\u0089\u008a\u0005*\u0000\u0000"+
		"\u008a\u0014\u0001\u0000\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c"+
		"\u0016\u0001\u0000\u0000\u0000\u008d\u008e\u0005^\u0000\u0000\u008e\u0018"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u0090\u001a\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005/\u0000\u0000\u0092\u0093\u0005=\u0000"+
		"\u0000\u0093\u001c\u0001\u0000\u0000\u0000\u0094\u0095\u0005<\u0000\u0000"+
		"\u0095\u001e\u0001\u0000\u0000\u0000\u0096\u0097\u0005<\u0000\u0000\u0097"+
		"\u0098\u0005=\u0000\u0000\u0098 \u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		">\u0000\u0000\u009a\"\u0001\u0000\u0000\u0000\u009b\u009c\u0005>\u0000"+
		"\u0000\u009c\u009d\u0005=\u0000\u0000\u009d$\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005(\u0000\u0000\u009f&\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		")\u0000\u0000\u00a1(\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005{\u0000"+
		"\u0000\u00a3*\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005}\u0000\u0000\u00a5"+
		",\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005c\u0000\u0000\u00a7\u00a8\u0005"+
		"z\u0000\u0000\u00a8\u00b0\u0005y\u0000\u0000\u00a9\u00aa\u0005j\u0000"+
		"\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab\u00ac\u0005z\u0000\u0000\u00ac"+
		"\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae\u00b0\u0005"+
		"i\u0000\u0000\u00af\u00a6\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0.\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005d\u0000\u0000"+
		"\u00b2\u00b3\u0005l\u0000\u0000\u00b3\u00b4\u0005a\u0000\u0000\u00b40"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005d\u0000\u0000\u00b6\u00b7\u0005"+
		"o\u0000\u0000\u00b7\u00b8\u0005p\u0000\u0000\u00b8\u00b9\u0005o\u0000"+
		"\u0000\u00b9\u00ba\u0005k\u0000\u0000\u00ba\u00bb\u0005i\u0000\u0000\u00bb"+
		"2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005p\u0000\u0000\u00bd\u00be\u0005"+
		"o\u0000\u0000\u00be\u00bf\u0005k\u0000\u0000\u00bf\u00c0\u0005a\u0000"+
		"\u0000\u00c0\u00c1\u0005z\u0000\u0000\u00c14\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c6\u0007\u0001\u0000\u0000\u00c3\u00c5\u0007\u0002\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"6\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005l\u0000\u0000\u00ca\u00cb\u0005i\u0000\u0000\u00cb\u00cc\u0005c"+
		"\u0000\u0000\u00cc\u00cd\u0005z\u0000\u0000\u00cd\u00ce\u0005b\u0000\u0000"+
		"\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005 \u0000\u0000\u00d08"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005l\u0000\u0000\u00d2\u00d3\u0005"+
		"i\u0000\u0000\u00d3\u00d4\u0005t\u0000\u0000\u00d4\u00d5\u0005e\u0000"+
		"\u0000\u00d5\u00d6\u0005r\u0000\u0000\u00d6\u00d7\u0005a\u0000\u0000\u00d7"+
		"\u00de\u0005 \u0000\u0000\u00d8\u00d9\u0005z\u0000\u0000\u00d9\u00da\u0005"+
		"n\u0000\u0000\u00da\u00db\u0005a\u0000\u0000\u00db\u00dc\u0005k\u0000"+
		"\u0000\u00dc\u00de\u0005 \u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d8\u0001\u0000\u0000\u0000\u00de:\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005s\u0000\u0000\u00e0\u00e1\u0005l\u0000\u0000\u00e1\u00e2\u0005"+
		"o\u0000\u0000\u00e2\u00e3\u0005w\u0000\u0000\u00e3\u00e4\u0005o\u0000"+
		"\u0000\u00e4\u00ec\u0005 \u0000\u0000\u00e5\u00e6\u0005w\u0000\u0000\u00e6"+
		"\u00e7\u0005y\u0000\u0000\u00e7\u00e8\u0005r\u0000\u0000\u00e8\u00e9\u0005"+
		"a\u0000\u0000\u00e9\u00ea\u0005z\u0000\u0000\u00ea\u00ec\u0005 \u0000"+
		"\u0000\u00eb\u00df\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ec<\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005z\u0000\u0000\u00ee"+
		"\u00ef\u0005m\u0000\u0000\u00ef\u00f0\u0005i\u0000\u0000\u00f0\u00f1\u0005"+
		"e\u0000\u0000\u00f1\u00f2\u0005n\u0000\u0000\u00f2\u00f3\u0005 \u0000"+
		"\u0000\u00f3>\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005n\u0000\u0000\u00f5"+
		"\u00f6\u0005a\u0000\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7@\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005.\u0000\u0000\u00f9B\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005,\u0000\u0000\u00fbD\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005:\u0000\u0000\u00fdF\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		";\u0000\u0000\u00ffH\u0001\u0000\u0000\u0000\u0100\u0101\u0005\'\u0000"+
		"\u0000\u0101J\u0001\u0000\u0000\u0000\u0102\u0103\u0005<\u0000\u0000\u0103"+
		"\u0104\u0005-\u0000\u0000\u0104L\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"-\u0000\u0000\u0106\u0107\u0005>\u0000\u0000\u0107N\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u0005-\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0007\u0003\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010fP\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\"\u0000\u0000\u0111\u0112\u0007\u0001\u0000\u0000\u0112\u0113"+
		"\u0005\"\u0000\u0000\u0113R\u0001\u0000\u0000\u0000\u0114\u0116\u0005"+
		"\"\u0000\u0000\u0115\u0117\u0007\u0004\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005\"\u0000\u0000\u011bT\u0001\u0000\u0000"+
		"\u0000\n\u0000t\u00af\u00c4\u00c6\u00dd\u00eb\u0109\u010e\u0118\u0001"+
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