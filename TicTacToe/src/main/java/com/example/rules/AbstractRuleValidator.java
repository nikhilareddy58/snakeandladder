package com.example.rules;

import com.example.apiutil.UpdateMoveReq;

public abstract class AbstractRuleValidator {
	
	private AbstractRuleValidator nextRuleValidator;


	public void setAbstractRuleValidator(AbstractRuleValidator abstractRuleValidator) {
		this.nextRuleValidator = abstractRuleValidator;
	}
	
	public void executeRule(UpdateMoveReq updateMoveReq) {
		execute(updateMoveReq);
		if(this.nextRuleValidator!=null) {
			this.nextRuleValidator.executeRule(updateMoveReq);
		}
		
	}
	
	public abstract void execute(UpdateMoveReq updateMoveReq) ;


}
