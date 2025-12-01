package dsa.bitmanipulation;

public class SettingTheIthBit {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int i = 1; // We want to set the 1st bit (0-indexed)

        int newNumber = setIthBit(number, i);
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number after setting the " + i + "th bit: " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    private static int setIthBit(int number, int i) {
        int mask = 1 << i; // Create a mask by left shifting 1 by i positions
        return number | mask; // Use OR operation to set the ith bit
    }
}
