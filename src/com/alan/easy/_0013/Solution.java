package com.alan.easy._0013;

import java.util.HashMap;

/**
 * @author shiml
 * @date 2022-02-19 23:40:06
 */
public class Solution {

    public int romanToInt(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        Integer result = 0;
        StringBuilder stringBuilder = new StringBuilder("  ");
        for (int i = 0; i < s.length(); i++) {

            stringBuilder.setCharAt(0, s.charAt(i));

            if (i + 1 < s.length()) {
                stringBuilder.setCharAt(1, s.charAt(i + 1));
            }

            if (map.containsKey(stringBuilder.toString().trim())) {
                result += map.get(stringBuilder.toString().trim());
                i++;
            } else {
                result += map.get(String.valueOf(s.charAt(i)));
            }

        }


        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "D";
        System.out.println(solution.romanToInt(s));
    }
}