package com.alan.easy._0206;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(0, head);
        while (null == head) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return head;
    }

    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(2, new ListNode(3, null));

        ListNode list1 = new ListNode(0);
        ListNode temp = list1;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.reverseList(list1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}