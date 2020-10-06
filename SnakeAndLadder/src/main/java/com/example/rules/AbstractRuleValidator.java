package com.example.rules;

import com.example.apiutil.UpdateGameReq;
import com.example.exceptions.RulesException;

public abstract class AbstractRuleValidator {

	AbstractRuleValidator nextExecutor;

	public void setNextExecutor(AbstractRuleValidator nextExecutor) {
		this.nextExecutor = nextExecutor;
	}

	public void executeRule(UpdateGameReq req) {
		execute(req);
		if (this.nextExecutor != null)
			this.nextExecutor.executeRule(req);
	}

	public abstract void execute(UpdateGameReq req) throws RulesException;

}
