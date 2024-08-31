package mypackage.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderSuccessor {

    Node root;

    public LevelOrderSuccessor (){

    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }

    public void insert(Scanner scanner){
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        root = new Node(val);
        insertHelper(root,scanner);
    }

    private void insertHelper(Node root, Scanner scanner) {
        System.out.println("do you wish to enter the left of: "+root.val);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("enter the left of: "+root.val);
            int leftVal = scanner.nextInt();
            root.left=new Node(leftVal);
            insertHelper(root.left,scanner);
        }

        System.out.println("do you wish to enter the right of: "+root.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("enter the right of: "+root.val);
            int rightVal = scanner.nextInt();
            root.right=new Node(rightVal);
            insertHelper(root.right,scanner);
        }
    }


    public void display(){
        displayHelper(root,"");
    }

    private void displayHelper(Node root, String s) {
        if (root==null){
            return;
        }
        System.out.println(s+root.val);
        displayHelper(root.left,s+"----");
        displayHelper(root.right,s+"----");
    }

    //level order successor of a node let's say 4

    public void calculate(Node root, int key){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();

            for (int i=0; i< levelSize; i++){
                Node target = queue.poll();

                if (target.left!=null){
                    queue.offer(target.left);
                }

                if (target.right!=null){
                    queue.offer(target.right);
                }
                //check of value
                if (target.val==key){
                    Node answer = queue.poll();
                    if (answer==null){
                        System.out.println("no next node");
                    }else {
                        System.out.println(answer.val);
                    }
                    break;
                }
            }
        }
    }


}
