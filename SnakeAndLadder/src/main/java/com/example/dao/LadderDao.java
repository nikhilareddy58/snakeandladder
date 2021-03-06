package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Ladder;

@Repository
public class LadderDao {

	public static HashMap<Integer, Integer> ladderMap = new HashMap<>();

	public void initializeLadders(List<Ladder> ladders) {

		for (Ladder ladder : ladders) {
			ladderMap.put(ladder.getStart(), ladder.getEnd());
		}

	}

	public void updateLadder(int start, int end) {
		ladderMap.put(start, end);
	}

	public int getLadder(int start) {
		return ladderMap.get(start);
	}

	public boolean isLadder(int start) {
		return ladderMap.containsKey(start);
	}

}
