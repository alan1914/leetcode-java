package com.alan.easy._0242;

import java.util.Arrays;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] record = new int[26];

        for (char c : sChars) {
            record[c - 'a'] += 1;
        }

        for (char c : tChars) {
            record[c - 'a'] -= 1;
        }

        for (int i : record) {
            if (0 != i) {
                return false;
            }
        }

        return true;
    }

//    public boolean isAnagram(String s, String t) {
//
//        char[] sChar = s.toCharArray();
//        char[] tChar = t.toCharArray();
//
//        Arrays.sort(sChar);
//        Arrays.sort(tChar);
//
//        return Arrays.equals(sChar, tChar);
//
//    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));

    }
}