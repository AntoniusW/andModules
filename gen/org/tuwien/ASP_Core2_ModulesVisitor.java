// Generated from /home/as/src/ASP-Core2-Parser/ASP_Core2_Modules.g4 by ANTLR 4.5.1
package org.tuwien;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASP_Core2_ModulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASP_Core2_ModulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ASP_Core2_ModulesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ASP_Core2_ModulesParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ASP_Core2_ModulesParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ASP_Core2_ModulesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(ASP_Core2_ModulesParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_def(ASP_Core2_ModulesParser.Module_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_use(ASP_Core2_ModulesParser.Module_useContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_local_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_local_definition(ASP_Core2_ModulesParser.Module_local_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_rule_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_rule_scope(ASP_Core2_ModulesParser.Module_rule_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ASP_Core2_ModulesParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(ASP_Core2_ModulesParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(ASP_Core2_ModulesParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#choice_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_elements(ASP_Core2_ModulesParser.Choice_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#choice_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_element(ASP_Core2_ModulesParser.Choice_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(ASP_Core2_ModulesParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_elements(ASP_Core2_ModulesParser.Aggregate_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_element(ASP_Core2_ModulesParser.Aggregate_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(ASP_Core2_ModulesParser.Aggregate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#weight_at_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight_at_level(ASP_Core2_ModulesParser.Weight_at_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaf_literals(ASP_Core2_ModulesParser.Naf_literalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#naf_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaf_literal(ASP_Core2_ModulesParser.Naf_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#classical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassical_literal(ASP_Core2_ModulesParser.Classical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_variables(ASP_Core2_ModulesParser.Module_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_predicate(ASP_Core2_ModulesParser.Module_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_predicate_variable(ASP_Core2_ModulesParser.Module_predicate_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_predicate_variables(ASP_Core2_ModulesParser.Module_predicate_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#module_predicate_uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_predicate_uses(ASP_Core2_ModulesParser.Module_predicate_usesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#builtin_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_atom(ASP_Core2_ModulesParser.Builtin_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(ASP_Core2_ModulesParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(ASP_Core2_ModulesParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ASP_Core2_ModulesParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGringo_range(ASP_Core2_ModulesParser.Gringo_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#gringo_sharp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGringo_sharp(ASP_Core2_ModulesParser.Gringo_sharpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#basic_terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_terms(ASP_Core2_ModulesParser.Basic_termsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#basic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_term(ASP_Core2_ModulesParser.Basic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#ground_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGround_term(ASP_Core2_ModulesParser.Ground_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#variable_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_term(ASP_Core2_ModulesParser.Variable_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASP_Core2_ModulesParser#arithop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithop(ASP_Core2_ModulesParser.ArithopContext ctx);
}