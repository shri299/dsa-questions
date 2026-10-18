package dsa.recursion.array;

public class PrintSubsequenceWhoseSumEqualToK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        printSubsequences(arr, 0, "", 0, k);
    }

    private static void printSubsequences(int[] arr, int i, String s, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(s);
            }
            return;
        }
        printSubsequences(arr, i + 1, s + arr[i], sum + arr[i], k);
        printSubsequences(arr, i + 1, s, sum, k);
    }
}
