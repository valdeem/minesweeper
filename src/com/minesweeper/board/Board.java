package com.minesweeper.board;

import com.minesweeper.common.Location;
import com.minesweeper.tiles.Tile;

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


        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= columns; col++) {
                Tile newTile = new Tile(new Location(row,col), false, false, false);
                    if (newTile.isBomb()==false) {
                        bombCounter++;
                    }
                    else {
                        bombCounter = bombCounter;
                    }
                    board[row][col] = newTile;

                /*
                if((row == 0) && (col == 0)){
                    board[row][col] = "     ";
                }
                else if ((row == 0) && (col > 0)){
                    board[row][col] = "[ " + col + " ]";
                }
                else if ((col == 0) && (row > 0)){
                    board[row][col] = "[ " + row + " ]";
                }
                else {
                    board[row][col] = "[ * ]";
                }

                 */
            }
        }
    }
    //Method
    public void showBoard() {
        for(Tile[] t : board) {
            for(Tile tile : t) {
                System.out.print(tile);
            }
            System.out.println();
        }
        System.out.println(bombCounter);
        /*
        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= columns; col++) {
                if((row == 0) && (col == 0)){
                    System.out.print(board[row][col]);
                }
                else if ((row == 0) && (col > 0)){
                    System.out.print(board[row][col]);
                }
                else if ((col == 0) && (row > 0)){
                    System.out.print(board[row][col]);
                }
                else {
                    System.out.print(board[row][col]);
                }
            }
            System.out.println("");
        }

         */
    }
}
