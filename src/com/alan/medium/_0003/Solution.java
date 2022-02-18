package com.alan.medium._0003;

import java.util.HashMap;

/**
 * @author shiml
 * @date 2022-02-17 12:07:36
 */
public class Solution {

//    public int lengthOfLongestSubstring(String s) {
//
//        int max = 0;
//
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = s.toCharArray();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            stringBuilder.append(chars[i]);
//            if (stringBuilder.length() != stringBuilder.chars().distinct().count()) {
//                System.out.println("confirm:" + stringBuilder.toString());
//                stringBuilder.deleteCharAt(0);
//            } else {
//                int len = stringBuilder.length();
//                if (len > max) {
//                    max = len;
//                }
//            }
//
//        }
//
//        return max;
//    }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }

            // 核心，录入map
            map.put(s.charAt(i), i);

            max = max > i - j ? max : i - j + 1;
        }

        return max;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}