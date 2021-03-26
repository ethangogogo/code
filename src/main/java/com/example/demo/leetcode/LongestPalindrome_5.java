package com.example.demo.leetcode;

public class LongestPalindrome_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abaaa"));
    }

    private static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        String result = s.substring(0, 1);
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }
}
