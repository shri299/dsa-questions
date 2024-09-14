package dsa.patterns;

public class ProblemOne {

    public static void main(String[] args) {
//        patternOne(4);
//        patternTwo(4);
//        patternThree(4);
//        patternFour(4);
        patternFive(5);
    }

    private static void patternFive(int n) {
        for (int i=1;i<=2*n-1;i++){
            if (i>=1 && i<=5){

                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();

            } else {
                System.out.println("something");
            }
        }
    }

    private static void patternFour(int n) {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patternThree(int n) {
        for (int i = 0;i<n;i++){ //4 is the number of row
            //for every row run the cols
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patternTwo(int n) {
        for (int i = 0;i<n;i++){ //4 is the number of row
            //for every row run the cols
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void patternOne(int n) {
        for (int i = 0;i<n;i++){ //4 is the number of row
            //for every row run the cols
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
