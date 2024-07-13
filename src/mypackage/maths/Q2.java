package mypackage.maths;

public class Q2 {

    public static void main(String[] args) {
        int n=3;
        boolean[] primes = new boolean[n+1]; //initially by default all the value will be false
        countPrime(n,primes);
    }

    //false -> prime
    static void countPrime(int n, boolean[] primes){
        for (int i=2;i*i<=n;i++){
            if(!primes[i]){
                for (int j=2*i;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }

        for (int i=2;i<=n;i++){
            if (!primes[i]){
                System.out.println(i);
            }
        }

    }
}
