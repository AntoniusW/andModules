package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;
import org.tuwien.andModules.rewriter.ModuleRewriter;
import org.tuwien.andModules.rewriter.RuleBodyForRewriting;

import java.util.ArrayList;

/**
 * Created by Antonius Weinzierl on 4/24/16.
 */
public class ModuleUse extends ParsedBase {
    public String mid;
    public ArrayList<String> predicateVariables;
    public ArrayList<String> foVariables;
    public ParsedBase queryAtom;

    public RuleBodyForRewriting surroundingRuleBody;

    public void setBoundModuleDefinition(ModuleDefinition boundModuleDefinition) {
        this.boundModuleDefinition = boundModuleDefinition;
    }

    private ModuleDefinition boundModuleDefinition;   // the specific instance of a ModuleDefinition that is bound to this module use

    public ModuleUse() {
        super();
        predicateVariables = new ArrayList<>();
        foVariables = new ArrayList<>();
        this.programParts.add(this);
    }

    public ModuleUse(ModuleUse copy) {
        super();
        mid = copy.mid;
        predicateVariables = new ArrayList<>(copy.predicateVariables);
        foVariables = new ArrayList<>(copy.foVariables);
        queryAtom = copy.queryAtom;
        this.programParts.add(this);
    }

    /**
     *  Checks whether this module use matches with a given module definition (based on module header)
     * @param moduleDefinition
     * @return true if both module ids are the same and number of predicate variables match.
     */
    public boolean matchesDefinition(ModuleDefinition moduleDefinition) {
        if( !mid.equals(moduleDefinition.mid))
            return false;

        if( predicateVariables.size() != moduleDefinition.predicateVariables.size())
            return false;

        if( foVariables.size() != moduleDefinition.foVariables.size())
            return false;

        return true;
    }

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        ModuleDefinitionInstance newModuleInstance = new ModuleDefinitionInstance();
        newModuleInstance.callingScope = moduleInstance;
        newModuleInstance.moduleDefinition = boundModuleDefinition;
        newModuleInstance.actualInputPredicates = predicateVariables;
        newModuleInstance.instanceNumber = ModuleRewriter.getInstance().getNewInstanceCounter(newModuleInstance.moduleDefinition);
        newModuleInstance.prefix = newModuleInstance.getInstancePrefix();
        newModuleInstance.callingBody = surroundingRuleBody.bodyParts.getProgramParts();

        ModuleRewriter.getInstance().addInstanceToGenerate(newModuleInstance);

        return newModuleInstance.prefix+queryAtom.rewrite(ModuleDefinitionInstance.getMainInstance());
    }
}
