package dsa.stacksandqueues;

import java.util.Stack;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(3);
        Stack<Integer> stack1 = new Stack<>();
        stack.push(2);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(2);
    }

    public static void count(Stack<Integer> stack, Stack<Integer> stack1, int sum, int count){
        if (sum>10){
            return;
        }
    }
}
