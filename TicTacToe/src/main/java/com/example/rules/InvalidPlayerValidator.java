package com.example.rules;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.apiutil.UpdateMoveReq;
import com.example.dao.PlayerDao;
import com.example.exceptions.RulesException;

public class InvalidPlayerValidator extends AbstractRuleValidator {
	
	@Autowired
	PlayerDao playerDao;

	@Override
	public void execute(UpdateMoveReq req) throws RulesException{
		
		if(playerDao.getPlayer(req.getPlayerId())==null) {
			throw new RulesException("Invalid player");
		}
		
	}

}
