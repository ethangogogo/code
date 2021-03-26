package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZConvert_6 {
    public static void main(String[] args) {
        System.out.println(convert("ABC", 1));
    }

    private static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int len = s.length();
        int rows = Math.min(len, numRows);
        List<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            stringBuilders.add(new StringBuilder());
        }

        int numRow = 0;
        boolean jump = false;
        for (char a : s.toCharArray()) {
            stringBuilders.get(numRow).append(a);
            if (numRow == 0 || numRow == rows - 1) {
                jump = !jump;
            }
            numRow += jump ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder stringBuilder : stringBuilders) {
            result.append(stringBuilder);
        }

        return result.toString();
    }
}
