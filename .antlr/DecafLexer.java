// Generated from c:\Users\alber\Documents\UVG\Decimo_semestre\Compiladores\Lab0\Laboratorio_0_compiladores\Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, IF=33, ELSE=34, FOR=35, WHILE=36, BREAK=37, CONTINUE=38, CHAR=39, 
		STRING=40, QUOTES=41, APOSTROPHE=42, ID=43, ALPHA=44, CHAR_LITERAL=45, 
		DECIMAL_LITERAL=46, DIGIT=47, HEX_LITERAL=48, BOOL_LITERAL=49, STRING_LITERAL=50, 
		ALPHA_NUM=51, HEX_DIGIT=52, LINE_COMMENT=53, COMMENT=54, NEWLINE=55, WHITESPACE=56;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "CHAR", "STRING", "QUOTES", 
			"APOSTROPHE", "ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", "DIGIT", 
			"HEX_LITERAL", "BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "HEX_DIGIT", 
			"LINE_COMMENT", "COMMENT", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class Program{'", "'}'", "','", "';'", "'['", "']'", "'struct'", 
			"'{'", "'('", "')'", "'void'", "'='", "'return'", "'callout'", "'-'", 
			"'!'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'+'", "'*'", "'/'", "'%'", "'int'", "'boolean'", "'+='", "'-='", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'continue'", "'char'", "'string'", 
			"'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "CONTINUE", "CHAR", "STRING", "QUOTES", "APOSTROPHE", 
			"ID", "ALPHA", "CHAR_LITERAL", "DECIMAL_LITERAL", "DIGIT", "HEX_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "ALPHA_NUM", "HEX_DIGIT", "LINE_COMMENT", 
			"COMMENT", "NEWLINE", "WHITESPACE"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3+\3+\3,\3,\7,\u0117\n,\f,\16,\u011a\13,\3-\3-\3.\3.\3.\3.\5."+
		"\u0122\n.\3.\3.\3/\6/\u0127\n/\r/\16/\u0128\3\60\3\60\3\61\3\61\3\61\6"+
		"\61\u0130\n\61\r\61\16\61\u0131\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u013d\n\62\3\63\3\63\3\63\3\63\7\63\u0143\n\63\f\63\16\63\u0146"+
		"\13\63\3\63\3\63\3\64\3\64\5\64\u014c\n\64\3\65\3\65\3\65\5\65\u0151\n"+
		"\65\3\66\3\66\3\66\3\66\7\66\u0157\n\66\f\66\16\66\u015a\13\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0164\n\67\f\67\16\67\u0167\13"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\58\u016f\n8\38\38\68\u0173\n8\r8\168\u0174"+
		"\38\38\39\39\39\39\4\u0158\u0165\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\t\5\2C\\aac|\n\2$$))^^ddh"+
		"hppttvv\6\2\f\f\17\17$$^^\3\2\62;\4\2ZZzz\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5\u0082\3\2\2\2\7\u0084\3"+
		"\2\2\2\t\u0086\3\2\2\2\13\u0088\3\2\2\2\r\u008a\3\2\2\2\17\u008c\3\2\2"+
		"\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2\2\27\u0099\3\2\2\2"+
		"\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a7\3\2\2\2\37\u00af\3\2\2\2!"+
		"\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00ba\3"+
		"\2\2\2+\u00bd\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61\u00c6\3\2\2\2\63"+
		"\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00dd\3\2\2\2A\u00e0\3\2\2\2C\u00e3\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00eb\3\2\2\2I\u00ef\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u0104\3\2\2\2Q\u0109\3\2\2\2S\u0110\3\2\2\2U\u0112\3\2\2\2W\u0114"+
		"\3\2\2\2Y\u011b\3\2\2\2[\u011d\3\2\2\2]\u0126\3\2\2\2_\u012a\3\2\2\2a"+
		"\u012c\3\2\2\2c\u013c\3\2\2\2e\u013e\3\2\2\2g\u014b\3\2\2\2i\u014d\3\2"+
		"\2\2k\u0152\3\2\2\2m\u015f\3\2\2\2o\u0172\3\2\2\2q\u0178\3\2\2\2st\7e"+
		"\2\2tu\7n\2\2uv\7c\2\2vw\7u\2\2wx\7u\2\2xy\7\"\2\2yz\7R\2\2z{\7t\2\2{"+
		"|\7q\2\2|}\7i\2\2}~\7t\2\2~\177\7c\2\2\177\u0080\7o\2\2\u0080\u0081\7"+
		"}\2\2\u0081\4\3\2\2\2\u0082\u0083\7\177\2\2\u0083\6\3\2\2\2\u0084\u0085"+
		"\7.\2\2\u0085\b\3\2\2\2\u0086\u0087\7=\2\2\u0087\n\3\2\2\2\u0088\u0089"+
		"\7]\2\2\u0089\f\3\2\2\2\u008a\u008b\7_\2\2\u008b\16\3\2\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7e\2\2\u0091\u0092\7v\2\2\u0092\20\3\2\2\2\u0093\u0094\7}\2\2\u0094"+
		"\22\3\2\2\2\u0095\u0096\7*\2\2\u0096\24\3\2\2\2\u0097\u0098\7+\2\2\u0098"+
		"\26\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b\7q\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7f\2\2\u009d\30\3\2\2\2\u009e\u009f\7?\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2"+
		"\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7"+
		"e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\36\3\2\2\2\u00af\u00b0"+
		"\7/\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7@\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7"+
		">\2\2\u00b8\u00b9\7?\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc*\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\7?\2\2\u00bf,\3"+
		"\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7?\2\2\u00c2.\3\2\2\2\u00c3\u00c4"+
		"\7(\2\2\u00c4\u00c5\7(\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7~\2\2\u00c7\u00c8"+
		"\7~\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\64\3\2\2\2\u00cb\u00cc"+
		"\7,\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce8\3\2\2\2\u00cf\u00d0"+
		"\7\'\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7q\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7c\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc>\3\2\2\2\u00dd\u00de\7-\2\2\u00de\u00df\7?\2\2\u00df"+
		"@\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\7?\2\2\u00e2B\3\2\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7h\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7n\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00eaF\3\2\2\2\u00eb\u00ec"+
		"\7h\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00eeH\3\2\2\2\u00ef\u00f0"+
		"\7y\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7n\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7m\2\2\u00faL\3\2\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7w\2\2\u0102\u0103"+
		"\7g\2\2\u0103N\3\2\2\2\u0104\u0105\7e\2\2\u0105\u0106\7j\2\2\u0106\u0107"+
		"\7c\2\2\u0107\u0108\7t\2\2\u0108P\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e"+
		"\u010f\7i\2\2\u010fR\3\2\2\2\u0110\u0111\7$\2\2\u0111T\3\2\2\2\u0112\u0113"+
		"\7)\2\2\u0113V\3\2\2\2\u0114\u0118\5Y-\2\u0115\u0117\5g\64\2\u0116\u0115"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"X\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\2\2\2\u011cZ\3\2\2\2\u011d"+
		"\u0121\5U+\2\u011e\u011f\7^\2\2\u011f\u0122\t\3\2\2\u0120\u0122\n\4\2"+
		"\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\5U+\2\u0124\\\3\2\2\2\u0125\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129^\3\2\2\2\u012a"+
		"\u012b\t\5\2\2\u012b`\3\2\2\2\u012c\u012d\7\62\2\2\u012d\u012f\t\6\2\2"+
		"\u012e\u0130\t\7\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132b\3\2\2\2\u0133\u0134\7V\2\2\u0134\u0135"+
		"\7t\2\2\u0135\u0136\7w\2\2\u0136\u013d\7g\2\2\u0137\u0138\7H\2\2\u0138"+
		"\u0139\7c\2\2\u0139\u013a\7n\2\2\u013a\u013b\7u\2\2\u013b\u013d\7g\2\2"+
		"\u013c\u0133\3\2\2\2\u013c\u0137\3\2\2\2\u013dd\3\2\2\2\u013e\u0144\7"+
		"$\2\2\u013f\u0140\7^\2\2\u0140\u0143\t\3\2\2\u0141\u0143\n\4\2\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7$\2\2\u0148f\3\2\2\2\u0149\u014c\5Y-\2\u014a\u014c\5_\60\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014ch\3\2\2\2\u014d\u014e\7\62\2\2"+
		"\u014e\u0150\t\6\2\2\u014f\u0151\t\7\2\2\u0150\u014f\3\2\2\2\u0151j\3"+
		"\2\2\2\u0152\u0153\7\61\2\2\u0153\u0154\7\61\2\2\u0154\u0158\3\2\2\2\u0155"+
		"\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7\f\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b\66\2\2\u015el\3\2\2\2"+
		"\u015f\u0160\7\61\2\2\u0160\u0161\7,\2\2\u0161\u0165\3\2\2\2\u0162\u0164"+
		"\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169"+
		"\7,\2\2\u0169\u016a\7\61\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\67\2\2"+
		"\u016cn\3\2\2\2\u016d\u016f\7\17\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\7\f\2\2\u0171\u0173\7\17\2\2\u0172"+
		"\u016e\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b8\2\2\u0177"+
		"p\3\2\2\2\u0178\u0179\t\b\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b9\2\2\u017b"+
		"r\3\2\2\2\21\2\u0118\u0121\u0128\u0131\u013c\u0142\u0144\u014b\u0150\u0158"+
		"\u0165\u016e\u0172\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}