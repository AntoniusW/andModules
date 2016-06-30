// Generated from /home/as/src/ASP-Core2-Parser/ASP_Core2_Modules.g4 by ANTLR 4.5.1
package org.tuwien;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASP_Core2_ModulesParser}.
 */
public interface ASP_Core2_ModulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ASP_Core2_ModulesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ASP_Core2_ModulesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ASP_Core2_ModulesParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ASP_Core2_ModulesParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ASP_Core2_ModulesParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ASP_Core2_ModulesParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ASP_Core2_ModulesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ASP_Core2_ModulesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(ASP_Core2_ModulesParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(ASP_Core2_ModulesParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_def}.
	 * @param ctx the parse tree
	 */
	void enterModule_def(ASP_Core2_ModulesParser.Module_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_def}.
	 * @param ctx the parse tree
	 */
	void exitModule_def(ASP_Core2_ModulesParser.Module_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_use}.
	 * @param ctx the parse tree
	 */
	void enterModule_use(ASP_Core2_ModulesParser.Module_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_use}.
	 * @param ctx the parse tree
	 */
	void exitModule_use(ASP_Core2_ModulesParser.Module_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_local_definition}.
	 * @param ctx the parse tree
	 */
	void enterModule_local_definition(ASP_Core2_ModulesParser.Module_local_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_local_definition}.
	 * @param ctx the parse tree
	 */
	void exitModule_local_definition(ASP_Core2_ModulesParser.Module_local_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_rule_scope}.
	 * @param ctx the parse tree
	 */
	void enterModule_rule_scope(ASP_Core2_ModulesParser.Module_rule_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_rule_scope}.
	 * @param ctx the parse tree
	 */
	void exitModule_rule_scope(ASP_Core2_ModulesParser.Module_rule_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ASP_Core2_ModulesParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ASP_Core2_ModulesParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ASP_Core2_ModulesParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ASP_Core2_ModulesParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(ASP_Core2_ModulesParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(ASP_Core2_ModulesParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void enterChoice_elements(ASP_Core2_ModulesParser.Choice_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#choice_elements}.
	 * @param ctx the parse tree
	 */
	void exitChoice_elements(ASP_Core2_ModulesParser.Choice_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#choice_element}.
	 * @param ctx the parse tree
	 */
	void enterChoice_element(ASP_Core2_ModulesParser.Choice_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#choice_element}.
	 * @param ctx the parse tree
	 */
	void exitChoice_element(ASP_Core2_ModulesParser.Choice_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(ASP_Core2_ModulesParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(ASP_Core2_ModulesParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_elements(ASP_Core2_ModulesParser.Aggregate_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_elements}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_elements(ASP_Core2_ModulesParser.Aggregate_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_element(ASP_Core2_ModulesParser.Aggregate_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_element}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_element(ASP_Core2_ModulesParser.Aggregate_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(ASP_Core2_ModulesParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(ASP_Core2_ModulesParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void enterWeight_at_level(ASP_Core2_ModulesParser.Weight_at_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#weight_at_level}.
	 * @param ctx the parse tree
	 */
	void exitWeight_at_level(ASP_Core2_ModulesParser.Weight_at_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literals(ASP_Core2_ModulesParser.Naf_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literals}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literals(ASP_Core2_ModulesParser.Naf_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void enterNaf_literal(ASP_Core2_ModulesParser.Naf_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literal}.
	 * @param ctx the parse tree
	 */
	void exitNaf_literal(ASP_Core2_ModulesParser.Naf_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void enterClassical_literal(ASP_Core2_ModulesParser.Classical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#classical_literal}.
	 * @param ctx the parse tree
	 */
	void exitClassical_literal(ASP_Core2_ModulesParser.Classical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_variables}.
	 * @param ctx the parse tree
	 */
	void enterModule_variables(ASP_Core2_ModulesParser.Module_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_variables}.
	 * @param ctx the parse tree
	 */
	void exitModule_variables(ASP_Core2_ModulesParser.Module_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate}.
	 * @param ctx the parse tree
	 */
	void enterModule_predicate(ASP_Core2_ModulesParser.Module_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate}.
	 * @param ctx the parse tree
	 */
	void exitModule_predicate(ASP_Core2_ModulesParser.Module_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variable}.
	 * @param ctx the parse tree
	 */
	void enterModule_predicate_variable(ASP_Core2_ModulesParser.Module_predicate_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variable}.
	 * @param ctx the parse tree
	 */
	void exitModule_predicate_variable(ASP_Core2_ModulesParser.Module_predicate_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variables}.
	 * @param ctx the parse tree
	 */
	void enterModule_predicate_variables(ASP_Core2_ModulesParser.Module_predicate_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variables}.
	 * @param ctx the parse tree
	 */
	void exitModule_predicate_variables(ASP_Core2_ModulesParser.Module_predicate_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_uses}.
	 * @param ctx the parse tree
	 */
	void enterModule_predicate_uses(ASP_Core2_ModulesParser.Module_predicate_usesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_uses}.
	 * @param ctx the parse tree
	 */
	void exitModule_predicate_uses(ASP_Core2_ModulesParser.Module_predicate_usesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_atom(ASP_Core2_ModulesParser.Builtin_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#builtin_atom}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_atom(ASP_Core2_ModulesParser.Builtin_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(ASP_Core2_ModulesParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(ASP_Core2_ModulesParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(ASP_Core2_ModulesParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(ASP_Core2_ModulesParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ASP_Core2_ModulesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ASP_Core2_ModulesParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_range}.
	 * @param ctx the parse tree
	 */
	void enterGringo_range(ASP_Core2_ModulesParser.Gringo_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_range}.
	 * @param ctx the parse tree
	 */
	void exitGringo_range(ASP_Core2_ModulesParser.Gringo_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void enterGringo_sharp(ASP_Core2_ModulesParser.Gringo_sharpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_sharp}.
	 * @param ctx the parse tree
	 */
	void exitGringo_sharp(ASP_Core2_ModulesParser.Gringo_sharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void enterBasic_terms(ASP_Core2_ModulesParser.Basic_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#basic_terms}.
	 * @param ctx the parse tree
	 */
	void exitBasic_terms(ASP_Core2_ModulesParser.Basic_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#basic_term}.
	 * @param ctx the parse tree
	 */
	void enterBasic_term(ASP_Core2_ModulesParser.Basic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#basic_term}.
	 * @param ctx the parse tree
	 */
	void exitBasic_term(ASP_Core2_ModulesParser.Basic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#ground_term}.
	 * @param ctx the parse tree
	 */
	void enterGround_term(ASP_Core2_ModulesParser.Ground_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#ground_term}.
	 * @param ctx the parse tree
	 */
	void exitGround_term(ASP_Core2_ModulesParser.Ground_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#variable_term}.
	 * @param ctx the parse tree
	 */
	void enterVariable_term(ASP_Core2_ModulesParser.Variable_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#variable_term}.
	 * @param ctx the parse tree
	 */
	void exitVariable_term(ASP_Core2_ModulesParser.Variable_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASP_Core2_ModulesParser#arithop}.
	 * @param ctx the parse tree
	 */
	void enterArithop(ASP_Core2_ModulesParser.ArithopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASP_Core2_ModulesParser#arithop}.
	 * @param ctx the parse tree
	 */
	void exitArithop(ASP_Core2_ModulesParser.ArithopContext ctx);
}