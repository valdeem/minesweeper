package com.minesweeper.common;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MineRandomizer {
    int grids, numMines;

    public MineRandomizer (int grids, int numMines) {
        this.grids = grids;
        this.numMines = numMines;
    }


    public List generateMines () {
        List<Boolean> mine = new ArrayList<Boolean>(Arrays.asList(new Boolean[numMines]));
        Collections.fill(mine, true); //Generates a list of TRUE values for each numMines
        List<Boolean> notMine = new ArrayList<Boolean>(Arrays.asList(new Boolean[(grids-numMines)]));
        Collections.fill(notMine, false); //Generates a list of FALSE values for the remaining tiles
        Stream<Boolean> isMineStream = Stream.of(mine, notMine).flatMap(Collection::stream); //Combines the two lists into one stream
        Collection<Boolean> isMineC = isMineStream.collect(Collectors.toList()); //Converts the stream into a collection
        List isMine = new ArrayList(isMineC); //Converts the collection back to a list
        Collections.shuffle(isMine); //Shuffles all the isMine values

        return isMine;
    }
}
