package com.example.demo.leetcode;

public class TransPose_867 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(transpose(a)[1][2]);
    }

    private static int[][] transpose(int[][] matrix) {
        int len = matrix.length;
        int cloLen = matrix[0].length;
        int[][] result = new int[cloLen][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < cloLen; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
