package dsa.linkedlists.revision;

public class RemoveNNodeFromBack {

    Node head;

    public void removeKthNode(int n){
        if (head==null){
            return;
        }

        Node temp = head;
        int length=0;

        while(temp!=null){
            temp=temp.next;
            length = length+1;
        }

        int itr_length=length-n;

        Node prev = head;
        temp = head;

        if (itr_length==0){

            if (head.next==null)
                return;
            else {
                head = head.next;
            }

        }else {

            for (int i=0;i<itr_length;i++){
                prev = temp;
                temp = temp.next;
            }

            prev.next=temp.next;

        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
    }

    public void display(){
        Node itr = head;
        while (itr!=null){
            System.out.print(itr.val+" -> ");
            itr=itr.next;
        }
        System.out.print("end");
    }

    public class Node{
        int val;
        Node next;

        public Node (){

        }

        public Node (int val){
            this.val=val;
        }

        public Node (int val, Node node){
            this.val=val;
            this.next=node;
        }
    }
}
