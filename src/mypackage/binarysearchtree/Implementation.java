package mypackage.binarysearchtree;

public class Implementation {

    Node root;

    public Implementation(){

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

        return node;

    }

    public void insertMultiple(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void insertSorted(int[] nums){
        insertSorted(nums,0,nums.length);
    }

    private void insertSorted(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(nums[mid]);
        insertSorted(nums,start,mid);
        insertSorted(nums,mid+1,end);
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
}
