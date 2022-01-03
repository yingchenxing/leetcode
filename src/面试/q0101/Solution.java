package 面试.q0101;

class Solution {
//    public boolean isUnique(String astr) {
//        int[] num = new int[26];
//        for (int i = 0; i < astr.length(); i++) {
//            int cur = astr.charAt(i) - 'a';
//            if (num[cur] >= 1)
//                return false;
//        }
//        return true;
//    }

    public boolean isUnique(String astr) {
        int[] num = new int[26];
        for (int i = 0; i < astr.length(); i++) {
            int cur = astr.charAt(i) - 'a';
            if (num[cur] >= 1)
                return false;
        }
        return true;
    }

}
