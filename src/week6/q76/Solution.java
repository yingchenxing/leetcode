package week6.q76;

import java.util.Arrays;

class Solution {
    public String minWindow(String s, String t) {
        int[] chars = new int[128];
        boolean[] flag = new boolean[128];

        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i)]++;
            flag[t.charAt(i)] = true;
        }

        int l = 0, lMin = 0, count = 0, Min = s.length() + 1, r;
        for (r = 0; r < s.length(); r++) {
            if (flag[s.charAt(r)]) {
                if (--chars[s.charAt(r)] >= 0)
                    count++;
                while (count == t.length()) {
                    if (r - l + 1 < Min) {
                        lMin = l;
                        Min = r - l + 1;
                    }
                    if (flag[s.charAt(l)] && ++chars[s.charAt(l)] > 0) {
                        count--;
                    }
                    l++;
                }
            }
        }
        if (Min == s.length() + 1)
            return "";
        return s.substring(lMin, lMin + Min);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        solution.minWindow(s, t);
    }
}
