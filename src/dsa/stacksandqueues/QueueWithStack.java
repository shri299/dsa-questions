package dsa.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueWithStack {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        //insertion in the queue will be same as that in stack
        stack.push(5);
        stack.push(4);
        stack.push(3);

        //removal
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()){
            helper.push(stack.pop());
        }
        int removed_item = helper.pop();
        while (!helper.isEmpty()){
            stack.push(helper.pop());
        }
        System.out.println(removed_item);
    }
}
