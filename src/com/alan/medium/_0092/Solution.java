package com.alan.medium._0092;

/**
 * @author shiml
 * @date 2022-02-21 17:15:09
 */
public class Solution {

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

    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(1, new ListNode(2, null));
//
        ListNode list1 = new ListNode(0);
        ListNode temp = list1;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        int left = 2;
        int right = 4;

        Solution solution = new Solution();
        ListNode result = solution.reverseBetween(list1.next, left, right);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}