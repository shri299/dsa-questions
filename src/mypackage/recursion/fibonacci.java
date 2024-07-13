package mypackage.recursion;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciNumbers(11));
    }

    private static int fibonacciNumbers(int i) {
        if (i==0)
        {
            return 0;
        }
        if (i==1)
        {
            return 1;
        }
        return fibonacciNumbers(i-1) + fibonacciNumbers(i-2);
    }
}
