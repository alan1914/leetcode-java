# 15. 3Sum

## 题目

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

## Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

## Example 2:

```
Input: nums = []
Output: []
```

## Example 3:

```
Input: nums = [0]
Output: []
```

## Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105

## 解题思路

用 map 提前计算好任意 2 个数字之和，保存起来，可以将时间复杂度降到 O(n^2)。这一题比较麻烦的一点在于，最后输出解的时候，要求输出不重复的解。数组中同一个数字可能出现多次，同一个数字也可能使用多次，但是最后输出解的时候，不能重复。例如 [-1，-1，2] 和 [2, -1, -1]、[-1, 2, -1] 这 3 个解是重复的，即使 -1 可能出现 100 次，每次使用的 -1 的数组下标都是不同的。

这里就需要去重和排序了。map 记录每个数字出现的次数，然后对 map 的 key 数组进行排序，最后在这个排序以后的数组里面扫，找到另外 2 个数字能和自己组成 0 的组合。

## 代码

```java
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
```