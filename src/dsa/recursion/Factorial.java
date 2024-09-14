package dsa.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(calc(5));
    }

    public static int calc(int n){
        if (n==0)
            return 1;
        return n*calc(n-1);
    }


}
