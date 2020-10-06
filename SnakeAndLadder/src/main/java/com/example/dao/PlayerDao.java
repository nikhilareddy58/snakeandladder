package com.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;

import org.springframework.stereotype.Repository;

import com.example.model.Player;

@Repository
public class PlayerDao {

	
	public static HashMap<Integer, Player> playerMap = new HashMap<>();
	
	public void initializePlayers(Queue<Player> players) {
		
		for(Player player:players) {
			playerMap.put(player.getUserId(), player);
		}
		
	}
	
	public Player getPlayer(int playerId) {
		return playerMap.get(playerId);
		
	}
	
	public void upadtePlayer(Player player) {
		playerMap.put(player.getUserId(), player);
	}
	
	
}
