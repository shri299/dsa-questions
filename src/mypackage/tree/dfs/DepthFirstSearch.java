package mypackage.tree.dfs;

import mypackage.linkedlists.revision.RemoveNNodeFromBack;

public class DepthFirstSearch {

    Node root;

    int diameter = 0;

    public DepthFirstSearch (){

    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }

    public int diameter(Node root){
        getHeight(root);
        return diameter;
    }

    private int getHeight(Node root) {
        if (root==null){
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int rootDiameter = leftHeight + rightHeight;
        diameter = Math.max(diameter,rootDiameter);

        return Math.max(leftHeight,rightHeight)+1;
    }
}
