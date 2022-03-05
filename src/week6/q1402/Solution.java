package week6.q1402;

import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0, ans = 0;
        if (satisfaction[satisfaction.length - 1] <= 0)
            return 0;
        int pointer = 0;
        for (int i = satisfaction.length-1; i >=0; i--) {
            sum+=satisfaction[i];
            if(sum>=0)
                pointer=i;
            else
                break;
        }
        for(int i = pointer;i<satisfaction.length;i++){
            ans+=(i-pointer+1)*satisfaction[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
    }
}
