package dsa.linkedlists.revision;

public class LLImportantQuestions {

    Node head;


    ///////REMOVE THE DUPLICATES FROM A SORTED LL////////////////////
    public void removeDuplicates(){
        Node temp = head;
        while (temp.next!=null){
            if (temp.val==temp.next.val){
                temp.next = temp.next.next;
            }else {
                temp=temp.next;
            }
        }
    }



    //////////MERGE TWO SORTED LL//////////////////////////////////
    public void mergeList(Node head, Node head1){
        Node dummyList = new Node();
        Node tail = dummyList;

        if (head.val> head1.val){
            tail.next  = head;
            head = head.next;
            tail = tail.next;
        }else {
            tail.next  = head1;
            head1 = head1.next;
            tail = tail.next;
        }

        tail.next = head!=null ? head : head1;

        //return dummyList.next
    }

    ////////////////////////REVERSE A LINKED LIST/////////////

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = head;

        while (curr!=null){
            Node temp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp1;
        }

        head = prev;
    }

    ////////////////rotate right//////////////

    public Node rotateRight( int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length = 1;

        Node temp = head;
        while(temp.next!=null){
            length = length + 1;
            temp = temp.next;
        }

        int itr_length = length-k;
        Node temp1 = head;
        for(int i=1;i<itr_length;i++){
            temp1 = temp1.next;
        }
        temp1.next=null;
        temp.next = head;

        return temp;
    }


    ///////////////////////////INSERT FIRST///////////////////////////
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
    }

    /////////////////////////DISPLAY////////////////////////////////
    public void display(){
        Node itr = head;
        while (itr!=null){
            System.out.print(itr.val+" -> ");
            itr=itr.next;
        }
        System.out.print("end");
    }

    private class Node{
        int val;
        Node next;

        public Node (int val){
            this.val=val;
        }

        public Node (int val,Node next){
            this.val=val;
            this.next=next;
        }

        public Node (){}
    }
}
