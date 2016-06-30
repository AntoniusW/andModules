package org.tuwien.andModules.parsed;

import org.tuwien.andModules.GlobalSettings;
import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

import java.util.ArrayList;

/**
 * Created by Antonius Weinzierl on 4/24/16.
 */
public class ModuleDefinition extends ParsedBase {

    public String mid;
    public ArrayList<String> predicateVariables;
    public ArrayList<String> foVariables;
    public Program program;

    public ModuleDefinition() {
        super();
        predicateVariables = new ArrayList<>();
        foVariables = new ArrayList<>();
        getProgramParts().add(this);
    }

    public ModuleDefinition(ModuleDefinition copy) {
        super();
        mid = copy.mid;
        predicateVariables = new ArrayList<>(copy.predicateVariables);
        foVariables = new ArrayList<>(copy.foVariables);
        program = new Program(copy.program);
        getProgramParts().add(this);
    }

    boolean isMainProgram() {
        return GlobalSettings.rewritingProgramName.equals(mid);
    }



    public String rewrite(ModuleDefinitionInstance thisInstance) {
        String ret = "";

        for (int i = 0; i < program.getProgramParts().size(); i++) {
            ParsedBase part = program.getProgramParts().get(i);
            ret += part.rewrite(thisInstance);
        }

        if( !isMainProgram() && !thisInstance.hasEmptyFoVars() ) {
            ret += thisInstance.getFoVarsAtom();
            ret += " :- ";
            ret += thisInstance.getPureBody();
            if(! thisInstance.callingScope.hasEmptyFoVars())
                ret += ", "+thisInstance.callingScope.getFoVarsAtom();
            ret += ".\n";
        }

        return ret;
    }


}
