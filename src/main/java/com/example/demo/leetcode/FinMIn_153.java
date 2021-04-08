package com.example.demo.leetcode;

public class FinMIn_153 {
    public static void main(String[] args) {
        int[] a = {6,7,1,2,3,4,5};
        System.out.println(findMin(a));
    }
    public static int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int left = 0;
        int right = len - 1;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (nums[middle] <= nums[right] && nums[middle] >= nums[left]) {
                return nums[left];
            }
            if (nums[left] <= nums[middle]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return nums[right];
    }

    public static int findMin2(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int left = 0;
        int right = len - 1;
        while (left < right) {
            int middle = (left + right) >> 1;
            if (nums[right] > nums[middle]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return nums[left];
    }
}
