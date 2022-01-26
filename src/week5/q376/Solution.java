package week5.q376;

class Solution {
    public int wiggleMaxLength(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 1;//正数差
        dp[0][1] = 1;//负数差
        int ans = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<0){
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][0]+1;
            }else if(nums[i]-nums[i-1]>0){
                dp[i][0] = dp[i-1][1]+1;
                dp[i][1] = dp[i-1][1];
            }else {
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1];
            }
            ans = Math.max(ans,Math.max(dp[i][0],dp[i][1]));
        }
        return ans;
    }

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.numTrees(4));
//    }
}
