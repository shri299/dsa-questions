package dsa.bitmanipulation;

public class CheckIfIthBitIsSetOrNot {

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int i = 3; // We want to check the 3rd bit (0-indexed)

        boolean isSet = isIthBitSet(number, i);
        if (isSet) {
            System.out.println("The " + i + "th bit is set.");
        } else {
            System.out.println("The " + i + "th bit is not set.");
        }
    }

    private static boolean isIthBitSet(int number, int i) {
        int mask = 1 << i; // Create a mask by left shifting 1 by i positions
        return (number & mask) != 0; // Use AND operation to check if the ith bit is set
    }
}
