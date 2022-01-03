package match.no374.q2;

class Solution {
    public int numberOfBeams(String[] bank) {
        int length = bank.length;
        int ans = 0;
        int[] e = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1')
                    e[i]++;
            }
        }


        for (int i = 0; i < length; i++) {
            if (e[i] != 0) {
                int j;
                for (j = i + 1; j < length; j++) {
                    if (e[j] != 0)
                        break;
                }

                if (j == length)
                    return ans;
                else {
                    ans += e[i] * e[j];
                }

                i = j - 1;
            }
        }
        return ans;
    }


}
