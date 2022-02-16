package com.alan.medium._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shiml
 * @date 2022/2/15 3:06 下午
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] numArr) {

        List<List<Integer>> result = new ArrayList<>();

        // 排序
        int[] nums = Arrays.stream(numArr).sorted().toArray();

        int len = nums.length;

        for (int index = 1; index < nums.length; index++) {

            int start = 0;
            int end = len - 1;

            if (index > 1 && nums[index] == nums[index - 1]) {
                start = index - 1;
            }

            while (start < index && end > index) {

                if (start > 0 && nums[start] == nums[start - 1]) {
                    start++;
                    continue;
                }

                if (end < len - 1 && nums[end] == nums[end + 1]) {
                    end--;
                    continue;
                }

                int count = nums[start] + nums[end] + nums[index];
                if (count == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[index]);
                    list.add(nums[end]);
                    result.add(list);

                    start++;
                    end--;
                } else if (count > 0) {
                    end--;
                } else {
                    start++;
                }

            }

        }


        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums).toString());
    }
}