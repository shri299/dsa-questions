package dsa.tree;

public class PreOrderTraversal {

    //TC : O(n)
    //SC : O(n)
    public static void main(String[] args) {
            traverse(null);
    }

    public static void traverse(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.value);
        traverse(root.left);
        traverse(root.right);
    }

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node (int value){
            this.value=value;
        }
    }
}
