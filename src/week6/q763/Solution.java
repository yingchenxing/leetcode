package week6.q763;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        char pointer = s.charAt(0);
        int[][] alphabet = new int[26][2];
        for (int i = 1; i < s.length(); i++) {
            int[] n = alphabet[s.charAt(i) - 'a'];
            if (n[0] == 0&&s.charAt(i)!=s.charAt(0))
                n[0] = i;
            n[1] = i;
        }

        Arrays.sort(alphabet, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List ans = new ArrayList();
        int l = 0, r = 0;
        for (int i = 0; i < 26; i++) {
            if(alphabet[i][1]==0&&alphabet[i][0]==0)
                continue;
            if (alphabet[i][0] > r) {
                ans.add(r-l + 1);
                l = alphabet[i][0];
                r = alphabet[i][1];
            } else if (alphabet[i][1] > r)
                r = alphabet[i][1];
        }
        ans.add(r-l+1);
        return ans;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
        solution.partitionLabels(s);
    }
}
