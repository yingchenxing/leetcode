package week4.q162;

import java.util.Arrays;

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1||nums[0]>nums[1])
            return 0;

        int i =0;
        for( i = 1;i< nums.length-1;i++){
            if(nums[i] >nums[i+1]&&nums[i]>nums[i-1])
                return i;
        }
        if(nums[i]>nums[i-1])
            return i;
        return -1;
    }
}
