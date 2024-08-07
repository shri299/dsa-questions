package mypackage.linkedlists.revision;

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
    }
}
