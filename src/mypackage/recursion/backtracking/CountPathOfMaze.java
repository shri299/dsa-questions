package mypackage.recursion.backtracking;

public class CountPathOfMaze {

    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //printPath(3,3,"");
        printPathDiagonal(3,3,"");
    }

    //count number of ways to reach end
    static int count(int r, int c){
        if (r==1 || c==1){
            return 1;
        }

        int count = 0;

        count = count + count(r-1,c);
        count = count + count(r,c-1);

        return count;
    }

    //print path to reach maze
    static void printPath(int r, int c, String output){

        if (r==1 && c==1){
            System.out.println(output);
            return;
        }

        if (r>1){
            printPath(r-1,c,output+"d");
        }
        if (c>1){
            printPath(r,c-1,output+"r");
        }

    }

    //we can also go diagonally

    static void printPathDiagonal(int r, int c, String output){

        if (r==1 && c==1){
            System.out.println(output);
            return;
        }

        if (r>1){
            printPathDiagonal(r-1,c,output+"d");
        }
        if (c>1){
            printPathDiagonal(r,c-1,output+"r");
        }
        if (r>1 && c>1){
            printPathDiagonal(r-1,c-1,output+"x");
        }

    }
}
