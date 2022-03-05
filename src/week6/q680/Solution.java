package week6.q680;

import java.util.Arrays;

class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int count = 1;
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return isp(s,l+1,r)||isp(s,l,r-1);
            }
        }
        return true;
    }

    public boolean isp(String s, int beg, int end){
        while(beg<=end){
            if(s.charAt(beg)==s.charAt(end))
            {
                beg++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ebcbbececabbacecbbcbe";
        solution.validPalindrome(s);
    }
}
