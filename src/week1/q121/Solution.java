package week1.q121;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int maxProfit(int[] prices) {
//        int[] temp = new int[prices.length + 1];
//        for (int i = 0; i < prices.length; i++)
//            temp[i] = prices[i];
//        temp[temp.length - 1] = 0;
        Deque<Integer> s = new LinkedList<>();

        int i = 0, max = 0;
        while (i < prices.length) {
            if (s.isEmpty())
                s.push(prices[i]);
            else if (s.getFirst() > prices[i])
                s.push(prices[i]);
            else if (prices[i] - s.getFirst() > max)
                max = prices[i] - s.getFirst();
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 6, 5, 0, 3};
        Solution s = new Solution();
        System.out.println(s.maxProfit(nums));
    }
}