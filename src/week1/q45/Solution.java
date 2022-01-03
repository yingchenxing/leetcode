package week1.q45;

class Solution {
//    public int jump(int[] nums) {
//        int min = nums.length - 1;
//        if (nums == null || nums.length == 1)
//            return 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] + i >= nums.length - 1) {
//                return jump(Arrays.copyOfRange(nums, 0, i + 1))+1;
//            }
//        }
//        return 0;
//    }

    public int jump(int[] nums) {
        int max=0,j=0,step=0;
        for(int i=0;i< nums.length;i++)
        {
            max=Math.max(nums[i]+i,max );
            if(j==i){
                step++;
                j=max;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {2,3,1,1,4};
        System.out.println(s.jump(num));
    }
}
