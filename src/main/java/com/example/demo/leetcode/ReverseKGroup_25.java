package com.example.demo.leetcode;

import com.example.demo.model.ListNode;

public class ReverseKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode result = hair;

        while (head != null) {
            for (int i = 1; i < k && head != null; i++) {
                head = head.next;
            }
            if (head == null) {
                break;
            }
            ListNode tmp = head.next;
            head.next = null;
            ListNode start = hair.next;
            hair.next = reverse(start);
            start.next = tmp;
            hair = start;
            head = tmp;
        }

        return result.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;
    }
}
