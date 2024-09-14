package dsa.recursion.strings;

public class StringCombinationWithAscii {

    //print the combination of a string along with the ascii value

    public static void main(String[] args) {
        subsetAscii("","ab");
    }

    public static void subsetAscii(String output, String input){
        if (input.isEmpty()){
            System.out.println(output);
            return;
        }

        //add
        char ch = input.charAt(0);
        subsetAscii(output+ch,input.substring(1));

        //ascii
        int ascii = (ch+0);
        subsetAscii(output+ascii,input.substring(1));

        //remove
        subsetAscii(output,input.substring(1));
    }
}
