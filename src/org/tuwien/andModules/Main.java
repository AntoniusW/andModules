package org.tuwien.andModules;

import org.antlr.v4.runtime.*;
import org.tuwien.ASP_Core2_ModulesLexer;
import org.tuwien.ASP_Core2_ModulesParser;
import org.tuwien.andModules.parsed.ModuleDefinition;
import org.tuwien.andModules.rewriter.ModuleRewriter;

import java.io.IOException;

public class Main {

    public static boolean parsingError;

    public static void main(String[] args) throws IOException {


        String testinput = "testmodule[T] { foo(T). \n" +
                "bar | d :- -T(f,g,h). }.\n"+
                "baz :- testmodule[bar]:foo(X).\n"+
                "a :- {foo :- bar(X).}:foo(X), dom(X).\n" +
                "bzt :- { c :- d. }:d, a.\n" +
                "b :- othermod(Z,X):ot1, p(Z,Z), a, r(a,Z) .\n"+
                "othermod(X,Y) { ot1 :- foo(Y,X), testmodule[ot1]:foo(Y). }.";

        // prepare parser
        ASP_Core2_ModulesLexer lexer = new ASP_Core2_ModulesLexer(new ANTLRInputStream(System.in));
        CommonTokenStream toks = new CommonTokenStream(lexer);
        ASP_Core2_ModulesParser parser = new ASP_Core2_ModulesParser(toks);

        // record eventual parsing errors
        parsingError = false;
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                parsingError = true;
            }
        });

        // parse program
        ASP_Core2_ModulesParser.ProgramContext programContext = parser.program();

        if( parsingError ) {
            System.err.println("Error while parsing input ASP program using modules, see errors above.");
            System.exit(-1);
        }


        // construct representation from parsed
        Vocabulary vocabulary = lexer.getVocabulary();
        ModuleRepresentationBuilder moduleRepresentationBuilder = new ModuleRepresentationBuilder(vocabulary);
        ModuleDefinition andModules = (ModuleDefinition) moduleRepresentationBuilder.visitProgram(programContext);

        // rewrite modules into ordinary asp
        ModuleRewriter rewriter = ModuleRewriter.getInstance();
        String rewrittenProgram = rewriter.rewriteProgram(andModules);


        System.out.println(rewrittenProgram);

    }

}
