package week5.q392;

import java.util.Arrays;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        if (s.length() == 1 && t.contains(s))
            return true;
        int sp = 0, tp = 0;
        while (tp < t.length() && sp < s.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
                tp++;
            } else
                tp++;
        }
        if (sp == s.length())
            return true;
        else
            return false;
    }


//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] num = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
//        System.out.println(s.combinationSum4(num, 3));
//    }
}