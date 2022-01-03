package week1.q350;

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return null;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[Math.min(nums1.length, nums2.length)];

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;

            else {
                res[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] n1 = {4, 9, 5};
        int[] n2 = {9, 4, 9, 8, 4};
        System.out.println(solution.intersect(n1, n2));
    }

}