package com.alan.easy._1047;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * @author shiml
 * @date 2022-03-04 17:14:32
 */
public class Solution {

    public String removeDuplicates(String s) {

        Deque<Character> deque = new LinkedList<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!deque.isEmpty() && c == deque.getLast()) {
                deque.removeLast();
            } else {
                deque.addLast(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : deque) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abbaca";
        System.out.println(solution.removeDuplicates(s));
    }
}