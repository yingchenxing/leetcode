package week6.q122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                sum+=prices[i]-prices[i-1];
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
    }
}
