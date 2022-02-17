package com.alan.easy._0026;

/**
 * @author shiml
 * @date 2022/2/15 3:06 下午
 */
public class Solution {

    public int removeDuplicates(int[] nums) {

        int counter = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                counter++;
            }

            nums[i - counter] = nums[i];

        }

        return nums.length - counter;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{1, 1, 2};
//        int[] nums = new int[]{1, 1, 2};
        System.out.println(solution.removeDuplicates(nums));
    }
}