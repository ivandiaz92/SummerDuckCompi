import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class summerDuckLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROG=1, MAIN=2, INT=3, FLOAT=4, CHAR=5, BOOL=6, RETURN=7, FUNCTION=8, 
		IF=9, ELSE=10, WHILE=11, THEN=12, DO=13, UNTIL=14, SCAN=15, PRINT=16, 
		SUMA=17, RESTA=18, MULT=19, DIV=20, LP=21, RP=22, LB=23, RB=24, LK=25, 
		RK=26, DP=27, PC=28, COMA=29, PUNTO=30, MOD=31, IGUAL=32, MAYOR=33, MENOR=34, 
		MAYORI=35, MENORI=36, EQUIV=37, NEG=38, DIF=39, AND=40, OR=41, CTE_I=42, 
		CTE_F=43, CTE_C=44, ID=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROG", "MAIN", "INT", "FLOAT", "CHAR", "BOOL", "RETURN", "FUNCTION", 
		"IF", "ELSE", "WHILE", "THEN", "DO", "UNTIL", "SCAN", "PRINT", "SUMA", 
		"RESTA", "MULT", "DIV", "LP", "RP", "LB", "RB", "LK", "RK", "DP", "PC", 
		"COMA", "PUNTO", "MOD", "IGUAL", "MAYOR", "MENOR", "MAYORI", "MENORI", 
		"EQUIV", "NEG", "DIF", "AND", "OR", "CTE_I", "CTE_F", "CTE_C", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'principal'", "'entero'", "'real'", "'char'", "'boleano'", 
		"'regresa'", "'modulo'", "'si'", "'sino'", "'mientras'", "'haz'", "'repite'", 
		"'hasta'", "'lee'", "'escribe'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'.'", "'%'", "'='", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'¡'", "'!='", "'&'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROG", "MAIN", "INT", "FLOAT", "CHAR", "BOOL", "RETURN", "FUNCTION", 
		"IF", "ELSE", "WHILE", "THEN", "DO", "UNTIL", "SCAN", "PRINT", "SUMA", 
		"RESTA", "MULT", "DIV", "LP", "RP", "LB", "RB", "LK", "RK", "DP", "PC", 
		"COMA", "PUNTO", "MOD", "IGUAL", "MAYOR", "MENOR", "MAYORI", "MENORI", 
		"EQUIV", "NEG", "DIF", "AND", "OR", "CTE_I", "CTE_F", "CTE_C", "ID"
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


	public summerDuckLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "summerDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\7,\u0101\n,\f,\16,\u0104\13,\3,\3,\6,\u0108\n,\r,\16,\u0109\3-\3"+
		"-\3-\3-\3.\6.\u0111\n.\r.\16.\u0112\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/\3\2\5\3\2\62;\4\2C\\c|\5\2\62;C\\c|\u0116\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5f\3\2\2\2\7p\3\2\2\2\tw\3\2\2\2\13|\3"+
		"\2\2\2\r\u0081\3\2\2\2\17\u0089\3\2\2\2\21\u0091\3\2\2\2\23\u0098\3\2"+
		"\2\2\25\u009b\3\2\2\2\27\u00a0\3\2\2\2\31\u00a9\3\2\2\2\33\u00ad\3\2\2"+
		"\2\35\u00b4\3\2\2\2\37\u00ba\3\2\2\2!\u00be\3\2\2\2#\u00c6\3\2\2\2%\u00c8"+
		"\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67"+
		"\u00da\3\2\2\29\u00dc\3\2\2\2;\u00de\3\2\2\2=\u00e0\3\2\2\2?\u00e2\3\2"+
		"\2\2A\u00e4\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00ea\3\2\2\2I\u00ed"+
		"\3\2\2\2K\u00f0\3\2\2\2M\u00f3\3\2\2\2O\u00f6\3\2\2\2Q\u00f9\3\2\2\2S"+
		"\u00fb\3\2\2\2U\u00fd\3\2\2\2W\u0102\3\2\2\2Y\u010b\3\2\2\2[\u0110\3\2"+
		"\2\2]^\7r\2\2^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc\7c\2\2cd\7o\2\2de"+
		"\7c\2\2e\4\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7e\2\2kl\7k\2"+
		"\2lm\7r\2\2mn\7c\2\2no\7n\2\2o\6\3\2\2\2pq\7g\2\2qr\7p\2\2rs\7v\2\2st"+
		"\7g\2\2tu\7t\2\2uv\7q\2\2v\b\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z{\7n\2"+
		"\2{\n\3\2\2\2|}\7e\2\2}~\7j\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\f\3"+
		"\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087\u0088\7q\2\2"+
		"\u0088\16\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7"+
		"i\2\2\u008c\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7u\2\2\u008f\u0090"+
		"\7c\2\2\u0090\20\3\2\2\2\u0091\u0092\7o\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7f\2\2\u0094\u0095\7w\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097"+
		"\22\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7k\2\2\u009a\24\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7q\2\2"+
		"\u009f\26\3\2\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7u\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7|\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7c\2\2\u00b9\36\3\2\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7g\2\2\u00bd \3\2\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7k\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7g\2\2\u00c5\"\3\2"+
		"\2\2\u00c6\u00c7\7-\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9&\3\2\2"+
		"\2\u00ca\u00cb\7,\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd*\3\2\2"+
		"\2\u00ce\u00cf\7*\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1.\3\2\2\2"+
		"\u00d2\u00d3\7]\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5\62\3\2\2"+
		"\2\u00d6\u00d7\7}\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7\177\2\2\u00d9\66"+
		"\3\2\2\2\u00da\u00db\7<\2\2\u00db8\3\2\2\2\u00dc\u00dd\7=\2\2\u00dd:\3"+
		"\2\2\2\u00de\u00df\7.\2\2\u00df<\3\2\2\2\u00e0\u00e1\7\60\2\2\u00e1>\3"+
		"\2\2\2\u00e2\u00e3\7\'\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5B\3"+
		"\2\2\2\u00e6\u00e7\7@\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9F\3\2"+
		"\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec\7?\2\2\u00ecH\3\2\2\2\u00ed\u00ee"+
		"\7>\2\2\u00ee\u00ef\7?\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2L\3\2\2\2\u00f3\u00f4\7\u00c4\2\2\u00f4\u00f5\7\u00a3\2\2"+
		"\u00f5N\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8\7?\2\2\u00f8P\3\2\2\2\u00f9"+
		"\u00fa\7(\2\2\u00faR\3\2\2\2\u00fb\u00fc\7~\2\2\u00fcT\3\2\2\2\u00fd\u00fe"+
		"\t\2\2\2\u00feV\3\2\2\2\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\60\2\2\u0106\u0108\t\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010aX\3\2\2\2\u010b\u010c\7$\2\2\u010c\u010d\t\3\2\2\u010d\u010e"+
		"\7$\2\2\u010eZ\3\2\2\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\\\3\2\2\2\6\2\u0102"+
		"\u0109\u0112\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}