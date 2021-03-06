/*
 * generated by Xtext 2.13.0
 */
package network.regen.ceres.parser.antlr;

import network.regen.ceres.parser.antlr.internal.InternalCeresParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class CeresTokenSource extends AbstractIndentationTokenSource {

	public CeresTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalCeresParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalCeresParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalCeresParser.RULE_END;
	}

}
