# 2. Add Two Numbers

## 题目

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Example 1:
```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

## Example 2:

```
Input: l1 = [0], l2 = [0]
Output: [0]
```

## Example 3:

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

## 解题思路

需要注意的是各种进位问题。

极端情况，例如

```
Input: (9 -> 9 -> 9 -> 9 -> 9) + (1 -> )
Output: 0 -> 0 -> 0 -> 0 -> 0 -> 1
```

为了处理方法统一，可以先建立一个虚拟头结点，这个虚拟头结点的 Next 指向真正的 head，这样 head 不需要单独处理，直接 while 循环即可。
另外判断循环终止的条件不用是 p.Next ！= nil，这样最后一位还需要额外计算，循环终止条件应该是 p != nil。

## 代码

```java
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   
           ListNode sentinel = new ListNode(0);
           ListNode d = sentinel;
   
           int carry = 0;
   
           while (carry > 0 || null != l1 || null != l2) {
   
               int sum = carry;
   
               if (l1 != null) {
                   sum += l1.val;
                   l1 = l1.next;
               }
   
               if (l2 != null) {
                   sum += l2.val;
                   l2 = l2.next;
               }
   
               carry = sum / 10;
               sum %= 10;
   
               d.next = new ListNode(sum);
               d = d.next;
   
           }
   
           return sentinel.next;
       }
```