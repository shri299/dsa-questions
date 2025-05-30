package dsa.dynamicprogramming;

public class NinjaTraining {

    public static void main(String[] args) {

    }

    //Recursion pseudo-code
//    func(days,lastAct){
//        if(days==0){
//            max = 0;
//            for(i=0 to 2){
//                if(i!=lastAct){
//                    max = math.max(max,points[i]);
//                }
//            }
//            return max;
//        }

//        max=0
//
//        //since we have multiple picks here
//        for(i=0 to 2){
//            if(i!=lastAct){
//                points = points[i] + func(day-1,i);
//                max = Math.max(max,points);
//            }
//        }
//
//        return max;
    //}


    //memoization pseudo-code
    //you will require a 2d dp tp store results dp[day][lastAct]
//    func(days,lastAct){
//        if(days==0){
//            max = 0;
//            for(i=0 to 2){
//                if(i!=lastAct){
//                    max = math.max(max,points[i]);
//                }
//            }
//            return max;
//        }

//        max=0
//        if(dp[day][lastAct]!=-1) return dp[day][lastAct];
//        //since we have multiple picks here
//        for(i=0 to 2){
//            if(i!=lastAct){
//                points = points[i] + func(day-1,i);
//                max = Math.max(max,points);
//            }
//        }
//
//        return dp[day][lastAct]=max;
    //}


    //Tabulation
    public int tabulation(int[][] arr){
        int days = 2;
        int tasks = 3;
        int[][] dp = new int[days][tasks+1]; //adding extra when no task performed previously

        dp[0][0] = Math.max(arr[0][1],arr[0][2]); //what would be 0th day's maximum if on the 1th day 0th task was performed
        dp[0][1] = Math.max(arr[0][0],arr[0][2]); //what would be 0th day's maximum if on the 1th day 1th task was performed
        dp[0][2] = Math.max(arr[0][1],arr[0][0]);
        dp[0][3] = Math.max(arr[0][1],Math.max(arr[0][2],arr[0][0]));

        for (int i=1;i<days;i++){
            for (int last = 0;last<tasks;last++){
                dp[i][last]=0;
                for (int j=0;j<tasks;j++){
                    if (j!=last){
                        dp[i][last]=Math.max(arr[i][j]+dp[i-1][j],dp[i][last]);
                    }
                }
            }
        }

        return dp[days-1][tasks];
    }

    //space optimization

    public int sc(int[][] arr){
        int days = 2;
        int tasks = 3;
        int[] dp = new int[tasks+1]; //adding extra when no task performed previously

        dp[0] = Math.max(arr[0][1],arr[0][2]); //what would be 0th day's maximum if on the 1th day 0th task was performed
        dp[1] = Math.max(arr[0][0],arr[0][2]); //what would be 0th day's maximum if on the 1th day 1th task was performed
        dp[2] = Math.max(arr[0][1],arr[0][0]);
        dp[3] = Math.max(arr[0][1],Math.max(arr[0][2],arr[0][0]));

        for (int i=1;i<days;i++){
            int[] temp = new int[tasks+1];
            for (int last = 0;last<tasks;last++){
                temp[last]=0;
                for (int j=0;j<tasks;j++){
                    if (j!=last){
                        temp[last]=Math.max(arr[i][j]+temp[j],temp[last]);
                    }
                }
            }
            dp=temp;
        }
        return dp[tasks];
    }
}
