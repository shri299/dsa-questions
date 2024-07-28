package mypackage.recursion.backtracking;

public class CountPathOfMaze {

    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    static int count(int r, int c){
        if (r==1 || c==1){
            return 1;
        }

        int count = 0;

        count = count + count(r-1,c);
        count = count + count(r,c-1);

        return count;
    }
}
