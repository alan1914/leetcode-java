package com.alan.medium._0002;

/**
 * @author shiml
 * @date 2022-02-21 10:10:32
 */
public class Solution {
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

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(listNode1, listNode4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

}