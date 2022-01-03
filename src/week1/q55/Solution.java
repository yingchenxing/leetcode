package week1.q55;

class Solution {
//    public boolean canJump(int[] nums) {
//        boolean[] can = new boolean[nums.length];
//        can[0] = true;
//        for (int i = 0; i < nums.length; i++) {
//            if (can[i] == true) {
//                for (int j = 0; j < nums[i]; j++) {
//                    if (i + j < nums.length)
//                        can[i + j] = true;
//                }
//            }
//        }
//        return can[nums.length - 1];
//    }

    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i =0;i<= max;i++){
            max = Math.max(nums[i]+i,max);
            if(max>= nums.length-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {2,3,1,1,4};
        s.canJump(num);
    }
}