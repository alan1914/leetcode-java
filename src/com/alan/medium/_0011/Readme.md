# 11. Container With Most Water

## 题目

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

## Example 1:
```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
```

## Example 2:

```
Input: height = [1,1]
Output: 1
```

## Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

## 解题思路

用 map 提前计算好任意 2 个数字之和，保存起来，可以将时间复杂度降到 O(n^2)。这一题比较麻烦的一点在于，最后输出解的时候，要求输出不重复的解。数组中同一个数字可能出现多次，同一个数字也可能使用多次，但是最后输出解的时候，不能重复。例如 [-1，-1，2] 和 [2, -1, -1]、[-1, 2, -1] 这 3 个解是重复的，即使 -1 可能出现 100 次，每次使用的 -1 的数组下标都是不同的。

这里就需要去重和排序了。map 记录每个数字出现的次数，然后对 map 的 key 数组进行排序，最后在这个排序以后的数组里面扫，找到另外 2 个数字能和自己组成 0 的组合。

## 代码

```java
    public int maxArea(int[] height) {
    
            int len = height.length;
            int start = 0;
            int end = len - 1;
            int max = 0;
    
            while (end > start) {
    
                int wight = end - start;
                int high = 0;
    
                if (height[start] > height[end]) {
                    high = height[end];
                    end--;
                } else {
                    high = height[start];
                    start++;
                }
    
                int temp = wight * high;
                if (temp > max) {
                    max = temp;
                }
    
            }
    
            return max;
        }
```