package mypackage.linkedlists.revision;

import mypackage.linkedlists.LLRecursion;

public class Main {

    public static void main(String[] args) {
        RemoveNNodeFromBack list = new RemoveNNodeFromBack();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.removeKthNode(5);
        list.display();
    }
}
