package week7.competition.q6017;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
//    public long minimalKSum(int[] nums, int k) {
//        long ans = 0;
//
//        Arrays.sort(nums);
//
//        int a = 1;
//        while(a<nums[0]&&k>0){
//            ans+=a;
//            k--;
//            a++;
//        }
//
//        for(int i = 0;i<nums.length-1&&k>0;i++){
//            if(nums[i]<nums[i+1]-1)
//            {
//                a = nums[i]+1;
//                while(a<nums[i+1]&&k>0){
//                    ans+=a;
//                    k--;
//                    a++;
//                }
//            }
//        }
//
//        if(k==0)
//            return ans;
//
//        a = nums[nums.length-1]+1;
//        while(k>0){
//            ans+=a;
//            k--;
//            a++;
//        }
//        return ans;
//    }

    public long minimalKSum(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        long sum = 0;
        for(int i :nums){
            if(!set.contains(i)&&i<=k){
                k++;
                sum+=i;
            }
            set.add(i);
        }
        long ans = k*(k+1)/2-sum;
        return ans;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {96, 44, 99, 25, 61, 84, 88, 18, 19, 33, 60, 86, 52, 19, 32, 47, 35, 50, 94, 17, 29, 98, 22, 21, 72, 100, 40, 84};
        System.out.println(s.minimalKSum(num, 17));
    }
}