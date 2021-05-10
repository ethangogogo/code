package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-1, -1, 0, 1};
        System.out.println(threeSum(a));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       if (nums.length < 3) {
           return result;
       }
        Arrays.sort(nums);
       for (int first = 0; first < nums.length; first++) {
           if (first > 0 && nums[first] == nums[first - 1]) {
               continue;
           }
           int target = -nums[first];
           int third = nums.length - 1;
           for (int second = first + 1; second < nums.length - 1; second++) {
               if (second > first + 1 && nums[second] == nums[second - 1]) {
                   continue;
               }

               while (second < third && nums[second] + nums[third] > target) {
                   third--;
               }

               if (second == third) {
                   break;
               }

               if (nums[second] + nums[third] == target) {
                  List<Integer> tmp = new ArrayList<>();
                  tmp.add(nums[first]);
                  tmp.add(nums[second]);
                  tmp.add(nums[third]);
                  result.add(tmp);
               }
           }
       }

       return result;
    }
}
