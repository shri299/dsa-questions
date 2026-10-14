package dsa.recursion;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverseArray(int[] arr, int i, int i1) {
        if (i >= i1) {
            return;
        }

        // Swap elements at index i and i1
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;

        // Recursive call for the next pair
        reverseArray(arr, i + 1, i1 - 1);
    }
}
