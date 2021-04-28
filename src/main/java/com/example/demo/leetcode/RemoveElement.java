package com.example.demo.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(removeElement2(a, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int start = 0;
        while (start <= end) {
            while (nums[end] == val) {
                if (end == 0) {
                    return start;
                }
                end--;
            }
            if (start > end) {
                return start;
            }

            if (nums[start] == val) {
                nums[start] = nums[end];
                start++;
                end--;
            } else {
                start++;
            }
        }

        return start;
    }

    public static int removeElement2(int[] nums, int val) {
        int s = 0;
        int e = nums.length;
        while (s < e) {
            if (nums[s] == val) {
                nums[s] = nums[--e];
            } else {
                s++;
            }
        }
        return s;
    }

}
