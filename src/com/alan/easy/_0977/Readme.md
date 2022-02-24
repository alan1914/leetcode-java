# 977. Squares of a Sorted Array

## 题目

Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

## Example 1:

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
```

## Example 2:

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

## Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

## 解题思路

二分查找 
定义中间值为 mid = (left + rigth) / 2
目标值与数组中间节点比较，如果大于则left向后移动，如果小于则right向左移动。重复直至left > right;

## 代码

```java
   
```