package com.example.rules;

import org.springframework.stereotype.Component;

import com.example.apiutil.UpdateGameReq;
import com.example.exceptions.RulesException;

@Component
public class DiceCountValidator extends AbstractRuleValidator{

	@Override
	public void execute(UpdateGameReq req) throws RulesException{
		
		if(req.getDiceValue()>6 || req.getDiceValue()<1)
			throw new RulesException("Dice count entered in the input is invalid!!");
		
	}
	
	

}
