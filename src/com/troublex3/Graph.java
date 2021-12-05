package com.troublex3;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Graph<T> {

    protected Hashtable<T, GraphNode<T>> nodes;

    public Graph() {
        nodes = new Hashtable<T, GraphNode<T>>();
    }

    public void loadGraph(T edges[][], float edgeWeights[]) {
        // Build all the graph nodes
        for (int x = 0; x < edges.length; x++) {
            for (int subIndex = 0; subIndex < 2; subIndex++) {
                if (!nodes.containsKey(edges[x][subIndex])) {
                    nodes.put(edges[x][subIndex], new GraphNode<T>(edges[x][subIndex]));
                }
            }
        }

        // Add all the edges
        for (int x = 0; x < edges.length; x++) {
            GraphNode<T> first = nodes.get(edges[x][0]);
            GraphNode<T> second = nodes.get(edges[x][1]);

            GraphEdge<T> newEdge = new GraphEdge<T>(edgeWeights[x], first, second);
            first.Edges.add(newEdge);
            second.Edges.add(newEdge);
        }
    }

    public void printGraph() {
        System.out.println("Printing graph..");
        for (T key : nodes.keySet()) {
            GraphNode<T> node = nodes.get(key);
            node.print();
        }
    }

    protected void printDFS(GraphNode<T> startNode, HashSet<T> visitedNodes) {
        if(startNode == null) {
            return;
        }
        if(visitedNodes.contains(startNode.Value)) {
            return;
        }

        startNode.print();
        visitedNodes.add(startNode.Value);

        for(GraphEdge<T> edge: startNode.Edges) {
            printDFS(edge.getOtherEnd(startNode), visitedNodes);
        }
    }

    public void printDFS() {
        System.out.println("Printing graph DFS");
        HashSet<T> visitedNodes = new HashSet<T>();
        GraphNode<T> firstNode = null;
        for (T key : nodes.keySet()) {
            firstNode = nodes.get(key);
            break;
        }
        printDFS(firstNode, visitedNodes);
    }

    public void printBFS() {

    }
}
