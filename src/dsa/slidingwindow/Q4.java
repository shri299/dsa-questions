package dsa.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

    }

    public List<Integer> calculate(int[] arr, int k){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (i+j+1<=k){
            if (arr[j] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[j];
            } else if (arr[j] == firstMax) {
                // If it's equal to the firstMax, we set secondMax to firstMax to allow duplicates
                secondMax = firstMax;
            } else if (arr[j] > secondMax) {
                secondMax = arr[j];
            }
            j++;
        }

        while (j<arr.length){
            //from the 1st window we have first max and second max
            ans.add(firstMax);
            //cases

            //first max is i
            if (firstMax==arr[i]){
                j++;
                if (arr[j]>secondMax){
                    firstMax = arr[j];
                    //leave second max as it is
                }else {
                    firstMax = secondMax;

                }

            }else { //first max is not i
                j++;
                if (arr[j]>firstMax){
                    //this means arr[j] is now maximum
                    firstMax = arr[j];
                }else {
                    //first max will remain as it is
                    //check for second max
                    if (arr[j]>secondMax){
                        secondMax = arr[j];
                    }
                }
            }
            i++;

        }
        return ans;
    }
}
