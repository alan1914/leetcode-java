package com.alan.medium._0150;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shiml
 * @date 2022-02-21 17:15:09
 */
public class Solution {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i])) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(tokens[i])) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(tokens[i])) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(tokens[i])) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp1 / temp2);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] strArr = {"2", "1", "+", "3", "*"};

        Solution solution = new Solution();
        int result = solution.evalRPN(strArr);
        System.out.println(result);

    }

}