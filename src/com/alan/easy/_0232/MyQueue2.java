package com.alan.easy._0232;

import java.util.Stack;

/**
 * @author shiml
 * @date 2022/3/4 4:16 下午
 */
public class MyQueue2 {

    Stack<Integer> stack;

    public MyQueue2() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(0);
    }

    public int peek() {
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
