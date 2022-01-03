package week1.q233;

class Solution {
    public boolean first = true;

    public int countDigitOne(int n) {
        int res = 0, high = 0, low = 0, cur = 0, digit = 1;
        high = n/10;
        cur = n%10;
        while(high!=0||cur!=0){
            if(cur == 0){
                res +=high*digit;
            }
            else if(cur==1 ){
                res +=high*digit+low+1;
            }
            else
                res +=(high+1)*digit;
            low+=cur*digit;
            cur = high%10;
            high/=10;
            digit*=10;
        }return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDigitOne(20));
    }
}