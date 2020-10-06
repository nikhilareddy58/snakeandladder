package com.example.exceptions;

public class InvalidDiceCountException extends RuntimeException {

	public InvalidDiceCountException(String message) {
		super(message);
	}

}
