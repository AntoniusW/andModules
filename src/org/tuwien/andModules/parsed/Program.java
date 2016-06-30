package org.tuwien.andModules.parsed;

import java.util.ArrayList;

/**
 * Created by Antonius Weinzierl on 4/24/16.
 */
public class Program extends ParsedBase {

    public ArrayList<ModuleDefinition> moduleDefinitions;

    public ArrayList<ModuleUse> moduleUses;

    public Program() {
        programParts = new ArrayList<>();
        moduleDefinitions = new ArrayList<>();
        moduleUses = new ArrayList<>();
    }

    public Program(Program copy) {
        programParts = new ArrayList<>(copy.programParts);
        moduleDefinitions = new ArrayList<>(copy.moduleDefinitions);
        moduleUses = new ArrayList<>(copy.moduleUses);
    }
}
