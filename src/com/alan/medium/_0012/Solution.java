package com.alan.medium._0012;

/**
 * @author shiml
 * @date 2022-02-19 23:40:06
 */
public class Solution {

    public String intToRoman(int num) {

        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {

            while (value[i] > num) {
                i++;
            }

            num = num - value[i];
            stringBuilder.append(symbols[i]);

        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 1994;
        System.out.println(solution.intToRoman(num));
    }
}