package dsa.maths;

public class MoveZeroToLast {

    //move all the zeroes in ana array to last
    public static void main(String[] args) {
        int[] nums = {0,1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }

            int end_count = nums.length - index + 1;
            for(int t = 1;t<end_count;t++){
                nums[index] = 0;
                index++;
            }

    }
}
