package com.alan.easy._0704;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public int search(int[] nums, int target) {

        if(target < nums[0] || target > nums[nums.length-1]){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (nums[left] <= nums[right]) {

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;

        int[] nums = {5};
        int target = -5;

        Solution solution = new Solution();
        int result = solution.search(nums, target);
        System.out.println(result);
    }
}