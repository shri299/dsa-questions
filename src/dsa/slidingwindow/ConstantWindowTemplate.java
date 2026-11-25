package dsa.slidingwindow;

public class ConstantWindowTemplate {

    //Given an array of integers nums and an integer k, return the maximum sum of a subarray of size k.
    //TC: O(n)
    //SC: O(1)

    public static void main(String[] args) {
        int[] arr = {2,3,6,3,8,2,4,5,1};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i=0;
        int j=0;

        while(j-i+1<k){ //first try to hit the first window size
            sum+=arr[j];
            j++;
        }
        max=sum;
        while(j<arr.length){
            sum+=arr[j];
            max=Math.max(max,sum);
            sum=sum-arr[i];
            i++;j++;
        }

        return max;
    }
}
