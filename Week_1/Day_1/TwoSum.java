package Week_1.Day_1;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
            int key = nums[i];
            int more = target - key ;
            if(mp.containsKey(more)){
                return new int[]{mp.get(more),i};
            }
            mp.put(key , i);
        }
        return new int[]{};
    }
}
