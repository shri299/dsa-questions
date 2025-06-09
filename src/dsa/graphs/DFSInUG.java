package dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSInUG {

    //suppose the graph starts from and goes till 10
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

        System.out.println(nodeList);
        System.out.println(traversal(1,5,nodeList));
    }

    public static List<Integer> traversal(int startNode, int totalNodes, ArrayList<ArrayList<Integer>> adjList){
        List<Integer> ans = new ArrayList<>();
        boolean[] visitedArray = new boolean[totalNodes+1];
        visitedArray[0] = true; //we have nothing to do with this index
        traverse(ans,visitedArray,adjList,startNode);
        return ans;
    }

    private static void traverse(List<Integer> ans, boolean[] visitedArray, ArrayList<ArrayList<Integer>> adjList, int node) {
        ans.add(node);
        visitedArray[node]=true;
        for (Integer neighbourNodes : adjList.get(node)){
            if (!visitedArray[neighbourNodes]){
                traverse(ans,visitedArray,adjList,neighbourNodes);
            }
        }
    }


}
