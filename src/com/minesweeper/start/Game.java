package com.minesweeper;
import com.minesweeper.board.Board;
import com.minesweeper.tiles.Tile;

import java.util.*;

public class Game {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there! Let's play MINESWEEPER!!");
        System.out.println("WELCOME TO THE GAME!");
        System.out.print("Type the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Type the number of columns: ");
        int columns = scan.nextInt();
        System.out.print("Set the number of mines ");
        System.out.print("10 <= mimes <= 50: ");
        int level = scan.nextInt();
        System.out.println("");

        Board boardA = new Board(rows, columns, level);
        boardA.showBoard();


    }
}
