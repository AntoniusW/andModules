// Generated from /home/as/src/ASP-Core2-Parser/ASP_Core2_Modules.g4 by ANTLR 4.5.1
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
public class ASP_Core2_ModulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANONYMOUS_VARIABLE=1, DOT=2, COMMA=3, QUESTION_MARK=4, COLON=5, SEMICOLON=6, 
		OR=7, NAF=8, CONS=9, WCONS=10, PLUS=11, MINUS=12, TIMES=13, DIV=14, AT=15, 
		SHARP=16, PAREN_OPEN=17, PAREN_CLOSE=18, SQUARE_OPEN=19, SQUARE_CLOSE=20, 
		CURLY_OPEN=21, CURLY_CLOSE=22, EQUAL=23, UNEQUAL=24, LESS=25, GREATER=26, 
		LESS_OR_EQ=27, GREATER_OR_EQ=28, AGGREGATE_COUNT=29, AGGREGATE_MAX=30, 
		AGGREGATE_MIN=31, AGGREGATE_SUM=32, ID=33, VARIABLE=34, NUMBER=35, STRING=36, 
		COMMENT=37, MULTI_LINE_COMMEN=38, BLANK=39;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_query = 2, RULE_statement = 3, 
		RULE_head = 4, RULE_module_def = 5, RULE_module_use = 6, RULE_module_local_definition = 7, 
		RULE_module_rule_scope = 8, RULE_body = 9, RULE_disjunction = 10, RULE_choice = 11, 
		RULE_choice_elements = 12, RULE_choice_element = 13, RULE_aggregate = 14, 
		RULE_aggregate_elements = 15, RULE_aggregate_element = 16, RULE_aggregate_function = 17, 
		RULE_weight_at_level = 18, RULE_naf_literals = 19, RULE_naf_literal = 20, 
		RULE_classical_literal = 21, RULE_module_variables = 22, RULE_module_predicate = 23, 
		RULE_module_predicate_variable = 24, RULE_module_predicate_variables = 25, 
		RULE_module_predicate_uses = 26, RULE_builtin_atom = 27, RULE_binop = 28, 
		RULE_terms = 29, RULE_term = 30, RULE_gringo_range = 31, RULE_gringo_sharp = 32, 
		RULE_basic_terms = 33, RULE_basic_term = 34, RULE_ground_term = 35, RULE_variable_term = 36, 
		RULE_arithop = 37;
	public static final String[] ruleNames = {
		"program", "statements", "query", "statement", "head", "module_def", "module_use", 
		"module_local_definition", "module_rule_scope", "body", "disjunction", 
		"choice", "choice_elements", "choice_element", "aggregate", "aggregate_elements", 
		"aggregate_element", "aggregate_function", "weight_at_level", "naf_literals", 
		"naf_literal", "classical_literal", "module_variables", "module_predicate", 
		"module_predicate_variable", "module_predicate_variables", "module_predicate_uses", 
		"builtin_atom", "binop", "terms", "term", "gringo_range", "gringo_sharp", 
		"basic_terms", "basic_term", "ground_term", "variable_term", "arithop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'.'", "','", "'?'", "':'", "';'", "'|'", "'not'", "':-'", 
		"':~'", "'+'", "'-'", "'*'", "'/'", "'@'", "'#'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'='", null, "'<'", "'>'", "'<='", "'>='", "'#count'", 
		"'#max'", "'#min'", "'#sum'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANONYMOUS_VARIABLE", "DOT", "COMMA", "QUESTION_MARK", "COLON", 
		"SEMICOLON", "OR", "NAF", "CONS", "WCONS", "PLUS", "MINUS", "TIMES", "DIV", 
		"AT", "SHARP", "PAREN_OPEN", "PAREN_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", 
		"CURLY_OPEN", "CURLY_CLOSE", "EQUAL", "UNEQUAL", "LESS", "GREATER", "LESS_OR_EQ", 
		"GREATER_OR_EQ", "AGGREGATE_COUNT", "AGGREGATE_MAX", "AGGREGATE_MIN", 
		"AGGREGATE_SUM", "ID", "VARIABLE", "NUMBER", "STRING", "COMMENT", "MULTI_LINE_COMMEN", 
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
	public String getGrammarFileName() { return "ASP_Core2_Modules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASP_Core2_ModulesParser(TokenStream input) {
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(76);
				statements();
				}
				break;
			}
			setState(80);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << ID) | (1L << VARIABLE))) != 0)) {
				{
				setState(79);
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			statement();
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(83);
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
		public TerminalNode QUESTION_MARK() { return getToken(ASP_Core2_ModulesParser.QUESTION_MARK, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			classical_literal();
			setState(87);
			match(QUESTION_MARK);
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
		public TerminalNode CONS() { return getToken(ASP_Core2_ModulesParser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASP_Core2_ModulesParser.DOT, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode WCONS() { return getToken(ASP_Core2_ModulesParser.WCONS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASP_Core2_ModulesParser.SQUARE_OPEN, 0); }
		public Weight_at_levelContext weight_at_level() {
			return getRuleContext(Weight_at_levelContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ASP_Core2_ModulesParser.SQUARE_CLOSE, 0); }
		public Gringo_sharpContext gringo_sharp() {
			return getRuleContext(Gringo_sharpContext.class,0);
		}
		public Module_defContext module_def() {
			return getRuleContext(Module_defContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(CONS);
				setState(90);
				body();
				setState(91);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				head();
				setState(98);
				_la = _input.LA(1);
				if (_la==CONS) {
					{
					setState(94);
					match(CONS);
					setState(96);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
						{
						setState(95);
						body();
						}
					}

					}
				}

				setState(100);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(WCONS);
				setState(104);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(103);
					body();
					}
				}

				setState(106);
				match(DOT);
				setState(107);
				match(SQUARE_OPEN);
				setState(108);
				weight_at_level();
				setState(109);
				match(SQUARE_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				gringo_sharp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				module_def();
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				disjunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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

	public static class Module_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public Module_rule_scopeContext module_rule_scope() {
			return getRuleContext(Module_rule_scopeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASP_Core2_ModulesParser.DOT, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASP_Core2_ModulesParser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ASP_Core2_ModulesParser.SQUARE_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2_ModulesParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2_ModulesParser.PAREN_CLOSE, 0); }
		public Module_predicate_variablesContext module_predicate_variables() {
			return getRuleContext(Module_predicate_variablesContext.class,0);
		}
		public Module_variablesContext module_variables() {
			return getRuleContext(Module_variablesContext.class,0);
		}
		public Module_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_defContext module_def() throws RecognitionException {
		Module_defContext _localctx = new Module_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_module_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(125);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN) {
				{
				setState(120);
				match(SQUARE_OPEN);
				setState(122);
				_la = _input.LA(1);
				if (_la==VARIABLE) {
					{
					setState(121);
					module_predicate_variables();
					}
				}

				setState(124);
				match(SQUARE_CLOSE);
				}
			}

			setState(132);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(127);
				match(PAREN_OPEN);
				setState(129);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(128);
					module_variables();
					}
				}

				setState(131);
				match(PAREN_CLOSE);
				}
			}

			setState(134);
			module_rule_scope();
			setState(135);
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

	public static class Module_useContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ASP_Core2_ModulesParser.COLON, 0); }
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public Module_local_definitionContext module_local_definition() {
			return getRuleContext(Module_local_definitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASP_Core2_ModulesParser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ASP_Core2_ModulesParser.SQUARE_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2_ModulesParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2_ModulesParser.PAREN_CLOSE, 0); }
		public Module_predicate_usesContext module_predicate_uses() {
			return getRuleContext(Module_predicate_usesContext.class,0);
		}
		public Module_variablesContext module_variables() {
			return getRuleContext(Module_variablesContext.class,0);
		}
		public Module_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_use(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_use(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_useContext module_use() throws RecognitionException {
		Module_useContext _localctx = new Module_useContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_module_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch (_input.LA(1)) {
			case CURLY_OPEN:
				{
				setState(137);
				module_local_definition();
				}
				break;
			case ID:
				{
				setState(138);
				match(ID);
				setState(144);
				_la = _input.LA(1);
				if (_la==SQUARE_OPEN) {
					{
					setState(139);
					match(SQUARE_OPEN);
					setState(141);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(140);
						module_predicate_uses();
						}
					}

					setState(143);
					match(SQUARE_CLOSE);
					}
				}

				setState(151);
				_la = _input.LA(1);
				if (_la==PAREN_OPEN) {
					{
					setState(146);
					match(PAREN_OPEN);
					setState(148);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
						{
						setState(147);
						module_variables();
						}
					}

					setState(150);
					match(PAREN_CLOSE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			match(COLON);
			setState(156);
			classical_literal();
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

	public static class Module_local_definitionContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2_ModulesParser.CURLY_OPEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2_ModulesParser.CURLY_CLOSE, 0); }
		public Module_local_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_local_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_local_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_local_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_local_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_local_definitionContext module_local_definition() throws RecognitionException {
		Module_local_definitionContext _localctx = new Module_local_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_module_local_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CURLY_OPEN);
			setState(159);
			statements();
			setState(160);
			match(CURLY_CLOSE);
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

	public static class Module_rule_scopeContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2_ModulesParser.CURLY_OPEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2_ModulesParser.CURLY_CLOSE, 0); }
		public Module_rule_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_rule_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_rule_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_rule_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_rule_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_rule_scopeContext module_rule_scope() throws RecognitionException {
		Module_rule_scopeContext _localctx = new Module_rule_scopeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_module_rule_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(CURLY_OPEN);
			setState(163);
			statements();
			setState(164);
			match(CURLY_CLOSE);
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
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASP_Core2_ModulesParser.NAF, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(166);
				naf_literal();
				}
				break;
			case 2:
				{
				setState(168);
				_la = _input.LA(1);
				if (_la==NAF) {
					{
					setState(167);
					match(NAF);
					}
				}

				setState(170);
				aggregate();
				}
				break;
			}
			setState(175);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(173);
				match(COMMA);
				setState(174);
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
		public TerminalNode OR() { return getToken(ASP_Core2_ModulesParser.OR, 0); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			classical_literal();
			setState(180);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(178);
				match(OR);
				setState(179);
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
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2_ModulesParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2_ModulesParser.CURLY_CLOSE, 0); }
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(182);
				term(0);
				setState(183);
				binop();
				}
			}

			setState(187);
			match(CURLY_OPEN);
			setState(189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << ID) | (1L << VARIABLE))) != 0)) {
				{
				setState(188);
				choice_elements();
				}
			}

			setState(191);
			match(CURLY_CLOSE);
			setState(195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(192);
				binop();
				setState(193);
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
		public TerminalNode SEMICOLON() { return getToken(ASP_Core2_ModulesParser.SEMICOLON, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public Choice_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterChoice_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitChoice_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitChoice_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_elementsContext choice_elements() throws RecognitionException {
		Choice_elementsContext _localctx = new Choice_elementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_choice_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			choice_element();
			setState(200);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(198);
				match(SEMICOLON);
				setState(199);
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
		public TerminalNode COLON() { return getToken(ASP_Core2_ModulesParser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Choice_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterChoice_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitChoice_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitChoice_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_elementContext choice_element() throws RecognitionException {
		Choice_elementContext _localctx = new Choice_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_choice_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			classical_literal();
			setState(207);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(203);
				match(COLON);
				setState(205);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(204);
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
		public TerminalNode CURLY_OPEN() { return getToken(ASP_Core2_ModulesParser.CURLY_OPEN, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASP_Core2_ModulesParser.CURLY_CLOSE, 0); }
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(209);
				term(0);
				setState(210);
				binop();
				}
			}

			setState(214);
			aggregate_function();
			setState(215);
			match(CURLY_OPEN);
			setState(216);
			aggregate_elements();
			setState(217);
			match(CURLY_CLOSE);
			setState(221);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(218);
				binop();
				setState(219);
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
		public TerminalNode SEMICOLON() { return getToken(ASP_Core2_ModulesParser.SEMICOLON, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public Aggregate_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterAggregate_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitAggregate_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitAggregate_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_elementsContext aggregate_elements() throws RecognitionException {
		Aggregate_elementsContext _localctx = new Aggregate_elementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aggregate_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			aggregate_element();
			setState(226);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(224);
				match(SEMICOLON);
				setState(225);
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
		public TerminalNode COLON() { return getToken(ASP_Core2_ModulesParser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Aggregate_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterAggregate_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitAggregate_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitAggregate_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_elementContext aggregate_element() throws RecognitionException {
		Aggregate_elementContext _localctx = new Aggregate_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aggregate_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(228);
				basic_terms();
				}
			}

			setState(235);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(231);
				match(COLON);
				setState(233);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << CURLY_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(232);
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
		public TerminalNode AGGREGATE_COUNT() { return getToken(ASP_Core2_ModulesParser.AGGREGATE_COUNT, 0); }
		public TerminalNode AGGREGATE_MAX() { return getToken(ASP_Core2_ModulesParser.AGGREGATE_MAX, 0); }
		public TerminalNode AGGREGATE_MIN() { return getToken(ASP_Core2_ModulesParser.AGGREGATE_MIN, 0); }
		public TerminalNode AGGREGATE_SUM() { return getToken(ASP_Core2_ModulesParser.AGGREGATE_SUM, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitAggregate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aggregate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public TerminalNode AT() { return getToken(ASP_Core2_ModulesParser.AT, 0); }
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Weight_at_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight_at_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterWeight_at_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitWeight_at_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitWeight_at_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Weight_at_levelContext weight_at_level() throws RecognitionException {
		Weight_at_levelContext _localctx = new Weight_at_levelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_weight_at_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			term(0);
			setState(242);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(240);
				match(AT);
				setState(241);
				term(0);
				}
			}

			setState(246);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(244);
				match(COMMA);
				setState(245);
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
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Naf_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterNaf_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitNaf_literals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitNaf_literals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naf_literalsContext naf_literals() throws RecognitionException {
		Naf_literalsContext _localctx = new Naf_literalsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_naf_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			naf_literal();
			setState(251);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(249);
				match(COMMA);
				setState(250);
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
		public Module_useContext module_use() {
			return getRuleContext(Module_useContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASP_Core2_ModulesParser.NAF, 0); }
		public Naf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterNaf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitNaf_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitNaf_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naf_literalContext naf_literal() throws RecognitionException {
		Naf_literalContext _localctx = new Naf_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_naf_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(253);
				match(NAF);
				}
			}

			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(256);
				classical_literal();
				}
				break;
			case 2:
				{
				setState(257);
				builtin_atom();
				}
				break;
			case 3:
				{
				setState(258);
				module_use();
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
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public Module_predicateContext module_predicate() {
			return getRuleContext(Module_predicateContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ASP_Core2_ModulesParser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2_ModulesParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2_ModulesParser.PAREN_CLOSE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Classical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterClassical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitClassical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitClassical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Classical_literalContext classical_literal() throws RecognitionException {
		Classical_literalContext _localctx = new Classical_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(261);
				match(MINUS);
				}
			}

			setState(266);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(264);
				match(ID);
				}
				break;
			case VARIABLE:
				{
				setState(265);
				module_predicate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(268);
				match(PAREN_OPEN);
				setState(270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(269);
					terms();
					}
				}

				setState(272);
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

	public static class Module_variablesContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Module_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_variablesContext module_variables() throws RecognitionException {
		Module_variablesContext _localctx = new Module_variablesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_module_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			terms();
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

	public static class Module_predicateContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ASP_Core2_ModulesParser.VARIABLE, 0); }
		public Module_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_predicateContext module_predicate() throws RecognitionException {
		Module_predicateContext _localctx = new Module_predicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_module_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(VARIABLE);
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

	public static class Module_predicate_variableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ASP_Core2_ModulesParser.VARIABLE, 0); }
		public Module_predicate_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_predicate_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_predicate_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_predicate_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_predicate_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_predicate_variableContext module_predicate_variable() throws RecognitionException {
		Module_predicate_variableContext _localctx = new Module_predicate_variableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_module_predicate_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(VARIABLE);
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

	public static class Module_predicate_variablesContext extends ParserRuleContext {
		public Module_predicate_variableContext module_predicate_variable() {
			return getRuleContext(Module_predicate_variableContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public Module_predicate_variablesContext module_predicate_variables() {
			return getRuleContext(Module_predicate_variablesContext.class,0);
		}
		public Module_predicate_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_predicate_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_predicate_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_predicate_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_predicate_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_predicate_variablesContext module_predicate_variables() throws RecognitionException {
		Module_predicate_variablesContext _localctx = new Module_predicate_variablesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_module_predicate_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			module_predicate_variable();
			setState(284);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(282);
				match(COMMA);
				setState(283);
				module_predicate_variables();
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

	public static class Module_predicate_usesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public Module_predicate_usesContext module_predicate_uses() {
			return getRuleContext(Module_predicate_usesContext.class,0);
		}
		public Module_predicate_usesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_predicate_uses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterModule_predicate_uses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitModule_predicate_uses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitModule_predicate_uses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_predicate_usesContext module_predicate_uses() throws RecognitionException {
		Module_predicate_usesContext _localctx = new Module_predicate_usesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_module_predicate_uses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(289);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(287);
				match(COMMA);
				setState(288);
				module_predicate_uses();
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterBuiltin_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitBuiltin_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitBuiltin_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_atomContext builtin_atom() throws RecognitionException {
		Builtin_atomContext _localctx = new Builtin_atomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_builtin_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			term(0);
			setState(292);
			binop();
			setState(293);
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
		public TerminalNode EQUAL() { return getToken(ASP_Core2_ModulesParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(ASP_Core2_ModulesParser.UNEQUAL, 0); }
		public TerminalNode LESS() { return getToken(ASP_Core2_ModulesParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ASP_Core2_ModulesParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQ() { return getToken(ASP_Core2_ModulesParser.LESS_OR_EQ, 0); }
		public TerminalNode GREATER_OR_EQ() { return getToken(ASP_Core2_ModulesParser.GREATER_OR_EQ, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			term(0);
			setState(300);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(298);
				match(COMMA);
				setState(299);
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
		public TerminalNode MINUS() { return getToken(ASP_Core2_ModulesParser.MINUS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASP_Core2_ModulesParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASP_Core2_ModulesParser.PAREN_CLOSE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ASP_Core2_ModulesParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ASP_Core2_ModulesParser.STRING, 0); }
		public TerminalNode VARIABLE() { return getToken(ASP_Core2_ModulesParser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASP_Core2_ModulesParser.ANONYMOUS_VARIABLE, 0); }
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(303);
				match(MINUS);
				setState(304);
				term(3);
				}
				break;
			case 2:
				{
				setState(305);
				match(ID);
				setState(311);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(306);
					match(PAREN_OPEN);
					setState(308);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
						{
						setState(307);
						terms();
						}
					}

					setState(310);
					match(PAREN_CLOSE);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(313);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(314);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(315);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				setState(316);
				match(ANONYMOUS_VARIABLE);
				}
				break;
			case 7:
				{
				setState(317);
				match(PAREN_OPEN);
				setState(318);
				term(0);
				setState(319);
				match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				setState(321);
				gringo_range();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(324);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(325);
					arithop();
					setState(326);
					term(3);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public List<TerminalNode> DOT() { return getTokens(ASP_Core2_ModulesParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASP_Core2_ModulesParser.DOT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASP_Core2_ModulesParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASP_Core2_ModulesParser.NUMBER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ASP_Core2_ModulesParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ASP_Core2_ModulesParser.VARIABLE, i);
		}
		public List<TerminalNode> ID() { return getTokens(ASP_Core2_ModulesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ASP_Core2_ModulesParser.ID, i);
		}
		public Gringo_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gringo_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterGringo_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitGringo_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitGringo_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gringo_rangeContext gringo_range() throws RecognitionException {
		Gringo_rangeContext _localctx = new Gringo_rangeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gringo_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(334);
			match(DOT);
			setState(335);
			match(DOT);
			setState(336);
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
		public TerminalNode SHARP() { return getToken(ASP_Core2_ModulesParser.SHARP, 0); }
		public List<TerminalNode> DOT() { return getTokens(ASP_Core2_ModulesParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASP_Core2_ModulesParser.DOT, i);
		}
		public Gringo_sharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gringo_sharp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterGringo_sharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitGringo_sharp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitGringo_sharp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gringo_sharpContext gringo_sharp() throws RecognitionException {
		Gringo_sharpContext _localctx = new Gringo_sharpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gringo_sharp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SHARP);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << COMMA) | (1L << QUESTION_MARK) | (1L << COLON) | (1L << SEMICOLON) | (1L << OR) | (1L << NAF) | (1L << CONS) | (1L << WCONS) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << AT) | (1L << SHARP) | (1L << PAREN_OPEN) | (1L << PAREN_CLOSE) | (1L << SQUARE_OPEN) | (1L << SQUARE_CLOSE) | (1L << CURLY_OPEN) | (1L << CURLY_CLOSE) | (1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT) | (1L << MULTI_LINE_COMMEN) | (1L << BLANK))) != 0)) {
				{
				{
				setState(339);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DOT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		public TerminalNode COMMA() { return getToken(ASP_Core2_ModulesParser.COMMA, 0); }
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public Basic_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterBasic_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitBasic_terms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitBasic_terms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_termsContext basic_terms() throws RecognitionException {
		Basic_termsContext _localctx = new Basic_termsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_basic_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			basic_term();
			setState(350);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(348);
				match(COMMA);
				setState(349);
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
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterBasic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitBasic_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitBasic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_termContext basic_term() throws RecognitionException {
		Basic_termContext _localctx = new Basic_termContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_basic_term);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				ground_term();
				}
				break;
			case ANONYMOUS_VARIABLE:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		public TerminalNode ID() { return getToken(ASP_Core2_ModulesParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ASP_Core2_ModulesParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ASP_Core2_ModulesParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ASP_Core2_ModulesParser.MINUS, 0); }
		public Ground_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterGround_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitGround_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitGround_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ground_termContext ground_term() throws RecognitionException {
		Ground_termContext _localctx = new Ground_termContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ground_term);
		int _la;
		try {
			setState(362);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(358);
					match(MINUS);
					}
				}

				setState(361);
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
		public TerminalNode VARIABLE() { return getToken(ASP_Core2_ModulesParser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASP_Core2_ModulesParser.ANONYMOUS_VARIABLE, 0); }
		public Variable_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterVariable_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitVariable_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitVariable_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_termContext variable_term() throws RecognitionException {
		Variable_termContext _localctx = new Variable_termContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variable_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public TerminalNode PLUS() { return getToken(ASP_Core2_ModulesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ASP_Core2_ModulesParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(ASP_Core2_ModulesParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ASP_Core2_ModulesParser.DIV, 0); }
		public ArithopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).enterArithop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASP_Core2_ModulesListener ) ((ASP_Core2_ModulesListener)listener).exitArithop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASP_Core2_ModulesVisitor ) return ((ASP_Core2_ModulesVisitor<? extends T>)visitor).visitArithop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithopContext arithop() throws RecognitionException {
		ArithopContext _localctx = new ArithopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arithop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		case 30:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0173\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\5\2S\n\2"+
		"\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5\5\5"+
		"e\n\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3"+
		"\6\3\6\5\6x\n\6\3\7\3\7\3\7\5\7}\n\7\3\7\5\7\u0080\n\7\3\7\3\7\5\7\u0084"+
		"\n\7\3\7\5\7\u0087\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\b\5"+
		"\b\u0093\n\b\3\b\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n\b\5\b\u009c\n\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00ab\n\13\3\13"+
		"\5\13\u00ae\n\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\5\f\u00b7\n\f\3"+
		"\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\3\r\3\r\5\r\u00c6"+
		"\n\r\3\16\3\16\3\16\5\16\u00cb\n\16\3\17\3\17\3\17\5\17\u00d0\n\17\5\17"+
		"\u00d2\n\17\3\20\3\20\3\20\5\20\u00d7\n\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00e0\n\20\3\21\3\21\3\21\5\21\u00e5\n\21\3\22\5\22\u00e8"+
		"\n\22\3\22\3\22\5\22\u00ec\n\22\5\22\u00ee\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\5\24\u00f5\n\24\3\24\3\24\5\24\u00f9\n\24\3\25\3\25\3\25\5\25\u00fe"+
		"\n\25\3\26\5\26\u0101\n\26\3\26\3\26\3\26\5\26\u0106\n\26\3\27\5\27\u0109"+
		"\n\27\3\27\3\27\5\27\u010d\n\27\3\27\3\27\5\27\u0111\n\27\3\27\5\27\u0114"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\5\33\u011f\n\33\3\34"+
		"\3\34\3\34\5\34\u0124\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\5\37\u012f\n\37\3 \3 \3 \3 \3 \3 \5 \u0137\n \3 \5 \u013a\n \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u0145\n \3 \3 \3 \3 \7 \u014b\n \f \16 \u014e\13"+
		" \3!\3!\3!\3!\3!\3\"\3\"\7\"\u0157\n\"\f\"\16\"\u015a\13\"\3\"\3\"\3#"+
		"\3#\3#\5#\u0161\n#\3$\3$\5$\u0165\n$\3%\3%\3%\5%\u016a\n%\3%\5%\u016d"+
		"\n%\3&\3&\3\'\3\'\3\'\2\3>(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJL\2\b\3\2\37\"\3\2\31\36\3\2#%\3\2\4\4\4\2"+
		"\3\3$$\3\2\r\20\u018d\2O\3\2\2\2\4T\3\2\2\2\6X\3\2\2\2\bs\3\2\2\2\nw\3"+
		"\2\2\2\fy\3\2\2\2\16\u009b\3\2\2\2\20\u00a0\3\2\2\2\22\u00a4\3\2\2\2\24"+
		"\u00ad\3\2\2\2\26\u00b3\3\2\2\2\30\u00bb\3\2\2\2\32\u00c7\3\2\2\2\34\u00cc"+
		"\3\2\2\2\36\u00d6\3\2\2\2 \u00e1\3\2\2\2\"\u00e7\3\2\2\2$\u00ef\3\2\2"+
		"\2&\u00f1\3\2\2\2(\u00fa\3\2\2\2*\u0100\3\2\2\2,\u0108\3\2\2\2.\u0115"+
		"\3\2\2\2\60\u0117\3\2\2\2\62\u0119\3\2\2\2\64\u011b\3\2\2\2\66\u0120\3"+
		"\2\2\28\u0125\3\2\2\2:\u0129\3\2\2\2<\u012b\3\2\2\2>\u0144\3\2\2\2@\u014f"+
		"\3\2\2\2B\u0154\3\2\2\2D\u015d\3\2\2\2F\u0164\3\2\2\2H\u016c\3\2\2\2J"+
		"\u016e\3\2\2\2L\u0170\3\2\2\2NP\5\4\3\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2"+
		"QS\5\6\4\2RQ\3\2\2\2RS\3\2\2\2S\3\3\2\2\2TV\5\b\5\2UW\5\4\3\2VU\3\2\2"+
		"\2VW\3\2\2\2W\5\3\2\2\2XY\5,\27\2YZ\7\6\2\2Z\7\3\2\2\2[\\\7\13\2\2\\]"+
		"\5\24\13\2]^\7\4\2\2^t\3\2\2\2_d\5\n\6\2`b\7\13\2\2ac\5\24\13\2ba\3\2"+
		"\2\2bc\3\2\2\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\4\2\2gt\3\2"+
		"\2\2hj\7\f\2\2ik\5\24\13\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\4\2\2mn\7"+
		"\25\2\2no\5&\24\2op\7\26\2\2pt\3\2\2\2qt\5B\"\2rt\5\f\7\2s[\3\2\2\2s_"+
		"\3\2\2\2sh\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2ux\5\26\f\2vx\5\30\r"+
		"\2wu\3\2\2\2wv\3\2\2\2x\13\3\2\2\2y\177\7#\2\2z|\7\25\2\2{}\5\64\33\2"+
		"|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\26\2\2\177z\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0086\3\2\2\2\u0081\u0083\7\23\2\2\u0082\u0084\5.\30\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\7\24\2\2\u0086\u0081\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\5\22\n\2\u0089\u008a\7\4\2\2\u008a\r\3\2\2\2\u008b\u009c"+
		"\5\20\t\2\u008c\u0092\7#\2\2\u008d\u008f\7\25\2\2\u008e\u0090\5\66\34"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\7\26\2\2\u0092\u008d\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0099\3\2\2\2"+
		"\u0094\u0096\7\23\2\2\u0095\u0097\5.\30\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\24\2\2\u0099\u0094\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5,\27\2\u009f"+
		"\17\3\2\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3\7\30"+
		"\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a7"+
		"\7\30\2\2\u00a7\23\3\2\2\2\u00a8\u00ae\5*\26\2\u00a9\u00ab\7\n\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\5\36"+
		"\20\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00b0\7\5\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b6\5,\27\2\u00b4\u00b5\7\t\2\2\u00b5"+
		"\u00b7\5\26\f\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\27\3\2\2"+
		"\2\u00b8\u00b9\5> \2\u00b9\u00ba\5:\36\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\7\27\2\2"+
		"\u00be\u00c0\5\32\16\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c5\7\30\2\2\u00c2\u00c3\5:\36\2\u00c3\u00c4\5> \2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\31\3\2\2"+
		"\2\u00c7\u00ca\5\34\17\2\u00c8\u00c9\7\b\2\2\u00c9\u00cb\5\32\16\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00d1\5,\27"+
		"\2\u00cd\u00cf\7\7\2\2\u00ce\u00d0\5(\25\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\35\3\2\2\2\u00d3\u00d4\5> \2\u00d4\u00d5\5:\36\2\u00d5\u00d7\3\2\2\2"+
		"\u00d6\u00d3\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\5$\23\2\u00d9\u00da\7\27\2\2\u00da\u00db\5 \21\2\u00db\u00df\7\30\2\2"+
		"\u00dc\u00dd\5:\36\2\u00dd\u00de\5> \2\u00de\u00e0\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e4\5\"\22\2\u00e2"+
		"\u00e3\7\b\2\2\u00e3\u00e5\5 \21\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5!\3\2\2\2\u00e6\u00e8\5D#\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00eb\7\7\2\2\u00ea\u00ec\5(\25\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\t\2\2\2\u00f0%\3\2"+
		"\2\2\u00f1\u00f4\5> \2\u00f2\u00f3\7\21\2\2\u00f3\u00f5\5> \2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\7\5\2\2\u00f7"+
		"\u00f9\5<\37\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\'\3\2\2\2"+
		"\u00fa\u00fd\5*\26\2\u00fb\u00fc\7\5\2\2\u00fc\u00fe\5(\25\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe)\3\2\2\2\u00ff\u0101\7\n\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0106\5,"+
		"\27\2\u0103\u0106\58\35\2\u0104\u0106\5\16\b\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106+\3\2\2\2\u0107\u0109\7\16\2\2"+
		"\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010d"+
		"\7#\2\2\u010b\u010d\5\60\31\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0113\3\2\2\2\u010e\u0110\7\23\2\2\u010f\u0111\5<\37\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\7\24\2\2"+
		"\u0113\u010e\3\2\2\2\u0113\u0114\3\2\2\2\u0114-\3\2\2\2\u0115\u0116\5"+
		"<\37\2\u0116/\3\2\2\2\u0117\u0118\7$\2\2\u0118\61\3\2\2\2\u0119\u011a"+
		"\7$\2\2\u011a\63\3\2\2\2\u011b\u011e\5\62\32\2\u011c\u011d\7\5\2\2\u011d"+
		"\u011f\5\64\33\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\65\3\2"+
		"\2\2\u0120\u0123\7#\2\2\u0121\u0122\7\5\2\2\u0122\u0124\5\66\34\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\67\3\2\2\2\u0125\u0126\5> \2"+
		"\u0126\u0127\5:\36\2\u0127\u0128\5> \2\u01289\3\2\2\2\u0129\u012a\t\3"+
		"\2\2\u012a;\3\2\2\2\u012b\u012e\5> \2\u012c\u012d\7\5\2\2\u012d\u012f"+
		"\5<\37\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f=\3\2\2\2\u0130"+
		"\u0131\b \1\2\u0131\u0132\7\16\2\2\u0132\u0145\5> \5\u0133\u0139\7#\2"+
		"\2\u0134\u0136\7\23\2\2\u0135\u0137\5<\37\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\7\24\2\2\u0139\u0134\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u0145\3\2\2\2\u013b\u0145\7%\2\2\u013c"+
		"\u0145\7&\2\2\u013d\u0145\7$\2\2\u013e\u0145\7\3\2\2\u013f\u0140\7\23"+
		"\2\2\u0140\u0141\5> \2\u0141\u0142\7\24\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0145\5@!\2\u0144\u0130\3\2\2\2\u0144\u0133\3\2\2\2\u0144\u013b\3\2\2"+
		"\2\u0144\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f"+
		"\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u014c\3\2\2\2\u0146\u0147\f\4\2\2\u0147"+
		"\u0148\5L\'\2\u0148\u0149\5> \5\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2"+
		"\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d?"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\t\4\2\2\u0150\u0151\7\4\2\2\u0151"+
		"\u0152\7\4\2\2\u0152\u0153\t\4\2\2\u0153A\3\2\2\2\u0154\u0158\7\22\2\2"+
		"\u0155\u0157\n\5\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7\4\2\2\u015cC\3\2\2\2\u015d\u0160\5F$\2\u015e\u015f\7\5\2\2\u015f"+
		"\u0161\5D#\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161E\3\2\2\2\u0162"+
		"\u0165\5H%\2\u0163\u0165\5J&\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2"+
		"\u0165G\3\2\2\2\u0166\u016d\7#\2\2\u0167\u016d\7&\2\2\u0168\u016a\7\16"+
		"\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\7%\2\2\u016c\u0166\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0169\3\2"+
		"\2\2\u016dI\3\2\2\2\u016e\u016f\t\6\2\2\u016fK\3\2\2\2\u0170\u0171\t\7"+
		"\2\2\u0171M\3\2\2\28ORVbdjsw|\177\u0083\u0086\u008f\u0092\u0096\u0099"+
		"\u009b\u00aa\u00ad\u00b1\u00b6\u00bb\u00bf\u00c5\u00ca\u00cf\u00d1\u00d6"+
		"\u00df\u00e4\u00e7\u00eb\u00ed\u00f4\u00f8\u00fd\u0100\u0105\u0108\u010c"+
		"\u0110\u0113\u011e\u0123\u012e\u0136\u0139\u0144\u014c\u0158\u0160\u0164"+
		"\u0169\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}