package dsa.recursion.strings;

public class RemoveCharacter {

    //remove all the letter "a" from a given string

    public static void main(String[] args) {
        removeLetter("bcaacata");

        StringBuilder answer = new StringBuilder();
        removeLetterRecursion("bcaacata",answer, 0);
        System.out.println(answer);

        System.out.println(recursionOne("bcaacata",0));

        recursionTwo("bcaacata","");

        System.out.println(recursionThree("bcaacata"));
    }

    public static void removeLetter(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = str.toCharArray();
        for (char c :array){
            if (c!='a'){
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }

    //taking the answer in argument itself
    public static void removeLetterRecursion(String string,StringBuilder answer, int index){
        if (index==string.length()-1){
            return;
        }
        if (string.charAt(index)!='a'){
            answer.append(string.charAt(index));
            index = index + 1;
            removeLetterRecursion(string,answer,index);
        }else {
            index = index + 1;
            removeLetterRecursion(string,answer,index);
        }
    }

    //returning the answer up the recursion hierarchy

    public static StringBuilder recursionOne(String string, int index){
        StringBuilder ans = new StringBuilder();
        if (index==string.length()-1){
            return ans;
        }
        if (string.charAt(index)!='a'){
            ans.append(string.charAt(index));
        }
        ans.append(recursionOne(string, index + 1));
        return ans;

    }

    public static void recursionTwo(String input, String output){
        if (input.isEmpty()){
            return;
        }
        char ch = input.charAt(0);
        System.out.println(output);
        if (ch=='a'){
            recursionTwo(input.substring(1),output);
        }else {
            recursionTwo(input.substring(1),output + ch);
        }
    }

    public static String recursionThree(String input){
        if (input.isEmpty()){
            return "";
        }
        char ch = input.charAt(0);
        if (ch=='a'){
            return recursionThree(input.substring(1));
        }else {
            return ch + recursionThree(input.substring(1));
        }
    }
}
