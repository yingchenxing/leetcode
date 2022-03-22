//////////////There are n cities. Some of them are connected, while some are 
//not. 
////
//////If 
//////////city 
////////////a 
//////////////is connected directly with city b, and city b is connected 
//directly 
////
////////with 
////////////city c,
////////////// then city a is connected indirectly with city c. 
//////////////
////////////// A province is a group of directly or indirectly connected cities 
//
////and 
//////
////////no 
//////////////other cities outside of the group. 
//////////////
////////////// You are given an n x n matrix isConnected where isConnected[i][j]
// =
//// 1
////// 
////////if 
//////////
////////////the 
//////////////iᵗʰ city and the jᵗʰ city are directly connected, and isConnected[
//i]
////[
//////j] 
////////= 
//////////0 
////////////
//////////////otherwise. 
//////////////
////////////// Return the total number of provinces. 
//////////////
////////////// 
////////////// Example 1: 
//////////////
////////////// 
//////////////Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
//////////////Output: 2
////////////// 
//////////////
////////////// Example 2: 
//////////////
////////////// 
//////////////Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
//////////////Output: 3
////////////// 
//////////////
////////////// 
////////////// Constraints: 
//////////////
////////////// 
////////////// 1 <= n <= 200 
////////////// n == isConnected.length 
////////////// n == isConnected[i].length 
////////////// isConnected[i][j] is 1 or 0. 
////////////// isConnected[i][i] == 1 
////////////// isConnected[i][j] == isConnected[j][i] 
////////////// 
////////////// Related Topics Depth-First Search Breadth-First Search Union 
//Find 
////////Graph ?
//////////? 
////////////48
//////////////65 👎 231
////////////
//////////
////////
//////
////
//


package week8.leetcode.editor.en;

import java.util.Arrays;

public class Q547_NumberOfProvinces {
    public static void main(String[] args) {
        Solution solution = new Q547_NumberOfProvinces().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int ans = 0;
            int n = isConnected.length;
            Boolean[] flag = new Boolean[n];
            Arrays.fill(flag,false);

            for (int i = 0; i < n; i++) {
                if (!flag[i]) {
                    ans++;
                    clean(isConnected, i, flag);
                }
            }
            return ans;
        }

        private void clean(int[][] isConnected, int i, Boolean[] flag) {
            flag[i]=true;
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&&!flag[j])
                {
                    clean(isConnected, j, flag);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}