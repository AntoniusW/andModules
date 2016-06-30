package org.tuwien.andModules.rewriter;

import org.tuwien.andModules.parsed.ModuleDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Antonius Weinzierl on 6/9/16.
 */
public class ModuleRewriter {

    private static final ModuleRewriter instance = new ModuleRewriter();    // singleton

    public static ModuleRewriter getInstance() {
        return instance;
    }

    private ModuleRewriter() {
        instancesAddedToGenerationList = new HashSet<>();
        instancesToGenerate = new ArrayList<>();
        instanceCounterPerModule = new HashMap<>();
    }


    private HashSet<ModuleDefinitionInstance> instancesAddedToGenerationList;
    private ArrayList<ModuleDefinitionInstance> instancesToGenerate;
    public void addInstanceToGenerate(ModuleDefinitionInstance instanceToAdd) {
        if( !instancesAddedToGenerationList.contains(instanceToAdd) ) {
            instancesToGenerate.add(instanceToAdd);

        }
    }

    private HashMap<ModuleDefinition,Integer> instanceCounterPerModule;
    public int getNewInstanceCounter(ModuleDefinition moduleDefinition) {
        Integer counter = instanceCounterPerModule.get(moduleDefinition);
        if( counter == null) {
            instanceCounterPerModule.put(moduleDefinition,new Integer(0));
            return 0;

        } else {
            instanceCounterPerModule.put(moduleDefinition,new Integer(counter+1));
            return counter+1;
        }
    }

    private ModuleDefinitionInstance getNextInstanceToGenerate() {
        if( instancesToGenerate.size() == 0 )
            return null;
        return instancesToGenerate.remove(0);
    }


    public String rewriteProgram(ModuleDefinition mainProgram) {


        ModuleDefinitionInstance mainProgInstance = ModuleDefinitionInstance.getMainInstance(); //new ModuleDefinitionInstance();
        mainProgInstance.callingScope = ModuleDefinitionInstance.getMainInstance(); // null
        mainProgInstance.moduleDefinition = mainProgram;
        mainProgInstance.prefix = "";
        mainProgInstance.instanceNumber = 0;

        String rewritten = "% Main Program:\n";
        rewritten += mainProgram.rewrite(mainProgInstance);

        rewritten += "\n% Modules:\n";
        ModuleDefinitionInstance nextModuleInstance = getNextInstanceToGenerate();
        while( nextModuleInstance != null ) {
            //outerScopeInstance = nextModuleInstance;
            rewritten += "% Module "+nextModuleInstance.printModuleName()+":\n";
            rewritten += nextModuleInstance.moduleDefinition.rewrite(nextModuleInstance);
            rewritten += "\n";
            nextModuleInstance = getNextInstanceToGenerate();
        }
        return rewritten;
    }
}
