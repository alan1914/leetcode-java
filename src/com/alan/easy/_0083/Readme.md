# 21. 83. Remove Duplicates from Sorted List

## 题目

Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.

## Example 1:
```
Input: head = [1,1,2]
Output: [1,2]
```

## Example 2:

```
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

## Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

## 解题思路

解法一：遍历
解法二：递归

## 代码

```java
     // 解法一：遍历
     public ListNode deleteDuplicates(ListNode head) {
    
            ListNode temp = head;
    
            if (null == head) {
                return null;
            }
    
            if (null == head.next) {
                return head;
            }
    
            while (null != temp.next) {
    
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
    
            }
    
            return head;
    
        }

     // 解法二：递归
     public ListNode deleteDuplicates(ListNode head) {
     
             if (null == head || null == head.next) {
                 return head;
             }
     
             head.next = deleteDuplicates(head.next);
     
             if (head.val == head.next.val) {
                 return head.next;
             } else {
                 return head;
             }
     
         }
```