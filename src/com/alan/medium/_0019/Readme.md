# 19. Remove Nth Node From End of List

## 题目

Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Example 1:
```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

## Example 2:

```
Input: head = [1], n = 1
Output: []
```

## Example 3:

```
Input: head = [1,2], n = 1
Output: [1]
```

## Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

## 解题思路

用 map 提前计算好任意 2 个数字之和，保存起来，可以将时间复杂度降到 O(n^2)。这一题比较麻烦的一点在于，最后输出解的时候，要求输出不重复的解。数组中同一个数字可能出现多次，同一个数字也可能使用多次，但是最后输出解的时候，不能重复。例如 [-1，-1，2] 和 [2, -1, -1]、[-1, 2, -1] 这 3 个解是重复的，即使 -1 可能出现 100 次，每次使用的 -1 的数组下标都是不同的。

这里就需要去重和排序了。map 记录每个数字出现的次数，然后对 map 的 key 数组进行排序，最后在这个排序以后的数组里面扫，找到另外 2 个数字能和自己组成 0 的组合。

## 代码

```java
    private ListNode removeNthFromEnd(ListNode head, int n) {
    
            int count = 0;
            ListNode temp = head;
    
            // get length
            while (null != temp) {
                temp = temp.next;
                count++;
            }
    
            if (count == 1) {
                return null;
            }
    
            int c = count - n;
            if (c == 0) {
                return head.next;
            }
    
            ListNode t = head;
            // jump to the end of n^th node
            for (int i = 0; i < c - 1; i++) {
                t = t.next;
            }
    
            t.next = t.next.next;
    
            return head;
        }
```