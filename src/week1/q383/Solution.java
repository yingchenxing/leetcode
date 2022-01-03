package week1.q383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        char c;
        for (int i = 0; i < magazine.length(); i++) {
            c = magazine.charAt(i);
            words[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            if (words[c - 'a'] == 0)
                return false;
            else
                words[c - 'a']--;
        }
        return true;
    }
}