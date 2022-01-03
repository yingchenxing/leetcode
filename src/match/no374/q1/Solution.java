package match.no374.q1;

class Solution {
    public boolean checkString(String s) {
        int max = -1;
        int min = 101;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                max = i;
            else
                min = Math.min(i, min);
        }
        return max<min;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkString("bb"));
    }
}
