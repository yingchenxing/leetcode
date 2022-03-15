package week7.competition.q2197;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> ans = new LinkedList<>();

        for (int i : nums) {
            while(true){
                int last = ans.isEmpty()?1:ans.getLast();
                int lcm = gcd(last,i);
                if(lcm==1)
                    break;
                i*=ans.removeLast()/lcm;
            }
            ans.add(i);
        }
        return ans;
    }

    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {287, 41, 49, 287, 899, 23, 23, 20677, 5, 825};
        solution.replaceNonCoprimes(num);
    }
}