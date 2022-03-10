package com.minesweeper.board;

import com.minesweeper.common.Location;
import com.minesweeper.tiles.Tile;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Board {
    //Attributes
    int rows, columns;
    Tile[][] board;

    //Constructor
    public Board(int rows,int columns, int numMines) {
        board = new Tile[(rows+1)][(columns+1)]; //Initializes the minesweeper board
        int grids = rows*columns;
        this.rows = board.length;
        this.columns = board.length;

        List<Boolean> mine = new ArrayList<Boolean>(Arrays.asList(new Boolean[numMines]));
            Collections.fill(mine, true); //Generates a list of TRUE values for each numMines
        List<Boolean> notMine = new ArrayList<Boolean>(Arrays.asList(new Boolean[(grids-numMines)]));
            Collections.fill(notMine, false); //Generates a list of FALSE values for the remaining tiles
        Stream<Boolean> isMineStream = Stream.of(mine, notMine).flatMap(Collection::stream); //Combines the two lists into one stream
        Collection<Boolean> isMineC = isMineStream.collect(Collectors.toList()); //Converts the stream into a collection
        List isMine = new ArrayList(isMineC); //Converts the collection back to a list
        Collections.shuffle(isMine); //Shuffles all the isMine values

        int index = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if ((row > 0) && (col > 0)) { //Used to assign the isMine values only to the non-label tiles
                    boolean mineStat = (boolean) isMine.get(index); //Used to retrieve isMine values and typecast them into boolean
                    Tile newTile = new Tile(new Location(row, col), true, mineStat, false, false);
                    board[row][col] = newTile; //Initialize tile attributes
                    ++index;
                }
            }
        }
    }

    //Method
    public void showBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col =  0; col < board[row].length; col++) {

                if ((row == 0) && (col == 0)){
                    System.out.print("     ");
                    /*
                    if (board.length < 10) {
                        System.out.print("     ");
                    }
                    else {
                        System.out.print("      ");
                    }

                     */
                }

                else if ((row == 0) && (col > 0)) {
                    System.out.print("[ " + col + " ]");
                    /*
                    if ((col < 10) && (board.length > 9)) {
                        System.out.print("[  " + col + " ]");
                    }
                    else {
                        System.out.print("[ " + col + " ]");
                    }

                     */
                }

                else if ((col == 0) && (row > 0)) {
                    System.out.print("[ " + row + " ]");
                    /*
                    if ((row < 10) && (board.length > 9)) {
                        System.out.print("[  " + row + " ]");
                    }
                    else {
                        System.out.print("[ " + row + " ]");
                    }
                    */
                }

                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == false)) {
                    System.out.print("[ * ]");
                    /*
                    if (board.length < 10) {
                        System.out.print("[ * ]");
                    }
                    else {
                        System.out.print("[  * ]");
                    }

                     */
                }

                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == true && (board[row][col].isMine() == false))) {
                    System.out.print("[   ]");
                    /*
                    if (board.length < 10) {
                        System.out.print("[ B ]");
                    }
                    else {
                        System.out.print("[  B ]");
                    }

                     */

                }

                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == true && (board[row][col].isMine() == true))) {
                    System.out.print("[ B ]");
                    /*
                    if (board.length < 10) {
                        System.out.print("[ B ]");
                    }
                    else {
                        System.out.print("[  B ]");
                    }

                     */

                }

                else if ((row > 0) && (col > 0) && (board[row][col].isRevealed() == true && (board[row][col].isFlag() == true))) {
                    System.out.print("[ F ]");
                    /*
                    if (board.length < 10) {
                        System.out.print("[ B ]");
                    }
                    else {
                        System.out.print("[  B ]");
                    }

                     */

                }
            }
            System.out.println();
        }
    }

}
