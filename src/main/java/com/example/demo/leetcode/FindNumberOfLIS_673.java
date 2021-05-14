package com.example.demo.leetcode;

import java.util.Arrays;

public class FindNumberOfLIS_673 {
    public static void main(String[] args) {
        int[] a = {2,2,2,2};
        System.out.println(findNumberOfLIS(a));
    }
    public static int findNumberOfLIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int maxSize = 0;
        int[] dp = new int[nums.length];
        int[] res = new int[nums.length];
        dp[0] = 1;
        Arrays.fill(res, 1);
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        res[i] = res[j];
                    } else if (dp[i] == dp[j] + 1) {
                        res[i] += res[j];
                    }
                }
            }

            maxSize = Math.max(maxSize, dp[i]);
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == maxSize) {
                result += res[i];
            }
        }

        return result;
    }
}
