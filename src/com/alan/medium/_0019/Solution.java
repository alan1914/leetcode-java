package com.alan.medium._0019;

/**
 * @author shiml
 * @date 2022/2/15 3:06 下午
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        ListNode slow = dummy;
        while (null != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }


//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode start = new ListNode(0);
//        ListNode slow = start, fast = start;
//        slow.next = head;
//
//        // Move fast in front so that the gap between slow and fast becomes n
//        for (int i = 1; i <= n + 1; i++) {
//            fast = fast.next;
//        }
//
//        // Move fast to the end, maintaining the gap
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        // Skip the desired node
//        slow.next = slow.next.next;
//
//        return start.next;
//    }

//    private ListNode removeNthFromEnd(ListNode head, int n) {
//
//        int count = 0;
//        ListNode temp = head;
//
//        // get length
//        while (null != temp) {
//            temp = temp.next;
//            count++;
//        }
//
//        if (count == 1) {
//            return null;
//        }
//
//        int c = count - n;
//        if (c == 0) {
//            return head.next;
//        }
//
//        ListNode t = head;
//        // jump to the end of n^th node
//        for (int i = 0; i < c - 1; i++) {
//            t = t.next;
//        }
//
//        t.next = t.next.next;
//
//        return head;
//    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(listNode.next, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}