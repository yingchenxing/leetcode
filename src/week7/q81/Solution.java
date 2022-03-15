package week7.q81;

class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            if(start == end&&nums[start]!=target)
                return false;

            int mid = (start+end)/2;

            if(nums[mid]==target)
                return true;

            if(nums[mid]==nums[start]){
                start++;
                continue;
            }


            //左递增
            if(nums[start]<nums[mid]){
                if(target<=nums[mid]&&target>=nums[start])
                    end = mid-1;
                else
                    start = mid+1;
            }else{//右递增
                if(target>=nums[mid]&&target<=nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] num = {2,5,6,0,0,1,2};
        System.out.println(s.search(num, 3));
    }
}
