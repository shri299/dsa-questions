package dsa.binarysearch;

public class LowerBoundUpperBound {


    //TC : O(logn)
    //SC : O(1)

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,9,15,19};
        int x = 9;

        System.out.println(lowerBound(arr,x));
        System.out.println(upperBound(arr,x));
    }

    private static int lowerBound(int[] arr, int x) {
        int start = 0;
        int end = arr.length-1;
        int ans  = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]>=x){
                ans = mid; //potential answer
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                ans = mid; // potential answer
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
