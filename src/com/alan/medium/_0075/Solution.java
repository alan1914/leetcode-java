package com.alan.medium._0075;

import java.util.Arrays;

/**
 * @author shiml
 * @date 2022-02-18 16:22:14
 */
public class Solution {

    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            nums[i] = 2;

            if (temp <= 1) {
                nums[one] = 1;
                one++;
            }
            if (temp == 0) {
                nums[zero] = 0;
                zero++;
            }

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}