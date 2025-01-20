package dsa.tree;

public class PostOrderTraversal {

    //TC : O(n)
    //SC : O(n)
    public static void main(String[] args) {
        traverse(null);
    }

    public static void traverse(PreOrderTraversal.Node root){
        if (root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        System.out.println(root.value);
    }

    public static class Node{
        int value;
        PreOrderTraversal.Node left;
        PreOrderTraversal.Node right;

        public Node (int value){
            this.value=value;
        }
    }
}
