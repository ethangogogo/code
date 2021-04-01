package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6};
        System.out.println(subsets(a));
    }
    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i : nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            for (List<Integer> list : result) {
                List<Integer> copyList = new ArrayList<>(list);
                copyList.add(i);
                subsets.add(copyList);
            }
            result.addAll(subsets);
        }

        return result;
    }
}
