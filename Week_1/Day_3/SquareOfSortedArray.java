package Week_1.Day_3;

import java.util.Arrays;

public class SquareOfSortedArray {
        public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
