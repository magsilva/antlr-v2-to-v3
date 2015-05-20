import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.TokenRewriteStream;

public class v3me {
	public static final String VERSION="0.2";
	public static void main(String[] args) throws Exception {
		boolean combined=false;
		if ( args.length==0 ) {
			System.err.println("usage: java v3me file.g");
			return;
		}
		int i=0;
		if ( args[i].startsWith("-") ) {
			if ( args[i].equals("-combined") ) {
				combined=true;
			}
			i++;
		}
		String filename = args[i];
		ANTLRLexer lexer = new ANTLRLexer(new ANTLRFileStream(filename));
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		ANTLRParser parser = new ANTLRParser(tokens);
		parser.setTokenBuffer(tokens);
		parser.setCombined(combined);
		parser.antlrGrammar();
		System.out.print(tokens.toString()); // emit after changes
	}
}
