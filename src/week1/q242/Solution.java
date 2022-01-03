package week1.q242;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] words = new int[26];
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            words[c - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            if (words[c - 'a'] == 0)
                return false;
            else
                words[c - 'a']--;
        }

        for(int i =0;i<26;i++)
            if(words[i]>0)
                return false;
        return true;
    }
}