package mypackage.recursion.strings;

public class RemoveString {

    //remove string
    public static void main(String[] args) {
        System.out.println(skipString("bcappledfg"));
    }

    public static String skipString(String string){
        if (string.isEmpty()){
            return "";
        }
        if (string.startsWith("apple")){
            return skipString(string.substring(5));
        }else {
            return string.charAt(0) + skipString(string.substring(1));
        }
    }
}
