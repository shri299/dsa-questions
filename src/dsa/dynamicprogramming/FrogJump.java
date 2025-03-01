package dsa.dynamicprogramming;

import java.util.Arrays;

public class FrogJump {

    //https://www.geeksforgeeks.org/problems/geek-jump/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=geek-jump

    static int[] dp = new int[3];
    public static void main(String[] args) {
        int[] energy = {10, 20, 30, 10};
        int n = 3;
        Arrays.fill(dp,-1);
        System.out.println(computeMinEnergy(n,energy));
    }


    //Exponential time complexity
    //Notice we are going from end array to start array
    //at every stair, All I want is the min of 1 step or 2 step
    //TC : 2^n
    private static int computeMinEnergy(int n, int[] energy) {
        if(n==0){
            return 0;
        }

        int le = computeMinEnergy(n-1,energy) + Math.abs(energy[n]-energy[n-1]);
        if (n == 1){
            return le;
        }
        int re = computeMinEnergy(n-2,energy) + Math.abs(energy[n]-energy[n-2]);
        return Math.min(le,re);
    }

    //TC : O(n)
    //SC : O(n) {dp array} + O(n) {stack space}
    private static int computeMinEnergyMemoize(int n, int[] energy) {
        if(n==0){
            return 0;
        }

        int le = 0;
        if (dp[n-1]!=-1){
            le = dp[n-1] + Math.abs(energy[n]-energy[n-1]);
        }else{
            le = computeMinEnergy(n-1,energy) + Math.abs(energy[n]-energy[n-1]);
        }

        if (n == 1){
            dp[n] = le;
            return le;
        }

        int re = 0;
        if (dp[n-2]!=-1){
            re = dp[n-2] + Math.abs(energy[n]-energy[n-2]);
        }else{
            re = computeMinEnergy(n-2,energy) + Math.abs(energy[n]-energy[n-2]);
        }
        dp[n] = Math.min(le,re);
        return Math.min(le,re);
    }

    private static void computeMinEnergyTabulation(int n, int[] energy){
        dp[0] = 0;

        for (int i=1;i<n;i++){
            int le = dp[i-1] + Math.abs(energy[i]-energy[i-1]);
            int re = Integer.MAX_VALUE;
            if(i>1){
                 re = dp[n-2] + Math.abs(energy[i]-energy[i-2]);
            }
            dp[i] = Math.min(le,re);
        }
        System.out.println(dp[n-1]);
    }

    private static void computeMinEnergyTabulationSC(int n, int[] energy){
        int prev1 = 0;
        int prev2 = 0;

        for (int i=1;i<n;i++){
            int le = prev1 + Math.abs(energy[i]-energy[i-1]);
            int re = Integer.MAX_VALUE;
            if(i>1){
                re = prev2 + Math.abs(energy[i]-energy[i-2]);
            }
            prev2 = prev1;
            prev1 = Math.min(le,re);
        }
        System.out.println(prev1);
    }
}
