package com.alan.hard._0076;

/**
 * @author shiml
 * @date 2022-02-18 16:22:14
 */
public class Solution {

    public String minWindow(String s, String t) {

        int max = 0;
        int lo = 0;

        for (int i = 0; i < t.length(); i++) {

            int left = 0;
            int right = 0;
            int last = 0;

            for (int j = last; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    last = j;
                    last = last++;
                }

            }
        }

        return s.substring(lo, lo + max + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(solution.minWindow(s, t));
    }
}