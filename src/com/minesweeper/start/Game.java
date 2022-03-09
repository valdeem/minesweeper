package com.minesweeper;
import com.minesweeper.board.Board;
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
        System.out.print("Set the game difficulty level ");
        System.out.print("(e)asy, (a)verage, (d)ifficult): ");
        scan.nextLine();
        String level = scan.nextLine();
        System.out.println("");

        Board boardA = new Board(rows, columns, level);
        boardA.showBoard();
    }
}
