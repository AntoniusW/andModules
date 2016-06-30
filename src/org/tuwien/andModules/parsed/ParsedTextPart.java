package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

/**
 * Created by Antonius Weinzierl on 5/28/16.
 */
public class ParsedTextPart extends ParsedBase {

    public ParsedTextPart() {
        super();
        this.programParts.add(this);
    }

    public String textPart;

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        return textPart;
    }
}
