package week3.q139;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (dp[i] == true && wordDict.contains(s.subSequence(i, j))) {
                    dp[j] = true;
                    if(j==s.length())
                        return true;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = new String("aaaaaaa");
        List<String> list = new ArrayList<>();
        list.add(new String("aaaa"));
        list.add(new String("aaa"));
        System.out.println(s.wordBreak(str, list));
    }
}
