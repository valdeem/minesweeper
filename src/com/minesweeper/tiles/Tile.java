package com.minesweeper.tiles;
import com.minesweeper.common.Location;

public class Tile {
    private final Location location;
    private boolean isRevealed;
    private boolean isBomb;
    private boolean isFlag;

    public Tile(Location location, boolean isRevealed) {
        this.location = location;
        this.isRevealed = false;
        this.isBomb = false;
        this.isFlag = false;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "location=" + location +
                ", isRevealed=" + isRevealed +
                ", isBomb=" + isBomb +
                ", isFlag=" + isFlag +
                '}';
    }
}
