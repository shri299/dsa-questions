package dsa.bitmanipulation;

public class ToggleTheIthBit {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int i = 2; // We want to toggle the 2nd bit (0-indexed)

        int newNumber = toggleIthBit(number, i);
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number after toggling the " + i + "th bit: " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    private static int toggleIthBit(int number, int i) {
        int mask = 1 << i; // Create a mask by left shifting 1 by i positions
        return number ^ mask; // Use XOR operation to toggle the ith bit
    }
}
