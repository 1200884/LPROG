grammar LabeledExpr6;
prog: stat ;
stat: TIPO NOTA VIRGULA TRABALHO NOTA VIRGULA NUMERO VIRGULA TURMA stat+ NEWLINE #highergrade
| NEWLINE stat# blank
;

TIPO:NORMAL|RECURSO|SETEMBRO;
NORMAL: 'NORMAL:';
RECURSO: 'RECURSO:';
SETEMBRO: 'SETEMBRO:';
TRABALHO: 'TRABALH0:';
NUMERO: [0-9][0-9][0-9][0-9][0-9][0-9][0-9];
LETRA: [A-Z];
VIRGULA: ',';
NEWLINE : [\r\n]+ | [\n] | '<EOF>';
NOTA: [0-9]+;
TURMA: [0-9][A-Z][A-Z];
