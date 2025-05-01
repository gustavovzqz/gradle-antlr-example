parser grammar MiniJavaParser;

@header {
package com.examples.parser;
}

options {
  tokenVocab=MiniJavaLexer;  // Usa os tokens definidos no lexer
}

expr: INT PLUS INT;
