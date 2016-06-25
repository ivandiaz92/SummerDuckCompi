// Generated from /Users/ivandiaz/Desktop/SummerDuckCompi/SummerDuck/summerDuck.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class summerDuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROG=1, MAIN2=2, INT=3, FLOAT=4, CHAR=5, BOOL=6, RETURN=7, FUNCTION=8, 
		IF=9, ELSE=10, WHILE=11, THEN=12, DO=13, UNTIL=14, SCAN=15, PRINT=16, 
		SUMA=17, RESTA=18, MULT=19, DIV=20, LP=21, RP=22, LB=23, RB=24, LK=25, 
		RK=26, DP=27, PC=28, COMA=29, PUNTO=30, MOD=31, IGUAL=32, MAYOR=33, MENOR=34, 
		MAYORI=35, MENORI=36, EQUIV=37, NEG=38, DIF=39, AND=40, OR=41, CTE_BT=42, 
		CTE_BF=43, CTE_I=44, CTE_F=45, CTE_C=46, ID=47, WS=48;
	public static final int
		RULE_summerduck = 0, RULE_main = 1, RULE_vardec = 2, RULE_vardecaux = 3, 
		RULE_type = 4, RULE_var = 5, RULE_varaux = 6, RULE_var2 = 7, RULE_varaux2 = 8, 
		RULE_fundef = 9, RULE_params = 10, RULE_paramsaux = 11, RULE_paramsaux2 = 12, 
		RULE_statements = 13, RULE_asignations = 14, RULE_varAsign = 15, RULE_leer = 16, 
		RULE_leeraux = 17, RULE_leeraux2 = 18, RULE_escribir = 19, RULE_ifelse = 20, 
		RULE_ifelseaux = 21, RULE_while_statement = 22, RULE_dowhile = 23, RULE_exp = 24, 
		RULE_expaux = 25, RULE_exor = 26, RULE_exoraux = 27, RULE_exnot = 28, 
		RULE_exnotaux = 29, RULE_exlog = 30, RULE_exlogaux = 31, RULE_exmod = 32, 
		RULE_exmodaux = 33, RULE_ex = 34, RULE_exaux = 35, RULE_termino = 36, 
		RULE_terminoaux = 37, RULE_factor = 38, RULE_functioncall = 39, RULE_functioncallaux = 40;
	public static final String[] ruleNames = {
		"summerduck", "main", "vardec", "vardecaux", "type", "var", "varaux", 
		"var2", "varaux2", "fundef", "params", "paramsaux", "paramsaux2", "statements", 
		"asignations", "varAsign", "leer", "leeraux", "leeraux2", "escribir", 
		"ifelse", "ifelseaux", "while_statement", "dowhile", "exp", "expaux", 
		"exor", "exoraux", "exnot", "exnotaux", "exlog", "exlogaux", "exmod", 
		"exmodaux", "ex", "exaux", "termino", "terminoaux", "factor", "functioncall", 
		"functioncallaux"
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
		null, "PROG", "MAIN2", "INT", "FLOAT", "CHAR", "BOOL", "RETURN", "FUNCTION", 
		"IF", "ELSE", "WHILE", "THEN", "DO", "UNTIL", "SCAN", "PRINT", "SUMA", 
		"RESTA", "MULT", "DIV", "LP", "RP", "LB", "RB", "LK", "RK", "DP", "PC", 
		"COMA", "PUNTO", "MOD", "IGUAL", "MAYOR", "MENOR", "MAYORI", "MENORI", 
		"EQUIV", "NEG", "DIF", "AND", "OR", "CTE_BT", "CTE_BF", "CTE_I", "CTE_F", 
		"CTE_C", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "summerDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public summerDuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SummerduckContext extends ParserRuleContext {
		public TerminalNode PROG() { return getToken(summerDuckParser.PROG, 0); }
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public FundefContext fundef() {
			return getRuleContext(FundefContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public SummerduckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summerduck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterSummerduck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitSummerduck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitSummerduck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummerduckContext summerduck() throws RecognitionException {
		SummerduckContext _localctx = new SummerduckContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_summerduck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PROG);
			setState(83);
			match(ID);
			setState(84);
			match(PC);
			setState(85);
			vardec();
			setState(86);
			asignations();Reglas.Programa.R1();
			setState(87);
			fundef();
			setState(88);
			Reglas.Programa.R2(); main(); Reglas.Programa.R3();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN2() { return getToken(summerDuckParser.MAIN2, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MAIN2);
			setState(91);
			match(LP);
			setState(92);
			match(RP);
			setState(93);
			match(LK);Reglas.FuncDecl.R1();
			setState(94);
			vardec();
			setState(95);
			statements();
			setState(96);
			match(RK);Reglas.FuncDecl.R2();
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

	public static class VardecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DP() { return getToken(summerDuckParser.DP, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public VardecauxContext vardecaux() {
			return getRuleContext(VardecauxContext.class,0);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case MAIN2:
			case RETURN:
			case FUNCTION:
			case IF:
			case WHILE:
			case DO:
			case SCAN:
			case PRINT:
			case RK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				type();Reglas.VarDec.R1();
				setState(100);
				match(DP);
				setState(101);
				var2();
				setState(102);
				vardecaux();
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

	public static class VardecauxContext extends ParserRuleContext {
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode COMA() { return getToken(summerDuckParser.COMA, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public VardecauxContext vardecaux() {
			return getRuleContext(VardecauxContext.class,0);
		}
		public VardecauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVardecaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVardecaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVardecaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecauxContext vardecaux() throws RecognitionException {
		VardecauxContext _localctx = new VardecauxContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecaux);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case PC:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(PC);
				setState(107);
				vardec();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(COMA);
				setState(109);
				var2();
				setState(110);
				vardecaux();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(summerDuckParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(summerDuckParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(summerDuckParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(summerDuckParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
                Reglas.Type.R1(this.getCurrentToken().getText());
				consume();
			}
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public VarauxContext varaux() {
			return getRuleContext(VarauxContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			Reglas.Var1.EntrandoAID(this.getCurrentToken().getText());
            match(ID);
			setState(117);
			varaux();
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

	public static class VarauxContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(summerDuckParser.LB, 0); }
		public TerminalNode CTE_I() { return getToken(summerDuckParser.CTE_I, 0); }
		public TerminalNode RB() { return getToken(summerDuckParser.RB, 0); }
		public VarauxContext varaux() {
			return getRuleContext(VarauxContext.class,0);
		}
		public VarauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVaraux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVaraux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVaraux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarauxContext varaux() throws RecognitionException {
		VarauxContext _localctx = new VarauxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varaux);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case RP:
			case COMA:
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(LB);
				setState(121);
				match(CTE_I);
				setState(122);
				match(RB);
				setState(123);
				varaux();
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

	public static class Var2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public Varaux2Context varaux2() {
			return getRuleContext(Varaux2Context.class,0);
		}
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVar2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVar2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_var2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
            Reglas.VarDec.R2(this.getCurrentToken().getText());match(ID);
			setState(127);
			varaux2();
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

	public static class Varaux2Context extends ParserRuleContext {
		public TerminalNode LB() { return getToken(summerDuckParser.LB, 0); }
		public TerminalNode CTE_I() { return getToken(summerDuckParser.CTE_I, 0); }
		public TerminalNode RB() { return getToken(summerDuckParser.RB, 0); }
		public Varaux2Context varaux2() {
			return getRuleContext(Varaux2Context.class,0);
		}
		public Varaux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varaux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVaraux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVaraux2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVaraux2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varaux2Context varaux2() throws RecognitionException {
		Varaux2Context _localctx = new Varaux2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_varaux2);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case PC:
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(LB);
				setState(131);
				match(CTE_I);
				setState(132);
				match(RB);
				setState(133);
				varaux2();
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

	public static class FundefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(summerDuckParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public List<TerminalNode> LP() { return getTokens(summerDuckParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(summerDuckParser.LP, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<TerminalNode> RP() { return getTokens(summerDuckParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(summerDuckParser.RP, i);
		}
		public List<TerminalNode> PC() { return getTokens(summerDuckParser.PC); }
		public TerminalNode PC(int i) {
			return getToken(summerDuckParser.PC, i);
		}
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(summerDuckParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public FundefContext fundef() {
			return getRuleContext(FundefContext.class,0);
		}
		public FundefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterFundef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitFundef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitFundef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundefContext fundef() throws RecognitionException {
		FundefContext _localctx = new FundefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fundef);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case MAIN2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(FUNCTION);
				setState(138);
				type();
				setState(139);
				match(ID);
				setState(140);
				match(LP);
				setState(141);
				params();
				setState(142);
				match(RP);
				setState(143);
				match(PC);
				setState(144);
				match(LK);
				setState(145);
				vardec();
				setState(146);
				statements();
				setState(147);
				match(RETURN);
				setState(148);
				match(LP);
				setState(149);
				exp();
				setState(150);
				match(RP);
				setState(151);
				match(PC);
				setState(152);
				match(RK);
				setState(153);
				fundef();
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamsauxContext paramsaux() {
			return getRuleContext(ParamsauxContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				paramsaux();
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

	public static class ParamsauxContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DP() { return getToken(summerDuckParser.DP, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Paramsaux2Context paramsaux2() {
			return getRuleContext(Paramsaux2Context.class,0);
		}
		public ParamsauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterParamsaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitParamsaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitParamsaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsauxContext paramsaux() throws RecognitionException {
		ParamsauxContext _localctx = new ParamsauxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramsaux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			type();
			setState(162);
			match(DP);
			setState(163);
			var();
			setState(164);
			paramsaux2();
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

	public static class Paramsaux2Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(summerDuckParser.COMA, 0); }
		public ParamsauxContext paramsaux() {
			return getRuleContext(ParamsauxContext.class,0);
		}
		public Paramsaux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsaux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterParamsaux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitParamsaux2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitParamsaux2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paramsaux2Context paramsaux2() throws RecognitionException {
		Paramsaux2Context _localctx = new Paramsaux2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramsaux2);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(COMA);
				setState(168);
				paramsaux();
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

	public static class StatementsContext extends ParserRuleContext {
		public VarAsignContext varAsign() {
			return getRuleContext(VarAsignContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statements);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case RETURN:
			case LK:
			case RK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				varAsign();
				setState(173);
				statements();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				leer();
				setState(176);
				statements();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				escribir();
				setState(179);
				statements();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				ifelse();
				setState(182);
				statements();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				while_statement();
				setState(185);
				statements();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				dowhile();
				setState(188);
				statements();
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

	public static class AsignationsContext extends ParserRuleContext {
		public VarAsignContext varAsign() {
			return getRuleContext(VarAsignContext.class,0);
		}
		public AsignationsContext asignations() {
			return getRuleContext(AsignationsContext.class,0);
		}
		public AsignationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterAsignations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitAsignations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitAsignations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignationsContext asignations() throws RecognitionException {
		AsignationsContext _localctx = new AsignationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignations);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case MAIN2:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				varAsign();
				setState(194);
				asignations();
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

	public static class VarAsignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(summerDuckParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public VarAsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterVarAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitVarAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitVarAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAsignContext varAsign() throws RecognitionException {
		VarAsignContext _localctx = new VarAsignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varAsign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			var();Reglas.Asignacion.R1();
			setState(199);
			match(IGUAL);
			setState(200);
			exp();
			setState(201);
			match(PC);Reglas.Asignacion.R2();
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(summerDuckParser.SCAN, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public LeerauxContext leeraux() {
			return getRuleContext(LeerauxContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SCAN);
			setState(204);
			match(LP);
			setState(205);
			leeraux();
			setState(206);
			match(RP);
			setState(207);
			match(PC);
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

	public static class LeerauxContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Leeraux2Context leeraux2() {
			return getRuleContext(Leeraux2Context.class,0);
		}
		public LeerauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leeraux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterLeeraux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitLeeraux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitLeeraux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerauxContext leeraux() throws RecognitionException {
		LeerauxContext _localctx = new LeerauxContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_leeraux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			var();Reglas.Leer.R1();
			setState(210);
			leeraux2();
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

	public static class Leeraux2Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(summerDuckParser.COMA, 0); }
		public LeerauxContext leeraux() {
			return getRuleContext(LeerauxContext.class,0);
		}
		public Leeraux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leeraux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterLeeraux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitLeeraux2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitLeeraux2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leeraux2Context leeraux2() throws RecognitionException {
		Leeraux2Context _localctx = new Leeraux2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_leeraux2);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(COMA);
				setState(214);
				leeraux();
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(summerDuckParser.PRINT, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PRINT);
			setState(218);
			match(LP);
			setState(208);
			exp();Reglas.Escribir.R1();
			setState(220);
			match(RP);
			setState(221);
			match(PC);
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(summerDuckParser.IF, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public IfelseauxContext ifelseaux() {
			return getRuleContext(IfelseauxContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IF);
			setState(224);
			match(LP);
			setState(225);
			exp();
			setState(226);
			match(RP);
			setState(227);
			match(LK);Reglas.Condicional.R1();
			setState(228);
			statements();Reglas.Condicional.R2();
			setState(229);
			match(RK);
			setState(230);
			ifelseaux();
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

	public static class IfelseauxContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(summerDuckParser.ELSE, 0); }
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public IfelseauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterIfelseaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitIfelseaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitIfelseaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseauxContext ifelseaux() throws RecognitionException {
		IfelseauxContext _localctx = new IfelseauxContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifelseaux);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case RETURN:
			case IF:
			case WHILE:
			case DO:
			case SCAN:
			case PRINT:
			case LK:
			case RK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ELSE);
				setState(234);
				match(LK);Reglas.Condicional.R3();
				setState(235);
				statements();Reglas.Condicional.R2();
				setState(236);
				match(RK);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(summerDuckParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode THEN() { return getToken(summerDuckParser.THEN, 0); }
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHILE);
			setState(241);
			match(LP);Reglas.Mientras.R1();
			setState(242);
			exp();Reglas.Mientras.R2();
			setState(243);
			match(RP);
			setState(244);
			match(THEN);
			setState(245);
			match(RK);
			setState(246);
			statements();Reglas.Mientras.R3();
			setState(247);
			match(LK);
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

	public static class DowhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(summerDuckParser.DO, 0); }
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RK() { return getToken(summerDuckParser.RK, 0); }
		public TerminalNode UNTIL() { return getToken(summerDuckParser.UNTIL, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DO);
			setState(250);
			match(LK);Reglas.HazMientras.R1();
			setState(251);
			statements();
			setState(252);
			match(RK);
			setState(253);
			match(UNTIL);
			setState(254);
			match(LP);
			setState(255);
			exp();Reglas.HazMientras.R2();
			setState(256);
			match(RP);
			setState(257);
			match(PC);
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

	public static class ExpContext extends ParserRuleContext {
		public ExorContext exor() {
			return getRuleContext(ExorContext.class,0);
		}
		public ExpauxContext expaux() {
			return getRuleContext(ExpauxContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
            Reglas.Expresion.IniciaExp();
            exor();
			setState(260);
			expaux();
            Reglas.Expresion.TerminaExp();
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

	public static class ExpauxContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(summerDuckParser.AND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExpaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExpaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExpaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpauxContext expaux() throws RecognitionException {
		ExpauxContext _localctx = new ExpauxContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expaux);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				Reglas.Expresion.Operador(Prioridades.AND);match(AND);
				setState(264);
				exp();
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

	public static class ExorContext extends ParserRuleContext {
		public ExnotContext exnot() {
			return getRuleContext(ExnotContext.class,0);
		}
		public ExorauxContext exoraux() {
			return getRuleContext(ExorauxContext.class,0);
		}
		public ExorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExorContext exor() throws RecognitionException {
		ExorContext _localctx = new ExorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			exnot();
			setState(268);
			exoraux();
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

	public static class ExorauxContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(summerDuckParser.OR, 0); }
		public ExorContext exor() {
			return getRuleContext(ExorContext.class,0);
		}
		public ExorauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exoraux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExoraux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExoraux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExoraux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExorauxContext exoraux() throws RecognitionException {
		ExorauxContext _localctx = new ExorauxContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exoraux);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				Reglas.Expresion.Operador(Prioridades.OR);match(OR);
				setState(272);
				exor();
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

	public static class ExnotContext extends ParserRuleContext {
		public ExlogContext exlog() {
			return getRuleContext(ExlogContext.class,0);
		}
		public ExnotauxContext exnotaux() {
			return getRuleContext(ExnotauxContext.class,0);
		}
		public ExnotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exnot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExnot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExnotContext exnot() throws RecognitionException {
		ExnotContext _localctx = new ExnotContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exnot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			exlog();
			setState(276);
			exnotaux();
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

	public static class ExnotauxContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(summerDuckParser.NEG, 0); }
		public ExnotContext exnot() {
			return getRuleContext(ExnotContext.class,0);
		}
		public ExnotauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exnotaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExnotaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExnotaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExnotaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExnotauxContext exnotaux() throws RecognitionException {
		ExnotauxContext _localctx = new ExnotauxContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exnotaux);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NEG:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				Reglas.Expresion.Operador(Prioridades.NOT); match(NEG);
				setState(280);
				exnot();
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

	public static class ExlogContext extends ParserRuleContext {
		public ExmodContext exmod() {
			return getRuleContext(ExmodContext.class,0);
		}
		public ExlogauxContext exlogaux() {
			return getRuleContext(ExlogauxContext.class,0);
		}
		public ExlogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exlog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExlog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExlogContext exlog() throws RecognitionException {
		ExlogContext _localctx = new ExlogContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exlog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			exmod();
			setState(284);
			exlogaux();
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

	public static class ExlogauxContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(summerDuckParser.MAYOR, 0); }
		public ExlogContext exlog() {
			return getRuleContext(ExlogContext.class,0);
		}
		public TerminalNode MENOR() { return getToken(summerDuckParser.MENOR, 0); }
		public TerminalNode MAYORI() { return getToken(summerDuckParser.MAYORI, 0); }
		public TerminalNode MENORI() { return getToken(summerDuckParser.MENORI, 0); }
		public TerminalNode EQUIV() { return getToken(summerDuckParser.EQUIV, 0); }
		public TerminalNode DIF() { return getToken(summerDuckParser.DIF, 0); }
		public ExlogauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exlogaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExlogaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExlogaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExlogaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExlogauxContext exlogaux() throws RecognitionException {
		ExlogauxContext _localctx = new ExlogauxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exlogaux);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case NEG:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				Reglas.Expresion.Operador(Prioridades.MAYOR);match(MAYOR);
				setState(288);
				exlog();
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
                Reglas.Expresion.Operador(Prioridades.MENOR);match(MENOR);
				setState(290);
				exlog();
				}
				break;
			case MAYORI:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
                Reglas.Expresion.Operador(Prioridades.MAYORIGUAL);match(MAYORI);
				setState(292);
				exlog();
				}
				break;
			case MENORI:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
                Reglas.Expresion.Operador(Prioridades.MENORIGUAL);match(MENORI);
				setState(294);
				exlog();
				}
				break;
			case EQUIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
                Reglas.Expresion.Operador(Prioridades.EQUIVALENTE);match(EQUIV);
				setState(296);
				exlog();
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
                Reglas.Expresion.Operador(Prioridades.DIFERENTE);match(DIF);
				setState(298);
				exlog();
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

	public static class ExmodContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ExmodauxContext exmodaux() {
			return getRuleContext(ExmodauxContext.class,0);
		}
		public ExmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExmod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExmodContext exmod() throws RecognitionException {
		ExmodContext _localctx = new ExmodContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			ex();
			setState(302);
			exmodaux();
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

	public static class ExmodauxContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(summerDuckParser.MOD, 0); }
		public ExmodContext exmod() {
			return getRuleContext(ExmodContext.class,0);
		}
		public ExmodauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exmodaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExmodaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExmodaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExmodaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExmodauxContext exmodaux() throws RecognitionException {
		ExmodauxContext _localctx = new ExmodauxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exmodaux);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case MAYOR:
			case MENOR:
			case MAYORI:
			case MENORI:
			case EQUIV:
			case NEG:
			case DIF:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
                Reglas.Expresion.Operador(Prioridades.MOD);match(MOD);
				setState(306);
				exmod();
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

	public static class ExContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExauxContext exaux() {
			return getRuleContext(ExauxContext.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			termino();
			setState(310);
			exaux();
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

	public static class ExauxContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(summerDuckParser.SUMA, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(summerDuckParser.RESTA, 0); }
		public ExauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterExaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitExaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitExaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExauxContext exaux() throws RecognitionException {
		ExauxContext _localctx = new ExauxContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exaux);
		try {
			setState(317);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case MOD:
			case MAYOR:
			case MENOR:
			case MAYORI:
			case MENORI:
			case EQUIV:
			case NEG:
			case DIF:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
                Reglas.Expresion.Operador(Prioridades.SUMA);match(SUMA);
				setState(314);
				ex();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
                Reglas.Expresion.Operador(Prioridades.RESTA);match(RESTA);
				setState(316);
				ex();
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoauxContext terminoaux() {
			return getRuleContext(TerminoauxContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			factor();
			setState(320);
			terminoaux();
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

	public static class TerminoauxContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(summerDuckParser.MULT, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode DIV() { return getToken(summerDuckParser.DIV, 0); }
		public TerminoauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterTerminoaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitTerminoaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitTerminoaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoauxContext terminoaux() throws RecognitionException {
		TerminoauxContext _localctx = new TerminoauxContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_terminoaux);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
			case RP:
			case PC:
			case COMA:
			case MOD:
			case MAYOR:
			case MENOR:
			case MAYORI:
			case MENORI:
			case EQUIV:
			case NEG:
			case DIF:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				Reglas.Expresion.Operador(Prioridades.MULTIPLICACION);match(MULT);
				setState(324);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
                Reglas.Expresion.Operador(Prioridades.DIVICION);match(DIV);
				setState(326);
				termino();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(summerDuckParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(summerDuckParser.CTE_F, 0); }
		public TerminalNode CTE_C() { return getToken(summerDuckParser.CTE_C, 0); }
		public TerminalNode CTE_BF() { return getToken(summerDuckParser.CTE_BF, 0); }
		public TerminalNode CTE_BT() { return getToken(summerDuckParser.CTE_BT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_factor);
		try {
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(LP);
				setState(331);
				exp();
				setState(332);
				match(RP);Reglas.Expresion.CierraParentesis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				Reglas.Expresion.Factor(this.getCurrentToken().getText());match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
                Reglas.Constante.R1(Compilador.ManejadorDeMemoria.Memoria.VAR_INT, this.getCurrentToken().getText());
				Reglas.Expresion.CTE(Compilador.ManejadorDeMemoria.Memoria.VAR_INT, this.getCurrentToken().getText());
				match(CTE_I);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
                Reglas.Constante.R1(Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT, this.getCurrentToken().getText());
                Reglas.Expresion.CTE(Compilador.ManejadorDeMemoria.Memoria.VAR_FLOAT, this.getCurrentToken().getText());
				match(CTE_F);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
                Reglas.Constante.R1(Compilador.ManejadorDeMemoria.Memoria.VAR_STRING, this.getCurrentToken().getText());
				Reglas.Expresion.CTE(Compilador.ManejadorDeMemoria.Memoria.VAR_STRING, this.getCurrentToken().getText());
				match(CTE_C);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(339);
                Reglas.Constante.R1(Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL, "false");
				Reglas.Expresion.CTE(Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL, "false");
				match(CTE_BF);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(340);
                Reglas.Constante.R1(Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL, "true");
				Reglas.Expresion.CTE(Compilador.ManejadorDeMemoria.Memoria.VAR_BOOL, "true");
				match(CTE_BT);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(summerDuckParser.ID, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctioncallauxContext functioncallaux() {
			return getRuleContext(FunctioncallauxContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(LP);
			setState(345);
			exp();
			setState(346);
			functioncallaux();
			setState(347);
			match(RP);
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

	public static class FunctioncallauxContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(summerDuckParser.COMA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctioncallauxContext functioncallaux() {
			return getRuleContext(FunctioncallauxContext.class,0);
		}
		public FunctioncallauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).enterFunctioncallaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof summerDuckListener ) ((summerDuckListener)listener).exitFunctioncallaux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof summerDuckVisitor ) return ((summerDuckVisitor<? extends T>)visitor).visitFunctioncallaux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallauxContext functioncallaux() throws RecognitionException {
		FunctioncallauxContext _localctx = new FunctioncallauxContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functioncallaux);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(COMA);
				setState(351);
				exp();
				setState(352);
				functioncallaux();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0167\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\5\f\u00a2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00c1\n\17\3\20\3\20\3\20\3\20\5\20\u00c7\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\5\24\u00da\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f1"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u010c"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0114\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u011c\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u012e\n!\3\"\3\"\3\"\3#\3#\3#\5#\u0136\n#\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\5%\u0140\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u014a\n\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0158\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\5*\u0165\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPR\2\3\3\2\5\b\u0164\2T\3\2\2\2\4\\\3\2\2\2\6"+
		"j\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0080\3\2\2"+
		"\2\22\u0088\3\2\2\2\24\u009d\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2"+
		"\32\u00ab\3\2\2\2\34\u00c0\3\2\2\2\36\u00c6\3\2\2\2 \u00c8\3\2\2\2\"\u00cd"+
		"\3\2\2\2$\u00d3\3\2\2\2&\u00d9\3\2\2\2(\u00db\3\2\2\2*\u00e1\3\2\2\2,"+
		"\u00f0\3\2\2\2.\u00f2\3\2\2\2\60\u00fb\3\2\2\2\62\u0105\3\2\2\2\64\u010b"+
		"\3\2\2\2\66\u010d\3\2\2\28\u0113\3\2\2\2:\u0115\3\2\2\2<\u011b\3\2\2\2"+
		">\u011d\3\2\2\2@\u012d\3\2\2\2B\u012f\3\2\2\2D\u0135\3\2\2\2F\u0137\3"+
		"\2\2\2H\u013f\3\2\2\2J\u0141\3\2\2\2L\u0149\3\2\2\2N\u0157\3\2\2\2P\u0159"+
		"\3\2\2\2R\u0164\3\2\2\2TU\7\3\2\2UV\7\61\2\2VW\7\36\2\2WX\5\6\4\2XY\5"+
		"\36\20\2YZ\5\24\13\2Z[\5\4\3\2[\3\3\2\2\2\\]\7\4\2\2]^\7\27\2\2^_\7\30"+
		"\2\2_`\7\33\2\2`a\5\6\4\2ab\5\34\17\2bc\7\34\2\2c\5\3\2\2\2dk\3\2\2\2"+
		"ef\5\n\6\2fg\7\35\2\2gh\5\20\t\2hi\5\b\5\2ik\3\2\2\2jd\3\2\2\2je\3\2\2"+
		"\2k\7\3\2\2\2lm\7\36\2\2ms\5\6\4\2no\7\37\2\2op\5\20\t\2pq\5\b\5\2qs\3"+
		"\2\2\2rl\3\2\2\2rn\3\2\2\2s\t\3\2\2\2tu\t\2\2\2u\13\3\2\2\2vw\7\61\2\2"+
		"wx\5\16\b\2x\r\3\2\2\2y\177\3\2\2\2z{\7\31\2\2{|\7.\2\2|}\7\32\2\2}\177"+
		"\5\16\b\2~y\3\2\2\2~z\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\21\3\2\2\2\u0083\u0089\3\2\2\2\u0084\u0085\7\31"+
		"\2\2\u0085\u0086\7.\2\2\u0086\u0087\7\32\2\2\u0087\u0089\5\22\n\2\u0088"+
		"\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0089\23\3\2\2\2\u008a\u009e\3\2\2"+
		"\2\u008b\u008c\7\n\2\2\u008c\u008d\5\n\6\2\u008d\u008e\7\61\2\2\u008e"+
		"\u008f\7\27\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\30\2\2\u0091\u0092"+
		"\7\36\2\2\u0092\u0093\7\33\2\2\u0093\u0094\5\6\4\2\u0094\u0095\5\34\17"+
		"\2\u0095\u0096\7\t\2\2\u0096\u0097\7\27\2\2\u0097\u0098\5\62\32\2\u0098"+
		"\u0099\7\30\2\2\u0099\u009a\7\36\2\2\u009a\u009b\7\34\2\2\u009b\u009c"+
		"\5\24\13\2\u009c\u009e\3\2\2\2\u009d\u008a\3\2\2\2\u009d\u008b\3\2\2\2"+
		"\u009e\25\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\5\30\r\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5\n\6\2\u00a4"+
		"\u00a5\7\35\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\5\32\16\2\u00a7\31\3\2"+
		"\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ac\5\30\r\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00c1\3\2\2"+
		"\2\u00ae\u00af\5 \21\2\u00af\u00b0\5\34\17\2\u00b0\u00c1\3\2\2\2\u00b1"+
		"\u00b2\5\"\22\2\u00b2\u00b3\5\34\17\2\u00b3\u00c1\3\2\2\2\u00b4\u00b5"+
		"\5(\25\2\u00b5\u00b6\5\34\17\2\u00b6\u00c1\3\2\2\2\u00b7\u00b8\5*\26\2"+
		"\u00b8\u00b9\5\34\17\2\u00b9\u00c1\3\2\2\2\u00ba\u00bb\5.\30\2\u00bb\u00bc"+
		"\5\34\17\2\u00bc\u00c1\3\2\2\2\u00bd\u00be\5\60\31\2\u00be\u00bf\5\34"+
		"\17\2\u00bf\u00c1\3\2\2\2\u00c0\u00ad\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0"+
		"\u00b1\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c1\35\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4"+
		"\5 \21\2\u00c4\u00c5\5\36\20\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2"+
		"\u00c6\u00c3\3\2\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\5\f\7\2\u00c9\u00ca"+
		"\7\"\2\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc\7\36\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00ce\7\21\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7"+
		"\30\2\2\u00d1\u00d2\7\36\2\2\u00d2#\3\2\2\2\u00d3\u00d4\5\f\7\2\u00d4"+
		"\u00d5\5&\24\2\u00d5%\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d8\7\37\2\2"+
		"\u00d8\u00da\5$\23\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\'\3"+
		"\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\27\2\2\u00dd\u00de\5\62\32\2"+
		"\u00de\u00df\7\30\2\2\u00df\u00e0\7\36\2\2\u00e0)\3\2\2\2\u00e1\u00e2"+
		"\7\13\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\5\62\32\2\u00e4\u00e5\7\30"+
		"\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\34\2\2\u00e8"+
		"\u00e9\5,\27\2\u00e9+\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\7\f\2\2"+
		"\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\7\34\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1-\3\2\2\2"+
		"\u00f2\u00f3\7\r\2\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5\5\62\32\2\u00f5"+
		"\u00f6\7\30\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00f8\7\34\2\2\u00f8\u00f9"+
		"\5\34\17\2\u00f9\u00fa\7\33\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc"+
		"\u00fd\7\33\2\2\u00fd\u00fe\5\34\17\2\u00fe\u00ff\7\34\2\2\u00ff\u0100"+
		"\7\20\2\2\u0100\u0101\7\27\2\2\u0101\u0102\5\62\32\2\u0102\u0103\7\30"+
		"\2\2\u0103\u0104\7\36\2\2\u0104\61\3\2\2\2\u0105\u0106\5\66\34\2\u0106"+
		"\u0107\5\64\33\2\u0107\63\3\2\2\2\u0108\u010c\3\2\2\2\u0109\u010a\7*\2"+
		"\2\u010a\u010c\5\62\32\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\65\3\2\2\2\u010d\u010e\5:\36\2\u010e\u010f\58\35\2\u010f\67\3\2\2\2\u0110"+
		"\u0114\3\2\2\2\u0111\u0112\7+\2\2\u0112\u0114\5\66\34\2\u0113\u0110\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u01149\3\2\2\2\u0115\u0116\5> \2\u0116\u0117"+
		"\5<\37\2\u0117;\3\2\2\2\u0118\u011c\3\2\2\2\u0119\u011a\7(\2\2\u011a\u011c"+
		"\5:\36\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011c=\3\2\2\2\u011d"+
		"\u011e\5B\"\2\u011e\u011f\5@!\2\u011f?\3\2\2\2\u0120\u012e\3\2\2\2\u0121"+
		"\u0122\7#\2\2\u0122\u012e\5> \2\u0123\u0124\7$\2\2\u0124\u012e\5> \2\u0125"+
		"\u0126\7%\2\2\u0126\u012e\5> \2\u0127\u0128\7&\2\2\u0128\u012e\5> \2\u0129"+
		"\u012a\7\'\2\2\u012a\u012e\5> \2\u012b\u012c\7)\2\2\u012c\u012e\5> \2"+
		"\u012d\u0120\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0125"+
		"\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"A\3\2\2\2\u012f\u0130\5F$\2\u0130\u0131\5D#\2\u0131C\3\2\2\2\u0132\u0136"+
		"\3\2\2\2\u0133\u0134\7!\2\2\u0134\u0136\5B\"\2\u0135\u0132\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136E\3\2\2\2\u0137\u0138\5J&\2\u0138\u0139\5H%\2\u0139"+
		"G\3\2\2\2\u013a\u0140\3\2\2\2\u013b\u013c\7\23\2\2\u013c\u0140\5F$\2\u013d"+
		"\u013e\7\24\2\2\u013e\u0140\5F$\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140I\3\2\2\2\u0141\u0142\5N(\2\u0142\u0143"+
		"\5L\'\2\u0143K\3\2\2\2\u0144\u014a\3\2\2\2\u0145\u0146\7\25\2\2\u0146"+
		"\u014a\5J&\2\u0147\u0148\7\26\2\2\u0148\u014a\5J&\2\u0149\u0144\3\2\2"+
		"\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014aM\3\2\2\2\u014b\u0158"+
		"\3\2\2\2\u014c\u014d\7\27\2\2\u014d\u014e\5\62\32\2\u014e\u014f\7\30\2"+
		"\2\u014f\u0158\3\2\2\2\u0150\u0158\5P)\2\u0151\u0158\7\61\2\2\u0152\u0158"+
		"\7.\2\2\u0153\u0158\7/\2\2\u0154\u0158\7\60\2\2\u0155\u0158\7-\2\2\u0156"+
		"\u0158\7,\2\2\u0157\u014b\3\2\2\2\u0157\u014c\3\2\2\2\u0157\u0150\3\2"+
		"\2\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157"+
		"\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158O\3\2\2\2"+
		"\u0159\u015a\7\61\2\2\u015a\u015b\7\27\2\2\u015b\u015c\5\62\32\2\u015c"+
		"\u015d\5R*\2\u015d\u015e\7\30\2\2\u015eQ\3\2\2\2\u015f\u0165\3\2\2\2\u0160"+
		"\u0161\7\37\2\2\u0161\u0162\5\62\32\2\u0162\u0163\5R*\2\u0163\u0165\3"+
		"\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0165S\3\2\2\2\26jr~\u0088"+
		"\u009d\u00a1\u00ab\u00c0\u00c6\u00d9\u00f0\u010b\u0113\u011b\u012d\u0135"+
		"\u013f\u0149\u0157\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}