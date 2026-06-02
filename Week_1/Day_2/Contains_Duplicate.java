package Week_1.Day_2;

import java.util.Arrays;

public class Contains_Duplicate {
        public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 1;
        Arrays.sort(nums);
        while(right<n){
            if(nums[left]==nums[right]) return true;
            left++;
            right++;
        }
        return false;
    }
}
