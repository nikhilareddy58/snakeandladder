package com.example.model;

import java.util.Queue;

public class Board {
	
	private int boardSize;
	
	private int[][] grid;
	
	private Queue<Player> players;
	
	private int currentPlayer;
	
	private GameStatus gameStatus;

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	public Queue<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Queue<Player> players) {
		this.players = players;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}
	
	
}
