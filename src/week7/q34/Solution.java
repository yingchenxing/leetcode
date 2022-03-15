package week7.q34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{-1, -1};

        int l = 0, r = nums.length - 1;
        int m = (l + r) / 2;
        while (l < r - 1) {
            if (nums[m] > target)
                r = m;
            else if (nums[m] < target)
                l = m;
            else
                break;
            m = (l + r) / 2;
        }

        if (nums[l] == target)
            m = l;
        else if (nums[r] == target)
            m = r;
        if (nums[m] != target)
            return new int[]{-1, -1};

        l = m;
        r = m;
        while (l - 1 >= 0 && nums[l - 1] == target)
            l--;
        while (r + 1 < nums.length && nums[r + 1] == target)
            r++;

        return new int[]{l, r};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 8, 10, 10};
        System.out.println(solution.searchRange(num,4));
    }
}