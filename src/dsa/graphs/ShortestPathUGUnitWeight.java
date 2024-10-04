package dsa.graphs;

import com.sun.source.tree.ArrayAccessTree;

import java.util.*;

public class ShortestPathUGUnitWeight {

    //G-28. Shortest Path in Undirected Graph with Unit Weights
    //https://www.youtube.com/watch?v=C4gxoTaI71U&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=29

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int totalNodes = 5;

        for (int i=0;i<5;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(0).add(4);

        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(1).add(4);

        adjList.get(2).add(1);
        adjList.get(2).add(3);

        adjList.get(3).add(2);
        adjList.get(3).add(4);

        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(4).add(3);

        Queue<Pair> queue = new LinkedList<>();
        int[] dist = new int[totalNodes];
        Arrays.fill(dist,Integer.MAX_VALUE);

        //let's say src is 0

        queue.offer(new Pair(0,0));
        dist[0]=0;

        while (!queue.isEmpty()){
            Pair pair = queue.poll();

            for (int neighbour: adjList.get(pair.node)){
                int d1 = dist[neighbour];
                int d2 = pair.distance + 1;

                if (d2<d1){
                    dist[neighbour]=d2;
                    queue.offer(new Pair(neighbour,d2));
                }

            }
        }

        System.out.println(Arrays.toString(dist));



    }

    static class Pair{
        int node;
        int distance;

        Pair (int node, int distance){
            this.node=node;
            this.distance=distance;
        }
    }

}
