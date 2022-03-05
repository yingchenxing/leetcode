package week6.q1147;

class Solution {
    public int longestDecomposition(String text) {
        int l = 0, r = text.length()-1;
        int ans = 0;
        for (int i = 0; i <= (text.length() - 1) / 2&&l<r; i++) {
            if (text.charAt(l) == text.charAt(text.length() - 1 - i))
                if (text.substring(l, i + 1).equals(text.substring(text.length() - i - 1, r+1))) {
                    ans++;
                    l = i + 1;
                    r = text.length() - i - 2;
                }
        }
        if(l-1!=r)
            return ans*2+1;
        return ans*2;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaa";
        System.out.println(solution.longestDecomposition(s));
    }
}
