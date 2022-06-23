package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/20 00:08
 */
public class m6 {

      public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
          this.val = val;
        }
      }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @param val int整型
     * @return ListNode类
     */
    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        if (head == null) {
            return null;
        }

        ListNode res = head;
        while (res.next != null) {
            if (res.val == val) {
                res.next = res.next.next;
                break;
            }
            res = res.next;
        }

        return head;
    }

    public ListNode deleteNode1 (ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node = dummy;
        while(node.next!=null){
            if(node.next.val==val){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        return dummy.next;
    }

}
