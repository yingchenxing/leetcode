package week1.q20;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==')')
                c='(';
            else if (c==']')
                c='[';
            else if (c=='}')
                c='{';
            else
            {
                stack.push(c);
                continue;
            }

            if(!stack.isEmpty()&&stack.getFirst()==c)
                stack.pop();
            else
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        Solution s1 = new Solution();
        s1.isValid(s);
    }
}
