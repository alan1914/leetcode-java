# 206. Reverse Linked List

## 题目

Given the head of a singly linked list, reverse the list, and return the reversed list.

## Example 1:
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

## Example 2:

```
Input: head = [1,2]
Output: [2,1]
```

## Example 3:

```
Input: head = []
Output: []
```

## Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

## 解题思路

头插法

## 代码

```java
   public ListNode reverseList(ListNode head) {
  
          ListNode dummy = new ListNode(-1, head);
          ListNode pre = dummy;
          ListNode cur = pre.next;
          while (null != cur && null != cur.next) {
              ListNode temp = cur.next;
              cur.next = temp.next;
              temp.next = pre.next;
              pre.next = temp;
          }
          return dummy.next;
      }
```