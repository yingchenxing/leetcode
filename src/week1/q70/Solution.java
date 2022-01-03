package week1.q70;

class Solution {
    public int climbStairs(int n) {
        int i = 1, ans = 1;

        while(i<=n-i){
            ans+=c(i,n-i);
            i++;
        }
        return ans;
    }

    public int c(int a, int b) {
        long sum1 = 1;
        for(int i =0;i<a;i++){
            sum1*=b-i;
            sum1/=i+1;
        }
        return (int)sum1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(44));
    }
}
