package com.alan.medium._0024;

/**
 * @author shiml
 * @date 2022/2/15 3:06 下午
 */
public class Solution {

    /**
     * 解法一 循环
     */
//    public ListNode swapPairs(ListNode head) {
//
//        if (null == head || null == head.next) {
//            return head;
//        }
//
//        ListNode dummy = new ListNode(-1, head);
//        ListNode cur = dummy;
//
//        while (null != cur.next && null != cur.next.next) {
//            ListNode temp1 = cur.next;
//            ListNode temp2 = cur.next.next;
//            cur.next = temp2;
//            temp1.next = temp2.next;
//            temp2.next = temp1;
//            cur = temp1;
//        }
//
//        return dummy.next;
//    }

    /**
     * 解法二：递归
     */
    public ListNode swapPairs(ListNode head) {

        if (null == head || null == head.next) {
            return head;
        }

        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;

        return temp;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        for (int i = 0; i < 5; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.swapPairs(listNode.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}