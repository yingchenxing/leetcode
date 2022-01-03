package week1.q122;


class Solution {
//    public int maxProfit(int[] prices) {
//        int min = prices[0];
//        int cur = prices[0];
//        int sum = 0;
//        int p = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (cur < prices[i]) {
//                if (min < prices[i])
//                    sum += prices[i] - min;
//            } else {
//
//                min = prices[i];
//            }
//            cur = prices[i];
//        }
//        return sum;
//    }

    public int maxProfit(int[] prices, int fee) {
        int min = prices[0];
        int cur = prices[0];
        int sum = 0;
        int p = 0;
        for (int i = 1; i < prices.length; i++) {
            if (cur< prices[i]) {
                    sum += Math.max(prices[i] - min-fee,0);
            } else {
                min = prices[i];
            }
            cur = prices[i];
        }
        return sum;
    }

//    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5};
//        Solution s = new Solution();
//        s.maxProfit(num);
//    }
}
