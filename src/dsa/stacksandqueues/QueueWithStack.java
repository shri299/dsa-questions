package dsa.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueWithStack {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // returns 1
        System.out.println(queue.peek());    // returns 2
        System.out.println(queue.isEmpty()); // returns false
    }

    static class MyQueue {
        private final Stack<Integer> stack1;
        private final Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int x) {
            stack1.push(x);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}
