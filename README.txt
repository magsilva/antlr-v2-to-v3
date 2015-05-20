ANTLR v2 to v3 converter

This program converts two v2 ANTLR grammars from ANTLR v3 (antlr.g and
antlr.print.g) syntactically, but I get lots of warnings...anyway,
won't do trees in actions or anything, but it does some decent work
for you.  Does most of the grunt work I'd say.

VERSION

0.1 October 12, 2006

USAGE

$ java v3me file.g

stdout will have the translation.

Use

$ java v3me -combined file.g

if you are converting a file with both parser/lexer in there!

HELP OUT

Please send updates to me directly if you make some nice additions. :)

WHAT IT DOES

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

