package com.alan.easy._0977;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public int[] sortedSquares(int[] nums) {

        int len = nums.length;
        int[] result = new int[len];

        int left = 0;
        int right = len - 1;

        for (int i = len - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = Math.abs(nums[right]) * Math.abs(nums[right]);
                right--;
            } else {
                result[i] = Math.abs(nums[left]) * Math.abs(nums[left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        Solution solution = new Solution();
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}