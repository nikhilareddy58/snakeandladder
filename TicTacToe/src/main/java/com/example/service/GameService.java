package com.example.service;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiutil.UpdateMoveReq;
import com.example.dao.BoardDao;
import com.example.model.Board;
import com.example.model.GameStatus;
import com.example.model.Player;
import com.example.rules.RulesExecutor;

@Service
public class GameService {
	
	public final int BOARD_SIZE=3;
	static Queue<Player> players;
	static Board board;
	
	@Autowired
	PlayerService playerService;
	
	@Autowired
	BoardDao boardDao;
	
	@Autowired
	RulesExecutor rulesExecutor;
	
	public Board initializeBoard() {
		
		board= new Board();
		players= new LinkedList<Player>();
		
		//initialize players
		
		
		players.add(new Player(1,"Nik1"));
		players.add(new Player(2,"Nik2"));
		players.add(new Player(3,"Nik3"));
		players.add(new Player(4,"Nik4"));
		players.add(new Player(5,"Nik5"));

		board.setPlayers(players);
		playerService.initializePlayers(players);
		
		
		//initialize board states
		board.setGrid(new int[BOARD_SIZE][BOARD_SIZE]);
		boardDao.initializeBoard(BOARD_SIZE);
		
		//set game status
		board.setGameStatus(GameStatus.INPROGRESS);
		
		//setcurrent player
		board.setCurrentPlayer(getCurrentPlayer());
		
		//setBoardSize
		board.setBoardSize(BOARD_SIZE);
		
		return board;
	}
	
	private int getCurrentPlayer() {
		return players.peek().getPlayerId();
	}
	
	private void updateCurrentPlayer() {
		players.add(players.poll());
	}

	public Board updateMove(UpdateMoveReq req) {
		
		//execute rules
		rulesExecutor.executeRules(req);
		
		int player=req.getPlayerId();
		int i=req.getRow();
		int j=req.getCol();
		//update board
		boardDao.updateBoard(i, j, player);
		
		//update next player
		updateCurrentPlayer();
		
		//check if game is completed
		if(isCompleted(player, i, j)) {
		  this.board.setGameStatus(GameStatus.COMPLETED);
		}
		
		return board;
	}
	
	private boolean isCompleted(int val,int i, int j) {
		int[][] tempboard=boardDao.getBoard();
		for(int x=0;x<BOARD_SIZE;x++) {
			if(tempboard[i][x]!=val)
				return false;
		}
		for(int x=0;x<BOARD_SIZE;x++) {
			if(tempboard[x][j]!=val)
				return false;
		}
		
		if(i==j) {
			
		}
		return true;
	}
}
