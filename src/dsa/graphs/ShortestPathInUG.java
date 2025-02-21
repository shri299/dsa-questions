package dsa.graphs;

import dsa.oops.accesscontrol.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ShortestPathInUG {

    //https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=shortest-path-in-weighted-undirected-graph

    public static void main(String[] args) {

    }

    private static ArrayList<Integer> getPath(ArrayList<ArrayList<ArrayList<Integer>>> adjList, int totalNodes, int start, int end){
        int[] dist = new int[totalNodes];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        dist[start]=0;
        pq.offer(new Pair(0,start));
        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()){
            Pair parent = pq.poll();
            int currDist = parent.distance;
            int currNode = parent.node;

            for (ArrayList<Integer> neighbours : adjList.get(currNode)){
                if(neighbours.get(1)==end){
                    if (currDist+neighbours.get(0)<dist[neighbours.get(0)]){
                        ans.add(currNode);
                        dist[neighbours.get(0)]=currDist+neighbours.get(0);
                    }
                }
            }
        }
        return ans;
    }

    static class Pair{
        int distance;
        int node;

        public Pair (int distance,int node){
            this.distance=distance;
            this.node=node;
        }
    }
}
