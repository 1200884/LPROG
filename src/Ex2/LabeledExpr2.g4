grammar LabeledExpr2;
prog: stat ;
stat: NUMBER ' ' MENOR ' ' NUMBER NEWLINE stat #validateMenor
| NUMBER ' ' MAIOR ' ' NUMBER NEWLINE stat  #validateMaior
| NUMBER ' ' IGUAL ' ' NUMBER NEWLINE stat  #validateIgual
| NUMBER ' ' DIFERENTE ' ' NUMBER NEWLINE stat  #validateDiferente
| NEWLINE stat# blank
| . # invalid
;
NEWLINE : [\r\n]+ ;
NUMBER: [0-9]*;
MENOR : '<';
MAIOR : '>';
IGUAL : '=';
DIFERENTE: '<>';