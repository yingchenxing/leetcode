package week6.q455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0,candy = 0;
        while(child<g.length&&candy<s.length){
            if(g[child]<=s[candy])
                child++;
            candy++;
        }
        return child;
    }
}