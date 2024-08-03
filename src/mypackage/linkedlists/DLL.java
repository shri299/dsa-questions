package mypackage.linkedlists;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL (){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
        size=size+1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if (head==null){
            insertFirst(val);
            tail=head;
        }
        else {
            while (temp.next!=null){
                temp=temp.next;
            }
            node.prev=temp;
            temp.next=node;
            node.next=null;
            tail=node;
        }
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.val+"->");
            last=temp;
            temp = temp.next;
        }
        System.out.println("end");
        System.out.println("print in reverse");
        while (last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.print("end");
    }

    public class Node{
        private int val;
        private Node prev;
        private Node next;

        public Node (int val, Node prev, Node next){
            this.val=val;
            this.prev=prev;
            this.next=next;
        }

        public Node (int val){
            this.val=val;
        }
    }
}
