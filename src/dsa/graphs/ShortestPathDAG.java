package dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathDAG {

    //Shortest Path in Directed Acyclic Graph - Topological Sort

    //TC : O(v+e) {topological sort} + O(v+e) {while(this will run for total nodes) + for(this will run for each edge)}

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        int totalNodes = 7;
        boolean[] vis = new boolean[totalNodes];

        for (int i=0;i<totalNodes;i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(new Pair(1,2));

        adjList.get(1).add(new Pair(3,1));

        adjList.get(2).add(new Pair(3,3));

        adjList.get(4).add(new Pair(0,3));
        adjList.get(4).add(new Pair(2,1));

        adjList.get(5).add(new Pair(4,1));

        adjList.get(6).add(new Pair(4,2));
        adjList.get(6).add(new Pair(5,3));

        for (int i=0;i<totalNodes;i++){
            if (!vis[i]){
                topoSort(vis,i,adjList);
            }
        }

        shortestPath(adjList,totalNodes);
    }

    private static void shortestPath(ArrayList<ArrayList<Pair>> adjList, int totalNodes) {
        int[] distance = new int[totalNodes];
        Arrays.fill(distance, Integer.MAX_VALUE);
        int source = stack.peek();
        while (!stack.isEmpty()){
            int target = stack.pop();
            if (target==source){
                distance[target]=0;
            }
            //evaluate neighbours

            for (Pair pair: adjList.get(target)){
                if (distance[pair.node]==Integer.MAX_VALUE){
                    distance[pair.node]= pair.weight + distance[target];
                }else {
                    distance[pair.node] = Math.min(distance[pair.node],distance[target]+ pair.weight);
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }

    private static void topoSort(boolean[] vis, int node, ArrayList<ArrayList<Pair>> adjList) {
        vis[node] = true;

        for (Pair pair: adjList.get(node)){
            if (!vis[pair.node]){
                topoSort(vis, pair.node,adjList);
            }
        }

        stack.push(node);

    }

    static class Pair{
        int node;
        int weight;

        Pair (int node, int weight){
            this.node=node;
            this.weight=weight;
        }
    }


}
