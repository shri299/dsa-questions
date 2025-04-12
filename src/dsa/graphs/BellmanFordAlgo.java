package dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgo {

    public static void main(String[] args) {

    }

    public static int[] algo(int n, ArrayList<ArrayList<Integer>> edges, int s){
        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e8);
        dist[0]=0;
        for (int i=0;i<n-1;i++){
            for (ArrayList<Integer> target : edges){
                int u = target.get(0);
                int v = target.get(1);
                int wt = target.get(2);
                if (dist[u]!=(int)1e8 && dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                }
            }
        }

        //nth relaxation to check for negative cycle
        for (ArrayList<Integer> target : edges){
            int u = target.get(0);
            int v = target.get(1);
            int wt = target.get(2);
            if (dist[u]!=(int)1e8 && dist[u]+wt<dist[v]){
                System.out.println("Negative cycle found");
                return new int[]{-1};
            }
        }
        return dist;
    }
}
