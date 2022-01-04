package week2.q34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1, -1};
        return searchRange(nums, 0, nums.length - 1, target);
    }

    public int[] searchRange(int[] nums, int l, int r, int target) {
        if (r<=l) {
            if (nums[r] == target && nums[l] == target)
                return new int[]{l,r};
            else
                return new int[]{-1, -1};
        }

        int length = (l+r) / 2;
        if (nums[length] < target)
            return searchRange(nums, length + 1, r, target);
        else if (nums[length] > target)
            return searchRange(nums, l, length - 1, target);

        int i = l;
        int j = r;
        while (nums[i] != target)
            i++;
        while (nums[j] != target)
            j--;
        return new int[]{i, j};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.searchRange(new int[]{5,7,7,8,8,10}, 8);
    }
}
