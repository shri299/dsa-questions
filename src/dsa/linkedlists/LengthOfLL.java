package dsa.linkedlists;

public class LengthOfLL {

    public static void main(String[] args) {

    }

    public static int length(Node head){
        int length=0;
        Node temp = head;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    class Node{
        int val;
        Node next;

        public Node (int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
