package mypackage.stacksandqueues;

import java.util.*;

public class InBuilt {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
//        System.out.println(queue.peek()); //gets the first item but does not remove it
//        System.out.println(queue.remove()); //gets and removes the item

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        //System.out.println(deque.pop());
    }

}
