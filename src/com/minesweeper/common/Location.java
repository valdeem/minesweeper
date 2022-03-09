package com.minesweeper.common;
import java.util.*;

public class Location {
    //Attributes
    int row, col;

    //Constructor
    public Location(int row, int col){
        this.row = row;
        this.col = col;
    }

    //Methods
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return row == location.row && col == location.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
