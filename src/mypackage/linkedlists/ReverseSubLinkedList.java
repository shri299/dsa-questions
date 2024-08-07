package mypackage.linkedlists;

public class ReverseSubLinkedList {

    Node head;

    public Node reverseBetween(Node head, int left, int right) {
        if (left==right)
        {
            return head;
        }

        Node current = head;
        Node previous = null;

        for (int i=0; current!=null && i<left-1;i++){
            previous = current;
            current = current.next;
        }

        Node last = previous;
        Node new_end = current;

        //reverse between left and right
        Node temp = current.next;
        for (int i=0;current!=null && i<right-left+1;i++){
            current.next = previous;
            previous = current;
            current = temp;
            if (temp!=null){
                temp = temp.next;
            }
        }

        if (last!=null){
            last.next=previous;
        }else {
            head=previous;
        }

        new_end.next=current;
        return head;
    }


    class Node{
        int val;
        Node next;

        public Node (int val){
            this.val=val;
        }

        public Node (int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
