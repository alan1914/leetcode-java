package com.alan.easy._0021;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (null == list1) {
            return list2;
        }
        if (null == list2) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }

    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode temp = list1;
        ListNode temp2 = list2;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
        for (int i = 0; i < 5; i++) {
            temp2.next = new ListNode(i + 1);
            temp2 = temp2.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(list1.next, list2.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}