package dsa.tree;

import java.util.*;

public class LevelOrderSuccessor {

    Node root;

    public LevelOrderSuccessor() {

    }

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(Scanner scanner) {
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        root = new Node(val);
        insertHelper(root, scanner);
    }

    private void insertHelper(Node root, Scanner scanner) {
        System.out.println("do you wish to enter the left of: " + root.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the left of: " + root.val);
            int leftVal = scanner.nextInt();
            root.left = new Node(leftVal);
            insertHelper(root.left, scanner);
        }

        System.out.println("do you wish to enter the right of: " + root.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the right of: " + root.val);
            int rightVal = scanner.nextInt();
            root.right = new Node(rightVal);
            insertHelper(root.right, scanner);
        }
    }


    public void display() {
        displayHelper(root, "");
    }

    private void displayHelper(Node root, String s) {
        if (root == null) {
            return;
        }
        System.out.println(s + root.val);
        displayHelper(root.left, s + "----");
        displayHelper(root.right, s + "----");
    }

    //level order successor of a node let's say 4

    public void calculate(Node root, int key) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node target = queue.poll();
            if (target.left != null) {
                queue.offer(target.left);
            }
            if (target.right != null) {
                queue.offer(target.right);
            }
            //check of value
            if (target.val == key) {
                Node answer = queue.poll();
                if (answer == null) {
                    System.out.println("no next node");
                } else {
                    System.out.println(answer.val);
                }
                break;
            }
        }
    }



    //zig zag traversal

    public List<List<Integer>> traversal(Node root){

        List<List<Integer>> result = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        int flag=0;
        if (root==null){
            return result;
        }
        deque.addFirst(root);
        while (!deque.isEmpty()){
            int levelSize = deque.size(); //initially its 1
            List<Integer> subList = new ArrayList<>();
            for (int i=0;i<levelSize;i++){
                //we have two cases either remove from front or from back
                if (flag % 2 == 0){
                    Node target = deque.pollFirst(); //remove first and add to subList
                    subList.add(target.val);
                    if (target.left!=null){
                        deque.addLast(target.left);
                    }
                    if (target.right!=null){
                        deque.addLast(target.right);
                    }
                }else {
                    //remove from back, insert children in the front
                    Node target = deque.pollLast();
                    subList.add(target.val);
                    if (target.right!=null){
                        deque.addFirst(target.right);
                    }
                    if (target.left!=null){
                        deque.addFirst(target.left);
                    }
                }
            }
            flag = flag+1;
            result.add(subList);
        }
        return result;
    }






}
