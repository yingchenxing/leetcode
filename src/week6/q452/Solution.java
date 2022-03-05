package week6.q452;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int pointer = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > points[pointer][1]||ans==0) {
                pointer = i;
                ans++;
            }
        }
        return ans;
    }
}
