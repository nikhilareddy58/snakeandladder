package com.example.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.apiutil.UpdateGameReq;
import com.example.dao.PlayerDao;
import com.example.exceptions.RulesException;

@Component
public class PlayerIdValidator extends AbstractRuleValidator {
	
	@Autowired
	PlayerDao player;
	
	@Override
	public void execute(UpdateGameReq req) throws RulesException{
		
		if(player.getPlayer(req.getPlayerId())==null)
			throw new RulesException("Player ID entered in the input is invalid!!");
		
	}

}
