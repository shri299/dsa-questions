package dsa.dynamicprogramming;

public class SubsetSumEqualTarget {


    //Subset/subsequence Sum Equals to Target
    //https://takeuforward.org/data-structure/subset-sum-equal-to-target-dp-14/
    public static void main(String[] args) {
        int[] arr = {11,12,18,2,3};
        System.out.println(helper(arr.length-1,4,arr));
    }

    //Recursion
    //O(2^n) {use height of the tree concept}
    //In worst case max height will be equal to size of array, so total nodes in tree = time the rec will be called
    private static boolean helper(int index, int target, int[] arr){
        if(target==0) return true;
        if (index==0) return arr[index]==target;

        boolean notPick = helper(index-1,target,arr);
        boolean pick = false;
        if (arr[index]<target)
            pick = helper(index-1,target-arr[index],arr);

        return notPick || pick;
    }

    //Memoization
    //TC:(n x target) //since a combination of index and target will be called only once, so all possible combinations will be our TC
    private static boolean helper1(int index, int target, int[] arr, Boolean[][] dp){
        if(target==0) return true;
        if (index==0) return arr[index]==target;

        if (dp[index][target]!=null) return dp[index][target];
        boolean notPick = helper1(index-1,target,arr,dp);
        boolean pick = false;
        if (arr[index]<target)
            pick = helper1(index-1,target-arr[index],arr,dp);

        return dp[index][target] = notPick || pick;
    }

    //Tabulation
    private static boolean helper2(int[] arr, int targett){
        Boolean[][] dp = new Boolean[arr.length][targett+1];

        for(int i=0;i<arr.length;i++){
            dp[i][0]=true; //Generated from here : if(target==0) return true;
        }
        dp[0][arr[0]]=true; //Generated from here : if (index==0) return arr[index]==target;

        for (int i=1;i<arr.length;i++){ //since recursion was n-1 to 0, we will start ulta here
            for (int target = 1; target <= targett; target++){ //since recursion was target to 0, we will start ulta here
                boolean notPick = dp[i-1][target];
                boolean pick = false;
                if (arr[i]<targett)
                    pick = dp[i-1][target-arr[i]]; //since here we are using previous loops value, we can optimize
                // using two 1d array : curr & prev
                dp[i][target]=pick||notPick;
            }
        }
        return  dp[arr.length-1][targett];
    }

    //Tabulation
    //space optimization
    private static boolean helper3(int[] arr, int targett){
        boolean[] prev = new boolean[targett+1];
        boolean[] curr = new boolean[targett+1];
        prev[0] = true; curr[0]=true;
        prev[arr[0]]=true;

        for (int i=1;i<arr.length;i++){ //since recursion was n-1 to 0, we will start ulta here
            for (int target = 1; target <= targett; target++){ //since recursion was target to 0, we will start ulta here
                boolean notPick = prev[target];
                boolean pick = false;
                if (arr[i]<targett)
                    pick = prev[target-arr[i]]; //since here we are using previous loops value, we can optimize
                // using two 1d array : curr & prev
                curr[target]=pick||notPick;
            }
            prev=curr;
        }
        return  prev[targett+1];
    }
}
