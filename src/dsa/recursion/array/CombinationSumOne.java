package dsa.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumOne {

    //Q: https://leetcode.com/problems/combination-sum/
    //TC: O(2^t * k), where t is the target value and k is the average length of each combination
    //SC: O(k*x), where k is the average length of each combination and x is the number of combinations

    public static void main(String[] args) {
       combinationSum(new int[]{2,3,6,7}, 7).forEach(System.out::println);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds){
        if(index>=candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //this is done to avoid negative target values and unnecessary recursion
        //alternatively, we can also check if the target is negative in base condition and return in that case
//        If I KNOW a recursive branch is invalid
//        ↓
//        prune it BEFORE making the call.
        if(target>=candidates[index]){
            ds.add(candidates[index]);
            //the reason we are not incrementing the index is that we can use the same element again and again
            //If I can pick it again, stay. If I'm done with it, move.
            findCombinations(index, candidates, target-candidates[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1, candidates, target, ans, ds);
    }
}
