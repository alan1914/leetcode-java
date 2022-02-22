package com.alan.easy._0141;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

//    /**
//     * 解法一：直接设定一个 hashset 存储对象，判断 是否重复
//     *
//     * @param head
//     * @return
//     */
//    public boolean hasCycle(ListNode head) {
//
//        HashSet<ListNode> set = new HashSet<>();
//
//        while (head != null) {
//            if (set.contains(head)) {
//                return true;
//            }
//            set.add(head);
//            head = head.next;
//        }
//
//        return false;
//    }

    public boolean hasCycle(ListNode head) {

        ListNode copy = head;
        while (null != copy && null != copy.next) {
            head = head.next;
            copy = copy.next.next;
            if (head == copy && null != head) {
                return true;
            }
        }

        return false;
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
        Boolean result = solution.hasCycle(list1);
        System.out.println(result);
    }
}