package dsa.linkedlists;

import com.sun.source.tree.BreakTree;

public class ReverseLLRecursion {


    public static void main(String[] args) {

    }


    public void reverse(Node node, Node newNext){
        if (node==null){
            return;
        }
        Node itr = node.next;
        node.next = newNext;
        newNext = node;
        reverse(itr,newNext); //null

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
