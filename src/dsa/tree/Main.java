package dsa.tree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BfsOrLevelOrder bfs = new BfsOrLevelOrder();
//        bfs.insertRoot(new Scanner(System.in));
//        bfs.display(bfs.root);
//        bfs.iterativeTraversal(bfs.root);

//        AverageOfLevels bfs = new AverageOfLevels();
//        bfs.insert(new Scanner(System.in));
//        bfs.display();
//        System.out.println(bfs.calculateAverage(bfs.root));

        LevelOrderSuccessor bfs = new LevelOrderSuccessor();
        bfs.insert(new Scanner(System.in));
        bfs.display();
        //bfs.calculate(bfs.root,3);
        System.out.println(bfs.traversal(bfs.root));
    }
}
