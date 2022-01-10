package week2.q153;

class Solution {
    public static int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return findMin(nums, 0, nums.length - 1);
    }


    public static int findMin(int[] nums, int l, int r) {
        if (l == r)
            return nums[r];

        int m = (l + r) / 2;
        if (nums[m] > nums[r]) {
            return findMin(nums, m + 1, r);
        } else {
            return findMin(nums, l, m);
        }
    }

    public static void main(String[] args) {
        System.out.println(
                Solution.findMin(new int[]{3, 4, 5, 1, 2}));
    }
}
