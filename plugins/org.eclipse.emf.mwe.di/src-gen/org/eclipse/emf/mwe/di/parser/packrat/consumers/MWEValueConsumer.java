/*
* generated by Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.RuleCall;

import org.eclipse.xtext.parser.packrat.consumers.IElementConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;

import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ValueElements;

public final class MWEValueConsumer extends NonTerminalConsumer {

	private ValueElements rule;	

	private INonTerminalConsumer complexValueConsumer;

	private INonTerminalConsumer idRefConsumer;

	private INonTerminalConsumer simpleValueConsumer;

	private INonTerminalConsumer workflowRefConsumer;

	private IElementConsumer alternatives$1$Consumer;

	private IElementConsumer ruleCall$4$Consumer;

	private IElementConsumer ruleCall$5$Consumer;

	private IElementConsumer ruleCall$6$Consumer;

	private IElementConsumer ruleCall$7$Consumer;

	protected class Alternatives$1$Consumer extends AlternativesConsumer {
		
		protected Alternatives$1$Consumer(final Alternatives alternatives) {
			super(alternatives);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(ruleCall$4$Consumer);
			acceptor.accept(ruleCall$5$Consumer);
			acceptor.accept(ruleCall$6$Consumer);
			acceptor.accept(ruleCall$7$Consumer);
		}
	}

	protected class RuleCall$4$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$4$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume() throws Exception {
			return consumeNonTerminal(simpleValueConsumer, null, false, false, false, getElement());
		}
	}

	protected class RuleCall$5$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$5$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume() throws Exception {
			return consumeNonTerminal(complexValueConsumer, null, false, false, false, getElement());
		}
	}

	protected class RuleCall$6$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$6$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume() throws Exception {
			return consumeNonTerminal(idRefConsumer, null, false, false, false, getElement());
		}
	}

	protected class RuleCall$7$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$7$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume() throws Exception {
			return consumeNonTerminal(workflowRefConsumer, null, false, false, false, getElement());
		}
	}

	public MWEValueConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
	}
	
	@Override
	protected int doConsume() throws Exception {
		return alternatives$1$Consumer.consume();
	}

	public ValueElements getRule() {
		return rule;
	}
	
	public void setRule(ValueElements rule) {
		this.rule = rule;
		
		alternatives$1$Consumer = new Alternatives$1$Consumer(rule.eleAlternatives());
		ruleCall$4$Consumer = new RuleCall$4$Consumer(rule.ele000ParserRuleCallSimpleValue());
		ruleCall$5$Consumer = new RuleCall$5$Consumer(rule.ele001ParserRuleCallComplexValue());
		ruleCall$6$Consumer = new RuleCall$6$Consumer(rule.ele01ParserRuleCallIdRef());
		ruleCall$7$Consumer = new RuleCall$7$Consumer(rule.ele1ParserRuleCallWorkflowRef());
	}
	
	@Override
	protected AbstractRule getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected EClassifier getDefaultType() {
		return getGrammarElement().getType().getType();
	}
	
	public void setComplexValueConsumer(INonTerminalConsumer complexValueConsumer) {
		this.complexValueConsumer = complexValueConsumer;
	}
	
	public void setIdRefConsumer(INonTerminalConsumer idRefConsumer) {
		this.idRefConsumer = idRefConsumer;
	}
	
	public void setSimpleValueConsumer(INonTerminalConsumer simpleValueConsumer) {
		this.simpleValueConsumer = simpleValueConsumer;
	}
	
	public void setWorkflowRefConsumer(INonTerminalConsumer workflowRefConsumer) {
		this.workflowRefConsumer = workflowRefConsumer;
	}
	
}