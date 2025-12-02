package dsa.bitmanipulation;

public class FindSingleNumberInArray {


    //TC: O(n)
    //SC: O(1)

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = findSingleNumber(nums);
        System.out.println("The single number in the array is: " + singleNumber);
    }

    private static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation to find the unique number
        }
        return result;
    }
}
