package dsa.linkedlists;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL (){
        this.size=0;
    }

    public void RemoveDuplicates(){
        Node node = head;
        while (node.next!=null){
            if (node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;

        if (tail==null){
            tail=head;
        }
        size = size+1;
    }

    public void deleteFirst(){
        if (head==null){
            System.out.println("no nodes available to be deleted :)");
        }else {
            Node node = head;
            head = node.next;
            size=size-1;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if (head==null){
            head=node;
            tail=head;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
            tail=node;
        }
        size=size+1;
    }

    public void deleteLast(){
        if (head==null){
            System.out.println("no nodes available to be deleted :)");
        } else if (size==1) {
            head=null;
            tail=null;
            size= 0;
        } else {
            Node temp = head;
            while (temp.next.next!=null){
                temp = temp.next;
            }
            temp.next=null;
            tail=temp;
            size=size-1;
        }
    }

    public void insertInBetween(int index, int val){
        if (index==1){
            insertFirst(val);
        }else if (index==size){
            insertLast(val);
        }else {
            Node node = new Node(val);
            Node temp = head;
            int counter = 1;
            while (temp!=null){
                counter++;
                if (counter==index){
                    Node temp1 = temp.next;
                    temp.next=node;
                    node.next=temp1;
                }
                temp=temp.next;
            }
            size=size+1;
        }
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
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
