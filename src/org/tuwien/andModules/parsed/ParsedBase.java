package org.tuwien.andModules.parsed;

import org.tuwien.andModules.rewriter.ModuleDefinitionInstance;

import java.util.ArrayList;

/**
 * Created by Antonius Weinzierl on 5/28/16.
 */
public class ParsedBase {

    public ArrayList<ParsedBase> getProgramParts() {
        return programParts;
    }

    ArrayList<ParsedBase> programParts;

    public ParsedBase() {
        programParts = new ArrayList<>();
        //programParts.add(this);
    }

    public ParsedBase aggregate(ParsedBase other) {
        programParts.addAll(other.programParts);
        other.programParts = null;
        concatProgramParts();
        return this;
    }

    private void concatProgramParts() {
        ArrayList<ParsedBase> simplifiedProgramParts = new ArrayList<>();
        int simplifiedPos = 0;
        ParsedTextPart currentTextPart = new ParsedTextPart();
        currentTextPart.textPart = "";
        for (int i = 0; i < programParts.size(); i++) {
            ParsedBase part = programParts.get(i);
            if( part instanceof ParsedTextPart) {
                currentTextPart.textPart += ((ParsedTextPart) part).textPart;
                if( i == programParts.size()-1 ) {  // last element
                    simplifiedProgramParts.add(simplifiedPos,currentTextPart);
                }
            } else {
                if( !currentTextPart.textPart.equals("") ) {
                    simplifiedProgramParts.add(simplifiedPos,currentTextPart);
                    simplifiedPos++;
                    currentTextPart = new ParsedTextPart();
                    currentTextPart.textPart = "";
                }
                simplifiedProgramParts.add(simplifiedPos,part);
                simplifiedPos++;
            }
        }
        this.programParts = simplifiedProgramParts;
    }

    public void fillProgram(Program program) {
        for (ParsedBase part :
                programParts) {
            if (part instanceof ModuleDefinition) { // filter module definitions
                program.moduleDefinitions.add((ModuleDefinition) part);
            } else if (part instanceof ModuleUse) { // record uses and keep them as program part
                program.moduleUses.add((ModuleUse) part);
                program.programParts.add(part);
            } else {
                program.programParts.add(part); // keep anything else
            }
        }
    }

    public String rewrite(ModuleDefinitionInstance moduleInstance) {
        // for debugging below:
        if( programParts == null || programParts.size()== 0 )
            return "[["+this.toString()+"]]";
            //throw new RuntimeException("ParsedBase.rewrite() called but should be overwritten.");

        String ret = "";
        for (int i = 0; i < programParts.size(); i++) {
            ParsedBase part = programParts.get(i);
            ret += part.rewrite(moduleInstance);
        }
        return ret;
    }

}
