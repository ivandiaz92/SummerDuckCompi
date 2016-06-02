// Generated from C:/Users/jd-14/IdeaProjects/SummerDuck\summerDuck.g4 by ANTLR 4.5.1
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
		PROG=1, MAIN=2, INT=3, FLOAT=4, CHAR=5, BOOL=6, RETURN=7, FUNCTION=8, 
		IF=9, ELSE=10, WHILE=11, THEN=12, DO=13, UNTIL=14, SCAN=15, PRINT=16, 
		SUMA=17, RESTA=18, MULT=19, DIV=20, LP=21, RP=22, LB=23, RB=24, LK=25, 
		RK=26, DP=27, PC=28, COMA=29, PUNTO=30, MOD=31, IGUAL=32, MAYOR=33, MENOR=34, 
		MAYORI=35, MENORI=36, EQUIV=37, NEG=38, DIF=39, AND=40, OR=41, CTE_I=42, 
		CTE_F=43, CTE_C=44, ID=45;
	public static final int
		RULE_summerduck = 0, RULE_main = 1, RULE_vardec = 2, RULE_vardecaux = 3, 
		RULE_type = 4, RULE_var = 5, RULE_varaux = 6, RULE_fundef = 7, RULE_params = 8, 
		RULE_paramsaux = 9, RULE_paramsaux2 = 10, RULE_statements = 11, RULE_leer = 12, 
		RULE_leeraux = 13, RULE_leeraux2 = 14, RULE_escribir = 15, RULE_ifelse = 16, 
		RULE_ifelseaux = 17, RULE_while_statement = 18, RULE_dowhile = 19, RULE_exp = 20, 
		RULE_expaux = 21, RULE_exor = 22, RULE_exoraux = 23, RULE_exnot = 24, 
		RULE_exnotaux = 25, RULE_exlog = 26, RULE_exlogaux = 27, RULE_exmod = 28, 
		RULE_exmodaux = 29, RULE_ex = 30, RULE_exaux = 31, RULE_termino = 32, 
		RULE_terminoaux = 33, RULE_factor = 34, RULE_functioncall = 35, RULE_functioncallaux = 36;
	public static final String[] ruleNames = {
		"summerduck", "main", "vardec", "vardecaux", "type", "var", "varaux", 
		"fundef", "params", "paramsaux", "paramsaux2", "statements", "leer", "leeraux", 
		"leeraux2", "escribir", "ifelse", "ifelseaux", "while_statement", "dowhile", 
		"exp", "expaux", "exor", "exoraux", "exnot", "exnotaux", "exlog", "exlogaux", 
		"exmod", "exmodaux", "ex", "exaux", "termino", "terminoaux", "factor", 
		"functioncall", "functioncallaux"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'principal'", "'entero'", "'real'", "'char'", "'boleano'", 
		"'regresa'", "'modulo'", "'si'", "'sino'", "'mientras'", "'haz'", "'repite'", 
		"'hasta'", "'leer'", "'escribir'", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "':'", "';'", "','", "'.'", "'%'", 
		"'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'¡'", "'!='", "'&'", "'|'"
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
			setState(74);
			match(PROG);
			setState(75);
			match(ID);
			setState(76);
			match(PC);
			setState(77);
			vardec();
			setState(78);
			fundef();
			setState(79);
			main();
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
		public TerminalNode MAIN() { return getToken(summerDuckParser.MAIN, 0); }
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode LK() { return getToken(summerDuckParser.LK, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
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
			setState(81);
			match(MAIN);
			setState(82);
			match(LP);
			setState(83);
			match(RP);
			setState(84);
			match(LK);
			setState(85);
			vardec();
			setState(86);
			statements();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(94);
			switch (_input.LA(1)) {
			case EOF:
			case MAIN:
			case RETURN:
			case FUNCTION:
			case IF:
			case DO:
			case SCAN:
			case LP:
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
				setState(89);
				type();Reglas.VarDec.R1();
				setState(90);
				match(DP);
				setState(91);
				var();Reglas.VarDec.R2();
				setState(92);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
			setState(102);
			switch (_input.LA(1)) {
			case PC:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(PC);
				setState(97);
				vardec();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(COMA);
				setState(99);
				var();
				setState(100);
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
			setState(104);
			_la = _input.LA(1);
			Reglas.Type.R1(this.getCurrentToken().getText());
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(106);
			match(ID);
			setState(107);
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
			setState(114);
			switch (_input.LA(1)) {
			case RP:
			case PC:
			case COMA:
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(LB);
				setState(111);
				match(CTE_I);
				setState(112);
				match(RB);
				setState(113);
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
		enterRule(_localctx, 14, RULE_fundef);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(FUNCTION);
				setState(118);
				type();
				setState(119);
				match(ID);
				setState(120);
				match(LP);
				setState(121);
				params();
				setState(122);
				match(RP);
				setState(123);
				match(PC);
				setState(124);
				match(LK);
				setState(125);
				vardec();
				setState(126);
				statements();
				setState(127);
				match(RETURN);
				setState(128);
				match(LP);
				setState(129);
				exp();
				setState(130);
				match(RP);
				setState(131);
				match(PC);
				setState(132);
				match(RK);
				setState(133);
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
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(139);
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
				setState(138);
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
		enterRule(_localctx, 18, RULE_paramsaux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			type();
			setState(142);
			match(DP);
			setState(143);
			var();
			setState(144);
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
		enterRule(_localctx, 20, RULE_paramsaux2);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(COMA);
				setState(148);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(summerDuckParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(summerDuckParser.PC, 0); }
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
		enterRule(_localctx, 22, RULE_statements);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				var();
				setState(153);
				match(IGUAL);
				setState(154);
				exp();
				setState(155);
				match(PC);
				setState(156);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				leer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				escribir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				ifelse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				dowhile();
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

	public static class LeerContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LP);
			setState(166);
			leeraux();
			setState(167);
			match(RP);
			setState(168);
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
		enterRule(_localctx, 26, RULE_leeraux);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			var();
			setState(171);
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
		enterRule(_localctx, 28, RULE_leeraux2);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(COMA);
				setState(175);
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
		public TerminalNode SCAN() { return getToken(summerDuckParser.SCAN, 0); }
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
		enterRule(_localctx, 30, RULE_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SCAN);
			setState(179);
			match(LP);
			setState(180);
			exp();
			setState(181);
			match(RP);
			setState(182);
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
		enterRule(_localctx, 32, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IF);
			setState(185);
			match(LP);
			setState(186);
			exp();
			setState(187);
			match(RP);
			setState(188);
			match(LK);
			setState(189);
			statements();
			setState(190);
			match(RK);
			setState(191);
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
		enterRule(_localctx, 34, RULE_ifelseaux);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case EOF:
			case RETURN:
			case LK:
			case RK:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ELSE);
				setState(195);
				match(LK);
				setState(196);
				statements();
				setState(197);
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
		public TerminalNode LP() { return getToken(summerDuckParser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(summerDuckParser.RP, 0); }
		public TerminalNode DO() { return getToken(summerDuckParser.DO, 0); }
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
		enterRule(_localctx, 36, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LP);
			setState(202);
			exp();
			setState(203);
			match(RP);
			setState(204);
			match(DO);
			setState(205);
			match(RK);
			setState(206);
			statements();
			setState(207);
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
		enterRule(_localctx, 38, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(DO);
			setState(210);
			match(LK);
			setState(211);
			statements();
			setState(212);
			match(RK);
			setState(213);
			match(UNTIL);
			setState(214);
			match(LP);
			setState(215);
			exp();
			setState(216);
			match(RP);
			setState(217);
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
		enterRule(_localctx, 40, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			exor();
			setState(220);
			expaux();
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
		enterRule(_localctx, 42, RULE_expaux);
		try {
			setState(225);
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
				setState(223);
				match(AND);
				setState(224);
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
		enterRule(_localctx, 44, RULE_exor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			exnot();
			setState(228);
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
		enterRule(_localctx, 46, RULE_exoraux);
		try {
			setState(233);
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
				setState(231);
				match(OR);
				setState(232);
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
		enterRule(_localctx, 48, RULE_exnot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			exlog();
			setState(236);
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
		enterRule(_localctx, 50, RULE_exnotaux);
		try {
			setState(241);
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
				setState(239);
				match(NEG);
				setState(240);
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
		enterRule(_localctx, 52, RULE_exlog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			exmod();
			setState(244);
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
		enterRule(_localctx, 54, RULE_exlogaux);
		try {
			setState(259);
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
				setState(247);
				match(MAYOR);
				setState(248);
				exlog();
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(MENOR);
				setState(250);
				exlog();
				}
				break;
			case MAYORI:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(MAYORI);
				setState(252);
				exlog();
				}
				break;
			case MENORI:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(MENORI);
				setState(254);
				exlog();
				}
				break;
			case EQUIV:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(EQUIV);
				setState(256);
				exlog();
				}
				break;
			case DIF:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(DIF);
				setState(258);
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
		enterRule(_localctx, 56, RULE_exmod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			ex();
			setState(262);
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
		enterRule(_localctx, 58, RULE_exmodaux);
		try {
			setState(267);
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
				setState(265);
				match(MOD);
				setState(266);
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
		enterRule(_localctx, 60, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			termino();
			setState(270);
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
		enterRule(_localctx, 62, RULE_exaux);
		try {
			setState(277);
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
				setState(273);
				match(SUMA);
				setState(274);
				ex();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(RESTA);
				setState(276);
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
		enterRule(_localctx, 64, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			factor();
			setState(280);
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
		enterRule(_localctx, 66, RULE_terminoaux);
		try {
			setState(287);
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
				setState(283);
				match(MULT);
				setState(284);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(DIV);
				setState(286);
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
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(LP);
				setState(291);
				exp();
				setState(292);
				match(RP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(CTE_I);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				match(CTE_F);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				match(CTE_C);
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
		enterRule(_localctx, 70, RULE_functioncall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(LP);
			setState(303);
			exp();
			setState(304);
			functioncallaux();
			setState(305);
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
		enterRule(_localctx, 72, RULE_functioncallaux);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case RP:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(COMA);
				setState(309);
				exp();
				setState(310);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u008a\n\t\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ca\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00ec\n\31\3\32\3\32\3\32\3\33\3\33\3\33\5\33"+
		"\u00f4\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0106\n\35\3\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u010e\n\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0118\n!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\5#\u0122\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u012e\n$\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\5&\u013b\n&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3\3\2\5\b\u013a\2L\3\2\2"+
		"\2\4S\3\2\2\2\6`\3\2\2\2\bh\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16t\3\2\2\2"+
		"\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0097\3\2\2\2\30"+
		"\u00a5\3\2\2\2\32\u00a7\3\2\2\2\34\u00ac\3\2\2\2\36\u00b2\3\2\2\2 \u00b4"+
		"\3\2\2\2\"\u00ba\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00d3\3\2\2\2"+
		"*\u00dd\3\2\2\2,\u00e3\3\2\2\2.\u00e5\3\2\2\2\60\u00eb\3\2\2\2\62\u00ed"+
		"\3\2\2\2\64\u00f3\3\2\2\2\66\u00f5\3\2\2\28\u0105\3\2\2\2:\u0107\3\2\2"+
		"\2<\u010d\3\2\2\2>\u010f\3\2\2\2@\u0117\3\2\2\2B\u0119\3\2\2\2D\u0121"+
		"\3\2\2\2F\u012d\3\2\2\2H\u012f\3\2\2\2J\u013a\3\2\2\2LM\7\3\2\2MN\7/\2"+
		"\2NO\7\36\2\2OP\5\6\4\2PQ\5\20\t\2QR\5\4\3\2R\3\3\2\2\2ST\7\4\2\2TU\7"+
		"\27\2\2UV\7\30\2\2VW\7\33\2\2WX\5\6\4\2XY\5\30\r\2Y\5\3\2\2\2Za\3\2\2"+
		"\2[\\\5\n\6\2\\]\7\35\2\2]^\5\f\7\2^_\5\b\5\2_a\3\2\2\2`Z\3\2\2\2`[\3"+
		"\2\2\2a\7\3\2\2\2bc\7\36\2\2ci\5\6\4\2de\7\37\2\2ef\5\f\7\2fg\5\b\5\2"+
		"gi\3\2\2\2hb\3\2\2\2hd\3\2\2\2i\t\3\2\2\2jk\t\2\2\2k\13\3\2\2\2lm\7/\2"+
		"\2mn\5\16\b\2n\r\3\2\2\2ou\3\2\2\2pq\7\31\2\2qr\7,\2\2rs\7\32\2\2su\5"+
		"\16\b\2to\3\2\2\2tp\3\2\2\2u\17\3\2\2\2v\u008a\3\2\2\2wx\7\n\2\2xy\5\n"+
		"\6\2yz\7/\2\2z{\7\27\2\2{|\5\22\n\2|}\7\30\2\2}~\7\36\2\2~\177\7\33\2"+
		"\2\177\u0080\5\6\4\2\u0080\u0081\5\30\r\2\u0081\u0082\7\t\2\2\u0082\u0083"+
		"\7\27\2\2\u0083\u0084\5*\26\2\u0084\u0085\7\30\2\2\u0085\u0086\7\36\2"+
		"\2\u0086\u0087\7\34\2\2\u0087\u0088\5\20\t\2\u0088\u008a\3\2\2\2\u0089"+
		"v\3\2\2\2\u0089w\3\2\2\2\u008a\21\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008e"+
		"\5\24\13\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\5\n\6\2\u0090\u0091\7\35\2\2\u0091\u0092\5\f\7\2\u0092\u0093\5"+
		"\26\f\2\u0093\25\3\2\2\2\u0094\u0098\3\2\2\2\u0095\u0096\7\37\2\2\u0096"+
		"\u0098\5\24\13\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0098\27\3\2"+
		"\2\2\u0099\u00a6\3\2\2\2\u009a\u009b\5\f\7\2\u009b\u009c\7\"\2\2\u009c"+
		"\u009d\5*\26\2\u009d\u009e\7\36\2\2\u009e\u009f\5\30\r\2\u009f\u00a6\3"+
		"\2\2\2\u00a0\u00a6\5\32\16\2\u00a1\u00a6\5 \21\2\u00a2\u00a6\5\"\22\2"+
		"\u00a3\u00a6\5&\24\2\u00a4\u00a6\5(\25\2\u00a5\u0099\3\2\2\2\u00a5\u009a"+
		"\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\27\2"+
		"\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\7\36\2\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\5\36\20\2\u00ae\35\3\2\2\2"+
		"\u00af\u00b3\3\2\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b3\5\34\17\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\21\2"+
		"\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5*\26\2\u00b7\u00b8\7\30\2\2\u00b8"+
		"\u00b9\7\36\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\7\27\2"+
		"\2\u00bc\u00bd\5*\26\2\u00bd\u00be\7\30\2\2\u00be\u00bf\7\33\2\2\u00bf"+
		"\u00c0\5\30\r\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\5$\23\2\u00c2#\3\2\2"+
		"\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\7\33\2\2\u00c6"+
		"\u00c7\5\30\r\2\u00c7\u00c8\7\34\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3"+
		"\2\2\2\u00c9\u00c4\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd"+
		"\5*\26\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\7\34\2"+
		"\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\33\2\2\u00d2\'\3\2\2\2\u00d3\u00d4"+
		"\7\17\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7\34\2"+
		"\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\5*\26\2\u00da"+
		"\u00db\7\30\2\2\u00db\u00dc\7\36\2\2\u00dc)\3\2\2\2\u00dd\u00de\5.\30"+
		"\2\u00de\u00df\5,\27\2\u00df+\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2"+
		"\7*\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"-\3\2\2\2\u00e5\u00e6\5\62\32\2\u00e6\u00e7\5\60\31\2\u00e7/\3\2\2\2\u00e8"+
		"\u00ec\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea\u00ec\5.\30\2\u00eb\u00e8\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\61\3\2\2\2\u00ed\u00ee\5\66\34\2\u00ee"+
		"\u00ef\5\64\33\2\u00ef\63\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f2\7(\2"+
		"\2\u00f2\u00f4\5\62\32\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\65\3\2\2\2\u00f5\u00f6\5:\36\2\u00f6\u00f7\58\35\2\u00f7\67\3\2\2\2\u00f8"+
		"\u0106\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u0106\5\66\34\2\u00fb\u00fc\7"+
		"$\2\2\u00fc\u0106\5\66\34\2\u00fd\u00fe\7%\2\2\u00fe\u0106\5\66\34\2\u00ff"+
		"\u0100\7&\2\2\u0100\u0106\5\66\34\2\u0101\u0102\7\'\2\2\u0102\u0106\5"+
		"\66\34\2\u0103\u0104\7)\2\2\u0104\u0106\5\66\34\2\u0105\u00f8\3\2\2\2"+
		"\u0105\u00f9\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00ff"+
		"\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u01069\3\2\2\2\u0107"+
		"\u0108\5> \2\u0108\u0109\5<\37\2\u0109;\3\2\2\2\u010a\u010e\3\2\2\2\u010b"+
		"\u010c\7!\2\2\u010c\u010e\5:\36\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e=\3\2\2\2\u010f\u0110\5B\"\2\u0110\u0111\5@!\2\u0111?\3\2\2"+
		"\2\u0112\u0118\3\2\2\2\u0113\u0114\7\23\2\2\u0114\u0118\5> \2\u0115\u0116"+
		"\7\24\2\2\u0116\u0118\5> \2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118A\3\2\2\2\u0119\u011a\5F$\2\u011a\u011b\5D#\2\u011b"+
		"C\3\2\2\2\u011c\u0122\3\2\2\2\u011d\u011e\7\25\2\2\u011e\u0122\5B\"\2"+
		"\u011f\u0120\7\26\2\2\u0120\u0122\5B\"\2\u0121\u011c\3\2\2\2\u0121\u011d"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122E\3\2\2\2\u0123\u012e\3\2\2\2\u0124"+
		"\u0125\7\27\2\2\u0125\u0126\5*\26\2\u0126\u0127\7\30\2\2\u0127\u012e\3"+
		"\2\2\2\u0128\u012e\5H%\2\u0129\u012e\7/\2\2\u012a\u012e\7,\2\2\u012b\u012e"+
		"\7-\2\2\u012c\u012e\7.\2\2\u012d\u0123\3\2\2\2\u012d\u0124\3\2\2\2\u012d"+
		"\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012c\3\2\2\2\u012eG\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0131"+
		"\7\27\2\2\u0131\u0132\5*\26\2\u0132\u0133\5J&\2\u0133\u0134\7\30\2\2\u0134"+
		"I\3\2\2\2\u0135\u013b\3\2\2\2\u0136\u0137\7\37\2\2\u0137\u0138\5*\26\2"+
		"\u0138\u0139\5J&\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136"+
		"\3\2\2\2\u013bK\3\2\2\2\24`ht\u0089\u008d\u0097\u00a5\u00b2\u00c9\u00e3"+
		"\u00eb\u00f3\u0105\u010d\u0117\u0121\u012d\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}