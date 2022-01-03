package tree.q1014;

class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int score = values[0];
        int max = 0;
        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, score + values[i] - i);
            score = Math.max(score,values[i]+i);
        }
        return max;
    }
}
