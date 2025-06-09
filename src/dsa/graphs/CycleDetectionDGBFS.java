package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionDGBFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<=4;i++)
        {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(2).add(4);

        int[] inDegree = new int[adjList.size()];
        for (int i=0;i<adjList.size();i++){
            for (int node : adjList.get(i)){
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<inDegree.length;i++){
            if (inDegree[i]==0)
                queue.offer(i);
        }

        while (!queue.isEmpty()){
            int target = queue.poll();
            ans.add(target);

            for (int neighbour: adjList.get(target)){
                inDegree[neighbour]--;
                if (inDegree[neighbour]==0) {
                    queue.offer(neighbour);
                }
            }
        }

        if (ans.size()==adjList.size())
            System.out.println("No cycle present");
        else
            System.out.println("Cycle present");

    }
}
