package dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<=5;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);

        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(1).add(3);

        adjList.get(2).add(1);
        adjList.get(2).add(5);

        adjList.get(3).add(1);
        adjList.get(3).add(4);

        adjList.get(4).add(3);
        adjList.get(4).add(5);

        adjList.get(5).add(2);
        adjList.get(5).add(4);

        int[] color = new int[6];
        Arrays.fill(color, -1);

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(0,0));
        color[0]=0;
        boolean isBipartite = true;

        while (!queue.isEmpty() && isBipartite){
            Pair pair= queue.poll();
            int parentColor = pair.color;
            int parentNode = pair.node;

            for (int node: adjList.get(parentNode)){
                if (color[node]==-1){

                    int newColor = parentColor==0 ? 1 : 0;
                    queue.offer(new Pair(node,newColor));
                    color[node]=newColor;

                }else {
                    //already visited neighbour
                    if (parentColor==color[node]){
                        isBipartite = false;
                        System.out.println("not a bipartite graph");
                        break;
                    }
                }
            }
        }


    }

    static class Pair{
        int node;
        int color;

        Pair (int node, int color){
            this.color=color;
            this.node=node;
        }
    }
}
