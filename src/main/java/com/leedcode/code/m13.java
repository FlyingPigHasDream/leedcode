package com.leedcode.code;

import java.util.Stack;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/05/02 18:06
 */
public class m13 {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int node) {
        s1.push(node);
        if (s2 == null || s2.peek() > node) {
            s2.push(node);
        } else {
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
