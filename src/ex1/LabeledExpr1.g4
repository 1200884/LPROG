grammar LabeledExpr1;
prog: stat ;
stat: HELLO ' ' WORLD #printExpr
| NEWLINE # blank
| . # blank

;
NEWLINE : [\r\n]+ ;
HELLO: 'HELLO';
WORLD: 'WORLD';