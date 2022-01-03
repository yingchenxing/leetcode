package week1.q118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==1){
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> l =new ArrayList<>();
            l.add(1);
            list.add(l);
            return list;
        }else{

            List<List<Integer>> ans = generate(numRows-1);
            List<Integer> list = ans.get(ans.size()-1);
            List<Integer> res = new ArrayList<>();
            res.add(1);
            for(int i =0;i<list.size()-1;i++)
            {
                res.add(list.get(i)+list.get(i+1));
            }
            res.add(1);
            ans.add(res);
            return ans;
        }
    }
}
