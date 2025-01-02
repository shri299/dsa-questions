package dsa.dynamicprogramming;

import java.util.Arrays;

public class Fibonacci {

    //Tabulation method

    //start from the base and reach the given input (just opposite of what we do in recursion)

    //TC : O(n) {for loop}
    //SC : O(n) {dp array}

    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        Arrays.sort(dp);

        dp[0] = 0;
        dp[1] = 1;

        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        //System.out.println(Arrays.toString(dp));

        optimizeSC();
    }

    //O(1) space complexity here
    public static void optimizeSC() {
        int n = 7;

        int prev1 = 0;
        int prev2 = 1;

        for (int i=2;i<=n;i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        System.out.println(prev2);
    }
}
