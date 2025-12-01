package dsa.bitmanipulation;

public class ClearTheIthBit {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int i = 3; // We want to clear the 3rd bit (0-indexed)

        int newNumber = clearIthBit(number, i);
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number after clearing the " + i + "th bit: " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    private static int clearIthBit(int number, int i) {
        int mask = ~(1 << i); // Create a mask by left shifting 1 by i positions and then negating it
        return number & mask; // Use AND operation to clear the ith bit
    }
}
