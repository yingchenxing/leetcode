package week7.q540;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (r + l) / 2;
            if((m+1>= nums.length||nums[m]!=nums[m+1])&&(m-1<0||nums[m]!=nums[m-1]))
                return nums[m];
            if (m % 2 == 0) {//m 为偶数
                if (nums[m + 1] == nums[m]) {//右侧
                    l = m+1;
                } else
                    r = m-1;
            } else {//m为奇数
                if (nums[m + 1] == nums[m]) {//左侧
                    r = m-1;
                } else
                    l = m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = new int[]{2,0,0};
        System.out.println(solution.singleNonDuplicate(num));
    }
}