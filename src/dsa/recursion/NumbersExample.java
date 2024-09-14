package dsa.recursion;

public class NumbersExample {

    public static void main(String[] args) {
        printNum(1);
    }

    public static void printNum(int n){
        System.out.println(n);
        n = n+1;
        if (n<=5){ //terminating condition
            printNum(n);
        }
    }

    //recursion is a function that calls itself
    //a function stays in the stack memory until it is at the terminating statement
}
