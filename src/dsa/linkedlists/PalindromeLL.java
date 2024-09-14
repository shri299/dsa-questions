package dsa.linkedlists;

public class PalindromeLL {

    Node head;

    public boolean reverseList() {
        Node prev = null;
        Node current = head;


        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        boolean isPalindrome = true;
        Node temp = head;
        Node reverse_temp = prev;
        while(temp!=null && reverse_temp!=null){
            if(temp.val!=reverse_temp.val){
                isPalindrome = false;
                break;
            }
            temp = temp.next;
            reverse_temp = reverse_temp.next;
        }

        return isPalindrome;

        //head = prev;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;
    }

    private class Node {
        private int val;
        private Node next;

        public Node (int val){
            this.val=val;
        }

        public Node (int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
