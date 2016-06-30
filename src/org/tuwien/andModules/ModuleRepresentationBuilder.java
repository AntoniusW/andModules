package org.tuwien.andModules;

import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.tuwien.ASP_Core2_ModulesBaseVisitor;
import org.tuwien.ASP_Core2_ModulesParser;
import org.tuwien.andModules.parsed.*;
import org.tuwien.andModules.rewriter.RuleBodyForRewriting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Antonius Weinzierl on 5/26/16.
 */
public class ModuleRepresentationBuilder extends ASP_Core2_ModulesBaseVisitor<ParsedBase> {


    public ModuleRepresentationBuilder(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    private Vocabulary vocabulary;  // the tokens and their names of the lexer

    private static Stack<Pair<ArrayList<ModuleDefinition>,ArrayList<ModuleUse>>> ruleScopes = new Stack<>();

    @Override
    public ParsedBase visitStatement(ASP_Core2_ModulesParser.StatementContext ctx) {
        /*statement : CONS body DOT
                | head (CONS body?)? DOT
                | WCONS body? DOT SQUARE_OPEN weight_at_level SQUARE_CLOSE
                | gringo_sharp    // NOT Core2 syntax, but widespread
                | module_def;  // module extension*/
        ruleBodyForRewriting = new RuleBodyForRewriting();
        isOutermostBody = true;

        ParsedBase stm;

        if( ctx.module_def() != null || ctx.gringo_sharp() != null ) {
            // treat module_def and gringo_sharp (leave unchanged, except for adding a newline after last statement)
            stm = super.visitStatement(ctx);
            ParsedBase lastPart = stm.getProgramParts().get(stm.getProgramParts().size()-1);
            if( lastPart instanceof ParsedTextPart)
                ((ParsedTextPart) lastPart).textPart += "\n";

        } else if( ctx.WCONS() != null ) {
            // treat weak constraint
            ParsedBase parsedWcons= visitTerminal(ctx.WCONS());
            if( ctx.body() != null)
                parsedWcons = parsedWcons.aggregate(visitBody(ctx.body()));
            parsedWcons = parsedWcons.aggregate(new PlaceholderRuleEnd());
            parsedWcons = parsedWcons.aggregate(visitTerminal(ctx.SQUARE_CLOSE()));
            parsedWcons = parsedWcons.aggregate(visitWeight_at_level(ctx.weight_at_level()));
            parsedWcons = parsedWcons.aggregate(visitTerminal(ctx.SQUARE_CLOSE()));
            stm = parsedWcons;

        } else {
            // treat fact/rule/constraint
            ParsedBase rule = new ParsedBase();
            if( ctx.head() != null)
                rule = rule.aggregate(visitHead(ctx.head()));
            if( ctx.CONS() != null) {
                rule = rule.aggregate(visitTerminal(ctx.CONS()));
            }
            if( ctx.body() != null ) {
                rule = rule.aggregate(visitBody(ctx.body()));
            }
            rule = rule.aggregate(new PlaceholderRuleEnd());
            stm = rule;
        }

        return stm;
    }

    private static RuleBodyForRewriting ruleBodyForRewriting = null;    // collect body literals here (used for first-order rewriting)
    private static boolean isOutermostBody;

    @Override
    public ParsedBase visitBody(ASP_Core2_ModulesParser.BodyContext ctx) {
        // ( naf_literal | NAF? aggregate ) (COMMA body)?;
        if( isOutermostBody ) {
            isOutermostBody = false;
            ParsedBase bodyPart = super.visitBody(ctx);
            for (int i = 0; i < bodyPart.getProgramParts().size(); i++) {
                if (!(bodyPart.getProgramParts().get(i) instanceof ModuleUse))
                    ruleBodyForRewriting.bodyParts.getProgramParts().add(bodyPart.getProgramParts().get(i));
            }
        }

        return super.visitBody(ctx);
    }

    @Override
    public ParsedBase visitTerminal(TerminalNode node) {
        ParsedTextPart ret = new ParsedTextPart();

        // return symbol/token text, and add
        // whitespaces (necessary after 'not', nice after and before several other symbols)
        String tokenName = vocabulary.getSymbolicName(node.getSymbol().getType());
        String txt;
        switch (tokenName) {
            // symbols preceeded by WS
            case "NAF":
            case "COMMA":
            case "AGGREGATE_COUNT":
            case "AGGREGATE_MAX":
            case "AGGREGATE_MIN":
            case "AGGREGATE_SUM":
                txt = node.getText()+" ";
                break;
            // symbols surrounded by WS
            case "SEMICOLON":
            case "COLON":
            case "OR":
            case "CONS":
            case "WCONS":
                txt = " "+node.getText()+" ";
                break;
            // everything else is just the original text
            default : txt = node.getText();
        }
        ret.textPart = txt;
        return ret;
    }

    @Override
    protected ParsedBase aggregateResult(ParsedBase aggregate, ParsedBase nextResult) {
        return aggregate.aggregate(nextResult);
    }

    @Override
    protected ParsedBase defaultResult() {
        ParsedTextPart mpp = new ParsedTextPart();
        mpp.textPart = "";
        return mpp;
    }

    @Override
    public ParsedBase visitClassical_literal(ASP_Core2_ModulesParser.Classical_literalContext ctx) {
        // MINUS? (ID
        //         | module_predicate ) // module extension
        // (PAREN_OPEN terms PAREN_CLOSE)?;
        ParsedBase mb = new ParsedBase();
        if( ctx.MINUS() != null) {
            mb.aggregate(visit(ctx.MINUS()));
        }
        ParsedBase pred;
        if( ctx.module_predicate() != null) {
            ModuleInputPredicate predName = new ModuleInputPredicate();
            predName.predicateName = ctx.module_predicate().getText();

            if( ctx.terms() != null ) {
                ParsedTerms terms = (ParsedTerms) visitTerms(ctx.terms());
                predName.terms = terms;
            }

            mb.aggregate(predName);
        }
        if( ctx.ID() != null ) {
            ParsedOrdinaryPredicate ordinaryPredicate = new ParsedOrdinaryPredicate();
            ordinaryPredicate.predicateName = ctx.ID().getText();

            if( ctx.terms() != null ) {
                ParsedTerms terms = (ParsedTerms) visitTerms(ctx.terms());
                ordinaryPredicate.terms = terms;
            }

            mb.aggregate(ordinaryPredicate);
        }
        return mb;
    }


    public static Stack<HashSet<String>> definedPredicates = new Stack<>();
    @Override
    public ParsedBase visitHead(ASP_Core2_ModulesParser.HeadContext ctx) {
        // record all occurring head atoms
        ParsedBase ret = super.visitHead(ctx);
        for (ParsedBase part :
               ret.getProgramParts() ) {
            if( part instanceof ParsedOrdinaryPredicate) {
                ParsedOrdinaryPredicate hpred = (ParsedOrdinaryPredicate) part;
                if( !definedPredicates.empty()) {
                    definedPredicates.peek().add(hpred.predicateName);
                }
            }
        }
        return ret;
    }

    private static int localDefinitionCounter = 0;
    @Override
    public ParsedBase visitModule_use(ASP_Core2_ModulesParser.Module_useContext ctx) {
        // module_use : ( module_local_definition | ID (SQUARE_OPEN module_predicate_uses? SQUARE_CLOSE)? (PAREN_OPEN module_variables? PAREN_CLOSE)? ) DOT classical_literal; // module extension

        if( ctx.module_local_definition() !=null) {
            // directly rewrite into module
            definedPredicates.push(new HashSet<>());
            ParsedBase localDef = visitStatements(ctx.module_local_definition().statements());
            HashSet<String> locallyDefinedPredicates = definedPredicates.pop();
            HashSet<String> usedPredicates = new HashSet<>();
            for (ParsedBase part :
                    localDef.getProgramParts()) {
                if( part instanceof ParsedOrdinaryPredicate) {
                    ParsedOrdinaryPredicate pred = (ParsedOrdinaryPredicate) part;
                    usedPredicates.add(pred.predicateName);
                }
            }
            Program localProg = new Program();
            localDef.fillProgram(localProg);

            ModuleDefinition rewrittenModule = new ModuleDefinition();
            rewrittenModule.program = localProg;
            rewrittenModule.mid = "local"+localDefinitionCounter+"_";
            localDefinitionCounter++;

            usedPredicates.removeAll(locallyDefinedPredicates); // must be imported
            rewrittenModule.predicateVariables = new ArrayList<>(usedPredicates);
            rewrittenModule.foVariables = new ArrayList<>();

            // create module use
            ModuleUse moduleUse = new ModuleUse();
            moduleUse.mid = rewrittenModule.mid;
            moduleUse.predicateVariables = (ArrayList<String>) rewrittenModule.predicateVariables.clone();
            moduleUse.foVariables = (ArrayList<String>) rewrittenModule.foVariables.clone();
            moduleUse.queryAtom = visitClassical_literal(ctx.classical_literal());
            moduleUse.setBoundModuleDefinition(rewrittenModule);    // bind definition and use directly
            moduleUse.surroundingRuleBody = ruleBodyForRewriting;
            rewrittenModule.getProgramParts().add(moduleUse);

            return rewrittenModule;

        } else {
            ModuleUse moduleUse = new ModuleUse();
            moduleUse.mid = ctx.ID().getText();

            if( ctx.module_predicate_uses() != null) {
                ParsedBase predVars = visitModule_predicate_uses(ctx.module_predicate_uses());
                for (int i = 0; i < predVars.getProgramParts().size(); i++) {
                    ParsedTextPart term = (ParsedTextPart) predVars.getProgramParts().get(i);
                    moduleUse.predicateVariables.add(term.textPart);
                }
            }
            if( ctx.module_variables() != null) {
                ParsedTerms foVars = (ParsedTerms) visitModule_variables(ctx.module_variables());
                moduleUse.foVariables = foVars.termlist;
            }
            moduleUse.queryAtom = visitClassical_literal(ctx.classical_literal());
            moduleUse.surroundingRuleBody = ruleBodyForRewriting;
            ruleScopes.peek().b.add(moduleUse);
            return moduleUse;
        }
    }

    @Override
    public ParsedBase visitModule_variables(ASP_Core2_ModulesParser.Module_variablesContext ctx) {
        // module_variables : terms;
        return visitTerms(ctx.terms());
    }

    @Override
    public ParsedBase visitTerms(ASP_Core2_ModulesParser.TermsContext ctx) {
        // terms : term (COMMA terms)?;
        ParsedTerms ret = new ParsedTerms();
        ret.termlist.add(ctx.term().getText());
        if( ctx.terms() != null ) {
            ret.termlist.addAll(((ParsedTerms) visitTerms(ctx.terms())).termlist);
        }
        return ret;
    }

    @Override
    public ParsedBase visitModule_rule_scope(ASP_Core2_ModulesParser.Module_rule_scopeContext ctx) {
        // module_rule_scope : CURLY_OPEN statements CURLY_CLOSE;
        return super.visitStatements(ctx.statements());
    }

    @Override
    public ParsedBase visitModule_def(ASP_Core2_ModulesParser.Module_defContext ctx) {
        // module_def : ID (SQUARE_OPEN module_predicate_variables? SQUARE_CLOSE)? (PAREN_OPEN module_variables? PAREN_CLOSE)? module_rule_scope DOT;    // module extension
        ModuleDefinition moduleDefinition = new ModuleDefinition();
        moduleDefinition.mid = ctx.ID().getText();
        if( ctx.module_predicate_variables()!= null) {
            ParsedBase predVars = visitModule_predicate_variables(ctx.module_predicate_variables());
            for (int i = 0; i < predVars.getProgramParts().size(); i++) {
                ParsedTextPart pvar = (ParsedTextPart) predVars.getProgramParts().get(i);
                moduleDefinition.predicateVariables.add(pvar.textPart);
            }
        }
        if( ctx.module_variables() != null) {
            ParsedTerms foVars = (ParsedTerms) visitModule_variables(ctx.module_variables());
            moduleDefinition.foVariables = foVars.termlist;
        }


        declareNewModuleDefinition(moduleDefinition);

        ParsedBase mb = visitModule_rule_scope(ctx.module_rule_scope());
        Program moduleProgram = new Program();
        mb.fillProgram(moduleProgram);
        moduleDefinition.program = moduleProgram;

        resolveModuleUsesAndUndeclareCurrentModuleDefinition();

        return moduleDefinition;
    }

    @Override
    public ParsedBase visitProgram(ASP_Core2_ModulesParser.ProgramContext ctx) {
        ModuleDefinition mainProg = new ModuleDefinition();
        mainProg.mid = GlobalSettings.rewritingProgramName;
        mainProg.predicateVariables = new ArrayList<>();
        mainProg.foVariables = new ArrayList<>();


        initializeMainModuleDefinition(mainProg);

        ParsedBase mb = super.visitProgram(ctx);

        Program program = new Program();
        mb.fillProgram(program);
        mainProg.program = program;

        resolveModuleUsesAndUndeclareCurrentModuleDefinition();

        return mainProg;
    }

    private void initializeMainModuleDefinition(ModuleDefinition mainModule) {
        ArrayList<ModuleDefinition> definedModules = new ArrayList<>();
        ArrayList<ModuleUse> moduleUses = new ArrayList<>();
        ruleScopes.push(new Pair<>(definedModules,moduleUses));
        ruleScopes.peek().a.add(mainModule);  // probably not needed
    }

    private void declareNewModuleDefinition(ModuleDefinition newModuleDefinition) {
        // ensure that the module is not already defined: construct dummy ModuleUse and try to match it
        ModuleUse dummyUse = new ModuleUse();
        dummyUse.mid = newModuleDefinition.mid;
        dummyUse.predicateVariables = new ArrayList<>(newModuleDefinition.predicateVariables);
        dummyUse.foVariables = new ArrayList<>(newModuleDefinition.foVariables);
        if( matchWithDefinition(dummyUse) != null ) throw new RuntimeException("Error: Module definition already defined. "+newModuleDefinition);

        ruleScopes.peek().a.add(newModuleDefinition);   // make module definition known to surrounding scope
        ArrayList<ModuleDefinition> definedModules = new ArrayList<>(); // add new scope for the module definition itself
        ArrayList<ModuleUse> moduleUses = new ArrayList<>();
        ruleScopes.push(new Pair<>(definedModules,moduleUses));
    }

    private void declareModuleUse(ModuleUse moduleUse) {
        ruleScopes.peek().b.add(moduleUse);
    }

    private void resolveModuleUsesAndUndeclareCurrentModuleDefinition() {
        Pair<ArrayList<ModuleDefinition>, ArrayList<ModuleUse>> currentScope = ruleScopes.peek();
        for (ModuleUse moduleUse :
                currentScope.b) {
            ModuleDefinition matchedModuleDefinition = matchWithDefinition(moduleUse);
            if( matchedModuleDefinition == null) throw new RuntimeException("Error: Module use does not match any module definition. " +moduleUse.mid);
            moduleUse.setBoundModuleDefinition(matchedModuleDefinition);
        }
        ruleScopes.pop();
    }

    private ModuleDefinition matchWithDefinition(ModuleUse moduleUse) {
        // search backwards through all rule scopes and all defined modules in each rule scope
        for (int i = 1; i <= ruleScopes.size(); i++) {
            Pair<ArrayList<ModuleDefinition>, ArrayList<ModuleUse>> ruleScope = ruleScopes.get(ruleScopes.size() - i);
            for (int j = 0; j < ruleScope.a.size(); j++) {
                ModuleDefinition moduleDefinition = ruleScope.a.get(j);
                if( moduleUse.matchesDefinition(moduleDefinition) )
                    return moduleDefinition;
            }
        }
        return null;
    }
}
