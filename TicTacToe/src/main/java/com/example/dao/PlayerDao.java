package com.example.dao;

import java.util.HashMap;
import java.util.Queue;

import org.springframework.stereotype.Repository;

import com.example.model.Player;

@Repository
public class PlayerDao {

	static HashMap<Integer, Player> playersMap = new HashMap<>();

	public void createPlayers(Queue<Player> players) {

		for (Player player : players) {
			playersMap.put(player.getPlayerId(), player);
		}

	}

	public void updatePlayer(Player player) {
		playersMap.put(player.getPlayerId(), player);
	}

	public Player getPlayer(int playerId) {
		return playersMap.get(playerId);
	}

}
