package com.example.demo.leetcode;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,4,5};
        System.out.println(removeDuplicates2(a));
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

    public static int removeDuplicates2(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int i = 0;
        boolean flag = true;
        for (int j = 1; j < len; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
                System.out.println(nums[j]);
                flag = true;
                continue;
            }
            if (nums[i] == nums[j] && flag) {
                System.out.println(nums[j]);
                nums[++i] = nums[j];
                flag = false;
            }
        }

        return i + 1;
    }
}
