package dsa.bitmanipulation;

public class SetTheRightMostBit {

    public static void main(String[] args) {
        int number = 32; // Binary: 100000

        int newNumber = setRightMostBit(number);
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number after setting the rightmost unset bit: " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    private static int setRightMostBit(int number) {
        return number | (number + 1); // Use OR operation with (number + 1) to set the rightmost unset bit
    }
}
