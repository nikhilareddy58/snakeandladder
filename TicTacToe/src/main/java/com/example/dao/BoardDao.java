package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	
	private static int [][] boardMatrix;
	
    public void initializeBoard(int size) {
    	boardMatrix=new int[size][size];
    }
    
    public void updateBoard(int i, int j, int value) {
    	boardMatrix[i][j]=value;
    }
    
    public int getBoardValue(int i, int j) {
    	return boardMatrix[i][j];
    }
    
    public int[][] getBoard(){
    	return boardMatrix;
    }

}
