package mypackage.bitwise;

public class Q2 {

    //every number appears twice, fine the one which dose not.
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(FindUnique(arr));
    }

    private static int FindUnique(int[] arr) {
        int unique = 0;

        for (int n:arr){
            unique = unique ^ n;
        }

        return unique;
    }

    //n^2 -> iterate two times and compare
    //nlogn -> sort and check
    //n -> use bitwise
}
