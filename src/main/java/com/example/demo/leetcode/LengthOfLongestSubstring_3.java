package com.example.demo.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring_3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("abbab"));
    }


    private static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            Set<Character> characters = new HashSet<>();
            for (int j = i; j < len; j++) {
                if (characters.contains(s.charAt(j))) {
                    result = Math.max(characters.size(), result);
                    break;
                }
                characters.add(s.charAt(j));

                if (j == len - 1) {
                    result = Math.max(characters.size(), result);
                }

            }
        }

        return result;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0,j=0;i<len;i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            result = Math.max(result, i - j +1);
            map.put(s.charAt(i), i);
        }

        return result;
    }
}
