package com.minesweeper.tiles;
import com.minesweeper.common.Location;

public class Tile {
    private final Location location;
    private boolean isRevealed;
    private boolean isMine;
    private boolean isFlag;
    private boolean mineCounter;

    public Tile(Location location, boolean isRevealed, boolean isMine, boolean isFlag, boolean mineCounter) {
        this.location = location;
        this.isRevealed = isRevealed;
        this.isMine = isMine;
        this.isFlag = isFlag;
        this.mineCounter = mineCounter;
    }

    public boolean isMineCounter() {
        return mineCounter;
    }

    public void setMineCounter(boolean mineCounter) {
        this.mineCounter = mineCounter;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "location=" + location.getRow() + location.getCol() +
                ", isRevealed=" + isRevealed +
                ", isBomb=" + isMine +
                ", isFlag=" + isFlag +
                "}  ";
    }
}
