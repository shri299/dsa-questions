package dsa.recursion.strings;

import java.util.ArrayList;

public class PermutationsOfString {

    public static void main(String[] args) {
        //permutations("abc","");
        //System.out.println(permutationsReturnArray("abc",""));
        System.out.println(permutationsCount("abc",""));
    }

    static void permutations(String input, String output){
        if (input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);

        for (int i=0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i,output.length());
            permutations(input.substring(1),first+ch+second);
        }

    }

    static ArrayList<String> permutationsReturnArray(String input, String output){
        if (input.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(output);
            return list;
        }
        char ch = input.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i,output.length());
            ans.addAll(permutationsReturnArray(input.substring(1),first+ch+second));
        }

        return ans;

    }

    static int permutationsCount(String input, String output){
        if (input.isEmpty()){
            return 1;
        }
        char ch = input.charAt(0);
        int count = 0;
        for (int i=0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i,output.length());
            count = count + permutationsCount(input.substring(1),first+ch+second);
        }

        return count;
    }
}
