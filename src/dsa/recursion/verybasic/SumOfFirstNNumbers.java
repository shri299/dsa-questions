package dsa.recursion.verybasic;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfFirstNNumbers(n);
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }

    private static int sumOfFirstNNumbers(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumOfFirstNNumbers(n - 1);
    }
}
