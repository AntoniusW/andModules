// Generated from /home/as/src/ASP-Core2-Parser/ASP_Core2.g4 by ANTLR 4.5.1
package org.tuwien;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASP_Core2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANONYMOUS_VARIABLE=1, DOT=2, COMMA=3, QUERY_MARK=4, COLON=5, SEMICOLON=6, 
		OR=7, NAF=8, CONS=9, WCONS=10, PLUS=11, MINUS=12, TIMES=13, DIV=14, AT=15, 
		SHARP=16, PAREN_OPEN=17, PAREN_CLOSE=18, SQUARE_OPEN=19, SQUARE_CLOSE=20, 
		CURLY_OPEN=21, CURLY_CLOSE=22, EQUAL=23, UNEQUAL=24, LESS=25, GREATER=26, 
		LESS_OR_EQ=27, GREATER_OR_EQ=28, AGGREGATE_COUNT=29, AGGREGATE_MAX=30, 
		AGGREGATE_MIN=31, AGGREGATE_SUM=32, ID=33, VARIABLE=34, NUMBER=35, STRING=36, 
		COMMENT=37, MULTI_LINE_COMMEN=38, BLANK=39;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_query = 2, RULE_statement = 3, 
		RULE_head = 4, RULE_body = 5, RULE_disjunction = 6, RULE_choice = 7, RULE_choice_elements = 8, 
		RULE_choice_element = 9, RULE_aggregate = 10, RULE_aggregate_elements = 11, 
		RULE_aggregate_element = 12, RULE_aggregate_function = 13, RULE_weight_at_level = 14, 
		RULE_naf_literals = 15, RULE_naf_literal = 16, RULE_classical_literal = 17, 
		RULE_builtin_atom = 18, RULE_binop = 19, RULE_terms = 20, RULE_term = 21, 
		RULE_gringo_range = 22, RULE_gringo_sharp = 23, RULE_basic_terms = 24, 
		RULE_basic_term = 25, RULE_ground_term = 26, RULE_variable_term = 27, 
		RULE_arithop = 28;
	public static final String[] ruleNames = {
		"program", "statements", "query", "statement", "head", "body", "disjunction", 
		"choice", "choice_elements", "choice_element", "aggregate", "aggregate_elements", 
		"aggregate_element", "aggregate_function", "weight_at_level", "naf_literals", 
		"naf_literal", "classical_literal", "builtin_atom", "binop", "terms", 
		"term", "gringo_range", "gringo_sharp", "basic_terms", "basic_term", "ground_term", 
		"variable_term", "arithop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'.'", "','", "'?'", "':'", "';'", "'|'", "'not'", "':-'", 
		"':~'", "'+'", "'-'", "'*'", "'/'", "'@'", "'#'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'='", null, "'<'", "'>'", "'<='", "'>='", "'#count'", 
		"'#max'", "'#min'", "'#sum'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANONYMOUS_VARIABLE", "DOT", "COMMA", "QUERY_MARK", "COLON", "SEMICOLON", 
		"OR", "NAF", "CONS", "WCONS", "PLUS", "MINUS", "TIMES", "DIV", "AT", "SHARP", 
		"PAREN_OPEN", "PAREN_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "CURLY_OPEN", 
		"CURLY_CLOSE", "EQUAL", "UNEQUAL", "LESS", "GREATER", "LESS_OR_EQ", "GREATER_OR_EQ", 
		"AGGREGATE_COUNT", "AGGREGATE_MAX", "AGGREGATE_MIN", "AGGREGATE_SUM", 
		"ID", "VARIABLE", "NUMBER", "STRING", "COMMENT", "MULTI_LINE_COMMEN", 
		"BLANK"
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
	public String getGrammarFileName() { return "ASP_Core2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASP_Core2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(58);
				statements();
				}
				break;
			}
			setState(62);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(61);
				query();
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			statement();
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				statements();
				}
				break;
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

	public static class QueryContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode QUERY_MARK() { return getToken(ASP_Core2Parser.QUERY_MARK, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			classical_literal();
			setState(69);
			match(QUERY_MARK);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode CONS() { return getToken(ASP_Core2Parser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASP_Core2Parser.DOT, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode WCONS() { return getToken(ASP_Core2Parser.WCONS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASP_Core2Parser.SQUARE_OPEN, 0); }
		public Weight_at_levelContext weight_at_level() {
			return getRuleContext(Weight_at_levelContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ASP_Core2Parser.SQUARE_CLOSE, 0); }
		public Gringo_sharpContext gringo_sharp() {
			return getRuleContext(Gringo_sharpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(94);
			switch (_input.LA(1)) {
			case CONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(CONS);
				setState(72);
				body();
				setState(73);
				match(DOT);
				}
				break;
			case ANONYMOUS_VARIABLE:
			case MINUS:
			case PAREN_OPEN:
			case CURLY_OPEN:
			case ID:
			case VARIABLE:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				head();
				setState(80);
				_la = _input.LA(1);
				if (_la==CONS) {
					{
					setState(76);
					match(CONS);
					setState(78);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
						{
						setState(77);
						body();
						}
					}

					}
				}

				setState(82);
				match(DOT);
				}
				break;
			case WCONS:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(WCONS);
				setState(86);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(85);
					body();
					}
				}

				setState(88);
				match(DOT);
				setState(89);
				match(SQUARE_OPEN);
				setState(90);
				weight_at_level();
				setState(91);
				match(SQUARE_CLOSE);
				}
				break;
			case SHARP:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				gringo_sharp();
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

	public static class HeadContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				disjunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				choice();
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

	public static class BodyContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASP_Core2Parser.COMMA, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASP_Core2Parser.NAF, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				naf_literal();
				}
				break;
			case 2:
				{
				setState(102);
				_la = _input.LA(1);
				if (_la==NAF) {
					{
					setState(101);
					match(NAF);
					}
				}

				setState(104);
				aggregate();
				}
				break;
			}
			setState(109);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(107);
				match(COMMA);
				setState(108);
				body();
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

	public static class DisjunctionContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode OR() { return getToken(ASP_Core2Parser.OR, 0); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			classical_literal();
			setState(114);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(112);
				match(OR);
				setState(113);
				disjunction();
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

	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2Parser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2Parser.CURLY_CLOSE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitChoice(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(116);
				term(0);
				setState(117);
				binop();
				}
			}

			setState(121);
			match(CURLY_OPEN);
			setState(123);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(122);
				choice_elements();
				}
			}

			setState(125);
			match(CURLY_CLOSE);
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(126);
				binop();
				setState(127);
				term(0);
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

	public static class Choice_elementsContext extends ParserRuleContext {
		public Choice_elementContext choice_element() {
			return getRuleContext(Choice_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASP_Core2Parser.SEMICOLON, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public Choice_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterChoice_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitChoice_elements(this);
		}
	}

	public final Choice_elementsContext choice_elements() throws RecognitionException {
		Choice_elementsContext _localctx = new Choice_elementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choice_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			choice_element();
			setState(134);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(132);
				match(SEMICOLON);
				setState(133);
				choice_elements();
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

	public static class Choice_elementContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASP_Core2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Choice_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterChoice_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitChoice_element(this);
		}
	}

	public final Choice_elementContext choice_element() throws RecognitionException {
		Choice_elementContext _localctx = new Choice_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choice_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			classical_literal();
			setState(141);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(137);
				match(COLON);
				setState(139);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(138);
					naf_literals();
					}
				}

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

	public static class AggregateContext extends ParserRuleContext {
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2Parser.CURLY_OPEN, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2Parser.CURLY_CLOSE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(143);
				term(0);
				setState(144);
				binop();
				}
			}

			setState(148);
			aggregate_function();
			setState(149);
			match(CURLY_OPEN);
			setState(150);
			aggregate_elements();
			setState(151);
			match(CURLY_CLOSE);
			setState(155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(152);
				binop();
				setState(153);
				term(0);
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

	public static class Aggregate_elementsContext extends ParserRuleContext {
		public Aggregate_elementContext aggregate_element() {
			return getRuleContext(Aggregate_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASP_Core2Parser.SEMICOLON, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public Aggregate_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterAggregate_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitAggregate_elements(this);
		}
	}

	public final Aggregate_elementsContext aggregate_elements() throws RecognitionException {
		Aggregate_elementsContext _localctx = new Aggregate_elementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregate_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			aggregate_element();
			setState(160);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(158);
				match(SEMICOLON);
				setState(159);
				aggregate_elements();
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

	public static class Aggregate_elementContext extends ParserRuleContext {
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASP_Core2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Aggregate_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterAggregate_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitAggregate_element(this);
		}
	}

	public final Aggregate_elementContext aggregate_element() throws RecognitionException {
		Aggregate_elementContext _localctx = new Aggregate_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregate_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(162);
				basic_terms();
				}
			}

			setState(169);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(165);
				match(COLON);
				setState(167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(166);
					naf_literals();
					}
				}

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

	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode AGGREGATE_COUNT() { return getToken(ASP_Core2Parser.AGGREGATE_COUNT, 0); }
		public TerminalNode AGGREGATE_MAX() { return getToken(ASP_Core2Parser.AGGREGATE_MAX, 0); }
		public TerminalNode AGGREGATE_MIN() { return getToken(ASP_Core2Parser.AGGREGATE_MIN, 0); }
		public TerminalNode AGGREGATE_SUM() { return getToken(ASP_Core2Parser.AGGREGATE_SUM, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitAggregate_function(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM))) != 0)) ) {
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

	public static class Weight_at_levelContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode AT() { return getToken(ASP_Core2Parser.AT, 0); }
		public TerminalNode COMMA() { return getToken(ASP_Core2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Weight_at_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight_at_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterWeight_at_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitWeight_at_level(this);
		}
	}

	public final Weight_at_levelContext weight_at_level() throws RecognitionException {
		Weight_at_levelContext _localctx = new Weight_at_levelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_weight_at_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			term(0);
			setState(176);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(174);
				match(AT);
				setState(175);
				term(0);
				}
			}

			setState(180);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(178);
				match(COMMA);
				setState(179);
				terms();
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

	public static class Naf_literalsContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASP_Core2Parser.COMMA, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Naf_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterNaf_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitNaf_literals(this);
		}
	}

	public final Naf_literalsContext naf_literals() throws RecognitionException {
		Naf_literalsContext _localctx = new Naf_literalsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_naf_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			naf_literal();
			setState(185);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(183);
				match(COMMA);
				setState(184);
				naf_literals();
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

	public static class Naf_literalContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public Builtin_atomContext builtin_atom() {
			return getRuleContext(Builtin_atomContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASP_Core2Parser.NAF, 0); }
		public Naf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterNaf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitNaf_literal(this);
		}
	}

	public final Naf_literalContext naf_literal() throws RecognitionException {
		Naf_literalContext _localctx = new Naf_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_naf_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(187);
				match(NAF);
				}
			}

			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(190);
				classical_literal();
				}
				break;
			case 2:
				{
				setState(191);
				builtin_atom();
				}
				break;
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

	public static class Classical_literalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASP_Core2Parser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ASP_Core2Parser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2Parser.PAREN_CLOSE, 0); }
		public Classical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterClassical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitClassical_literal(this);
		}
	}

	public final Classical_literalContext classical_literal() throws RecognitionException {
		Classical_literalContext _localctx = new Classical_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(194);
				match(MINUS);
				}
			}

			setState(197);
			match(ID);
			setState(202);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(198);
				match(PAREN_OPEN);
				setState(199);
				terms();
				setState(200);
				match(PAREN_CLOSE);
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

	public static class Builtin_atomContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Builtin_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterBuiltin_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitBuiltin_atom(this);
		}
	}

	public final Builtin_atomContext builtin_atom() throws RecognitionException {
		Builtin_atomContext _localctx = new Builtin_atomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_builtin_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			term(0);
			setState(205);
			binop();
			setState(206);
			term(0);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ASP_Core2Parser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(ASP_Core2Parser.UNEQUAL, 0); }
		public TerminalNode LESS() { return getToken(ASP_Core2Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ASP_Core2Parser.GREATER, 0); }
		public TerminalNode LESS_OR_EQ() { return getToken(ASP_Core2Parser.LESS_OR_EQ, 0); }
		public TerminalNode GREATER_OR_EQ() { return getToken(ASP_Core2Parser.GREATER_OR_EQ, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) ) {
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASP_Core2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			term(0);
			setState(213);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(211);
				match(COMMA);
				setState(212);
				terms();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ASP_Core2Parser.MINUS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ID() { return getToken(ASP_Core2Parser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2Parser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2Parser.PAREN_CLOSE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ASP_Core2Parser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ASP_Core2Parser.STRING, 0); }
		public TerminalNode VARIABLE() { return getToken(ASP_Core2Parser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASP_Core2Parser.ANONYMOUS_VARIABLE, 0); }
		public Gringo_rangeContext gringo_range() {
			return getRuleContext(Gringo_rangeContext.class,0);
		}
		public ArithopContext arithop() {
			return getRuleContext(ArithopContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(216);
				match(MINUS);
				setState(217);
				term(3);
				}
				break;
			case 2:
				{
				setState(218);
				match(ID);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(219);
					match(PAREN_OPEN);
					setState(221);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
						{
						setState(220);
						terms();
						}
					}

					setState(223);
					match(PAREN_CLOSE);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(226);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(227);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(228);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(229);
				match(ANONYMOUS_VARIABLE);
				}
				break;
			case 7:
				{
				setState(230);
				match(PAREN_OPEN);
				setState(231);
				term(0);
				setState(232);
				match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				setState(234);
				gringo_range();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					arithop();
					setState(239);
					term(3);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Gringo_rangeContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ASP_Core2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASP_Core2Parser.DOT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASP_Core2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASP_Core2Parser.NUMBER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ASP_Core2Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ASP_Core2Parser.VARIABLE, i);
		}
		public List<TerminalNode> ID() { return getTokens(ASP_Core2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ASP_Core2Parser.ID, i);
		}
		public Gringo_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gringo_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterGringo_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitGringo_range(this);
		}
	}

	public final Gringo_rangeContext gringo_range() throws RecognitionException {
		Gringo_rangeContext _localctx = new Gringo_rangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gringo_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(247);
			match(DOT);
			setState(248);
			match(DOT);
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) ) {
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

	public static class Gringo_sharpContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(ASP_Core2Parser.SHARP, 0); }
		public List<TerminalNode> DOT() { return getTokens(ASP_Core2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASP_Core2Parser.DOT, i);
		}
		public Gringo_sharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gringo_sharp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterGringo_sharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitGringo_sharp(this);
		}
	}

	public final Gringo_sharpContext gringo_sharp() throws RecognitionException {
		Gringo_sharpContext _localctx = new Gringo_sharpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gringo_sharp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SHARP);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << COMMA) | (1L << QUERY_MARK) | (1L << COLON) | (1L << SEMICOLON) | (1L << OR) | (1L << NAF) | (1L << CONS) | (1L << WCONS) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << AT) | (1L << SHARP) | (1L << PAREN_OPEN) | (1L << PAREN_CLOSE) | (1L << SQUARE_OPEN) | (1L << SQUARE_CLOSE) | (1L << CURLY_OPEN) | (1L << CURLY_CLOSE) | (1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT) | (1L << MULTI_LINE_COMMEN) | (1L << BLANK))) != 0)) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DOT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(DOT);
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

	public static class Basic_termsContext extends ParserRuleContext {
		public Basic_termContext basic_term() {
			return getRuleContext(Basic_termContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASP_Core2Parser.COMMA, 0); }
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public Basic_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterBasic_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitBasic_terms(this);
		}
	}

	public final Basic_termsContext basic_terms() throws RecognitionException {
		Basic_termsContext _localctx = new Basic_termsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_basic_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			basic_term();
			setState(263);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(261);
				match(COMMA);
				setState(262);
				basic_terms();
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

	public static class Basic_termContext extends ParserRuleContext {
		public Ground_termContext ground_term() {
			return getRuleContext(Ground_termContext.class,0);
		}
		public Variable_termContext variable_term() {
			return getRuleContext(Variable_termContext.class,0);
		}
		public Basic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterBasic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitBasic_term(this);
		}
	}

	public final Basic_termContext basic_term() throws RecognitionException {
		Basic_termContext _localctx = new Basic_termContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basic_term);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				ground_term();
				}
				break;
			case ANONYMOUS_VARIABLE:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				variable_term();
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

	public static class Ground_termContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASP_Core2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(ASP_Core2Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ASP_Core2Parser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ASP_Core2Parser.MINUS, 0); }
		public Ground_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterGround_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitGround_term(this);
		}
	}

	public final Ground_termContext ground_term() throws RecognitionException {
		Ground_termContext _localctx = new Ground_termContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ground_term);
		int _la;
		try {
			setState(275);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(271);
					match(MINUS);
					}
				}

				setState(274);
				match(NUMBER);
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

	public static class Variable_termContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ASP_Core2Parser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASP_Core2Parser.ANONYMOUS_VARIABLE, 0); }
		public Variable_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterVariable_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitVariable_term(this);
		}
	}

	public final Variable_termContext variable_term() throws RecognitionException {
		Variable_termContext _localctx = new Variable_termContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==ANONYMOUS_VARIABLE || _la==VARIABLE) ) {
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

	public static class ArithopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ASP_Core2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ASP_Core2Parser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(ASP_Core2Parser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ASP_Core2Parser.DIV, 0); }
		public ArithopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).enterArithop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2Listener ) ((ASP_Core2Listener)listener).exitArithop(this);
		}
	}

	public final ArithopContext arithop() throws RecognitionException {
		ArithopContext _localctx = new ArithopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\5"+
		"\2A\n\2\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q"+
		"\n\5\5\5S\n\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n"+
		"\5\3\6\3\6\5\6e\n\6\3\7\3\7\5\7i\n\7\3\7\5\7l\n\7\3\7\3\7\5\7p\n\7\3\b"+
		"\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0084\n\t\3\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\5\13\u008e\n"+
		"\13\5\13\u0090\n\13\3\f\3\f\3\f\5\f\u0095\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u009e\n\f\3\r\3\r\3\r\5\r\u00a3\n\r\3\16\5\16\u00a6\n\16\3\16"+
		"\3\16\5\16\u00aa\n\16\5\16\u00ac\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00b3"+
		"\n\20\3\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\21\5\21\u00bc\n\21\3\22\5"+
		"\22\u00bf\n\22\3\22\3\22\5\22\u00c3\n\22\3\23\5\23\u00c6\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00cd\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u00d8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e0\n\27\3"+
		"\27\5\27\u00e3\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00ee\n\27\3\27\3\27\3\27\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0100\n\31\f\31\16\31\u0103\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\5\32\u010a\n\32\3\33\3\33\5\33\u010e\n\33"+
		"\3\34\3\34\3\34\5\34\u0113\n\34\3\34\5\34\u0116\n\34\3\35\3\35\3\36\3"+
		"\36\3\36\2\3,\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\b\3\2\37\"\3\2\31\36\3\2#%\3\2\4\4\4\2\3\3$$\3\2\r\20\u0130"+
		"\2=\3\2\2\2\4B\3\2\2\2\6F\3\2\2\2\b`\3\2\2\2\nd\3\2\2\2\fk\3\2\2\2\16"+
		"q\3\2\2\2\20y\3\2\2\2\22\u0085\3\2\2\2\24\u008a\3\2\2\2\26\u0094\3\2\2"+
		"\2\30\u009f\3\2\2\2\32\u00a5\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2"+
		" \u00b8\3\2\2\2\"\u00be\3\2\2\2$\u00c5\3\2\2\2&\u00ce\3\2\2\2(\u00d2\3"+
		"\2\2\2*\u00d4\3\2\2\2,\u00ed\3\2\2\2.\u00f8\3\2\2\2\60\u00fd\3\2\2\2\62"+
		"\u0106\3\2\2\2\64\u010d\3\2\2\2\66\u0115\3\2\2\28\u0117\3\2\2\2:\u0119"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\6\4\2@?\3\2\2\2@"+
		"A\3\2\2\2A\3\3\2\2\2BD\5\b\5\2CE\5\4\3\2DC\3\2\2\2DE\3\2\2\2E\5\3\2\2"+
		"\2FG\5$\23\2GH\7\6\2\2H\7\3\2\2\2IJ\7\13\2\2JK\5\f\7\2KL\7\4\2\2La\3\2"+
		"\2\2MR\5\n\6\2NP\7\13\2\2OQ\5\f\7\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RN\3"+
		"\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\4\2\2Ua\3\2\2\2VX\7\f\2\2WY\5\f\7\2XW\3"+
		"\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\4\2\2[\\\7\25\2\2\\]\5\36\20\2]^\7\26\2"+
		"\2^a\3\2\2\2_a\5\60\31\2`I\3\2\2\2`M\3\2\2\2`V\3\2\2\2`_\3\2\2\2a\t\3"+
		"\2\2\2be\5\16\b\2ce\5\20\t\2db\3\2\2\2dc\3\2\2\2e\13\3\2\2\2fl\5\"\22"+
		"\2gi\7\n\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\5\26\f\2kf\3\2\2\2kh\3\2"+
		"\2\2lo\3\2\2\2mn\7\5\2\2np\5\f\7\2om\3\2\2\2op\3\2\2\2p\r\3\2\2\2qt\5"+
		"$\23\2rs\7\t\2\2su\5\16\b\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vw\5,\27\2"+
		"wx\5(\25\2xz\3\2\2\2yv\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7\27\2\2|~\5\22\n"+
		"\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0083\7\30\2\2\u0080\u0081\5("+
		"\25\2\u0081\u0082\5,\27\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0088\5\24\13\2\u0086\u0087\7\b"+
		"\2\2\u0087\u0089\5\22\n\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\23\3\2\2\2\u008a\u008f\5$\23\2\u008b\u008d\7\7\2\2\u008c\u008e\5 \21"+
		"\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008b"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u0092\5,\27\2\u0092"+
		"\u0093\5(\25\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\34\17\2\u0097\u0098\7\27\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009d\7\30\2\2\u009a\u009b\5(\25\2\u009b\u009c\5"+
		",\27\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\27\3\2\2\2\u009f\u00a2\5\32\16\2\u00a0\u00a1\7\b\2\2\u00a1\u00a3\5\30"+
		"\r\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a6"+
		"\5\62\32\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab\3\2\2\2"+
		"\u00a7\u00a9\7\7\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\33\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\35\3\2\2\2\u00af\u00b2\5,\27\2\u00b0"+
		"\u00b1\7\21\2\2\u00b1\u00b3\5,\27\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b7\5*\26\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00bb\5\"\22"+
		"\2\u00b9\u00ba\7\5\2\2\u00ba\u00bc\5 \21\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc!\3\2\2\2\u00bd\u00bf\7\n\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c3\5$\23\2\u00c1\u00c3\5&"+
		"\24\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c6"+
		"\7\16\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00cc\7#\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb"+
		"\7\24\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd%\3\2\2\2\u00ce\u00cf\5,\27\2\u00cf\u00d0\5(\25\2\u00d0\u00d1\5"+
		",\27\2\u00d1\'\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3)\3\2\2\2\u00d4\u00d7"+
		"\5,\27\2\u00d5\u00d6\7\5\2\2\u00d6\u00d8\5*\26\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8+\3\2\2\2\u00d9\u00da\b\27\1\2\u00da\u00db\7\16\2"+
		"\2\u00db\u00ee\5,\27\5\u00dc\u00e2\7#\2\2\u00dd\u00df\7\23\2\2\u00de\u00e0"+
		"\5*\26\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\7\24\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ee\3"+
		"\2\2\2\u00e4\u00ee\7%\2\2\u00e5\u00ee\7&\2\2\u00e6\u00ee\7$\2\2\u00e7"+
		"\u00ee\7\3\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\5,\27\2\u00ea\u00eb\7"+
		"\24\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\5.\30\2\u00ed\u00d9\3\2\2\2\u00ed"+
		"\u00dc\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e6\3\2"+
		"\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f5\3\2\2\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\5:\36\2\u00f1\u00f2\5,"+
		"\27\5\u00f2\u00f4\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00f9\t\4\2\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\7\4\2\2\u00fb\u00fc"+
		"\t\4\2\2\u00fc/\3\2\2\2\u00fd\u0101\7\22\2\2\u00fe\u0100\n\5\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\4\2\2\u0105"+
		"\61\3\2\2\2\u0106\u0109\5\64\33\2\u0107\u0108\7\5\2\2\u0108\u010a\5\62"+
		"\32\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\63\3\2\2\2\u010b\u010e"+
		"\5\66\34\2\u010c\u010e\58\35\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\65\3\2\2\2\u010f\u0116\7#\2\2\u0110\u0116\7&\2\2\u0111\u0113\7"+
		"\16\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\7%\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0112\3\2"+
		"\2\2\u0116\67\3\2\2\2\u0117\u0118\t\6\2\2\u01189\3\2\2\2\u0119\u011a\t"+
		"\7\2\2\u011a;\3\2\2\2+=@DPRX`dhkoty}\u0083\u0088\u008d\u008f\u0094\u009d"+
		"\u00a2\u00a5\u00a9\u00ab\u00b2\u00b6\u00bb\u00be\u00c2\u00c5\u00cc\u00d7"+
		"\u00df\u00e2\u00ed\u00f5\u0101\u0109\u010d\u0112\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}