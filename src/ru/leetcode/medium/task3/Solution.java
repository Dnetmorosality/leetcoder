package ru.leetcode.medium.task3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rus.sadykov
 * 06.02.2026
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int window = 0;
        char[] chars = s.toCharArray();
        int l = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while (l < s.length()) {
            if (set.add(chars[l])){
                window++;
                result = Math.max(window, result);
                l++;
            } else {
                set.clear();
                l = l - window + 1;
                window = 0;
            }
        }
        return result;
    }
}
