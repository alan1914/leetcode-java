package com.alan.medium._0142;

/**
 * @author shiml
 * @date 2022-02-21 17:15:09
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }

        }

        if (slow == fast && slow != null) {

            while (slow != head) {
                slow = slow.next;
                head = head.next;
            }
            return head;
        }

        return null;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list2;


        Solution solution = new Solution();
        ListNode result = solution.detectCycle(list1.next);
        System.out.println(result.val);

    }

}