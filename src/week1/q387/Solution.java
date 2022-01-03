package week1.q387;


class Solution {
    public int firstUniqChar(String s) {
        int[] words = new int[26];
        char c;
        int p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (words[c - 'a'] >= 1)
                p = i;
            words[c - 'a']++;
        }
        if (p != 0)
            return p - 1;
        else {
            for (int i = s.length() - 1; i >= 0; i--) {
                c = s.charAt(i);
                if (words[c - 'a'] == 1)
                    return i;
            }
            return -1;
        }
    }
}
