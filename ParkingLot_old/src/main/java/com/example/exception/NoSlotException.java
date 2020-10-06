package com.example.exception;

public class NoSlotException extends RuntimeException{
	
	public NoSlotException() throws Exception {
		throw new Exception("no slot available");
	}

}
