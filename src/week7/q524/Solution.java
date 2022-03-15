package week7.q524;

import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for(int i = 0;i<dictionary.size();i++){
            String temp = dictionary.get(i);
            int p1 = 0,p2 = 0;
            while(p1<temp.length()&&p2<s.length()){
                if(temp.charAt(p1) == s.charAt(p2)){
                    p1++;
                    p2++;
                }else
                    p2++;
            }
            if(p1 == temp.length()){
                if(temp.length()>ans.length())
                    ans = temp;
                else if(temp.length()==ans.length()){
                    if(ans.compareTo(temp)>0)
                        ans = temp;
                }
            }
        }
        return ans;
    }
}
