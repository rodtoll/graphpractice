package com.troublex3;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Graph<Character> newGraph = new Graph();
        newGraph.loadGraph(new Character[][] {{'P','H'}, {'P','A'}, {'A','R'}, {'R','G'},
                {'G','B'}, {'B','D'}, {'D','F'}, {'F','S'},{'F','B'}, {'S','A'}, {'S','H'}},
                new float[] {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f });
        //newGraph.loadGraph(new Character[][] {{'A','B'}, {'B','C'}}, new float[] {1.0f,2.0f});
        //newGraph.printGraph();
//        newGraph.printDFSFrom('G');
        newGraph.printBFSFrom('G');
    }

    static void depthFirstTraversal(int map[][]) {
    }

    static int calculateManhatten(int startX, int startY, int endX, int endY) {
        return Math.abs(endX-startX) + Math.abs(endY - startY);
    }
}
