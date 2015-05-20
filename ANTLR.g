/** ANTLR v2 to v3 converter
Currently does this kind of stuff:

new keywords: grammar, tree; must warn with comment.

convert class T extends Parser -> grammar T if combined or
parser grammar T if not

header {...} -> @header {...} and move to action section after grammar.

option names; importVocab -> tokenVocab, buildAST=true -> output=AST

keyword protected->fragment

labels goes from colon to =

literals "abc" -> 'abc'

kill empty strings in tokens; don't need to add to literals table.
tokens {
	"options";
}

add @members to member actions.

add @init to rule actions

comment out return value init expressions

move lexer member action to grammar member area if combined
*/

grammar ANTLR;

tokens {
	SEMPRED;
	DOC_COMMENT;
}

@members {
protected TokenRewriteStream tokens;
protected Token headerActionToken;
protected boolean seenParser = false;
protected boolean combined = false;
protected Token lastTokenBeforeRules = null;

public void setTokenBuffer(TokenRewriteStream tokens) {
	this.tokens = tokens;
}
public void setCombined(boolean combined) {
	this.combined = combined;
}
}

antlrGrammar
   :
	( 	'header' STRING_LITERAL ACTION
	|	h='header' a=ACTION {headerActionToken = $a; tokens.delete($h,$a);}
	)*
	( optionsSpec )?
	( classDef )*
	EOF
	;

classDef
@init {
boolean justSawLexer=false;
}
	:
	( ACTION )?
	( DOC_COMMENT )?
	(	lexerSpec {justSawLexer=true;}
	|	treeParserSpec
	|	parserSpec
	)
	{
	lastTokenBeforeRules = input.LT(-1);
	if ( (!combined||(combined&&!justSawLexer)) && headerActionToken!=null ) {
		tokens.insertAfter(lastTokenBeforeRules,
			"\n@header "+headerActionToken.getText()+"\n");
	}
	}
	rules
	;

optionsSpec
	:	OPTIONS
		(	id '=' v=optionValue ';'
			{
			if ( $id.text.equals("importVocab") )
				tokens.replace($id.start, "tokenVocab");
			else if ( $id.text.equals("buildAST") )
				tokens.replace($id.start, $v.start, "output=AST");
			}
		)*
		'}'
		{
		tokens.insertBefore($optionsSpec.start, "/*");
		tokens.insertAfter(input.LT(-1), "*/"); // .stop not set yet
		}
	;

// optionValue returns a Token which may be one of several things:
//    STRING_LITERAL -- a quoted string
//    CHAR_LITERAL -- a single quoted character
//		INT -- an integer
//		RULE_REF or TOKEN_REF -- an identifier
optionValue
	:	qualifiedID
	|	STRING_LITERAL
	|	INT
	|	charSet
	;

charSet
	:	setBlockElement	( OR setBlockElement )*
	;

setBlockElement
	:	CHAR_LITERAL (RANGE CHAR_LITERAL)?
	;

tokensSpec
@init {int n=0;}
	:	TOKENS
			(	(	TOKEN_REF ( '=' STRING_LITERAL )? (tokensSpecOptions)? {n++;}
				|	s=STRING_LITERAL (tokensSpecOptions)?
					{tokens.insertBefore($s, "// ");}
				)
				';'
			)+
		RCURLY
		{
		if ( n==0 ) {
			tokens.insertBefore($TOKENS, "/*");
			tokens.insertAfter($RCURLY, "*/");
		}
		}
	;

tokensSpecOptions
	:	OPEN_ELEMENT_OPTION
		id '=' optionValue
		(
			';'
			id '=' optionValue

		)*
		CLOSE_ELEMENT_OPTION
	;

superClass
	:	LPAREN

			(STRING_LITERAL)
		RPAREN
	;

parserSpec
	:	'class'	id
		(	'extends' 'Parser' (superClass)?
		|
		)
		{
		String gname = $id.text;
		if ( gname.endsWith("Parser") ) {
			gname = gname.substring(0,gname.length()-"Parser".length());
		}
		String prefix="";
		if ( !combined ) {
			prefix = "parser ";
		}
		tokens.replace($parserSpec.start, input.LT(-1), prefix+"grammar "+gname);
		}
		';'
		(optionsSpec)?
		(tokensSpec)?
		( ACTION {tokens.insertBefore($ACTION, "@members ");})?
		{seenParser=true;}
	;

lexerSpec
	:   'class'	id 'extends' 'Lexer' (superClass)? semi=';'
		{
		String gname = $id.text;
		if ( gname.endsWith("Lexer") ) {
			gname = gname.substring(0,gname.length()-"Lexer".length());
		}
		if ( combined ) {
			tokens.delete($lexerSpec.start, $semi);
		}
		else {
			tokens.replace($lexerSpec.start, $semi, "lexer grammar "+gname+";");
		}
		}
		(optionsSpec)?
		(tokensSpec)?
		(	ACTION
			{
			if ( combined ) {
				// move up to other members
				tokens.insertBefore(lastTokenBeforeRules, "@lexer::members "+$ACTION.text);
				tokens.delete($ACTION);
			}
			else  {
				tokens.insertBefore($ACTION, "@lexer::members ");
			}
			}
		)?
	;

treeParserSpec
	:	'class' id 'extends' 'TreeParser' (superClass)?	semi=';'
		{
		String gname = $id.text;
		if ( gname.endsWith("TreeParser") ) {
			gname = gname.substring(0,gname.length()-"TreeParser".length());
		}
		tokens.replace($treeParserSpec.start, $semi, "tree grammar "+gname+";");
		}
		(optionsSpec)?
		(tokensSpec)?
		( ACTION {tokens.insertBefore($ACTION, "@members ");})?
	;

rules
    :   rule+
    ;

rule:	DOC_COMMENT?
		(	p='protected' {tokens.replace($p,"fragment");}
		|	'public'
		|	'private'
		)?
		id BANG? ARG_ACTION? ( r='returns' ret=ARG_ACTION )?
		{
		if ( $id.text.equals("tree") ) {
			tokens.replace($id.start, $id.text+"_");
			tokens.insertAfter($id.start, "/* tree is a keyword in v3! */");
		}
		if ( $id.text.equals("grammar") ) {
			tokens.replace($id.start, $id.text+"_");
			tokens.insertAfter($id.start, "/* grammar is a keyword in v3! */");
		}
		if ( $ret!=null && $ret.text.indexOf("=")>0 ) { // put in comment about assignment
			tokens.insertBefore($r, "/* cannot use = (yet) in v3: ");
			tokens.insertAfter($ret, "*/");
		}
		}
		throwsSpec?
		ruleOptionsSpec?
		(a=ACTION {tokens.insertBefore($a,"@init ");})?
		COLON block ';'
		exceptionGroup?
	;

ruleOptionsSpec
	:	OPTIONS ( id '=' optionValue ';' )* '}'
		{
		tokens.insertBefore($ruleOptionsSpec.start, "/*");
		tokens.insertAfter(input.LT(-1), "*/"); // .stop not set yet
		}
	;

throwsSpec
	:	'throws' id
		( COMMA id  )*

	;

block
    :
		alternative ( OR alternative )*

    ;

alternative

    :
		(BANG)? ( element )* ( exceptionSpecNoLabel )?

    ;

exceptionGroup
	:	( exceptionSpec )+
   ;

exceptionSpec
   :   'exception'( ARG_ACTION  )? ( exceptionHandler )*
   ;

exceptionSpecNoLabel
   :   'exception' ( exceptionHandler )*
   ;

exceptionHandler
   :   'catch' ARG_ACTION ACTION
   ;

element
	:	elementNoOptionSpec (elementOptionSpec)?
	;

elementOptionSpec
	:	OPEN_ELEMENT_OPTION
		id '=' optionValue ( ';' id '=' optionValue )*
		CLOSE_ELEMENT_OPTION
	;

elementNoOptionSpec
@after {
	if ( $ruleRef!=null && $ruleRef.text.equals("tree") ) {
		tokens.replace($ruleRef, $ruleRef.text+"_");
		tokens.insertAfter($ruleRef, "/* tree is a keyword in v3! */");
	}
	else if ( $ruleRef!=null && $ruleRef.text.equals("grammar") ) {
		tokens.replace($ruleRef, $ruleRef.text+"_");
		tokens.insertAfter($ruleRef, "/* grammar is a keyword in v3! */");
	}
}
	:	id '=' ( id COLON  )?
		(	ruleRef=RULE_REF ( ARG_ACTION )? ( BANG )?
		|	// this syntax only valid for lexer
			TOKEN_REF ( ARG_ACTION )?
		)

	|	(id c=COLON {tokens.replace($c,"=");} )?
		(	ruleRef=RULE_REF
			( ARG_ACTION  )?
			( BANG  )?
		|	range 
		|	terminal
		|	NOT_OP
			(	notTerminal
			|	ebnf
			)
		|	ebnf
		)
	|	ACTION
	|	SEMPRED
	|	treeSpec
	;

treeSpec :
	TREE_BEGIN {tokens.replace($TREE_BEGIN, "^(");}
	rootNode element+ RPAREN
	;

rootNode
	:	(id COLON )? terminal
	;

ebnf
	:	LPAREN
		(   optionsSpec
			( a=ACTION {tokens.insertBefore($a,"@init ");} c=COLON
			| c=COLON  {tokens.delete($c);}
			)
		|	a=ACTION {tokens.insertBefore($a,"@init ");} COLON
		)?
		block
		RPAREN
		(	(	QUESTION
			|	STAR
			|	PLUS
			)?
			( BANG )?
		|	IMPLIES
		)
	;

ast_type_spec
	:	(	CARET
		|	BANG
		)?
	;

range

	:	CHAR_LITERAL RANGE CHAR_LITERAL
		( BANG  )?

	|
		(TOKEN_REF|STRING_LITERAL)
		RANGE
		(TOKEN_REF|STRING_LITERAL)
		ast_type_spec
	;

terminal

	:
		CHAR_LITERAL
		( BANG  )?

	|
		TOKEN_REF
		ast_type_spec
		// Args are only valid for lexer
		( ARG_ACTION  )?

	|
		STRING_LITERAL
		ast_type_spec

	|
		WILDCARD
		ast_type_spec

	;

notTerminal
	:
		CHAR_LITERAL
		( BANG  )?

	|
		TOKEN_REF
		ast_type_spec

	;

/** Match a.b.c.d qualified ids; WILDCARD here is overloaded as
 *  id separator; that is, I need a reference to the '.' token.
 */
qualifiedID
	:	id
		(	WILDCARD id

		)*

	;

id	:	TOKEN_REF
	|	RULE_REF
	;

WS	:	(	' '
		|	'\t'
		|	'\r' '\n'
		|	'\n'
		)
		{ $channel=HIDDEN; }
	;

fragment
COMMENT
	:	SL_COMMENT | ML_COMMENT
	;

SL_COMMENT
    :   '//' .* '\r'? '\n' {$channel=HIDDEN;}
    ;

ML_COMMENT
    :   '/*' ('*' {$type=DOC_COMMENT;})? .* '*/' {$channel=HIDDEN;}
    ;

OPEN_ELEMENT_OPTION
	:	'<'
	;

CLOSE_ELEMENT_OPTION
	:	'>'
	;

COMMA : ',';

QUESTION :	'?' ;

TREE_BEGIN : '#(' ;

LPAREN:	'(' ;

RPAREN:	')' ;

COLON :	':' ;

STAR:	'*' ;

PLUS:	'+' ;

IMPLIES : '=>' ;

CARET : '^' ;

BANG : '!' ;

OR	:	'|' ;

WILDCARD : '.' ;

RANGE : '..' ;

NOT_OP :	'~' ;

RCURLY:	'}'	;

CHAR_LITERAL
	:	'\'' (ESC|~'\'') '\''
	;

STRING_LITERAL // convert to '...'
	:	'"' (ESC|~('\\'|'"'))* '"'
		{
			String s = getText();
			s = s.substring(1,s.length()-1);
			setText("'"+s+"'");
		}
	;

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

fragment
DIGIT
	:	'0'..'9'
	;

fragment
XDIGIT :
		'0' .. '9'
	|	'a' .. 'f'
	|	'A' .. 'F'
	;

INT	:	('0'..'9')+
	;

OPTIONS
	:	'options' WS_LOOP '{' {$channel=0;} // reset after WS cal
	;

TOKENS
	:	'tokens' WS_LOOP '{' {$channel=0;} // reset after WS cal
	;

ARG_ACTION
   :
	NESTED_ARG_ACTION

	;

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

ACTION
	:	NESTED_ACTION ('?' {$type=SEMPRED;})?
	;

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

TOKEN_REF
	:	'A'..'Z'
		(	'a'..'z'|'A'..'Z'|'_'|'0'..'9'	)*
	;

RULE_REF
	:	INTERNAL_RULE_REF
	;
	
fragment
WS_LOOP
	:	(   WS
		|	COMMENT
		)*
	;

fragment
INTERNAL_RULE_REF
	:	'a'..'z'
		(
			'a'..'z'|'A'..'Z'|'_'|'0'..'9'
		)*

	;

fragment
WS_OPT : WS? ;
