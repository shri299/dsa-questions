package mypackage.recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class LetterOnAPhone {

    public static void main(String[] args) {
        System.out.println(combinations("23",""));
    }


    //print the combinations
    //return the list of combinations
    //return the count of combinations

    static List<String> combinations(String input, String output){
        List<String> ans = new ArrayList<>();
        if (input.isEmpty()){
            ans.add(output);
            return ans;
        }

        int digit = input.charAt(0) - '0'; //convert from character to integer

        for (int i = 3*(digit-1);i<3*digit;i++){
            if (i==26){
                continue;
            }
            char ch = (char)('a' + i);
            ans.addAll(combinations(input.substring(1),output+ch));
        }

        return ans;
    }
}
