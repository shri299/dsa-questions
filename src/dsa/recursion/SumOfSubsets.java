package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubsets {

    //TC : 2^n
    //SC : 2^n
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        List<Integer> ans = new ArrayList<>();
        helper(0,arr,ans,0);
        System.out.println(ans);
    }

    private static void helper(int index, int[] arr, List<Integer> ans,int sum) {
        if(index>=arr.length){
            ans.add(sum);
            return;
        }

        helper(index+1,arr,ans,sum+arr[index]);
        helper(index+1,arr,ans,sum);
    }
}
