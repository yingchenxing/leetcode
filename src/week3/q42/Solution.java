package week3.q42;

class Solution {
//    public int trap(int[] height) {
//        if (height.length < 3)
//            return 0;
//
//        int rPointer = 0;
//        int lPointer = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            if (height[i] < height[i + 1])
//                rPointer = i + 1;
//            else
//                break;
//        }
//
//        int sum = 0;
//        int max = height[rPointer];
//        int[] dp = new int[height.length];
//
//        for (int i = rPointer + 1; i < height.length; i++) {
//            if (max <= height[i]) {
//                max = height[i];
//                lPointer = i;
//                dp[i] = sum + dp[i - 1];
//                sum = 0;
//            } else {
//                sum += max - height[i];
//                dp[i] = dp[i - 1];
//            }
//        }
//
//        if (lPointer < height.length - 1) {
//            sum = 0;
//            int i = height.length - 1;
//            rPointer = i;
//            for (; i > lPointer; i--) {
//                if (height[i] < height[i - 1]) {
//                    rPointer = i - 1;
//                    height[i] = 0;
//                } else
//                    break;
//            }
//
//            if (lPointer >= rPointer)
//                return dp[lPointer];
//
//            max = height[rPointer];
//            for (i = rPointer - 1; i >= lPointer; i--) {
//                if (max <= height[i]) {
//                    max = height[i];
//                    dp[i] = sum + dp[i + 1];
//                    sum = 0;
//                } else {
//                    sum += max - height[i];
//                    dp[i] = dp[i + 1];
//                }
//            }
//        }
//
//
//        return dp[lPointer];
//    }

    public int trap(int[] height) {
        int lMax = 0, rMax = 0;
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] < lMax) {
                    ans += lMax - height[left];
                } else {
                    lMax = height[left];
                }
                left++;
            } else {
                if (height[right] < rMax) {
                    ans += rMax - height[right];
                } else {
                    rMax = height[right];
                }
                right--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {4, 2, 3};
        System.out.println(s.trap(num));
    }
}