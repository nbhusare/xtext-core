/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.antlr.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.services.Bug301935ExTestLanguageGrammarAccess;

public class Bug301935ExTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Bug301935ExTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected org.eclipse.xtext.parser.antlr.parser.antlr.internal.InternalBug301935ExTestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.parser.antlr.parser.antlr.internal.InternalBug301935ExTestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DelegateModel";
	}
	
	public Bug301935ExTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Bug301935ExTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}