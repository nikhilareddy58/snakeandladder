package com.example.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.apiutil.UpdateMoveReq;

@Component
public class RulesExecutor {
	
	@Autowired
	InvalidMoveValidator invalidMoveValidator;
	
	@Autowired
	InvalidPlayerValidator invalidPlayerValidator;
	
	public  void executeRules(UpdateMoveReq req) {
		
		invalidPlayerValidator.setAbstractRuleValidator(invalidMoveValidator);
		invalidPlayerValidator.execute(req);
	}

}
