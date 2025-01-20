package dsa.tree;

public class InOrderTraversal {

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
        System.out.println(root.value);
        traverse(root.right);
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
