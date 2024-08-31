package mypackage.tree;

import mypackage.binaryTree.Implementation;

import java.util.*;

public class BfsOrLevelOrder {

    Node root;
    Queue<Node> queue = new LinkedList<>();

    public BfsOrLevelOrder (){

    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }

   public void insertRoot(Scanner scanner){
       System.out.println("Enter the root node");
       int val = scanner.nextInt();
       root = new Node(val);

       insertNonRoot(root,scanner);
   }

    private void insertNonRoot(Node root, Scanner scanner) {
        System.out.println("Do you wish to enter left child of: "+root.val);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter left child of: "+root.val);
            int leftVal = scanner.nextInt();
            root.left = new Node(leftVal);
            insertNonRoot(root.left,scanner);
        }

        System.out.println("Do you wish to enter right child of: "+root.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter right child of: "+root.val);
            int leftVal = scanner.nextInt();
            root.right = new Node(leftVal);
            insertNonRoot(root.right,scanner);
        }
    }


    public void display(Node root){
        if (root==null){
            return;
        }
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

    public void traversal(Node node){
        if (node==null){
            return;
        }
        if (node==root){
            System.out.println(root.val);
        }
        if (node.left!=null){
            System.out.println(node.left.val);
            queue.add(node.left);
        }
        if (node.right!=null){
            System.out.println(node.right.val);
            queue.add(node.right);
        }
        traversal(queue.poll());
    }

    public void iterativeTraversal(Node root){
        queue.offer(root);
        System.out.println(root.val);
        while (!queue.isEmpty()){
            Node target = queue.peek();
            if (target.left!=null){
                System.out.println(target.left.val);
                queue.offer(target.left);
            }
            if (target.right!=null){
                System.out.println(target.right.val);
                queue.offer(target.right);
            }
            queue.poll();
        }
    }

    public List<List<Integer>> iterativeTraversalTwo(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size(); //initially its 0
            List<Integer> subList = new ArrayList<>();
            for (int i=0;i<levelSize;i++){
                Node target = queue.poll();
                subList.add(target.val);
                if (target.left!=null){
                    queue.offer(target.left);
                }
                if (target.right!=null){
                    queue.offer(target.right);
                }
            }
            result.add(subList);
        }
        return result;
    }


}
