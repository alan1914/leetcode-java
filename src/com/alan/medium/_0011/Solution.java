package com.alan.medium._0011;

/**
 * @author shiml
 * @date 2022/2/15 3:06 下午
 */
public class Solution {

    public int maxArea(int[] height) {

        int len = height.length;
        int start = 0;
        int end = len - 1;
        int max = 0;

        while (end > start) {

            int wight = end - start;
            int high = 0;

            if (height[start] > height[end]) {
                high = height[end];
                end--;
            } else {
                high = height[start];
                start++;
            }

            int temp = wight * high;
            if (temp > max) {
                max = temp;
            }

        }

        return max;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = new int[]{0, 14, 6, 2, 10, 9, 4, 1, 10, 3};

        System.out.println(solution.maxArea(nums));

    }
}