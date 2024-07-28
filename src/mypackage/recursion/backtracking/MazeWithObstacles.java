package mypackage.recursion.backtracking;

public class MazeWithObstacles {

    public static void main(String[] args) {
        printPath(3,3,"");
    }

    public static void printPath(int r, int c, String output){
        if (r==1 && c==1){
            System.out.println(output);
            return;
        }
        if (r==2 && c==2){
            return;
        }
        if (r>1){
            printPath(r-1,c,output+"d");
        }if (c>1){
            printPath(r,c-1,output+"r");
        }
    }
}
