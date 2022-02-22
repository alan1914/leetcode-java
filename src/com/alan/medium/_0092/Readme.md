# 92. Reverse Linked List II

## 题目

Given the head of a singly linked list and two integers left and right where left <= right, 
reverse the nodes of the list from position left to position right, and return the reversed list.

## Example 1:
```
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
```

## Example 2:

```
Input: head = [5], left = 1, right = 1
Output: [5]
```

## Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n

## 解题思路

由于有可能整个链表都被反转，所以构造一个新的头结点指向当前的头。之后的处理方法是：找到第一个需要反转的结点的前一个结点 p，从这个结点开始，依次把后面的结点用“头插”法，插入到 p 结点的后面。循环次数用 n-m 来控制。

这一题结点可以原地变化，更改各个结点的 next 指针就可以。不需要游标 p 指针。因为每次逆序以后，原有结点的相对位置就发生了变化，相当于游标指针已经移动了，所以不需要再有游标 p = p.Next 的操作了。

## 代码

```java
   public ListNode reverseBetween(ListNode head, int m, int n) {
  
          ListNode dummy = new ListNode(-1, head);
          ListNode pre = dummy;
          for (int i = 0; i < m - 1; i++) {
              pre = pre.next;
          }
  
          ListNode cur = pre.next;
          for (int i = 0; i < n - m; i++) {
              ListNode temp = cur.next;
              cur.next = temp.next;
              temp.next = pre.next;
              pre.next = temp;
          }
  
          return dummy.next;
      }  
```