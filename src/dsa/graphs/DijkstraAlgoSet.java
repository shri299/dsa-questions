package dsa.graphs;

import java.util.ArrayList;
import java.util.TreeSet;

public class DijkstraAlgoSet {

    public static void main(String[] args) {

    }

    public static void algo(ArrayList<ArrayList<ArrayList<Integer>>> adjList, int totalNodes){
        TreeSet<Pair> set = new TreeSet<>((node1, node2) -> {
            if (node1.node != node2.node && node1.distance == node2.distance){
                return 1;
            }
            return node1.distance - node2.distance;
        });

        int[] dist = new int[totalNodes];
        dist[0]=0;
        set.add(new Pair(0,0));

        while (!set.isEmpty()){
            Pair pair = set.pollFirst();

            for (ArrayList<Integer> neighbours : adjList.get(pair.node)){
                if (neighbours.get(0) + pair.distance<dist[neighbours.get(1)]){
                    if (dist[neighbours.get(1)]!=Integer.MAX_VALUE){
                        set.remove(new Pair(dist[neighbours.get(1)],neighbours.get(1)));
                        set.add(new Pair(neighbours.get(0)+pair.distance,neighbours.get(1)));
                        dist[neighbours.get(1)] = neighbours.get(0)+pair.distance;
                    }
                }
            }
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
