package week6.q633;

class Solution {
    public boolean judgeSquareSum(int c) {
        double l = 0,r = (int) Math.sqrt(c);
        while(l<=r)
        {
            double num = l*l+r*r;
            if(num==c){
                return true;
            }else if(num>c)
                r--;
            else
                l++;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        solution.judgeSquareSum(100000);
    }
}
