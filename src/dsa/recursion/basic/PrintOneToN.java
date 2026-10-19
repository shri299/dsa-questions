package dsa.recursion.basic;

public class PrintOneToN {
    public static void main(String[] args) {
        int n = 5;
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if (n <= 0) {
            return;
        }

        printOneToN(n - 1);
        System.out.println(n);
    }
}
