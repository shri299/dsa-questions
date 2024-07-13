package mypackage.recursion;

public class ReverseANumber {

    public static void main(String[] args) {
//        cacl(1234);
//        System.out.println(sum);
        System.out.println(cacl2(1234,3));
    }

    static int sum = 0;

    public static void cacl(int n){
        if (n==0)
            return;
        int rem = n%10;
        sum  = sum * 10 + rem;
        cacl(n/10);
    }

    public static int cacl2(int n, int counter){
        if (n==0)
            return 0;
        int rem = n%10;
        return (int) (rem * Math.pow(10,counter) + cacl2(n/10,counter-1));

    }
}
