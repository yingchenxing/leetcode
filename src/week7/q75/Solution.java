package week7.q75;

class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k= nums.length-1;
        while(j<=k){
            int temp = nums[j];
            if(temp==0)
                swap(nums,i++,j++);
            else if(temp==1)
                j++;
            else
                swap(nums,j,k--);
        }
    }

    public void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = new int[]{1,0,2};
        solution.sortColors(num);
    }
}