package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup_90 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6};
        System.out.println(subsetsWithDup(a));
    }
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1 << nums.length; i++) {
            list.clear();
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if ((i & 1 << j) != 0) {
                    if (j > 0 && (i >> j - 1 & 1) == 0 && nums[j] == nums[j - 1]) {
                        flag = false;
                        break;
                    }
                    list.add(nums[j]);
                }
            }
            if (flag) {
                result.add(new ArrayList<>(list));
            }
        }

        return result;
    }
}
