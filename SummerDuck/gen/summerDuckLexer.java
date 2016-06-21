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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROG=1, MAIN=2, INT=3, FLOAT=4, CHAR=5, BOOL=6, RETURN=7, FUNCTION=8, 
		IF=9, ELSE=10, WHILE=11, THEN=12, DO=13, UNTIL=14, SCAN=15, PRINT=16, 
		SUMA=17, RESTA=18, MULT=19, DIV=20, LP=21, RP=22, LB=23, RB=24, LK=25, 
		RK=26, DP=27, PC=28, COMA=29, PUNTO=30, MOD=31, IGUAL=32, MAYOR=33, MENOR=34, 
		MAYORI=35, MENORI=36, EQUIV=37, NEG=38, DIF=39, AND=40, OR=41, CTE_BT=42, 
		CTE_BF=43, CTE_I=44, CTE_F=45, CTE_C=46, ID=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROG", "MAIN", "INT", "FLOAT", "CHAR", "BOOL", "RETURN", "FUNCTION", 
		"IF", "ELSE", "WHILE", "THEN", "DO", "UNTIL", "SCAN", "PRINT", "SUMA", 
		"RESTA", "MULT", "DIV", "LP", "RP", "LB", "RB", "LK", "RK", "DP", "PC", 
		"COMA", "PUNTO", "MOD", "IGUAL", "MAYOR", "MENOR", "MAYORI", "MENORI", 
		"EQUIV", "NEG", "DIF", "AND", "OR", "CTE_BT", "CTE_BF", "CTE_I", "CTE_F", 
		"CTE_C", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'principal'", "'entero'", "'real'", "'char'", "'boleano'", 
		"'regresa'", "'modulo'", "'si'", "'sino'", "'mientras'", "'haz'", "'repite'", 
		"'hasta'", "'lee'", "'escribe'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'.'", "'%'", "'='", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'¡'", "'!='", "'&'", "'|'", "'verdadero'", 
		"'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROG", "MAIN", "INT", "FLOAT", "CHAR", "BOOL", "RETURN", "FUNCTION", 
		"IF", "ELSE", "WHILE", "THEN", "DO", "UNTIL", "SCAN", "PRINT", "SUMA", 
		"RESTA", "MULT", "DIV", "LP", "RP", "LB", "RB", "LK", "RK", "DP", "PC", 
		"COMA", "PUNTO", "MOD", "IGUAL", "MAYOR", "MENOR", "MAYORI", "MENORI", 
		"EQUIV", "NEG", "DIF", "AND", "OR", "CTE_BT", "CTE_BF", "CTE_I", "CTE_F", 
		"CTE_C", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0128\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3.\7.\u0115\n.\f.\16.\u0118\13.\3.\3.\6.\u011c\n.\r.\16.\u011d\3/\3/"+
		"\3/\3/\3\60\6\60\u0125\n\60\r\60\16\60\u0126\2\2\61\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61\3\2\5\3\2\62;\4\2C\\c|\5\2\62;C\\c|\u012a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2"+
		"\2\5j\3\2\2\2\7t\3\2\2\2\t{\3\2\2\2\13\u0080\3\2\2\2\r\u0085\3\2\2\2\17"+
		"\u008d\3\2\2\2\21\u0095\3\2\2\2\23\u009c\3\2\2\2\25\u009f\3\2\2\2\27\u00a4"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00b1\3\2\2\2\35\u00b8\3\2\2\2\37\u00be\3"+
		"\2\2\2!\u00c2\3\2\2\2#\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3\2\2\2)\u00d0"+
		"\3\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00da\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f1\3\2\2\2K\u00f4\3\2\2\2M\u00f7\3\2"+
		"\2\2O\u00fa\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0101\3\2\2\2W\u010b"+
		"\3\2\2\2Y\u0111\3\2\2\2[\u0116\3\2\2\2]\u011f\3\2\2\2_\u0124\3\2\2\2a"+
		"b\7r\2\2bc\7t\2\2cd\7q\2\2de\7i\2\2ef\7t\2\2fg\7c\2\2gh\7o\2\2hi\7c\2"+
		"\2i\4\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7e\2\2op\7k\2\2pq"+
		"\7r\2\2qr\7c\2\2rs\7n\2\2s\6\3\2\2\2tu\7g\2\2uv\7p\2\2vw\7v\2\2wx\7g\2"+
		"\2xy\7t\2\2yz\7q\2\2z\b\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7c\2\2~\177\7n\2\2"+
		"\177\n\3\2\2\2\u0080\u0081\7e\2\2\u0081\u0082\7j\2\2\u0082\u0083\7c\2"+
		"\2\u0083\u0084\7t\2\2\u0084\f\3\2\2\2\u0085\u0086\7d\2\2\u0086\u0087\7"+
		"q\2\2\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7q\2\2\u008c\16\3\2\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7i\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7c\2\2\u0094\20\3\2\2\2\u0095\u0096\7o\2\2\u0096"+
		"\u0097\7q\2\2\u0097\u0098\7f\2\2\u0098\u0099\7w\2\2\u0099\u009a\7n\2\2"+
		"\u009a\u009b\7q\2\2\u009b\22\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7"+
		"k\2\2\u009e\24\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7p\2\2\u00a2\u00a3\7q\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6"+
		"\7k\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7u\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\7j\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7|\2\2\u00b0\32\3\2\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7"+
		"j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5"+
		"\7e\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7d\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb$\3\2\2\2\u00cc"+
		"\u00cd\7/\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf(\3\2\2\2\u00d0\u00d1"+
		"\7\61\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3,\3\2\2\2\u00d4\u00d5"+
		"\7+\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7]\2\2\u00d7\60\3\2\2\2\u00d8\u00d9"+
		"\7_\2\2\u00d9\62\3\2\2\2\u00da\u00db\7}\2\2\u00db\64\3\2\2\2\u00dc\u00dd"+
		"\7\177\2\2\u00dd\66\3\2\2\2\u00de\u00df\7<\2\2\u00df8\3\2\2\2\u00e0\u00e1"+
		"\7=\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7"+
		"\60\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7@\3\2\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7@\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7"+
		">\2\2\u00edF\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f0H\3\2"+
		"\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3J\3\2\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5\u00f6\7?\2\2\u00f6L\3\2\2\2\u00f7\u00f8\7\u00c4\2\2\u00f8"+
		"\u00f9\7\u00a3\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7?\2"+
		"\2\u00fcP\3\2\2\2\u00fd\u00fe\7(\2\2\u00feR\3\2\2\2\u00ff\u0100\7~\2\2"+
		"\u0100T\3\2\2\2\u0101\u0102\7x\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2"+
		"\2\u0104\u0105\7f\2\2\u0105\u0106\7c\2\2\u0106\u0107\7f\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7t\2\2\u0109\u010a\7q\2\2\u010aV\3\2\2\2\u010b\u010c"+
		"\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f"+
		"\u0110\7q\2\2\u0110X\3\2\2\2\u0111\u0112\t\2\2\2\u0112Z\3\2\2\2\u0113"+
		"\u0115\t\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\7\60\2\2\u011a\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\\\3\2\2\2\u011f\u0120"+
		"\7$\2\2\u0120\u0121\t\3\2\2\u0121\u0122\7$\2\2\u0122^\3\2\2\2\u0123\u0125"+
		"\t\4\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127`\3\2\2\2\6\2\u0116\u011d\u0126\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}