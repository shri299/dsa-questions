package dsa.bitmanipulation;

public class CountNumberOfSetBits {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int count = countSetBits(number);
        System.out.println("Number of set bits in " + number + " (Binary: " + Integer.toBinaryString(number) + ") is: " + count);
    }

    private static int countSetBits(int number) {
        int count = 0;
        while (number > 0) {
            number &= (number - 1); // Clear the rightmost set bit
            count++; // Increment count for each set bit found
        }
        return count;
    }
}
