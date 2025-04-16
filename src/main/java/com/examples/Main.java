package com.examples;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String input = "3 + 5";


        SimpleExprLexer lexer = new SimpleExprLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleExprParser parser = new SimpleExprParser(tokens);

        ParseTree tree = parser.expr();

        System.out.println("Árvore de Análise: " + tree.toStringTree(parser));
    }
}
