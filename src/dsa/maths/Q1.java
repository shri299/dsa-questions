package dsa.maths;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        int c = 2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }else {
                c = c+1;
            }
        }

        return true;
    }
}
