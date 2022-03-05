package week6.q88;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = Arrays.copyOfRange(nums1, 0, m);
        int l = 0, r = 0, p = 0;
        while (l < m && r < n) {
            if (nums3[l] < nums2[r])
                nums1[p++] = nums3[l++];
            else
                nums1[p++] = nums2[r++];
        }
        while(l<m)
            nums1[p++] = nums3[l++];

        while(r<n)
            nums1[p++] = nums2[r++];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
    }
}
