package revision;

public class BstImplementation {

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

    public int getHeight(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }

    public void insert(int val){
        root = insertHelper(root,val);
    }

    public void insertArray(int[] num) {
        for (int n : num){
            root = insertHelper(root,n);
        }
    }

    public void insertSorted(int[] num){
        insertSortedVal(num,0,num.length);
    }

    private void insertSortedVal(int[] num, int i, int i1) {
        if (i>i1){
            return;
        }
        int mid = (i + i1)/2;
        insert(num[mid]);
        insertSortedVal(num,i,mid); //first build the entire left of the root
        insertSortedVal(num,mid+1,i1); //then build the entire right of the root
    }

    private Node insertHelper(Node root, int val) {
        if(root==null){
            return new Node(val);
        }

        if (val<root.val){
            root.left = insertHelper(root.left,val);
        }

        if (val> root.val){
            root.right = insertHelper(root.right,val);
        }

        root.height = Math.max(getHeight(root.left),getHeight(root.right))+1;

        return root;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node root) {
        if (root==null){
            return true;
        }

        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && balanced(root.left) && balanced(root.right);
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

    public void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if (root==null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.val);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if (root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.val);
    }
}
