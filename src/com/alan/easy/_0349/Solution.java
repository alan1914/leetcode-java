package com.alan.easy._0349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int item : nums1) {
            hashSet.add(item);
        }

        for (int item : nums2) {
            if (hashSet.contains(item)) {
                hashSet2.add(item);
            }
        }

        int[] result = new int[hashSet2.size()];
        int index = 0;
        for (int i : hashSet2) {
            result[index++] = i;
        }

        return result;

    }

    public static void main(String[] args) {

        int[] s = {1, 2, 2, 1};
        int[] t = {2, 2};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersection(s, t)));

    }
}