package com.alan.medium._0005;

/**
 * @author shiml
 * @date 2022-02-18 10:50:48
 */
public class Solution {

    private int left = 0;
    private int maxLen = 0;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            maxPalindrome(s, i, i);
            maxPalindrome(s, i, i + 1);
        }

        return s.substring(left, left + maxLen + 1);
    }

    private void maxPalindrome(String s, int i, int j) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (j - 1 - (i + 1) > maxLen) {
            left = i + 1;
            maxLen = j - 1 - (i + 1);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ccc";
        System.out.println(solution.longestPalindrome(s));
    }
}