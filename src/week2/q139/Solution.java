package week2.q139;

import java.util.*;

class Solution {


    private Comparator<? super String> c = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public boolean wordBreak(String s, List<String> wordDict) {
        Collections.sort(wordDict, c);
        for (int i = 0; i < wordDict.size(); i++) {
            s = s.replace(wordDict.get(i), "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str1 = new String();
        str1 = "1";
        String str2 = new String();
        str2 = "12";
        List<String> l = new ArrayList<>();
        l.add(str2);
        l.add(str1);
        System.out.println(s.wordBreak(str2,l));
    }
}