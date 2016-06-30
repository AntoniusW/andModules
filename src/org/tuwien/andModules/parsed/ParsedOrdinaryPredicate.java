package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

/**
 * Created by Antonius Weinzierl on 5/29/16.
 */
public class ParsedOrdinaryPredicate extends ParsedBase {

    public String predicateName;

    public ParsedTerms terms;

    public ParsedOrdinaryPredicate() {
        super();
        this.programParts.add(this);
    }

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        String ret = moduleInstance.prefix+predicateName;
        if( terms == null)
            terms = new ParsedTerms();
        ret += terms.rewrite(moduleInstance);
        return ret;
    }
}
