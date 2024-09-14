package revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfsImplementation {

    Node root;
    Queue<Node> queue = new LinkedList<>();

    class Node {
        int val;
        Node left;
        Node right;

        public Node (int val){
            this.val=val;
        }
    }

    public void insertMultiple(int[] num){
        for (int n: num){
            root = insert(n,root);
        }
    }

    private Node insert(int n, Node root) {
        if (root==null){
            return new Node(n);
        }
        if (n<root.val){
            root.left = insert(n,root.left);
        }

        if (n>root.val){
            root.right = insert(n,root.right);
        }

        return root;
    }

    public void display(){
        displayHelper(root,"");
    }

    private void displayHelper(Node root, String indent) {
        if (root==null){
            return;
        }
        System.out.println(indent+root.val);
        displayHelper(root.left,indent+"---");
        displayHelper(root.right,indent+"---");
    }


    //breadth first search or level order traversal

    public void levelOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.val);

        if (root.left!=null){
            queue.offer(root.left);
        }

        if (root.right!=null){
            queue.offer(root.right);
        }

        levelOrder(queue.poll());

    }

    public void iterativeLevelOrder(Node root){
        if(root==null){
            System.out.println("Nothing to traverse");
            return;
        }

        queue.offer(root);

        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.val+" ");

            if(node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
        }
    }

    public List<List<Integer>> iterativeBFS(Node root){
        if (root==null){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i=0;i<levelSize;i++){
                Node node = queue.poll();
                subList.add(node.val);
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(subList);
        }

        return result;

    }
}
