lexer grammar MiniJavaLexer;

@header {
package com.examples.lexer;
}

INT : [0-9]+;
PLUS : '+';
WS  : [ \t\r\n]+ -> skip;
