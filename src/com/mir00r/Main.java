package com.mir00r;

import com.mir00r.bfs.BiColoring;
import com.mir00r.dfs.CycleFinding;
import com.mir00r.dfs.EndoscopyLength;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        //RareElement rareElement = new RareElement();
        //rareElement.calculateRareElement();

//        Probability probability = new Probability();
//        probability.calculateProbability();

//        CycleFinding cycleFinding = new CycleFinding();
//        cycleFinding.findCycle();

//        EndoscopyLength endoscopyLength = new EndoscopyLength();
//        endoscopyLength.calculateWaterPipe();

        BiColoring biColoring = new BiColoring();
        biColoring.checkBipartiteGraph();

    }
}
