package mypackage.tree;

public class ConvertBTtoDLL {

    Node root;
    DLL head;
    DLL tail;

    class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val= val;
        }
    }

    class DLL {
        int val;
        DLL next;
        DLL prev;

        public DLL (int val){
            this.val=val;
        }
    }

    public void BTtoDLL(Node root){
        if(root==null){
            return;
        }

        BTtoDLL(root.left);
        DLL curr = new DLL(root.val);
        if(head==null){
            head=curr;
            head.prev=null;
            tail = head;
        }else{
            curr.prev=tail;
            tail.next=curr;
            tail = curr;
        }
        BTtoDLL(root.right);
    }
}
