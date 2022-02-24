# 27. Remove Element

## 题目

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
## Example 1:
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

## Example 2:

```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

## Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.

## 解题思路

快慢指针
```
if(val != nums[fast]){
  nums[slow++] = nums[fast];  
}
```

## 代码

```java
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
```