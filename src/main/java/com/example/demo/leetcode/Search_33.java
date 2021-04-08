package com.example.demo.leetcode;

public class Search_33 {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,1,1};
        System.out.println(search2(a, 2));
    }
    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) >> 1;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] <= nums[right]) {
                if (target <= nums[right] && target > nums[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (target < nums[middle] && target >= nums[left]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

        }

        return -1;
    }

    public static boolean search2(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }

        if (nums.length == 1) {
            return nums[0] == target;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) >> 1;
            if (nums[middle] == target) {
                return true;
            }

            if (nums[middle] == nums[right] && nums[middle] == nums[left]) {
                while (left <= right) {
                    if (nums[left++] == target) {
                        return true;
                    }
                }
                return false;

            }
            if (nums[middle] <= nums[right]) {
                if (target <= nums[right] && target > nums[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (target < nums[middle] && target >= nums[left]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

        }

        return false;
    }
}
