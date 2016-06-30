package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

/**
 * Created by Antonius Weinzierl on 5/28/16.
 */
public class ModuleInputPredicate extends ParsedBase {
    public String predicateName;

    public ParsedTerms terms;

    public ModuleInputPredicate() {
        super();
        this.programParts.add(this);
    }

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        String ret = moduleInstance.getActualInputPredicateWithPrefix(this);
        if( terms == null)
            terms = new ParsedTerms();
        ret += terms.rewrite(moduleInstance);

        return ret;
    }
}
