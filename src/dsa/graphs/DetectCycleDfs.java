package dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleDfs {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nodeList = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<=5;i++)
        {
            nodeList.add(new ArrayList<>());
        }

        nodeList.get(1).add(2);
        nodeList.get(1).add(3);

        nodeList.get(2).add(1);
        nodeList.get(2).add(4);
        nodeList.get(2).add(5);

        nodeList.get(3).add(1);
        nodeList.get(3).add(5);

        nodeList.get(4).add(2);

        nodeList.get(5).add(2);
        nodeList.get(5).add(3);

        traversal(1,5,nodeList);
    }

    public static void traversal(int startNode, int totalNodes, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visitedArray = new boolean[totalNodes+1];
        visitedArray[0] = true; //we have nothing to do with this index
        traverse(visitedArray,adjList,startNode,-1);
    }

    public static void traverse(boolean[] visitedArray, ArrayList<ArrayList<Integer>> adjList, int node,int parent) {
        visitedArray[node]=true;
        for (Integer neighbourNodes : adjList.get(node)){
            if(visitedArray[neighbourNodes] && neighbourNodes!=parent){
                System.out.println("cycle detected");
                return;
            } else if (!visitedArray[neighbourNodes]) {
                traverse(visitedArray,adjList,neighbourNodes,node);
            }
        }
    }

    static class Pair{
        int node;
        int parent;

        public Pair (int node, int parent){
            this.node=node;
            this.parent=parent;
        }
    }
}
