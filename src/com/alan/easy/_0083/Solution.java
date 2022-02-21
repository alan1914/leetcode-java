package com.alan.easy._0083;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

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

    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(1, new ListNode(1, null));

        ListNode list1 = new ListNode(0);
        ListNode temp = list1;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp.next.next = new ListNode(i + 1);
            temp = temp.next.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(list1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}