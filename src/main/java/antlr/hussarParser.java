// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hussarParser extends Parser {
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
	public static final int
		RULE_program_sym = 0, RULE_start_block = 1, RULE_end_block = 2, RULE_hussar_expr = 3, 
		RULE_var_decl = 4, RULE_int_decl = 5, RULE_char_decl = 6, RULE_string_decl = 7, 
		RULE_var_redecl = 8, RULE_int_redecl = 9, RULE_char_redecl = 10, RULE_string_redecl = 11, 
		RULE_math_symbol_prio0 = 12, RULE_math_symbol_prio1 = 13, RULE_math_symbol_prio2 = 14, 
		RULE_start_bracket = 15, RULE_end_bracket = 16, RULE_start_bracket_fake_power = 17, 
		RULE_end_bracket_fake = 18, RULE_end_semicolon = 19, RULE_base = 20, RULE_factor = 21, 
		RULE_component = 22, RULE_math_expr = 23, RULE_supreme_math_expr = 24, 
		RULE_loop_expr = 25, RULE_then_sym = 26, RULE_is_equal = 27, RULE_compare_sym = 28, 
		RULE_condition = 29, RULE_for_range = 30, RULE_print = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program_sym", "start_block", "end_block", "hussar_expr", "var_decl", 
			"int_decl", "char_decl", "string_decl", "var_redecl", "int_redecl", "char_redecl", 
			"string_redecl", "math_symbol_prio0", "math_symbol_prio1", "math_symbol_prio2", 
			"start_bracket", "end_bracket", "start_bracket_fake_power", "end_bracket_fake", 
			"end_semicolon", "base", "factor", "component", "math_expr", "supreme_math_expr", 
			"loop_expr", "then_sym", "is_equal", "compare_sym", "condition", "for_range", 
			"print"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hussarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Program_symContext extends ParserRuleContext {
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(hussarParser.EOF, 0); }
		public List<Hussar_exprContext> hussar_expr() {
			return getRuleContexts(Hussar_exprContext.class);
		}
		public Hussar_exprContext hussar_expr(int i) {
			return getRuleContext(Hussar_exprContext.class,i);
		}
		public Program_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterProgram_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitProgram_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitProgram_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_symContext program_sym() throws RecognitionException {
		Program_symContext _localctx = new Program_symContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program_sym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			start_block();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1103798730764L) != 0) {
				{
				{
				setState(65);
				hussar_expr();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			end_block();
			setState(72);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(hussarParser.BEGIN, 0); }
		public Then_symContext then_sym() {
			return getRuleContext(Then_symContext.class,0);
		}
		public TerminalNode IF_SYM() { return getToken(hussarParser.IF_SYM, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode FOR_SYM() { return getToken(hussarParser.FOR_SYM, 0); }
		public For_rangeContext for_range() {
			return getRuleContext(For_rangeContext.class,0);
		}
		public TerminalNode WHILE_SYM() { return getToken(hussarParser.WHILE_SYM, 0); }
		public Start_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterStart_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitStart_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitStart_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_blockContext start_block() throws RecognitionException {
		Start_blockContext _localctx = new Start_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_block);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(BEGIN);
				setState(75);
				then_sym();
				}
				break;
			case IF_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(IF_SYM);
				setState(77);
				condition();
				setState(78);
				then_sym();
				}
				break;
			case FOR_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(FOR_SYM);
				setState(81);
				for_range();
				setState(82);
				then_sym();
				}
				break;
			case WHILE_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(WHILE_SYM);
				setState(85);
				condition();
				setState(86);
				then_sym();
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode DOT_SYM() { return getToken(hussarParser.DOT_SYM, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterEnd_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitEnd_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitEnd_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(DOT_SYM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Hussar_exprContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_redeclContext var_redecl() {
			return getRuleContext(Var_redeclContext.class,0);
		}
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public Supreme_math_exprContext supreme_math_expr() {
			return getRuleContext(Supreme_math_exprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode PASS() { return getToken(hussarParser.PASS, 0); }
		public Hussar_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hussar_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterHussar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitHussar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitHussar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hussar_exprContext hussar_expr() throws RecognitionException {
		Hussar_exprContext _localctx = new Hussar_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hussar_expr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_NUMBER:
			case ID_CHAR:
			case ID_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				var_decl();
				}
				break;
			case REDECLARATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				var_redecl();
				}
				break;
			case BEGIN:
			case IF_SYM:
			case FOR_SYM:
			case WHILE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				loop_expr();
				}
				break;
			case L_BRACKET:
			case ID_NAME:
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				supreme_math_expr();
				}
				break;
			case PRINT_SYM:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				print();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(PASS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Int_declContext int_decl() {
			return getRuleContext(Int_declContext.class,0);
		}
		public Char_declContext char_decl() {
			return getRuleContext(Char_declContext.class,0);
		}
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				int_decl();
				}
				break;
			case ID_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				char_decl();
				}
				break;
			case ID_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				string_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_declContext extends ParserRuleContext {
		public TerminalNode ID_NUMBER() { return getToken(hussarParser.ID_NUMBER, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
		public TerminalNode EQ() { return getToken(hussarParser.EQ, 0); }
		public Supreme_math_exprContext supreme_math_expr() {
			return getRuleContext(Supreme_math_exprContext.class,0);
		}
		public Int_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterInt_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitInt_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitInt_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declContext int_decl() throws RecognitionException {
		Int_declContext _localctx = new Int_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID_NUMBER);
			setState(106);
			match(ID_NAME);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(107);
				match(EQ);
				setState(108);
				supreme_math_expr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Char_declContext extends ParserRuleContext {
		public TerminalNode ID_CHAR() { return getToken(hussarParser.ID_CHAR, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
		public TerminalNode EQ() { return getToken(hussarParser.EQ, 0); }
		public TerminalNode CHAR() { return getToken(hussarParser.CHAR, 0); }
		public Char_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterChar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitChar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitChar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_declContext char_decl() throws RecognitionException {
		Char_declContext _localctx = new Char_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_char_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID_CHAR);
			setState(112);
			match(ID_NAME);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(113);
				match(EQ);
				setState(114);
				match(CHAR);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_declContext extends ParserRuleContext {
		public TerminalNode ID_STRING() { return getToken(hussarParser.ID_STRING, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
		public TerminalNode EQ() { return getToken(hussarParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(hussarParser.STRING, 0); }
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitString_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitString_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID_STRING);
			setState(118);
			match(ID_NAME);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(119);
				match(EQ);
				setState(120);
				match(STRING);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_redeclContext extends ParserRuleContext {
		public TerminalNode REDECLARATION() { return getToken(hussarParser.REDECLARATION, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
		public TerminalNode REDECLARATION_TO() { return getToken(hussarParser.REDECLARATION_TO, 0); }
		public Int_redeclContext int_redecl() {
			return getRuleContext(Int_redeclContext.class,0);
		}
		public Char_redeclContext char_redecl() {
			return getRuleContext(Char_redeclContext.class,0);
		}
		public String_redeclContext string_redecl() {
			return getRuleContext(String_redeclContext.class,0);
		}
		public Var_redeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_redecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterVar_redecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitVar_redecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitVar_redecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_redeclContext var_redecl() throws RecognitionException {
		Var_redeclContext _localctx = new Var_redeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_redecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(REDECLARATION);
			setState(124);
			match(ID_NAME);
			setState(125);
			match(REDECLARATION_TO);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACKET:
			case ID_NAME:
			case INT:
				{
				setState(126);
				int_redecl();
				}
				break;
			case CHAR:
				{
				setState(127);
				char_redecl();
				}
				break;
			case STRING:
				{
				setState(128);
				string_redecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_redeclContext extends ParserRuleContext {
		public Supreme_math_exprContext supreme_math_expr() {
			return getRuleContext(Supreme_math_exprContext.class,0);
		}
		public Int_redeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_redecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterInt_redecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitInt_redecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitInt_redecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_redeclContext int_redecl() throws RecognitionException {
		Int_redeclContext _localctx = new Int_redeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_int_redecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			supreme_math_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Char_redeclContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(hussarParser.CHAR, 0); }
		public Char_redeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_redecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterChar_redecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitChar_redecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitChar_redecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_redeclContext char_redecl() throws RecognitionException {
		Char_redeclContext _localctx = new Char_redeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_char_redecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CHAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_redeclContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(hussarParser.STRING, 0); }
		public String_redeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_redecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterString_redecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitString_redecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitString_redecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_redeclContext string_redecl() throws RecognitionException {
		String_redeclContext _localctx = new String_redeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string_redecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_symbol_prio0Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(hussarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(hussarParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(hussarParser.MOD, 0); }
		public Math_symbol_prio0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol_prio0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterMath_symbol_prio0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitMath_symbol_prio0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitMath_symbol_prio0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbol_prio0Context math_symbol_prio0() throws RecognitionException {
		Math_symbol_prio0Context _localctx = new Math_symbol_prio0Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_math_symbol_prio0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_symbol_prio1Context extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(hussarParser.MULTIPLICATION, 0); }
		public TerminalNode DIVIDE() { return getToken(hussarParser.DIVIDE, 0); }
		public Math_symbol_prio1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol_prio1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterMath_symbol_prio1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitMath_symbol_prio1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitMath_symbol_prio1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbol_prio1Context math_symbol_prio1() throws RecognitionException {
		Math_symbol_prio1Context _localctx = new Math_symbol_prio1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_math_symbol_prio1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICATION || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_symbol_prio2Context extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(hussarParser.POWER, 0); }
		public Math_symbol_prio2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol_prio2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterMath_symbol_prio2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitMath_symbol_prio2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitMath_symbol_prio2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbol_prio2Context math_symbol_prio2() throws RecognitionException {
		Math_symbol_prio2Context _localctx = new Math_symbol_prio2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_math_symbol_prio2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(POWER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_bracketContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(hussarParser.L_BRACKET, 0); }
		public Start_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterStart_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitStart_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitStart_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_bracketContext start_bracket() throws RecognitionException {
		Start_bracketContext _localctx = new Start_bracketContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(L_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_bracketContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(hussarParser.R_BRACKET, 0); }
		public End_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterEnd_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitEnd_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitEnd_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_bracketContext end_bracket() throws RecognitionException {
		End_bracketContext _localctx = new End_bracketContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_end_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Start_bracket_fake_powerContext extends ParserRuleContext {
		public Start_bracket_fake_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_bracket_fake_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterStart_bracket_fake_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitStart_bracket_fake_power(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitStart_bracket_fake_power(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_bracket_fake_powerContext start_bracket_fake_power() throws RecognitionException {
		Start_bracket_fake_powerContext _localctx = new Start_bracket_fake_powerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_start_bracket_fake_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_bracket_fakeContext extends ParserRuleContext {
		public End_bracket_fakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_bracket_fake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterEnd_bracket_fake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitEnd_bracket_fake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitEnd_bracket_fake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_bracket_fakeContext end_bracket_fake() throws RecognitionException {
		End_bracket_fakeContext _localctx = new End_bracket_fakeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_end_bracket_fake);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_semicolonContext extends ParserRuleContext {
		public End_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterEnd_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitEnd_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitEnd_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_semicolonContext end_semicolon() throws RecognitionException {
		End_semicolonContext _localctx = new End_semicolonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_end_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(hussarParser.INT, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
		public Start_bracketContext start_bracket() {
			return getRuleContext(Start_bracketContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public End_bracketContext end_bracket() {
			return getRuleContext(End_bracketContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_base);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(INT);
				}
				break;
			case ID_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(ID_NAME);
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				start_bracket();
				setState(156);
				math_expr();
				setState(157);
				end_bracket();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<BaseContext> base() {
			return getRuleContexts(BaseContext.class);
		}
		public BaseContext base(int i) {
			return getRuleContext(BaseContext.class,i);
		}
		public Start_bracket_fake_powerContext start_bracket_fake_power() {
			return getRuleContext(Start_bracket_fake_powerContext.class,0);
		}
		public Math_symbol_prio2Context math_symbol_prio2() {
			return getRuleContext(Math_symbol_prio2Context.class,0);
		}
		public End_bracket_fakeContext end_bracket_fake() {
			return getRuleContext(End_bracket_fakeContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				start_bracket_fake_power();
				setState(163);
				base();
				setState(164);
				math_symbol_prio2();
				setState(165);
				base();
				setState(166);
				end_bracket_fake();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Math_symbol_prio1Context> math_symbol_prio1() {
			return getRuleContexts(Math_symbol_prio1Context.class);
		}
		public Math_symbol_prio1Context math_symbol_prio1(int i) {
			return getRuleContext(Math_symbol_prio1Context.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			factor();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION || _la==DIVIDE) {
				{
				{
				setState(171);
				math_symbol_prio1();
				setState(172);
				factor();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_exprContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<Math_symbol_prio0Context> math_symbol_prio0() {
			return getRuleContexts(Math_symbol_prio0Context.class);
		}
		public Math_symbol_prio0Context math_symbol_prio0(int i) {
			return getRuleContext(Math_symbol_prio0Context.class,i);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		Math_exprContext _localctx = new Math_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_math_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			component();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) {
						{
						setState(180);
						math_symbol_prio0();
						}
					}

					setState(183);
					component();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Supreme_math_exprContext extends ParserRuleContext {
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public End_semicolonContext end_semicolon() {
			return getRuleContext(End_semicolonContext.class,0);
		}
		public Supreme_math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supreme_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterSupreme_math_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitSupreme_math_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitSupreme_math_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Supreme_math_exprContext supreme_math_expr() throws RecognitionException {
		Supreme_math_exprContext _localctx = new Supreme_math_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_supreme_math_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			math_expr();
			setState(190);
			end_semicolon();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_exprContext extends ParserRuleContext {
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public List<Hussar_exprContext> hussar_expr() {
			return getRuleContexts(Hussar_exprContext.class);
		}
		public Hussar_exprContext hussar_expr(int i) {
			return getRuleContext(Hussar_exprContext.class,i);
		}
		public Loop_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterLoop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitLoop_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitLoop_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_exprContext loop_expr() throws RecognitionException {
		Loop_exprContext _localctx = new Loop_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			start_block();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1103798730764L) != 0) {
				{
				{
				setState(193);
				hussar_expr();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			end_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Then_symContext extends ParserRuleContext {
		public TerminalNode COLON_SYM() { return getToken(hussarParser.COLON_SYM, 0); }
		public Then_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterThen_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitThen_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitThen_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_symContext then_sym() throws RecognitionException {
		Then_symContext _localctx = new Then_symContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_then_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(COLON_SYM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Is_equalContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(hussarParser.EQ, 0); }
		public Is_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterIs_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitIs_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitIs_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_equalContext is_equal() throws RecognitionException {
		Is_equalContext _localctx = new Is_equalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_is_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(EQ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compare_symContext extends ParserRuleContext {
		public Is_equalContext is_equal() {
			return getRuleContext(Is_equalContext.class,0);
		}
		public TerminalNode NOTEQ() { return getToken(hussarParser.NOTEQ, 0); }
		public TerminalNode LESSER() { return getToken(hussarParser.LESSER, 0); }
		public TerminalNode LESSEREQ() { return getToken(hussarParser.LESSEREQ, 0); }
		public TerminalNode GREATER() { return getToken(hussarParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(hussarParser.GREATEREQ, 0); }
		public Compare_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterCompare_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitCompare_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitCompare_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_symContext compare_sym() throws RecognitionException {
		Compare_symContext _localctx = new Compare_symContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compare_sym);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				is_equal();
				}
				break;
			case NOTEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(NOTEQ);
				}
				break;
			case LESSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(LESSER);
				}
				break;
			case LESSEREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(LESSEREQ);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(GREATER);
				}
				break;
			case GREATEREQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(GREATEREQ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public Compare_symContext compare_sym() {
			return getRuleContext(Compare_symContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			math_expr();
			setState(214);
			compare_sym();
			setState(215);
			math_expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_rangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(hussarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(hussarParser.INT, i);
		}
		public TerminalNode R_ARROW_SYM() { return getToken(hussarParser.R_ARROW_SYM, 0); }
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitFor_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitFor_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INT);
			setState(218);
			match(R_ARROW_SYM);
			setState(219);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_SYM() { return getToken(hussarParser.PRINT_SYM, 0); }
		public TerminalNode L_BRACKET() { return getToken(hussarParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(hussarParser.R_BRACKET, 0); }
		public End_bracket_fakeContext end_bracket_fake() {
			return getRuleContext(End_bracket_fakeContext.class,0);
		}
		public End_semicolonContext end_semicolon() {
			return getRuleContext(End_semicolonContext.class,0);
		}
		public TerminalNode STRING() { return getToken(hussarParser.STRING, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(hussarParser.CHAR, 0); }
		public TerminalNode NEWLINE() { return getToken(hussarParser.NEWLINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRINT_SYM);
			setState(222);
			match(L_BRACKET);
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(223);
				match(STRING);
				}
				break;
			case L_BRACKET:
			case ID_NAME:
			case INT:
				{
				setState(224);
				math_expr();
				}
				break;
			case CHAR:
				{
				setState(225);
				match(CHAR);
				}
				break;
			case NEWLINE:
				{
				setState(226);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(R_BRACKET);
			setState(230);
			end_bracket_fake();
			setState(231);
			end_semicolon();
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
		"\u0004\u0001*\u00ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000C\b\u0000"+
		"\n\u0000\f\u0000F\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0082\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00a0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00a9\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00af\b\u0016\n\u0016"+
		"\f\u0016\u00b2\t\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00b6\b\u0017"+
		"\u0001\u0017\u0005\u0017\u00b9\b\u0017\n\u0017\f\u0017\u00bc\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00c3"+
		"\b\u0019\n\u0019\f\u0019\u00c6\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00d4\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u00e4\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000"+
		"\u0002\u0001\u0000\u0005\u0007\u0001\u0000\n\u000b\u00e8\u0000@\u0001"+
		"\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000"+
		"\u0000\u0006b\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001"+
		"\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000"+
		"\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000"+
		"\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000"+
		"\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000\u0000\u0000"+
		"\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000\u0000"+
		" \u0091\u0001\u0000\u0000\u0000\"\u0093\u0001\u0000\u0000\u0000$\u0095"+
		"\u0001\u0000\u0000\u0000&\u0097\u0001\u0000\u0000\u0000(\u009f\u0001\u0000"+
		"\u0000\u0000*\u00a8\u0001\u0000\u0000\u0000,\u00aa\u0001\u0000\u0000\u0000"+
		".\u00b3\u0001\u0000\u0000\u00000\u00bd\u0001\u0000\u0000\u00002\u00c0"+
		"\u0001\u0000\u0000\u00004\u00c9\u0001\u0000\u0000\u00006\u00cb\u0001\u0000"+
		"\u0000\u00008\u00d3\u0001\u0000\u0000\u0000:\u00d5\u0001\u0000\u0000\u0000"+
		"<\u00d9\u0001\u0000\u0000\u0000>\u00dd\u0001\u0000\u0000\u0000@D\u0003"+
		"\u0002\u0001\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003\u0004"+
		"\u0002\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0003\u0000\u0000KY\u00034\u001a\u0000LM\u0005\u0017\u0000\u0000"+
		"MN\u0003:\u001d\u0000NO\u00034\u001a\u0000OY\u0001\u0000\u0000\u0000P"+
		"Q\u0005\u0018\u0000\u0000QR\u0003<\u001e\u0000RS\u00034\u001a\u0000SY"+
		"\u0001\u0000\u0000\u0000TU\u0005\u0019\u0000\u0000UV\u0003:\u001d\u0000"+
		"VW\u00034\u001a\u0000WY\u0001\u0000\u0000\u0000XJ\u0001\u0000\u0000\u0000"+
		"XL\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000"+
		"\u0000Y\u0003\u0001\u0000\u0000\u0000Z[\u0005!\u0000\u0000[\u0005\u0001"+
		"\u0000\u0000\u0000\\c\u0003\b\u0004\u0000]c\u0003\u0010\b\u0000^c\u0003"+
		"2\u0019\u0000_c\u00030\u0018\u0000`c\u0003>\u001f\u0000ac\u0005\u0002"+
		"\u0000\u0000b\\\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001"+
		"\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000c\u0007\u0001\u0000\u0000\u0000dh\u0003\n\u0005"+
		"\u0000eh\u0003\f\u0006\u0000fh\u0003\u000e\u0007\u0000gd\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\t\u0001\u0000"+
		"\u0000\u0000ij\u0005\u001c\u0000\u0000jm\u0005\u001b\u0000\u0000kl\u0005"+
		"\r\u0000\u0000ln\u00030\u0018\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000op\u0005\u001d\u0000"+
		"\u0000ps\u0005\u001b\u0000\u0000qr\u0005\r\u0000\u0000rt\u0005)\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\r\u0001\u0000"+
		"\u0000\u0000uv\u0005\u001e\u0000\u0000vy\u0005\u001b\u0000\u0000wx\u0005"+
		"\r\u0000\u0000xz\u0005*\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\u001f\u0000"+
		"\u0000|}\u0005\u001b\u0000\u0000}\u0081\u0005 \u0000\u0000~\u0082\u0003"+
		"\u0012\t\u0000\u007f\u0082\u0003\u0014\n\u0000\u0080\u0082\u0003\u0016"+
		"\u000b\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0011\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u00030\u0018\u0000\u0084\u0013\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005)\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005*\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0007\u0000\u0000\u0000\u008a\u0019\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0007\u0001\u0000\u0000\u008c\u001b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\f\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u0013\u0000\u0000\u0090\u001f\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u0014\u0000\u0000\u0092!\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094#\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096%\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\'\u0001\u0000\u0000\u0000\u0099\u00a0\u0005(\u0000\u0000\u009a"+
		"\u00a0\u0005\u001b\u0000\u0000\u009b\u009c\u0003\u001e\u000f\u0000\u009c"+
		"\u009d\u0003.\u0017\u0000\u009d\u009e\u0003 \u0010\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001"+
		"\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u00a0)\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a9\u0003(\u0014\u0000\u00a2\u00a3\u0003\"\u0011"+
		"\u0000\u00a3\u00a4\u0003(\u0014\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000"+
		"\u00a5\u00a6\u0003(\u0014\u0000\u00a6\u00a7\u0003$\u0012\u0000\u00a7\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a9+\u0001\u0000\u0000\u0000\u00aa\u00b0\u0003"+
		"*\u0015\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0003*\u0015"+
		"\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000"+
		"\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1-\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ba\u0003,\u0016\u0000\u00b4"+
		"\u00b6\u0003\u0018\f\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0003,\u0016\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb/\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0003.\u0017\u0000\u00be\u00bf\u0003&\u0013\u0000"+
		"\u00bf1\u0001\u0000\u0000\u0000\u00c0\u00c4\u0003\u0002\u0001\u0000\u00c1"+
		"\u00c3\u0003\u0006\u0003\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0004\u0002\u0000\u00c8"+
		"3\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca5\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\r\u0000\u0000\u00cc7\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d4\u00036\u001b\u0000\u00ce\u00d4\u0005\u000e\u0000"+
		"\u0000\u00cf\u00d4\u0005\u000f\u0000\u0000\u00d0\u00d4\u0005\u0010\u0000"+
		"\u0000\u00d1\u00d4\u0005\u0011\u0000\u0000\u00d2\u00d4\u0005\u0012\u0000"+
		"\u0000\u00d3\u00cd\u0001\u0000\u0000\u0000\u00d3\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d49\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003.\u0017\u0000\u00d6"+
		"\u00d7\u00038\u001c\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8;\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da\u00db\u0005\'"+
		"\u0000\u0000\u00db\u00dc\u0005(\u0000\u0000\u00dc=\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\u001a\u0000\u0000\u00de\u00e3\u0005\u0013\u0000\u0000"+
		"\u00df\u00e4\u0005*\u0000\u0000\u00e0\u00e4\u0003.\u0017\u0000\u00e1\u00e4"+
		"\u0005)\u0000\u0000\u00e2\u00e4\u0005\u0004\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\u0014\u0000\u0000\u00e6\u00e7\u0003"+
		"$\u0012\u0000\u00e7\u00e8\u0003&\u0013\u0000\u00e8?\u0001\u0000\u0000"+
		"\u0000\u0010DXbgmsy\u0081\u009f\u00a8\u00b0\u00b5\u00ba\u00c4\u00d3\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}