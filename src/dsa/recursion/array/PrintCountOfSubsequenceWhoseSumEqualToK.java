package dsa.recursion.array;

public class PrintCountOfSubsequenceWhoseSumEqualToK {

    //Q: Count the number of subsequences whose sum is equal to K.
    //intuition: We can use recursion to generate all possible subsequences of the given array and keep track of the sum of the elements in each subsequence. If the sum of a subsequence is equal to K, we increment a count variable. Finally, we return the count of such subsequences.
    //TC: O(2^n) where n is the length of the array. This is because we are generating all possible subsequences of the array, which can be done in 2^n ways.
    //SC: O(n) where n is the length of the array. This is because we are using recursion, which uses the call stack to keep track of the function calls. The maximum depth of the recursion tree will be equal to the length of the array.

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        System.out.println(countSubsequences(arr, 0, 0, k));
    }

    private static int countSubsequences(int[] arr, int i, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        int countIncludingCurrent = countSubsequences(arr, i + 1, sum + arr[i], k);
        int countExcludingCurrent = countSubsequences(arr, i + 1, sum, k);
        return countIncludingCurrent + countExcludingCurrent;
    }
}
