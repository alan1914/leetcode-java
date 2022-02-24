package com.alan.easy._0203;

/**
 * @author shiml
 * @date 2022-2-24 18:38:01
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur = pre.next;

        while (null != pre && null != pre.next) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = pre.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2, new ListNode(2, null));

//        ListNode list1 = new ListNode(0);
//        ListNode temp = list1;
//        for (int i = 0; i < 5; i++) {
//            temp.next = new ListNode(i + 1);
//            temp = temp.next;
//        }

        int val = 2;

        Solution solution = new Solution();
        ListNode result = solution.removeElements(list1, val);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}