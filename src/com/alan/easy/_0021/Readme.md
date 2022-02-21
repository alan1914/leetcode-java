# 21. Merge Two Sorted Lists

## 题目

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

## Example 1:
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

## Example 2:

```
Input: list1 = [], list2 = []
Output: []
```

## Example 3:

```
Input: list1 = [], list2 = [0]
Output: [0]
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