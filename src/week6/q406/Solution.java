package week6.q406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])
                    return o2[0] - o1[0];
                else
                    return o1[1] - o2[1];
            }
        });
        List<int[]> ans = new ArrayList<>();

        for(int[] cur : people)
            ans.add(cur[1],cur);
        return ans.toArray(new int[people.length][]);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 6, 10, 8, 7, 3, 2};
    }
}
