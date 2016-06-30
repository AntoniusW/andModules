package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

/**
 * Created by Antonius Weinzierl on 6/20/16.
 */
public class PlaceholderRuleEnd extends ParsedBase {

    public PlaceholderRuleEnd() {
        super();
        programParts.add(this);
    }

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        String ret = "";
        if( !moduleInstance.hasEmptyFoVars() )
            ret += ", "+moduleInstance.getFoVarsAtom();
        ret += ".\n";
        return ret;
    }
}
