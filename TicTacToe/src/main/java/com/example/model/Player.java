package com.example.model;

public class Player {

	private int playerId;

	private String name;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(int playerId, String name) {
		this.playerId = playerId;
		this.name = name;
	}

}
