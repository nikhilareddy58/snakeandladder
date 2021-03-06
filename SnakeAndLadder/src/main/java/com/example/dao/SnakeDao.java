package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Snake;

@Repository
public class SnakeDao {

	public static HashMap<Integer, Integer> snakeMap = new HashMap<>();

	public void initializeSnakes(List<Snake> snakes) {

		for (Snake snake : snakes) {
			snakeMap.put(snake.getStart(), snake.getEnd());
		}

	}

	public void updateSnake(int start, int end) {
		snakeMap.put(start, end);
	}

	public int getSnake(int start) {
		return snakeMap.get(start);
	}

	public boolean isSnake(int start) {
		return snakeMap.containsKey(start);
	}
}
