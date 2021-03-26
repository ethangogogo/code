package com.example.demo.leetcode;

public class IntegerReverse_7 {
    public static void main(String[] args) {
        System.out.println(reverse(1230000000));
        System.out.println(2147483647 + 2);
    }

    static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int y = x % 10;
            x = x / 10;
            if (result == 0 && y == 0) {
                continue;
            }

            result = result * 10 + y;
            if (result % 10 != y) {
                return 0;
            }
        }

        return result;
    }
}
