package week1.q27;

class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0)
            return 0;

        int i = 0;
        int j = nums.length - 1;
        int length = nums.length;
        while (i < j) {
            while (i < j && nums[i] != val)
                i++;
            while (i < j && nums[j] == val)
                j--;
            if (i < j)
                nums[i++] = nums[j--];
        }

        if (nums[i] == val)
            return i;
        else if (j < i)
            return i;
        else
            return i + 1;
    }
}
