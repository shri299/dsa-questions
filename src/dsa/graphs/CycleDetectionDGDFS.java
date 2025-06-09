package dsa.graphs;

import java.util.ArrayList;

public class CycleDetectionDGDFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nodeList = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<=10;i++)
        {
            nodeList.add(new ArrayList<>());
        }

        nodeList.get(1).add(2);

        nodeList.get(2).add(3);


        nodeList.get(3).add(4);
        nodeList.get(3).add(7);

        nodeList.get(4).add(5);

        nodeList.get(5).add(6);

        nodeList.get(7).add(5);

        nodeList.get(8).add(2);
        nodeList.get(8).add(9);

        nodeList.get(9).add(10);

        nodeList.get(10).add(8);

        boolean[] vis = new boolean[nodeList.size()];
        boolean[] pathTrack = new boolean[nodeList.size()];
        boolean ans = false;

        for (int i=1;i<=10;i++)
        {
            if (!vis[i]){
                if (dfs(i,vis,pathTrack,nodeList,ans)){
                    System.out.println("Cycle detected at: "+i);
                }else {
                    System.out.println("Cycle not found at: "+i);
                }
            }
        }


    }

    private static boolean dfs(int node, boolean[] vis, boolean[] pathTrack, ArrayList<ArrayList<Integer>> nodeList, boolean ans) {
        vis[node]=true;
        pathTrack[node]=true;

        for (Integer neighbour : nodeList.get(node)){
            if(!vis[neighbour]){
                ans = dfs(neighbour,vis,pathTrack,nodeList,ans);
            } else if (vis[neighbour] && !pathTrack[neighbour]) {
                ans = false;
            } else if (vis[neighbour] && pathTrack[neighbour]) {
                //cycle found
                ans = true;
            }
        }
        pathTrack[node]=false;
        return ans;
    }
}
