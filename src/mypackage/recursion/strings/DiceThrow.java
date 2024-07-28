package mypackage.recursion.strings;

public class DiceThrow {

    public static void main(String[] args) {
        combination(4,"");
    }

    static void combination(int input, String output){
        if (input==0){
            System.out.println(output);
            return;
        }

        for (int i =1;i<=6;i++){
            if (i<=input){
                combination(input-i, output + i);
            }
        }
    }
}
