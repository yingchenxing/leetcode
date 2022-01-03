package week1.q88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m, j = n, k = m + n;

        while (j > 0) {
            if (i > 0 && nums1[i - 1] > nums2[j - 1]) {
                nums1[--k] = nums1[--i];
            } else {
                nums1[--k] = nums2[--j];
            }
        }


//        for(i = n;i<n+m;i++,j++){
//            nums1[i]=nums2[j];
//        }
//        Arrays.sort(nums1);
    }
}