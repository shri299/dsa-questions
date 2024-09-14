package dsa.binaryTree;

import java.util.Scanner;

public class Implementation {

    Node root;

    public Implementation(){

    }

    public class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }

    //insert elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        root = new Node(val);

        insertNonRootNodes(root,scanner);

        display();
    }

    public void insertNonRootNodes(Node root, Scanner scanner) {
        System.out.println("Do you want to enter left of "+root.val);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the left of "+root.val);
            int val = scanner.nextInt();
            root.left=new Node(val);
            insertNonRootNodes(root.left,scanner);
        }

        System.out.println("Do you want to enter right of "+root.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the right of "+root.val);
            int val = scanner.nextInt();
            root.right=new Node(val);
            insertNonRootNodes(root.right,scanner);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root, String s) {
        if (root==null){
            return;
        }
        System.out.println(s+root.val);

        Node left = root.left;
        display(left,s+"----");

        Node right = root.right;
        display(right,s+"----");
    }
}
