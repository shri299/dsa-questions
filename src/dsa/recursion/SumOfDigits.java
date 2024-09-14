package dsa.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println(calc(32));
    }

    public static int calc(int n){
        if (n==0)
            return 0;
        int remainder = n%10;
        n = n/10;
        return remainder + calc(n);
    }
}
