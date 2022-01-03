package week1.q119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            return l;
        } else {
            List<Integer> list = getRow(rowIndex-1);
            List<Integer> res = new ArrayList<>();
            res.add(1);
            for (int i = 0; i < list.size() - 1; i++) {
                res.add(list.get(i) + list.get(i + 1));
            }
            res.add(1);
            return res;
        }
    }
}