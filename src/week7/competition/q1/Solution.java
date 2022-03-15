package week7.competition.q1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();


        for(char i = s.charAt(0);i<=s.charAt(3);i++){
            for(char j = s.charAt(1);j <=s.charAt(4);j++){
                String str = i+""+j;
                ans.add(str);
            }
        }
        return ans;
    }

}