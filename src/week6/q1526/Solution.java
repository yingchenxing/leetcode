package week6.q1526;

class Solution {
    public int minNumberOperations(int[] target) {
        int ans = target[0];
        for (int i = 0; i < target.length - 1; i++)
            ans += Math.max(target[i + 1] - target[i], 0);
        return ans;
    }
}
