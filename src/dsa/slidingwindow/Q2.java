package dsa.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q2 {

    //first negative integer in every window of size k
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,-5,-6,8,-7};
        System.out.println(calculate(arr,3));
    }

    public static List<Integer> calculate(int[] arr,int k){
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while(j < arr.length) {

            if(arr[j] < 0)
                queue.add(arr[j]);

            if((j - i + 1) < k) {
                j++;
            }
            else if((j - i + 1) == k) {
                if(queue.isEmpty()) {
                    list.add(0);
                }
                else {
                    list.add(queue.peek());
                    if(arr[i] == queue.peek())
                        queue.poll();
                }
                i++;
                j++;
            }

        }
        return list;
    }
}
