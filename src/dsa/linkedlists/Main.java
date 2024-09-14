package dsa.linkedlists;

public class Main {

    public static void main(String[] args) {
        PalindromeLL palindromeLL = new PalindromeLL();
        palindromeLL.insertFirst(1);
        palindromeLL.insertFirst(1);
        palindromeLL.insertFirst(2);
        palindromeLL.insertFirst(1);
        //palindromeLL.display();
        System.out.println(palindromeLL.reverseList());
        //palindromeLL.display();
    }
}
