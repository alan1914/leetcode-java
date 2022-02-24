package com.alan.medium._0209;

/**
 * @author shiml
 * @date 2022-2-24 14:10:38
 */
public class Solution {

    /**
     * 解法一 暴力循环
     */
//    public int minSubArrayLen(int target, int[] nums) {
//
//        int len = nums.length;
//        int miniNum = len + 1;
//
//        for (int i = 0; i < len; i++) {
//            int tempSum = 0;
//            int tempCounter = 0;
//            for (int j = i; j < len; j++) {
//                tempSum += nums[j];
//                tempCounter++;
//                if (tempSum >= target) {
//                    if (tempCounter < miniNum) {
//                        miniNum = tempCounter;
//                    }
//                    break;
//                }
//            }
//        }
//
//        return miniNum > len ? 0 : miniNum;
//    }

    /**
     * 解法二： 滑动窗口
     */
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int tempSum = 0;
        int subLen = 0;
        int result = nums.length + 1;

        for (int right = 0; right < nums.length; right++) {

            tempSum += nums[right];
            while (tempSum >= target) {
                subLen = right - left + 1;
                result = subLen < result ? subLen : result;
                tempSum -= nums[left++];
            }

        }

        return result > nums.length ? 0 : result;

    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        Solution solution = new Solution();
        int result = solution.minSubArrayLen(target, nums);
        System.out.println(result);

    }

}