package com.alan.medium._0215;

/**
 * @author shiml
 * @date 2022-02-21 17:15:09
 */
public class Solution {

    public int findKthLargest(int[] nums, int k) {


        int len = nums.length;
        int[] temp = new int[len];

        for (int i = 0; i < len ; i++) {

//            if(nums[i] > mid){
//
//
//
//            }





        }


        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Solution solution = new Solution();
        int result = solution.findKthLargest(nums, k);
        System.out.println(result);

    }

}