package dsa.recursion;

public class PrintAllSubsequenceOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsequences(arr, 0, "");
    }

    private static void printSubsequences(int[] arr, int i, String s) {
        if (i == arr.length) {
            System.out.println(s);
            return;
        }
        printSubsequences(arr, i + 1, s + arr[i]);
        printSubsequences(arr, i + 1, s);
    }
}
