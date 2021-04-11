package com.example.demo.leetcode;

import com.example.demo.model.ListNode;

public class SwapPairs_24 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(swapPairs(a).val);
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

//        ListNode result = head.next;
        ListNode preNode = new ListNode(0);
        ListNode result = preNode;
        preNode.next = head;
        while (preNode.next != null && preNode.next.next != null) {
            ListNode node1 = preNode.next;
            ListNode node2 = preNode.next.next;
            preNode.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            preNode = node1;
        }

        return result.next;
    }
}
