package dsa.recursion;

public class Palindrome {

    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = isPalindrome(str, 0, str.length() - 1);
        System.out.println(str + " is palindrome: " + isPalindrome);

    }

    private static boolean isPalindrome(String str, int i, int i1) {
        if (i >= i1) {
            return true;
        }
        if (str.charAt(i) != str.charAt(i1)) {
            return false;
        }
        return isPalindrome(str, i + 1, i1 - 1);
    }


}
