package dsa.binarysearch;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {
        //https://takeuforward.org/data-structure/aggressive-cows-detailed-solution/
        //place cows at different indexes and for each such combination calculate the min.
        //Once you have a list of min of all such combination, you have to return the max of that list
        int[] stables = {0,3,4,7,9,10};
        Arrays.sort(stables);
        int start = 1;
        int end = stables[stables.length-1]-stables[0];
        int maxOfMinis = 1;

        //linea search
        //O(n*(end))
        //SC: O(1)
        for (int i=start;i<=end;i++){
            boolean isPossible = placeCow(stables,i);
            if (!isPossible){
                maxOfMinis = i-1;
                break;
            }
        }

        //Binary search
        //O(n) * O(log(end))
        while(start<=end){
            int mid = (start+end)/2;

            if (placeCow(stables,mid)){
                maxOfMinis = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        System.out.println(maxOfMinis);
    }

    private static boolean placeCow(int[] stables, int min) {
        int cows = 1; int last = stables[0];
        for (int i=1;i<stables.length;i++){
            if (stables[i]-last>=min){
                cows++;
                last = stables[i];
            }
            if (cows>=4) return true;
        }
        return false;
    }
}
