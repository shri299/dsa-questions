package dsa.binarysearch;

public class Howmanytimesarrayrotated {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{15, 18, 2, 3, 6, 12}));
    }

    public static int findMin(int[] nums) {
        // Initialize low and high pointers
        int low = 0, high = nums.length - 1;

        while (low < high) {

            // Calculate mid index
            int mid = low + (high - low) / 2;

            // Check which half to discard
            if (nums[mid] > nums[high]) {

                // Minimum lies in right half
                low = mid + 1;

            } else {

                // Minimum lies in left half (including mid)
                high = mid;
            }
        }

        // Return the minimum element
        return low;

    }
}
