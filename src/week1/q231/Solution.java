package week1.q231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        else if(n%2==1)
            return false;
        else if(n<=0)
            return false;
        else
            return  isPowerOfTwo(n/2);
    }
}
