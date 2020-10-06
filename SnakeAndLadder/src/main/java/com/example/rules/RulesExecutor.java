package com.example.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.apiutil.UpdateGameReq;


@Component
public class RulesExecutor {
	
	@Autowired
	DiceCountValidator diceValidator;
	
	@Autowired
	PlayerIdValidator playerIdValidator;
	
	public void executeAllUpdateMoveRules(UpdateGameReq req)  {
		
		diceValidator.setNextExecutor(playerIdValidator);
		diceValidator.executeRule(req);
		
		
	}

}
