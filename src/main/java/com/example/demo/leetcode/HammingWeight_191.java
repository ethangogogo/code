package com.example.demo.leetcode;

public class HammingWeight_191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = (n-1) & n;
        }

        return count;
    }
}
