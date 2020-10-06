package com.example.service;

import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PlayerDao;
import com.example.model.Player;

@Service
public class PlayerService {
	
	@Autowired 
	PlayerDao playerDao;
	
	
	public void initializePlayers(Queue<Player> players) {
		playerDao.createPlayers(players);
	}
	
	

}
