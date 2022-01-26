package week5.q22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        List<String> str = new ArrayList<>();
        str.add("");
        dp.add(str);
        str = new ArrayList<>();
        str.add("()");
        dp.add(str);
        for (int i = 2; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = dp.get(j);
                List<String> str2 = dp.get(i - j - 1);
                for (String s1:str1) {
                    for (String s2:str2)
                        temp.add("(" + s1 + ")" + s2);
                }
            }
            dp.add(temp);
        }
        return dp.get(n);
    }
}
