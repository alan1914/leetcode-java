package com.alan.easy._0225;

/**
 * @author shiml
 * @date 2022-02-21 16:21:20
 */
public class Solution {

    public static void main(String[] args) {

        int x = 1;

        MyStack obj = new MyStack();
        obj.push(x);
        obj.push(x);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}