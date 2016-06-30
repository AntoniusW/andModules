// Generated from /home/as/src/ASP-Core2-Parser/ASP_Core2.g4 by ANTLR 4.5.1
package org.tuwien;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASP_Core2Parser}.
 */
public interface ASP_Core2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ASP_Core2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ASP_Core2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ASP_Core2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ASP_Core2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ASP_Core2Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ASP_Core2Parser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ASP_Core2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ASP_Core2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(ASP_Core2Parser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(ASP_Core2Parser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ASP_Core2Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ASP_Core2Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ASP_Core2Parser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ASP_Core2Parser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(ASP_Core2Parser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(ASP_Core2Parser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void enterChoice_elements(ASP_Core2Parser.Choice_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void exitChoice_elements(ASP_Core2Parser.Choice_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#choice_element}.
	 * @param ctx the parse tree
	 */
	void enterChoice_element(ASP_Core2Parser.Choice_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#choice_element}.
	 * @param ctx the parse tree
	 */
	void exitChoice_element(ASP_Core2Parser.Choice_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(ASP_Core2Parser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(ASP_Core2Parser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_elements(ASP_Core2Parser.Aggregate_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_elements(ASP_Core2Parser.Aggregate_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_element(ASP_Core2Parser.Aggregate_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_element(ASP_Core2Parser.Aggregate_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(ASP_Core2Parser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(ASP_Core2Parser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void enterWeight_at_level(ASP_Core2Parser.Weight_at_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void exitWeight_at_level(ASP_Core2Parser.Weight_at_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literals(ASP_Core2Parser.Naf_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literals(ASP_Core2Parser.Naf_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literal(ASP_Core2Parser.Naf_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literal(ASP_Core2Parser.Naf_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void enterClassical_literal(ASP_Core2Parser.Classical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void exitClassical_literal(ASP_Core2Parser.Classical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_atom(ASP_Core2Parser.Builtin_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_atom(ASP_Core2Parser.Builtin_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(ASP_Core2Parser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(ASP_Core2Parser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(ASP_Core2Parser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(ASP_Core2Parser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ASP_Core2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ASP_Core2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#gringo_range}.
	 * @param ctx the parse tree
	 */
	void enterGringo_range(ASP_Core2Parser.Gringo_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#gringo_range}.
	 * @param ctx the parse tree
	 */
	void exitGringo_range(ASP_Core2Parser.Gringo_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void enterGringo_sharp(ASP_Core2Parser.Gringo_sharpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void exitGringo_sharp(ASP_Core2Parser.Gringo_sharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void enterBasic_terms(ASP_Core2Parser.Basic_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void exitBasic_terms(ASP_Core2Parser.Basic_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#basic_term}.
	 * @param ctx the parse tree
	 */
	void enterBasic_term(ASP_Core2Parser.Basic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#basic_term}.
	 * @param ctx the parse tree
	 */
	void exitBasic_term(ASP_Core2Parser.Basic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#ground_term}.
	 * @param ctx the parse tree
	 */
	void enterGround_term(ASP_Core2Parser.Ground_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#ground_term}.
	 * @param ctx the parse tree
	 */
	void exitGround_term(ASP_Core2Parser.Ground_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#variable_term}.
	 * @param ctx the parse tree
	 */
	void enterVariable_term(ASP_Core2Parser.Variable_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#variable_term}.
	 * @param ctx the parse tree
	 */
	void exitVariable_term(ASP_Core2Parser.Variable_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2Parser#arithop}.
	 * @param ctx the parse tree
	 */
	void enterArithop(ASP_Core2Parser.ArithopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2Parser#arithop}.
	 * @param ctx the parse tree
	 */
	void exitArithop(ASP_Core2Parser.ArithopContext ctx);
}