package dsa.binarysearchtree.selfbalancingtree;

public class Main {

    public static void main(String[] args) {
        int[] num = {15,10,5,14,20,16,25,4,3};
        AVLTree bst = new AVLTree();
        bst.insertMultiple(num);
        bst.display();
        System.out.println(bst.balanced());
    }
}
