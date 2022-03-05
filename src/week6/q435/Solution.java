package week6.q435;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
//        quickSort(intervals, 0, intervals.length - 1);
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int pointer = 0;
        int ans = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[pointer][1] > intervals[i][0])
                ans++;
            else
                pointer = i;
        }
        return ans;
    }

//    public void quickSort(int[][] nums, int l, int r) {
//        int temp = nums[l][1];
//        int i = l, j = r;
//        while (i < j) {
//            while (i < j && nums[i][1] < temp)
//                i++;
//            while (i < j && nums[j][ 1] > temp)
//                j--;
//            if (nums[i][1] == nums[j][ 1] && i < j)
//                i++;
//            else {
//                int[] m;
//                m = nums[i];
//                nums[i] = nums[j];
//                nums[j] = m;
//            }
//        }
//        if (i - 1 > l)
//            quickSort(nums, l, i - 1);
//        if (i + 1 < r)
//            quickSort(nums, i + 1, r);
//    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(solution.eraseOverlapIntervals(nums));
    }
}
