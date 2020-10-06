package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiutil.UpdateMoveReq;
import com.example.model.Board;
import com.example.service.GameService;

@RestController
public class GameController {
	
	@Autowired 
	GameService gameService;
	
	@RequestMapping(value="/createGame", method=RequestMethod.GET)
	public Board initializeBoard() {
		return gameService.initializeBoard();
	}
	
	@RequestMapping(value="/upadteMove", method=RequestMethod.POST)
	public Board upadteMove(@RequestBody UpdateMoveReq req) {
		return gameService.updateMove(req);
	}
	
	
}
