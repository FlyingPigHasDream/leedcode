package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/23 02:29
 */
public class m19 {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.val = 1;
        ListNode list2 = new ListNode();
        list2.val = 2;
        list.next = list2;
        swapPairs(list);
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next;
          }
     }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode res = new ListNode(0);
        ListNode temp = res;
        ListNode h = head;
        while (h != null && h.next != null) {
            ListNode n1 = h;
            ListNode n2 = h.next;
            temp.next = new ListNode(n2.val);
            temp.next.next = new ListNode(n1.val);
            h = h.next.next;
            temp = temp.next.next;
        }

        return res.next;
    }
}
