package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDict {

    //https://www.geeksforgeeks.org/problems/alien-dictionary/1

    //be mindful of the char, int and ascii conversions

    public static void main(String[] args) {
        String[] input = {"baa","abcd","abca","cab","cad"};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //n words in input
        //k alphabets
        int k=4;
        for (int i=0;i<k;i++){
            list.add(new ArrayList<>());
        }

        for (int i=0;i<input.length-1;i++){
            //compare
            String s1 = input[i];
            String s2 = input[i+1];
            int len = Math.min(s1.length(),s2.length());
            for (int j=0;j<len;j++){
                if (s1.charAt(j)!=s2.charAt(j)){
                    list.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }

        List<Integer> topo = topoSort(list,k);
        String ans = "";
        for (int val:topo){
            ans = ans + (char)(val+(int)'a');
        }
        System.out.println(ans);
    }

    private static List<Integer> topoSort(ArrayList<ArrayList<Integer>> list, int k) {
        int[] inDegree = new int[k];
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<k;i++){
            for (int node : list.get(i)){
                inDegree[node]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<k;i++){
            if (inDegree[i]==0){
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()){
            int target = queue.poll();
            ans.add(target);

            for (int neighbour: list.get(target)){
                inDegree[neighbour]--;
                if (inDegree[neighbour]==0) {
                    queue.offer(neighbour);
                }
            }
        }

        return ans;
    }
}
