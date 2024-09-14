package dsa.recursion.strings;

public class RemoveString {

    //remove string
    public static void main(String[] args) {
        //System.out.println(skipString("bcappledfg"));
        System.out.println(skipStringOne("bcappopdfg"));
        System.out.println(skipStringOne("bcappledfg"));
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

    //only skip "app", when it is not equal to apple

    public static String skipStringOne(String string){
        if (string.isEmpty()){
            return "";
        }
        if (string.startsWith("app")){
            if (!string.startsWith("apple")){
                return skipStringOne(string.substring(3));
            }
            return string.charAt(0) + skipStringOne(string.substring(1));
        }else {
            return string.charAt(0) + skipStringOne(string.substring(1));
        }
    }
}
