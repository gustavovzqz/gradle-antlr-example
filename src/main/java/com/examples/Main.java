package com.examples;

import com.examples.lexer.MiniJavaLexer;
import com.examples.parser.MiniJavaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "3 + 5";

        // Criação do lexer
        MiniJavaLexer lexer = new MiniJavaLexer(CharStreams.fromString(input));

        // Criação do stream de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criação do parser
        MiniJavaParser parser = new MiniJavaParser(tokens);

        // Análise sintática
        ParseTree tree = parser.expr();

        // Exibição da árvore de análise
        System.out.println("Árvore de Análise: " + tree.toStringTree(parser));
    }
}
