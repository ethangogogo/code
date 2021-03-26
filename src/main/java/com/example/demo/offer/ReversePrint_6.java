package com.example.demo.offer;

import com.example.demo.model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReversePrint_6 {
    List<Integer> tmp = new ArrayList<>();

    private int[] reversePrint(ListNode head) {
        reverse(head);
        int[] result = new int[tmp.size()];
        int i = 0;
        for (int val : tmp) {
            result[i++] = val;
        }
        return result;
    }


    private void reverse(ListNode head) {
        if (head != null) {
            reverse(head.next);
            tmp.add(head.val);
        }
    }

}
