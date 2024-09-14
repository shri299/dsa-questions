package dsa.recursion;

public class Steps {

    public static void main(String[] args) {
        System.out.println(steps(4,0));
    }

    private static int steps(int num, int count) {
        if (num==0){
            return count;
        }
        if (num%2==0) {
            return steps(num / 2, count + 1);
        }
        return steps(num-1,count+1);

    }
}
