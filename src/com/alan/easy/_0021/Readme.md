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

递归

## 代码

```java
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
            if (null == list1) {
                return list2;
            }
            if (null == list2) {
                return list1;
            }
            if (list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list2.next, list1);
                return list2;
            }
    
        }
```