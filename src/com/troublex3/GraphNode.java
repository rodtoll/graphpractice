package com.troublex3;

import java.util.ArrayList;

public class GraphNode<T> {
    public GraphNode(T val) {
        Value = val;
        Edges = new ArrayList<GraphEdge<T>>();
    }

    public T Value;

    public ArrayList<GraphEdge<T>> Edges;

    public void print() {
        System.out.println("Node: " + Value);
        System.out.println("Edges..");
        for (GraphEdge<T> edge : Edges) {
            System.out.println("0: " + edge.Edges.get(0).Value + " 1: " + edge.Edges.get(1).Value + " W: " + edge.Weight);
        }
        System.out.println();
    }
}
