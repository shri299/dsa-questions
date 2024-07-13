package mypackage.recursion;

public class PatternWithRecursion {

    public static void main(String[] args) {
        fun2(    1,1, 4);
    }

    public static void fun(int row, int col){
        if (row==0){
            return;
        }
        if (row>col){
            System.out.print("*");
            fun(row,col+1);
        } else {
            System.out.println();
            fun(row-1,0);
        }
    }

    public static void fun3(int row, int col){
        if (row==0){
            return;
        }
        if (row>col){
            fun(row,col+1);
            System.out.print("*");
        } else {
            fun(row-1,0);
            System.out.println();
        }
    }

    public static void fun2(int r, int c, int max){
        if (r>max){
            return;
        }
        if (r>c){
            System.out.print("*");
            fun2(r,c+1,max);
        } else if (r==c){
            System.out.print("*");
            System.out.println();
            fun2(r+1,1,max);
        }
    }
}
