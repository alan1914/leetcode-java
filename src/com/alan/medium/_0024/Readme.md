# 24. Swap Nodes in Pairs

## 题目

Given a linked list, swap every two adjacent nodes and return its head.

You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

## Example 1:
```
Input: head = [1,2,3,4]
Output: [2,1,4,3]
```

## Example 2:

```
Input: head = []
Output: []
```

## Example 3:

```
Input: head = [1]
Output: [1]
```

## Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100

## 解题思路

## 代码

```java
  /**
 * 解法一 循环
 */
    public ListNode swapPairs(ListNode head) {

        if (null == head || null == head.next) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;

        while (null != cur.next && null != cur.next.next) {
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next;
            cur.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
            cur = temp1;
        }

        return dummy.next;
    }

/**
 * 解法二：递归
 */
public ListNode swapPairs(ListNode head) {

        if (null == head || null == head.next) {
        return head;
        }

        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;

        return temp;
        }

```