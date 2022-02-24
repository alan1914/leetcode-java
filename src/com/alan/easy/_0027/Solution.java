package com.alan.easy._0027;

import java.util.Arrays;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int len = nums.length;
        for (int fast = 0; fast < len; fast++) {
            if(val != nums[fast]){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution solution = new Solution();
        int result = solution.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
    }
}