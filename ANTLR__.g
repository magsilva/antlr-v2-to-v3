lexer grammar ANTLR;

T45 : 'header' ;
T46 : '=' ;
T47 : ';' ;
T48 : 'class' ;
T49 : 'extends' ;
T50 : 'Parser' ;
T51 : 'Lexer' ;
T52 : 'TreeParser' ;
T53 : 'protected' ;
T54 : 'public' ;
T55 : 'private' ;
T56 : 'returns' ;
T57 : 'throws' ;
T58 : 'exception' ;
T59 : 'catch' ;

// $ANTLR src "ANTLR.g" 438
WS	:	(	' '
		|	'\t'
		|	'\r' '\n'
		|	'\n'
		)
		{ $channel=HIDDEN; }
	;

// $ANTLR src "ANTLR.g" 446
fragment
COMMENT
	:	SL_COMMENT | ML_COMMENT
	;

// $ANTLR src "ANTLR.g" 451
SL_COMMENT
    :   '//' .* '\r'? '\n' {$channel=HIDDEN;}
    ;

// $ANTLR src "ANTLR.g" 455
ML_COMMENT
    :   '/*' ('*' {type=DOC_COMMENT;})? .* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "ANTLR.g" 459
OPEN_ELEMENT_OPTION
	:	'<'
	;

// $ANTLR src "ANTLR.g" 463
CLOSE_ELEMENT_OPTION
	:	'>'
	;

// $ANTLR src "ANTLR.g" 467
COMMA : ',';

// $ANTLR src "ANTLR.g" 469
QUESTION :	'?' ;

// $ANTLR src "ANTLR.g" 471
TREE_BEGIN : '#(' ;

// $ANTLR src "ANTLR.g" 473
LPAREN:	'(' ;

// $ANTLR src "ANTLR.g" 475
RPAREN:	')' ;

// $ANTLR src "ANTLR.g" 477
COLON :	':' ;

// $ANTLR src "ANTLR.g" 479
STAR:	'*' ;

// $ANTLR src "ANTLR.g" 481
PLUS:	'+' ;

// $ANTLR src "ANTLR.g" 483
IMPLIES : '=>' ;

// $ANTLR src "ANTLR.g" 485
CARET : '^' ;

// $ANTLR src "ANTLR.g" 487
BANG : '!' ;

// $ANTLR src "ANTLR.g" 489
OR	:	'|' ;

// $ANTLR src "ANTLR.g" 491
WILDCARD : '.' ;

// $ANTLR src "ANTLR.g" 493
RANGE : '..' ;

// $ANTLR src "ANTLR.g" 495
NOT_OP :	'~' ;

// $ANTLR src "ANTLR.g" 497
RCURLY:	'}'	;

// $ANTLR src "ANTLR.g" 499
CHAR_LITERAL
	:	'\'' (ESC|~'\'') '\''
	;

// $ANTLR src "ANTLR.g" 503
STRING_LITERAL // convert to '...'
	:	'"' (ESC|~('\\'|'"'))* '"'
		{
			String s = getText();
			s = s.substring(1,s.length()-1);
			setText("'"+s+"'");
		}
	;

// $ANTLR src "ANTLR.g" 512
fragment
ESC	:	'\\'
		(	'n'
		|	'r'
		|	't'
		|	'b'
		|	'f'
		|	'w'
		|	'a'
		|	'"'
		|	'\''
		|	'\\'
		|	('0'..'3')
			( '0'..'7' ( '0'..'7' )? )?
		|	('4'..'7')
			( '0'..'7' )?
		|	'u' XDIGIT XDIGIT XDIGIT XDIGIT
		)
	;

// $ANTLR src "ANTLR.g" 532
fragment
DIGIT
	:	'0'..'9'
	;

// $ANTLR src "ANTLR.g" 537
fragment
XDIGIT :
		'0' .. '9'
	|	'a' .. 'f'
	|	'A' .. 'F'
	;

// $ANTLR src "ANTLR.g" 544
INT	:	('0'..'9')+
	;

// $ANTLR src "ANTLR.g" 547
OPTIONS
	:	'options' WS_LOOP '{' {$channel=0;} // reset after WS cal
	;

// $ANTLR src "ANTLR.g" 551
TOKENS
	:	'tokens' WS_LOOP '{' {$channel=0;} // reset after WS cal
	;

// $ANTLR src "ANTLR.g" 555
ARG_ACTION
   :
	NESTED_ARG_ACTION

	;

// $ANTLR src "ANTLR.g" 561
fragment
NESTED_ARG_ACTION
	:	'['
		(	options {greedy=false; k=1;}
		:	NESTED_ARG_ACTION
		|	CHAR_LITERAL
		|	STRING_LITERAL
		|	.
		)*
	']'
	;

// $ANTLR src "ANTLR.g" 573
ACTION
	:	NESTED_ACTION ('?' {type=SEMPRED;})?
	;

// $ANTLR src "ANTLR.g" 577
fragment
NESTED_ACTION
	:	'{'
		(	options {greedy=false; k=1;}
		:	NESTED_ACTION
		|	CHAR_LITERAL
		|	COMMENT
		|	STRING_LITERAL
		|	. // lots of warnings here; should make antlr ignore
		)*
	'}'
   ;

// $ANTLR src "ANTLR.g" 590
TOKEN_REF
	:	'A'..'Z'
		(	'a'..'z'|'A'..'Z'|'_'|'0'..'9'	)*
	;

// $ANTLR src "ANTLR.g" 595
RULE_REF
	:	INTERNAL_RULE_REF
	;
	
// $ANTLR src "ANTLR.g" 599
fragment
WS_LOOP
	:	(   WS
		|	COMMENT
		)*
	;

// $ANTLR src "ANTLR.g" 606
fragment
INTERNAL_RULE_REF
	:	'a'..'z'
		(
			'a'..'z'|'A'..'Z'|'_'|'0'..'9'
		)*

	;

// $ANTLR src "ANTLR.g" 615
fragment
WS_OPT : WS? ;
