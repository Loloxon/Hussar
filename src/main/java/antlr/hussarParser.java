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
		T__0=1, WHITESPACE=2, PASS=3, PLUS=4, MINUS=5, INCREMENT=6, DECREMENT=7, 
		MULTIPLICATION=8, DIVIDE=9, POWER=10, EQ=11, LESSER=12, LESSEREQ=13, GREATER=14, 
		GREATEREQ=15, L_BRACKET=16, R_BRACKET=17, L_BUCKLE=18, R_BUCKLE=19, IF_SYM=20, 
		FOR_SYM=21, WHILE_SYM=22, PRINT_SYM=23, ID_NAME=24, ID_NUMBER=25, ID_CHAR=26, 
		ID_STRING=27, DOT_SYM=28, COMA_SYM=29, COLON_SYM=30, SEMICOLON_SYM=31, 
		APOSTROPHE_SYM=32, L_ARROW_SYM=33, R_ARROW_SYM=34, CHAR=35, STRING=36, 
		INT=37;
	public static final int
		RULE_program_sym = 0, RULE_start_block = 1, RULE_end_block = 2, RULE_hussar_expr = 3, 
		RULE_var_decl = 4, RULE_int_decl = 5, RULE_char_decl = 6, RULE_string_decl = 7, 
		RULE_math_symbol = 8, RULE_math_expr = 9, RULE_loop_expr = 10, RULE_then_sym = 11, 
		RULE_compare_sym = 12, RULE_condition = 13, RULE_for_range = 14, RULE_print = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program_sym", "start_block", "end_block", "hussar_expr", "var_decl", 
			"int_decl", "char_decl", "string_decl", "math_symbol", "math_expr", "loop_expr", 
			"then_sym", "compare_sym", "condition", "for_range", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'zacznij'", null, "'nic'", "'+'", "'-'", "'++'", "'--'", "'*'", 
			"'/'", "'^'", "'='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'", null, "'dla'", "'dopoki'", "'pokaz'", null, "'liczba '", null, 
			null, "'.'", "','", "':'", "';'", "'''", "'<-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WHITESPACE", "PASS", "PLUS", "MINUS", "INCREMENT", "DECREMENT", 
			"MULTIPLICATION", "DIVIDE", "POWER", "EQ", "LESSER", "LESSEREQ", "GREATER", 
			"GREATEREQ", "L_BRACKET", "R_BRACKET", "L_BUCKLE", "R_BUCKLE", "IF_SYM", 
			"FOR_SYM", "WHILE_SYM", "PRINT_SYM", "ID_NAME", "ID_NUMBER", "ID_CHAR", 
			"ID_STRING", "DOT_SYM", "COMA_SYM", "COLON_SYM", "SEMICOLON_SYM", "APOSTROPHE_SYM", 
			"L_ARROW_SYM", "R_ARROW_SYM", "CHAR", "STRING", "INT"
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
			setState(32);
			start_block();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 137689628682L) != 0) {
				{
				{
				setState(33);
				hussar_expr();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			end_block();
			setState(40);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				setState(43);
				then_sym();
				}
				break;
			case IF_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IF_SYM);
				setState(45);
				condition();
				setState(46);
				then_sym();
				}
				break;
			case FOR_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(FOR_SYM);
				setState(49);
				for_range();
				setState(50);
				then_sym();
				}
				break;
			case WHILE_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(WHILE_SYM);
				setState(53);
				condition();
				setState(54);
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
			setState(58);
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
		public Loop_exprContext loop_expr() {
			return getRuleContext(Loop_exprContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_NUMBER:
			case ID_CHAR:
			case ID_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				var_decl();
				}
				break;
			case T__0:
			case IF_SYM:
			case FOR_SYM:
			case WHILE_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				loop_expr();
				}
				break;
			case L_BRACKET:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				math_expr(0);
				}
				break;
			case PRINT_SYM:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				print();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				int_decl();
				}
				break;
			case ID_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				char_decl();
				}
				break;
			case ID_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
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
			setState(72);
			match(ID_NUMBER);
			setState(73);
			match(ID_NAME);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(74);
				match(EQ);
				setState(75);
				math_expr(0);
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
			setState(78);
			match(ID_CHAR);
			setState(79);
			match(ID_NAME);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(80);
				match(EQ);
				setState(81);
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
			setState(84);
			match(ID_STRING);
			setState(85);
			match(ID_NAME);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(86);
				match(EQ);
				setState(87);
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
	public static class Math_symbolContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(hussarParser.MULTIPLICATION, 0); }
		public TerminalNode POWER() { return getToken(hussarParser.POWER, 0); }
		public TerminalNode PLUS() { return getToken(hussarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(hussarParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(hussarParser.DIVIDE, 0); }
		public Math_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).enterMath_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hussarListener ) ((hussarListener)listener).exitMath_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hussarVisitor ) return ((hussarVisitor<? extends T>)visitor).visitMath_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbolContext math_symbol() throws RecognitionException {
		Math_symbolContext _localctx = new Math_symbolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_math_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1840L) != 0) ) {
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
	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(hussarParser.L_BRACKET, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(hussarParser.R_BRACKET, 0); }
		public TerminalNode INT() { return getToken(hussarParser.INT, 0); }
		public Math_symbolContext math_symbol() {
			return getRuleContext(Math_symbolContext.class,0);
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
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACKET:
				{
				setState(93);
				match(L_BRACKET);
				setState(94);
				math_expr(0);
				setState(95);
				match(R_BRACKET);
				}
				break;
			case INT:
				{
				setState(97);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
					setState(100);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(101);
					math_symbol();
					setState(102);
					math_expr(3);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 20, RULE_loop_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			start_block();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 137689628682L) != 0) {
				{
				{
				setState(110);
				hussar_expr();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		enterRule(_localctx, 22, RULE_then_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
	public static class Compare_symContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(hussarParser.EQ, 0); }
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
		enterRule(_localctx, 24, RULE_compare_sym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0) ) {
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
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			math_expr(0);
			setState(123);
			compare_sym();
			setState(124);
			math_expr(0);
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
		enterRule(_localctx, 28, RULE_for_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(INT);
			setState(127);
			match(R_ARROW_SYM);
			setState(128);
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
		public TerminalNode STRING() { return getToken(hussarParser.STRING, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(hussarParser.CHAR, 0); }
		public TerminalNode ID_NAME() { return getToken(hussarParser.ID_NAME, 0); }
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
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(PRINT_SYM);
			setState(131);
			match(L_BRACKET);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(132);
				match(STRING);
				}
				break;
			case L_BRACKET:
			case INT:
				{
				setState(133);
				math_expr(0);
				}
				break;
			case CHAR:
				{
				setState(134);
				match(CHAR);
				}
				break;
			case ID_NAME:
				{
				setState(135);
				match(ID_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007Y\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tc\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\ti\b\t\n\t\f\tl\t\t\u0001\n\u0001\n\u0005\np\b\n\n\n\f\ns\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0089\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0001\u0012"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0002\u0002\u0000\u0004\u0005\b\n\u0001\u0000"+
		"\u000b\u000f\u008f\u0000 \u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000"+
		"\u0000\u0004:\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000"+
		"\u0000\u000eT\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012"+
		"b\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016v\u0001"+
		"\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001az\u0001\u0000\u0000"+
		"\u0000\u001c~\u0001\u0000\u0000\u0000\u001e\u0082\u0001\u0000\u0000\u0000"+
		" $\u0003\u0002\u0001\u0000!#\u0003\u0006\u0003\u0000\"!\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0003"+
		"\u0004\u0002\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0001\u0000\u0000+9\u0003\u0016\u000b\u0000,-\u0005\u0014"+
		"\u0000\u0000-.\u0003\u001a\r\u0000./\u0003\u0016\u000b\u0000/9\u0001\u0000"+
		"\u0000\u000001\u0005\u0015\u0000\u000012\u0003\u001c\u000e\u000023\u0003"+
		"\u0016\u000b\u000039\u0001\u0000\u0000\u000045\u0005\u0016\u0000\u0000"+
		"56\u0003\u001a\r\u000067\u0003\u0016\u000b\u000079\u0001\u0000\u0000\u0000"+
		"8*\u0001\u0000\u0000\u00008,\u0001\u0000\u0000\u000080\u0001\u0000\u0000"+
		"\u000084\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005"+
		"\u001c\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<B\u0003\b\u0004\u0000"+
		"=B\u0003\u0014\n\u0000>B\u0003\u0012\t\u0000?B\u0003\u001e\u000f\u0000"+
		"@B\u0005\u0003\u0000\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000"+
		"\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CG\u0003\n\u0005\u0000DG\u0003"+
		"\f\u0006\u0000EG\u0003\u000e\u0007\u0000FC\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0019\u0000\u0000IL\u0005\u0018\u0000\u0000JK\u0005\u000b\u0000"+
		"\u0000KM\u0003\u0012\t\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0005\u001a\u0000\u0000OR\u0005"+
		"\u0018\u0000\u0000PQ\u0005\u000b\u0000\u0000QS\u0005#\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000"+
		"TU\u0005\u001b\u0000\u0000UX\u0005\u0018\u0000\u0000VW\u0005\u000b\u0000"+
		"\u0000WY\u0005$\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000[\u0011"+
		"\u0001\u0000\u0000\u0000\\]\u0006\t\uffff\uffff\u0000]^\u0005\u0010\u0000"+
		"\u0000^_\u0003\u0012\t\u0000_`\u0005\u0011\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000ac\u0005%\u0000\u0000b\\\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cj\u0001\u0000\u0000\u0000de\n\u0002\u0000\u0000ef\u0003\u0010\b"+
		"\u0000fg\u0003\u0012\t\u0003gi\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mq\u0003\u0002\u0001\u0000np\u0003\u0006\u0003\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0003"+
		"\u0004\u0002\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\u001e\u0000"+
		"\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0007\u0001\u0000\u0000y\u0019"+
		"\u0001\u0000\u0000\u0000z{\u0003\u0012\t\u0000{|\u0003\u0018\f\u0000|"+
		"}\u0003\u0012\t\u0000}\u001b\u0001\u0000\u0000\u0000~\u007f\u0005%\u0000"+
		"\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080\u0081\u0005%\u0000\u0000"+
		"\u0081\u001d\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0017\u0000\u0000"+
		"\u0083\u0088\u0005\u0010\u0000\u0000\u0084\u0089\u0005$\u0000\u0000\u0085"+
		"\u0089\u0003\u0012\t\u0000\u0086\u0089\u0005#\u0000\u0000\u0087\u0089"+
		"\u0005\u0018\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000\u0088\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0011\u0000\u0000\u008b\u001f\u0001\u0000\u0000\u0000\u000b$8A"+
		"FLRXbjq\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}