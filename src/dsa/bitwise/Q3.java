package dsa.bitwise;

public class Q3 {

    //find ith bit of a number
    public static void main(String[] args) {
        int n = 32;
        int key = 5;

        int bit_mask = 1 << (key-1);
        int result = (n & bit_mask) >> (key-1); // Shift right to get the bit value

        System.out.println(n & (1<<(n-1)));  // Print the value of the key-th bit
    }
}
