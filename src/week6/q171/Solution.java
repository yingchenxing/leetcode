package week6.q171;

class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        for (int i = 0; i < n; i++) {
            ans += Math.pow(26,n-1-i)*(columnTitle.charAt(i)-'A'+1);
        }
        return ans;
    }
}