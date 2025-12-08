package dsa.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());    // returns 2
        System.out.println(stack.pop());    // returns 2
        System.out.println(stack.empty());  // returns false
    }


    static class MyStack {
        private final Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);
            int size = queue.size();
            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.remove());
            }
        }

        public int pop() {
            return queue.remove();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
