package dsa.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<=5;i++)
        {
            adjList.add(new ArrayList<>());
        }

        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(5).add(0);
        adjList.get(5).add(2);

        boolean[] vis = new boolean[adjList.size()];

        for (int i=0;i<=5;i++){
            if (!vis[i]){
                dfs(i,vis,adjList);
            }
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjList) {
        vis[node]=true;
        for (Integer neighbour: adjList.get(node)){
            if (!vis[neighbour]){
                dfs(neighbour,vis,adjList);
            }
        }
        stack.push(node);
    }
}
