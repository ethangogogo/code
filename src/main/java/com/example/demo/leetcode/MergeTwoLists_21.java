package com.example.demo.leetcode;

import com.example.demo.model.ListNode;

public class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode result = new ListNode(0);
        ListNode index = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        if (l1 != null) {
            result.next = l1;
        } else {
            result.next = l2;
        }

        return index.next;
    }
}
