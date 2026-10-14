package dsa.recursion.verybasic;

public class PrintNameNTimes {

    public static void main(String[] args) {
        String name = "John Doe";
        int n = 5;

        printNameNTimes(name, n);
    }

    private static void printNameNTimes(String name, int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(name);
        printNameNTimes(name, n - 1);
    }
}
