package com.alan.medium._0082;

/**
 * @author shiml
 * @date 2022-02-21 17:15:09
 */
public class Solution {

//    public ListNode deleteDuplicates(ListNode head) {
//        if (null == head) {
//            return null;
//        }
//
//        ListNode temp = new ListNode(0, head);
//        head = temp;
//
//        int lastValue = 0;
//        while (null != head.next && null != head.next.next) {
//
//            if (head.next.val == head.next.next.val) {
//                lastValue = head.next.val;
//                while (null != head.next && lastValue == head.next.val) {
//                    head.next = head.next.next;
//                }
//            } else {
//                head = head.next;
//            }
//
//        }
//    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode fakeHead = new ListNode(0, head);
        ListNode pre = fakeHead;
        ListNode current = head;

        while (null != current) {
            while (null != current.next && current.val == current.next.val) {
                current = current.next;
            }
            if (pre.next == current) {
                pre = pre.next;
            } else {
                pre.next = current.next;
            }
            current = current.next;
        }

        return fakeHead.next;
    }

    public static void main(String[] args) {

//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(1, new ListNode(2, null));
//
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