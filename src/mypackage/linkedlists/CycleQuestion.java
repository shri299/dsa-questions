package mypackage.linkedlists;

public class CycleQuestion {

    public Node head;

    public int lengthOfCycle(Node head){
        Node fast = head;
        Node slow = head;
        //has cycle
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                break;
            }
        }

        //count length of cycle
        slow = slow.next;
        int count = 1;
        while (fast!=slow){
            slow = slow.next;
            count = count+1;
        }
        return count;
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
