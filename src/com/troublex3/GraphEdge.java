package com.troublex3;

import java.util.ArrayList;

public class GraphEdge<T> {
    GraphEdge(float weight, GraphNode<T> firstNode, GraphNode<T> secondNode) {
        Weight = weight;
        Edges = new ArrayList<GraphNode<T>>();
        Edges.add(0,firstNode);
        Edges.add(1,secondNode);
    }
    public ArrayList<GraphNode<T>> Edges;
    public float Weight;

    public GraphNode getOtherEnd(GraphNode<T> sourceNode) {
        if(Edges.get(0) == sourceNode) {
            return Edges.get(1);
        } else {
            return Edges.get(0);
        }
    }
}
