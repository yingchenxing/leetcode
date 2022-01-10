package week3.q1314;

import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] num = new int[1];
        num[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] temp = new int[num.length+1];
            for (int j = 0; j < num.length+1; j++) {
                if (j == num.length)
                    temp[j] = num[j - 1];

                else if (j == 0)
                    temp[j] = num[j];
                else
                    temp[j] = Math.min(num[j], num[j - 1]);
                temp[j]+=triangle.get(i).get(j);
            }
            num = temp;
        }
        int ans = num[0];
        for (int i = 0; i < triangle.size(); i++)
            ans = Math.min(ans, num[i]);

        return ans;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
