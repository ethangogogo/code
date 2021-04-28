package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermuteUnique_47 {
    public static void main(String[] args) {
        int[] nums = {1,1,3};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 1) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        List<Integer> path = new ArrayList<>();
        backtrack(nums, used, result, path);
        return result;
    }
    private static void backtrack(int[] nums, boolean[] used, List<List<Integer>> result, List<Integer> path) {
        if (path.size() == nums.length) {
            if (!result.contains(path)) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, used, result, path);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
