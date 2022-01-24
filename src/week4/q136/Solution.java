package week4.q136;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
//    public int singleNumber(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i : nums){
//            if(map.containsKey(i))
//                map.replace(i,2);
//            else
//                map.put(i,1);
//        }
//        for(int i : nums){
//            if(map.get(i)==1)
//                return i;
//        }
//        return -1;
//    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}

