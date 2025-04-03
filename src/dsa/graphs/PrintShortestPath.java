package dsa.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrintShortestPath {

    public static void main(String[] args) {

    }

    public static void printShortestPath(List<List<Pair>> adjList, int source, int destination){
        int[] dist = new int[adjList.size()];
        int[] parent = new int[adjList.size()];
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)->x.distance-y.distance);

        pq.offer(new Pair(0,source));
        dist[source]=0;
        parent[source]=source;

        while (!pq.isEmpty()){
            Pair current = pq.poll();
            for (Pair neighbours : adjList.get(current.node)){
                if(current.distance+neighbours.distance<dist[neighbours.node]){
                    dist[neighbours.node]=current.distance+neighbours.distance;
                    parent[neighbours.node]= current.node;
                    pq.offer(new Pair(dist[neighbours.node], neighbours.node));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        int index = destination;
        while (parent[index]!=index){ //we did this because only for source index, the index and parent[index] will be
            // equal, and that's exactly where we need to end the loop. Start from destination and backtrack it to the source.
            ans.add(index);
            index = parent[index];
        }
    }

    static class Pair{
        int distance;
        int node;

        public Pair (int distance, int node){
            this.distance=distance;
            this.node=node;
        }
    }
}
