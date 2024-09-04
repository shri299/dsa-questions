package revision;

import mypackage.linkedlists.revision.RemoveNNodeFromBack;

import java.util.Scanner;

public class BtImplementation {

    Node root;

    class Node{
        int val;
        Node left;
        Node right;

        int height;
        public Node (int val){
            this.val=val;
        }
    }

    public void insert(Scanner scanner){
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        root = new Node(val);
        insertNonRoots(root,scanner);
    }

    private void insertNonRoots(Node root, Scanner scanner) {
        System.out.println("Do you wish to enter the left of: "+root.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left node");
            int leftVal = scanner.nextInt();
            root.left = new Node(leftVal);
            insertNonRoots(root.left,scanner);
        }

        System.out.println("Do you wish to enter the right of: "+root.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the right node");
            int rightVal = scanner.nextInt();
            root.right = new Node(rightVal);
            insertNonRoots(root.right,scanner);
        }

        root.height=Math.max(height(root.left),height(root.right))+1;
        System.out.println("height for: "+root.val+" is: "+root.height);
    }

    private int height(Node node){
        return node==null ? -1 : node.height;
    }

    public void display(){
        displayHelper(root,"");
    }

    private void displayHelper(Node root, String s) {
        if(root==null){
            return;
        }
        System.out.println(s+root.val);
        displayHelper(root.left,s+"----");
        displayHelper(root.right,s+"----");
    }

}
