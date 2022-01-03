package week1.q232;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
    Deque<Integer> list;
    public MyQueue() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.pop();
    }

    public int peek() {
        return  list.peek();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}