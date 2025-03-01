package dsa.dynamicprogramming;

import java.util.Arrays;

public class FrogJumpTwo {

    //private static int minFinalEnergy = Integer.MAX_VALUE; {don't do this mistake dude}
    public static void main(String[] args) {
        int[] arr = {10,30,40,50,20};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(minEnergy(arr,3,arr.length-1));
        //System.out.println(minEnergyMemoization(arr,3,arr.length-1,dp));
    }

    //TC : K^n
    private static int minEnergy(int[] arr, int k, int n) {
        if (n==0){
            return 0;
        }
        int minFinalEnergy = Integer.MAX_VALUE;
        for (int i=1;i<=k;i++){
            if (n-i>=0){
                int subMinEnergy = minEnergy(arr,k,n-i) + Math.abs(arr[n]-arr[n-i]);
                minFinalEnergy = Math.min(minFinalEnergy,subMinEnergy);
            }
        }
        return minFinalEnergy;
    }

    //TC: O(nk)
    private static int minEnergyMemoization(int[] arr, int k, int n,int[] dp) {
        if (n==0){
            return 0;
        }
        int minFinalEnergy = Integer.MAX_VALUE;
        for (int i=1;i<=k;i++){
            if (n-i>=0){
                int subMinEnergy = 0;
                if(dp[n-i]!=-1){
                    subMinEnergy = dp[n-i] + Math.abs(arr[n]-arr[n-i]);
                }else {
                    subMinEnergy = minEnergyMemoization(arr,k,n-i,dp) + Math.abs(arr[n]-arr[n-i]);
                }
                minFinalEnergy = Math.min(minFinalEnergy,subMinEnergy);
                dp[n] = minFinalEnergy;
            }
        }
        return minFinalEnergy;
    }

    //TC: O(nk)
    private static void minEnergyTabulation(int[] arr, int k, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int i=1;i<n;i++){
            int minFinalEnergy = Integer.MAX_VALUE;
            for (int j=1;j<=k;j++){
                int subMinEnergy = 0;
                if(i-j>=0){
                    subMinEnergy = dp[i=j] + Math.abs(arr[i]-arr[i-j]);
                    minFinalEnergy = Math.min(minFinalEnergy,subMinEnergy);
                }
            }
            dp[i] = minFinalEnergy;
        }
    }

    //no space optimization here



}
