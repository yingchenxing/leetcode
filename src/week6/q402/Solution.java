package week6.q402;

class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder str = new StringBuilder(num);
        for (int i = 0; i < str.length() - 1 && k > 0; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                k--;
                str.deleteCharAt(i);
                if (i > 0)
                    i -= 2;
                else
                    i--;
            }
        }
        while (k > 0) {
            str.deleteCharAt(str.length() - 1);
            k--;
        }
        while (str.length() > 0 && str.charAt(0) == '0')
            str.deleteCharAt(0);

        if (str.isEmpty())
            return "0";
        return str.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "1234567890";
        solution.removeKdigits(s, 9);
    }
}
