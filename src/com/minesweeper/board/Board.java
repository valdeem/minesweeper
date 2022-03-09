package com.minesweeper.board;

import com.minesweeper.common.Location;
import com.minesweeper.tiles.Tile;

public class Board {
    //Attributes
    //int rows, columns;


    //Constructor
    public Board(int rows,int columns) {
        //check tile attributes
        Tile[][] board = new Tile[rows+1][columns+1];
        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= columns; col++) {
                Tile newTile = new Tile(new Location(row,col), false);
                        board[row][col] = row + col;
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
    public void showBoard(int rows, int columns) {
        Tile[][] board = new Tile[rows+1][columns+1];

        for(Tile[] row : board) {
            for(Tile newTile : row) {
                System.out.print(board);
            }
            System.out.println();
        }
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
