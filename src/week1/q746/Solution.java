package week1.q746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] min = new int[cost.length];
        min[0] = cost[0];
        min[1] = cost[1];
        int i =2;
        while(i<cost.length){
            min[i]=Math.min(min[i-1],min[i-2])+cost[i];
            i++;
        }
        return Math.min(min[i-1],min[i-2]);
    }
}