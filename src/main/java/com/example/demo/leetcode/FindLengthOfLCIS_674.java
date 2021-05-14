package com.example.demo.leetcode;

public class FindLengthOfLCIS_674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int result = 1;
        int tmp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                tmp++;
            } else {
                tmp = 1;
            }
            result = Math.max(tmp ,result);
        }

        return result;
    }
}
