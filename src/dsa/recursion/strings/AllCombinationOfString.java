package dsa.recursion.strings;

import java.util.ArrayList;

public class AllCombinationOfString {

    //find all the possible subsets of a string

    public static void main(String[] args) {
        subset("","abc");
        System.out.println(subsetOne("","abc"));
    }

    public static void subset(String output, String input){
        if (input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);

        //add
        subset(output+ch,input.substring(1));

        //remove
        subset(output,input.substring(1));
    }

    //return the subset in an array list

    //passing all the child answer to the parent(up the recursion call)
    public static ArrayList<String> subsetOne(String output, String input){
        ArrayList<String> ans = new ArrayList<>();
        if (input.isEmpty()){
            ans.add(output);
            return ans;
        }
        char ch = input.charAt(0);

        //add
        ans.addAll(subsetOne(output+ch,input.substring(1)));

        //remove
        ans.addAll(subsetOne(output,input.substring(1)));

        return ans;
    }

}
