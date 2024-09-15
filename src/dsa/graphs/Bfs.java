package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nodeList = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<5;i++)
        {
            nodeList.add(new ArrayList<>());
        }

        nodeList.get(0).add(1);
        nodeList.get(0).add(2);

        nodeList.get(1).add(0);
        nodeList.get(1).add(3);
        nodeList.get(1).add(4);

        nodeList.get(2).add(0);
        nodeList.get(2).add(4);

        nodeList.get(3).add(1);

        nodeList.get(4).add(1);
        nodeList.get(4).add(2);

        System.out.println(nodeList);

        System.out.println(traversal(nodeList,5));

    }

    public static List<Integer> traversal(ArrayList<ArrayList<Integer>> adjList, int totalNodes){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visitedArray = new boolean[totalNodes];
        Queue<Integer> queue = new LinkedList<>();

        visitedArray[0] = true;
        queue.offer(0);

        while (!queue.isEmpty()){
            Integer currNode = queue.poll();
            bfs.add(currNode);

            for(Integer neighbourNodes : adjList.get(currNode)){
                if (!visitedArray[neighbourNodes]){
                    visitedArray[neighbourNodes]=true;
                    queue.offer(neighbourNodes);
                }
            }
        }

        return bfs;
    }
}
