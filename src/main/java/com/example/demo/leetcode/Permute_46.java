package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permute_46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        List<Integer> path = new LinkedList<>();
        backtrack(nums, path, result);

        return result;
    }

    private static void backtrack(int[] nums, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (path.contains(num)) {
                continue;
            }
            path.add(num);
            System.out.println(path);
            backtrack(nums, path, result);
            System.out.println(path);
            path.remove(path.size() - 1);
        }
    }
}
