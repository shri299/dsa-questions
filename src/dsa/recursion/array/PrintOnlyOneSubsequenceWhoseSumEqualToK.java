package dsa.recursion.array;

public class PrintOnlyOneSubsequenceWhoseSumEqualToK {

    //Q: Print only one subsequence whose sum is equal to K.

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        printSubsequences(arr, 0, "", 0, k);
    }

    private static boolean printSubsequences(int[] arr, int i, String s, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(s);
                return true;
            }
            return false;
        }
        if (printSubsequences(arr, i + 1, s + arr[i], sum + arr[i], k)) {
            return true;
        }
        if (printSubsequences(arr, i + 1, s, sum, k)) {
            return true;
        }
        return false;
    }
}
