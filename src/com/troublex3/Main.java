package com.troublex3;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Graph<Character> newGraph = new Graph();
        newGraph.loadGraph(new Character[][] {{'A','B'}, {'B','C'}}, new float[] {1.0f,2.0f});
        newGraph.printGraph();
        newGraph.printDFS();
    }

    static void depthFirstTraversal(int map[][]) {
    }

    static int calculateManhatten(int startX, int startY, int endX, int endY) {
        return Math.abs(endX-startX) + Math.abs(endY - startY);
    }
}
