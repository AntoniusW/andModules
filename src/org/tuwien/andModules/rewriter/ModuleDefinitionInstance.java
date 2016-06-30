package org.tuwien.andModules.rewriter;

import org.tuwien.andModules.parsed.ModuleDefinition;
import org.tuwien.andModules.parsed.ModuleInputPredicate;
import org.tuwien.andModules.parsed.ParsedBase;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Antonius Weinzierl on 6/11/16.
 */
public class ModuleDefinitionInstance {
    public ModuleDefinition moduleDefinition;  // the module definition this is an instance from
    public String prefix;
    public int instanceNumber;

    public ArrayList<String> actualInputPredicates; // actual parameters of the input predicate
    public ModuleDefinitionInstance callingScope;  // the rule scope this instance is used in (might be derivable from prefix?)

    public  ArrayList<ParsedBase> callingBody; // the body of the rule without any module uses (binds first-order variables of module use)


    public String getFoVarsTerms() {
        String ret = "";
        ArrayList<String> allFoVars = getFoVars();
        for (int i = 0; i < allFoVars.size(); i++) {
            ret += (i==0 ? "" : ", ") + allFoVars.get(i);
        }
        return ret;
    }

    public boolean hasEmptyFoVars() {
        return getFoVars().size() == 0;
    }

    private ArrayList<String> getFoVars() {
        ArrayList<String> allFoVariables = new ArrayList<>();
        // add FO variables from surrounding rule scope (if this is not the main program)
        if( this != getMainInstance() ) {
            allFoVariables.addAll(callingScope.getFoVars());
        }
        allFoVariables.addAll(moduleDefinition.foVariables);
        // check that no variable occurs twice:
        TreeSet<String> allFoVariablesNoDuplicates = new TreeSet<>();
        allFoVariablesNoDuplicates.addAll(allFoVariables);
        if( allFoVariablesNoDuplicates.size() != allFoVariables.size())
            throw new RuntimeException("First-order variables with the same name occurring in module definition and using scope: Module definition "+moduleDefinition.mid);

        return allFoVariables;
    }

    public String getFoVarsAtom() {
        return getInstancePrefix() + "_vars(" + getFoVarsTerms() + ")";
    }

    public ModuleDefinitionInstance() {
        actualInputPredicates = new ArrayList<>();
    }

    public String getActualInputPredicateWithPrefix(ModuleInputPredicate formalInputPredicate) {
        int predicateIndex = moduleDefinition.predicateVariables.indexOf(formalInputPredicate.predicateName);
        if( predicateIndex == -1 ) {
            throw new RuntimeException("Error: Undefined predicate input: "+formalInputPredicate.predicateName);
        }
        String actualPredicate = actualInputPredicates.get(predicateIndex);
        //return (callingScope == null ? "" : callingScope.prefix) + actualPredicate;
        return callingScope.prefix + actualPredicate;
    }

    /**
     * Check equality based on the moduleDefinition, callingScope, and actual input predicates (prefix, instanceNumber ignored).
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ModuleDefinitionInstance)) return false;
        ModuleDefinitionInstance other = (ModuleDefinitionInstance) obj;
        if (this.moduleDefinition != other.moduleDefinition) return false;
        if (this.callingScope != other.callingScope) return false;
        for (int i = 0; i < actualInputPredicates.size(); i++) {
            if (!actualInputPredicates.get(i).equals(other.actualInputPredicates.get(i)))
                return false;
        }
        return true;
    }

    public String getInstancePrefix() {
        String pref = "";
        if( callingScope != ModuleDefinitionInstance.getMainInstance() )
            pref +=callingScope.getInstancePrefix();
        pref += "module_"+moduleDefinition.mid+"_";
        for (int i = 0; i < actualInputPredicates.size(); i++) {
            pref += actualInputPredicates.get(i)+ "_";
        }
        pref += "FoV"+moduleDefinition.foVariables.size() + "_";
        pref += "i"+instanceNumber+"_";
        return pref;
    }

    private static ModuleDefinitionInstance mainInstance = null;
    public static ModuleDefinitionInstance getMainInstance() {
        if( mainInstance == null) {
            mainInstance = new ModuleDefinitionInstance();
        }
        return mainInstance;
    }

    public String printModuleName() {
        String ret = "";
        ret += moduleDefinition.mid + "[";
        for (int i = 0; i < actualInputPredicates.size(); i++) {
            ret += (i ==0 ? "" : ", ") + actualInputPredicates.get(i);
        }
        ret += "] instance: "+instanceNumber;
        //if( callingScope != null) {
        if( callingScope != ModuleDefinitionInstance.getMainInstance() ) {
            ret += " scope: " + callingScope.moduleDefinition.mid + "[";
            for (int i = 0; i < callingScope.actualInputPredicates.size(); i++) {
                ret += (i == 0 ? "" : ", ") + callingScope.actualInputPredicates.get(i);
            }
            ret += "] instance: " + callingScope.instanceNumber;
        } else
            ret += " scope: Main";
        return ret;
    }

    public String getPureBody() {
        String pureBody = "";
        for (int i = 0; i < callingBody.size(); i++) {
            pureBody += callingBody.get(i).rewrite(callingScope);
        }
        // remove surplus ',' (from ModuleUses being removed)
        pureBody = pureBody.replaceAll("^\\s*,|,\\s*$","");    // trim leading and trailing ,
        pureBody = pureBody.replaceAll(",\\s*,", ", "); // remove inner , ,
        return pureBody;
    }
}
