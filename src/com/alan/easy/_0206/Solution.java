package com.alan.easy._0206;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

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

    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(2, new ListNode(3, null));

        ListNode list1 = new ListNode(0);
        ListNode temp = list1;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp.next.next = new ListNode(i + 1);
            temp = temp.next.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.reverseList(list1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}