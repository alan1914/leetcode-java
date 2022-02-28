package com.alan.medium._0707;

/**
 * @author shiml
 * @date 2022-2-25 11:49:56
 */
public class MyLinkedList {

    private ListNode node;

    private int length;

    public MyLinkedList() {

    }

    public int get(int index) {
        ListNode curr  = node;
        while (index > 0) {
            index--;
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode listNode = new ListNode(val);
        listNode.next = this.node.next;
        this.node = listNode;
    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }

}