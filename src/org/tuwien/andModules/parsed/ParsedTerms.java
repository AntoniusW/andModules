package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

import java.util.ArrayList;

/**
 * Created by Antonius Weinzierl on 6/16/16.
 */
public class ParsedTerms extends ParsedBase {

    public ArrayList<String> termlist;

    public ParsedTerms() {
        super();
        programParts.add(this);
        termlist = new ArrayList<>();
    }

    @Override
    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        String ret = "";
        ret += moduleInstance.getFoVarsTerms();
        if( !"".equals(ret) && termlist.size() != 0)
            ret += ", ";
        for (int i = 0; i < termlist.size(); i++) {
            ret += (i==0 ? "" : ", ") + termlist.get(i);
        }
        if( !"".equals(ret))
            ret = "("+ret+")";

        return ret;
    }

}
