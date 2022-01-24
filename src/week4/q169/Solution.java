package week4.q169;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
