package mypackage.binaryTree;

import java.util.Scanner;

public class Implementation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Implementation implementation = new Implementation();
        implementation.populate(scanner);
        implementation.display();
    }

    public Implementation(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert elements in the binary tree

    public void populate(Scanner scanner){
        System.out.println("Enter the root node value");
        int value  = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    public void  populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of: "+node.value);
        boolean left = scanner.nextBoolean();

        if (left){
            System.out.println("Enter the left value for: "+node.value);
            int leftValue = scanner.nextInt();
            node.left = new Node(leftValue);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter right of: "+node.value);
        boolean right = scanner.nextBoolean();

        if (right){
            System.out.println("Enter the right value for: "+node.value);
            int rightValue = scanner.nextInt();
            node.right = new Node(rightValue);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    public void display(Node node, String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

//    public void prettyDisplay(){
//        prettyDisplay(root,0);
//    }

//    public void prettyDisplay(Node node, int level) {
//        if (node==null){
//            return;
//        }
//        prettyDisplay(node.right,level+1);
//
//        if (level!=0){
//
//        }
//    }
}
