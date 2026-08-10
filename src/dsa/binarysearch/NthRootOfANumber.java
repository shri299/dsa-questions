package dsa.binarysearch;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class NthRootOfANumber {

    //TC : O(logn)
    //SC : O(1)

    public static void main(String[] args) {
        int n = 27;
        int m = 3;

        System.out.println(nthRoot(n, m));
    }

    static int nthRoot(int n, int m) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midPower = (long) power(mid, m);

            if (midPower == n) {
                return mid;
            } else if (midPower < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // If no integer root is found
    }
}
