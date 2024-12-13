package dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    public static void main(String[] args) {

    }

    public static int[] algo(int nodes, ArrayList<ArrayList<ArrayList<Integer>>> adjList, int startNode){
        int[] distance = new int[nodes];
        Arrays.fill(distance,Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
        distance[startNode]=0;
        pq.add(new Pair(0,startNode));

        while (!pq.isEmpty()){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (ArrayList<Integer> neighbours : adjList.get(node)){
                int weight = neighbours.get(0);
                int neighbour = neighbours.get(1);

                if (dis+weight<distance[neighbour]){
                    distance[neighbour] = dis+weight;
                    pq.offer(new Pair(distance[neighbour],neighbour));
                }
            }
        }

        return distance;
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
