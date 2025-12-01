package dsa.bitmanipulation;

public class ClearTheRightMostBit {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101

        int newNumber = clearRightMostBit(number);
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("New number after clearing the rightmost set bit: " + newNumber + " (Binary: " + Integer.toBinaryString(newNumber) + ")");
    }

    private static int clearRightMostBit(int number) {
        return number & (number - 1); // Use AND operation with (number - 1) to clear the rightmost set bit
    }
}
