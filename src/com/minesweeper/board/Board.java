package com.minesweeper.board;

import com.minesweeper.common.Location;
import com.minesweeper.tiles.Tile;
import java.util.*;

public class Board {
    //Attributes
    int rows, columns;
    int bombCounter;
    Tile[][] board;

    //Constructor
    public Board(int rows,int columns, String level) {
        board = new Tile[(rows+1)][(columns+1)];
        this.rows = board.length;
        this.columns = board.length;
        Random x = new Random();

        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col < board.length; col++) {
                Tile newTile = new Tile(new Location(row,col), x.nextBoolean(), false, false);
                    if (newTile.isBomb() == true) {
                        bombCounter++;
                    }
                    else {
                        bombCounter = bombCounter;
                    }
                    board[row][col] = newTile;

            }
        }
    }

    //Method
    public void showBoard() {
        for(int row = 0; row < board.length; row++) {
            for (int col =  0; col < board.length; col++) {
                if((row == 0) && (col == 0)){
                    System.out.print("     ");
                }
                else if ((row == 0) && (col > 0)){
                    System.out.print("[ " + col + " ]");
                }
                else if ((col == 0) && (row > 0)){
                    System.out.print("[ " + row + " ]");
                }
                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == false)) {
                    System.out.print("[ * ]");
                }
                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == true)) {
                    System.out.print("[ B ]");
                }
            }
            System.out.println();
        }
    }
}
