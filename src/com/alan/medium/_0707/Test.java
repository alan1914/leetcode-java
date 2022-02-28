package com.alan.medium._0707;

/**
 * test class
 *
 * @author shiml
 * @date 2022-2-25 11:53:46
 */
public class Test {

    public static void main(String[] args) {

        int index = 1;
        int val = 2;

        MyLinkedList obj = new MyLinkedList();
        int param_1 = obj.get(index);
        obj.addAtHead(val);
        obj.addAtTail(val);
        obj.addAtIndex(index, val);
        obj.deleteAtIndex(index);

    }
}
