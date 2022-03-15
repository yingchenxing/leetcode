package week7.q451;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public String frequencySort(String s) {
        int[][] num = new int[256][2];


        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i)][1]++;
            num[s.charAt(i)][0] = s.charAt(i);
        }

        Arrays.sort(num, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return -o1[1] + o2[1];
            }
        });

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            while (num[i][1] > 0) {
                ans.append((char) (num[i][0]));
                num[i][1]--;
            }
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Aabb";
        System.out.println(solution.frequencySort(s));
    }
}