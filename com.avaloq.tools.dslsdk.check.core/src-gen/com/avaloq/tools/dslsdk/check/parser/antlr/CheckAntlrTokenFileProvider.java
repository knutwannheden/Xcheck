/*
* generated by Xtext
*/
package com.avaloq.tools.dslsdk.check.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CheckAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/avaloq/tools/dslsdk/check/parser/antlr/internal/InternalCheck.tokens");
	}
}
