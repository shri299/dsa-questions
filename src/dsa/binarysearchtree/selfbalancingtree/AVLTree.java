package dsa.binarysearchtree.selfbalancingtree;

public class AVLTree {

    Node root;

    public AVLTree(){

    }

    class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node (int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }
    }

    public int height(Node node){
        return node==null ? -1 : node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public int getHeight(Node node){
        if (root==null)
            return -1;
        return node.height;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node==null)
            return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
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


    ////////////////////////////insert///////////////////////

    public void insertMultiple(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void insert(int val){
        root = insert(val,root);
    }

    public Node insert(int val, Node node){
        if (node==null){
            return new Node(val);
        }
        if (val<node.val){
            node.left=insert(val,node.left);
        }
        if (val>node.val){
            node.right=insert(val,node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return rotate(node);

    }

    private Node rotate(Node node) {
        if (height(node.left)-height(node.right)>1){
            //left heavy
            if (height(node.left.left)-height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }

            if (height(node.left.left)-height(node.left.right)<0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } else if (height(node.left)-height(node.right) < -1) {
            //right heavy
            if (height(node.right.right)-height(node.right.left)>0){
                //right-right case
                return leftRotate(node);
            }

            if (height(node.right.right)-height(node.right.left)<0){
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;

        node.height=Math.max(height(node.left),height(node.right))+1;
        temp.height=Math.max(height(temp.left),height(temp.right))+1;

        return temp;

    }

    private Node rightRotate(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;

        node.height=Math.max(height(node.left),height(node.right))+1;
        temp.height=Math.max(height(temp.left),height(temp.right))+1;

        return temp;
    }
}
