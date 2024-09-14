package dsa.bitwise;

public class Q1 {

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isOddNum(n));
    }

    private static boolean isOddNum(int n) {
        return (n&1)==1;
    }
}
