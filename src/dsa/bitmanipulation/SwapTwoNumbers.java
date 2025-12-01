package dsa.bitmanipulation;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 10; // 1010

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using XOR
        a = a ^ b; // Step 1: a now becomes 15 (1111)
        b = a ^ b; // Step 2: b becomes 5 (0101) // (a ^ b) ^ b = a
        a = a ^ b; // Step 3: a becomes 10 (1010) // (a ^ b) ^ a = b

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
