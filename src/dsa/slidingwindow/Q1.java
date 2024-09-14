package dsa.slidingwindow;

public class Q1 {

    //maximum sum sub array of size k
    public static void main(String[] args) {
        int[] arr = {2,3,6,3,8,2,4,5,1};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i=0;
        int j=0;

        while(j-i+1<3){ //first try to hit the first window size

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
