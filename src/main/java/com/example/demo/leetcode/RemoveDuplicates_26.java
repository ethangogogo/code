package com.example.demo.leetcode;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int i = 0;
        for (int j = 1; j < len; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
                System.out.println(nums[j]);
            }
        }

        return i + 1;
    }
}
