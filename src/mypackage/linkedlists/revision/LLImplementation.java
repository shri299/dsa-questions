package mypackage.linkedlists.revision;

import mypackage.linkedlists.LL;

public class LLImplementation {

    Node head;

    ///////////////////////////INSERT FIRST///////////////////////////
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
    }

    //////////////////////////INSERT LAST////////////////////////////
    public void insertLast(int val){
        if (head==null){
            insertFirst(val);
        }else {
            Node node = new Node(val);
            Node itr = head;
            while (itr.next!=null){
                itr = itr.next;
            }

            itr.next=node;
            node.next=null;
        }
    }

    /////////////////////////INSERT IN BETWEEN////////////////////
    public void insertInBetween(int val, int index){
        boolean isValidIndex = false;
        if (index==0){
            isValidIndex=true;
            insertFirst(val);
        }else {
            Node node = new Node(val);
            Node temp = head;
            int counter = 0;
            while (temp!=null) {
                counter++;
                if (counter == index) {
                    isValidIndex = true;
                    Node temp1 = temp.next;
                    temp.next = node;
                    node.next = temp1;
                }
                temp = temp.next;
            }
        }

        if (!isValidIndex){
            System.out.println("Out of range index");
        }
    }


    ////////////////////////INSERT USING RECURSION PART1/////////////
    public void insertUsingRecursion(int val,int index,Node temp){
        if (index==1){
            Node node = new Node(val);
            node.next=temp.next;
            temp.next=node;
            return;
        }
        temp=temp.next;
        insertUsingRecursion(val,index-1,temp);
    }

    //////////////////////////INSERT USING RECURSION PART TWO/////////
    public Node insertRecursion(int val, int index, Node node){
        if (index==0){
            Node temp = new Node(val,node);
            return temp;
        }

        node.next = insertRecursion(val,index--,node.next);
        return node;
    }


    ///////////////////////////DELETE FIRST/////////////////////////
    public void deleteFirst(){
        if (head==null){
            System.out.println("Nothing to delete");
        }else {
//            Node node = head;
//            head = node.next;
            head = head.next;
        }
    }

    ////////////////////////DELETE LAST/////////////////////////////
    public void deleteLast(){
        if (head==null){
            System.out.println("nothing to delete");
        } else if (head.next==null) {
            head=null;
        } else {
            Node curr = head;
            while (curr.next.next!=null){
                curr = curr.next;
            }
            curr.next=null;
        }
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

        public Node (int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
