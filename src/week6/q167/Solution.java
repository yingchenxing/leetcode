package week6.q167;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0,r = numbers.length-1;
        while(l<r){
            int num = numbers[l]+numbers[r];
            if(num==target){
                ans[0] = l;
                ans[1] = r;
                return ans;
            }
            else if(num<target)
                l++;
            else
                r--;
        }
        return null;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {2,7,11,15};
        System.out.println(solution.twoSum(num,9));
    }
}
