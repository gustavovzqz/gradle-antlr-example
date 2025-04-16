grammar SimpleExpr;

@header {
package com.examples;
}

expr:   INT '+' INT;

INT : [0-9]+;

WS : [ \t\r\n]+ -> skip;
