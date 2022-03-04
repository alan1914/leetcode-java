package com.alan.easy._0020;

import java.util.Stack;

/**
 * @author shiml
 * @date 2022-02-19 23:40:06
 */
public class Solution {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(]";
        System.out.println(solution.isValid(s));
    }
}