ANTLRV3_PATH=/home/magsilva/t/antlr-3.5.2-complete-no-st3.jar

default: clean all

clean:
	rm -f *.class *.tokens
	rm -f ANTLRLexer.java ANTLRParser.java

all:
	java -cp ${ANTLRV3_PATH} org.antlr.Tool ANTLR.g
	javac -cp ${ANTLRV3_PATH} *.java
