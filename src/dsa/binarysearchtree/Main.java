package dsa.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        int[] num = {15,10,5,14,20,16,25};
        Implementation bst = new Implementation();
        bst.insertMultiple(num);
        bst.display();
        //System.out.println(bst.balanced());
        System.out.println(bst.kthSmallest(bst.root,2));

        //convert sorted array to BST

//        int[] nums = {0,1,2,3,4,5,6,7,8,9};
//        Implementation bst = new Implementation();
//        bst.insertSorted(nums);
//        bst.display();

    }


}
