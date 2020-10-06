package com.example.model;

public class Player {
	
	private int userId;
	
	private int position;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Player(int userId, int position) {
		this.userId = userId;
		this.position = position;
	}
	
	
	
}
