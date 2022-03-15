package week7.q154;

class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if(mid-1>=start&&nums[mid]<nums[mid-1])
                return nums[mid];

            if(nums[mid]>nums[end])
                start = mid+1;
            else if(nums[mid]<nums[end])
                end = mid-1;
            else
                end--;

        }
        return nums[start];
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] num = {2,2,2,0,0,1};
        System.out.println(s.findMin(num));
    }
}
