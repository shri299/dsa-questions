package dsa.bitmanipulation;

public class FindSingleNumberInArrayTwo {

    //find a number which appears only once where all other numbers appear three times
    //TC: O(n)
    //SC: O(1)
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        int singleNumber = findSingleNumber(nums);
        System.out.println("The single number in the array is: " + singleNumber);
    }

    private static int findSingleNumber(int[] nums) {
        int[] bitCount = new int[32]; // Array to store count of bits at each position

        // Count bits at each position for all numbers
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitCount[i] += (num >> i) & 1; // Increment count if the ith bit is set
            }
        }

        int result = 0;
        // Reconstruct the single number from bit counts
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) { // If count is not a multiple of 3, this bit belongs to the single number
                result |= (1 << i); // Set the ith bit in the result
            }
        }

        return result;
    }
}
