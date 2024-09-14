package dsa.tree;

import java.util.*;

public class AverageOfLevels {

    Node root;

    public AverageOfLevels (){

    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }


    public void insert(Scanner scanner){
        System.out.println("Enter the root elements");
        int val = scanner.nextInt();
        root = new Node(val);
        insertHelper(root,scanner);
    }

    private void insertHelper(Node root, Scanner scanner) {
        System.out.println("do you wish to enter the left child of: "+root.val);
        boolean left =scanner.nextBoolean();
        if (left){
            System.out.println("Enter the left of: "+root.val);
            int leftVal = scanner.nextInt();
            root.left = new Node(leftVal);
            insertHelper(root.left,scanner);
        }

        System.out.println("do you wish to enter the right child of: "+root.val);
        boolean right =scanner.nextBoolean();
        if (right){
            System.out.println("Enter the right of: "+root.val);
            int rightVal = scanner.nextInt();
            root.right = new Node(rightVal);
            insertHelper(root.right,scanner);
        }
    }

    public void display(){
        displayHelper(root,"");
    }

    private void displayHelper(Node root, String s) {
        if (root==null){
            return;
        }
        System.out.println(s+root.val);
        displayHelper(root.left,s+"----");
        displayHelper(root.right,s+"----");
    }

    public List<Double> calculateAverage(Node root){
        List<Double> result = new ArrayList<>();
        if (root==null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            Double sum = 0.0;
            for (int i=0;i<levelSize;i++){
                Node target = queue.poll();
                sum = sum + target.val;
                if (target.left!=null){
                    queue.offer(target.left);
                }
                if (target.right!=null){
                    queue.offer(target.right);
                }
            }
            Double avg = sum/levelSize;
            result.add(avg);
        }

        return result;
    }

//    public  double formatToFiveDecimalPlaces(double value) {
//        BigDecimal bd = new BigDecimal(Double.toString(value));
//        bd = bd.setScale(5, RoundingMode.HALF_UP);
//        return bd.doubleValue();
//    }
}
