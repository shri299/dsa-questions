package dsa.slidingwindow;

public class MaxAverageSubArrayOne {

    //Q: https://leetcode.com/problems/maximum-average-subarray-i/
    //TC: O(n)
    //SC: O(1)

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maxAverage(arr, k));
    }

    private static boolean maxAverage(int[] arr, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < k) {
            sum += arr[j];
            j++;
        }

        //double is used to get the floating point value of the average
        double maxAverage = (double) sum / k;

        while (j <= arr.length-1) {
            sum -= arr[i];
            sum += arr[j];
            i++;
            j++;
            maxAverage = Math.max(maxAverage, (double) sum / k);
        }

        System.out.println("Max Average: " + maxAverage);
        return true;
    }
}
