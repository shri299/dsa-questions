package revision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bfsImplementation bfs = new bfsImplementation();
//        bst.insert(10);
//        bst.insert(5);
//        bst.insert(20);
//        bst.insert(3);
//        bst.insert(7);
//        bst.insert(15);
//        bst.insert(25);

        int[] num = {10,5,20,3,7,15,25};
        bfs.insertMultiple(num);
        bfs.display();
        System.out.println(bfs.iterativeBFS(bfs.root));
    }
}
