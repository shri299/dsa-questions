package dsa.graphs;

import java.util.*;

public class KahnsAlgorithm {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        List<Integer> topo = new ArrayList<>();

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

        //keep the in degree
        int[] inDegree = new int[adjList.size()];
        for (int i=0;i<=5;i++){
            for (int node : adjList.get(i)){
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<=5;i++){
            if (inDegree[i]==0){
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()){
            int target = queue.poll();
            topo.add(target);

            for (int neighbour: adjList.get(target)){
                inDegree[neighbour]--;
                if (inDegree[neighbour]==0) {
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println(topo.toString());

    }
}
