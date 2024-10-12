package dsa.greedy;

import java.util.Arrays;

public class FractionalKnapsack {

    //we sorted it according to val per weight, in order to maximise the total value
    //this is where greedy comes in

    //TC : O(nlogn) + O(n)
    //SC : O(1)

    public static void main(String[] args) {
        int[][] arr = {
                {100, 20},
                {60, 10},
                {100, 50},
                {200, 50}
        };

        Arrays.sort(arr, (a, b) -> Double.compare((double)b[0] / b[1], (double)a[0] / a[1]));

        int targetWeight = 90;
        double val = 0;

        for (int i=0;i<arr.length;i++){
            if (targetWeight>=arr[i][1]){
                targetWeight = targetWeight-arr[i][1];
                val = val  +arr[i][0];
            }else { //target weight is smaller
                //find value per weight of that pair
                double valPerWt = (double) arr[i][0] /arr[i][1];
                val = val + targetWeight*valPerWt;
                break;
            }
        }

        System.out.println(val);
    }
}
