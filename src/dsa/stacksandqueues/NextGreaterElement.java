package dsa.stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    //TC : O(2n) ~ for loop + while loop in worst case will run for n-1 elements(ascending order arr)
    //SC : O(2n)

    public static void main(String[] args) {
        int[] arr = {3,9,2,11,36,4,12,19};
        System.out.println(Arrays.toString(findNGE(arr)));
    }

    public static int[] findNGE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for (int i=arr.length-1;i>=0;i--){
            while (!stk.isEmpty() && stk.peek()<arr[i]){
                stk.pop();
            }
            if (stk.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stk.peek();
            }

            stk.push(arr[i]);

        }
        return ans;
    }
}
