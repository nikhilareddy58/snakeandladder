package com.example.rules;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.apiutil.UpdateMoveReq;
import com.example.exceptions.RulesException;
import com.example.service.GameService;

public class InvalidMoveValidator extends AbstractRuleValidator{
	
	@Autowired
	GameService gameService;

	@Override
	public void execute(UpdateMoveReq req) throws RulesException{
		
		if(req.getRow()<0 || req.getRow()>=gameService.BOARD_SIZE) {
			throw new RulesException("Row chosen is invalid");
		}
		if(req.getCol()<0 || req.getCol()>=gameService.BOARD_SIZE) {
			throw new RulesException("Column chosen is invalid");
		}
		
	}

}
