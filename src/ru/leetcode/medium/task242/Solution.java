package ru.leetcode.medium.task242;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rus.sadykov
 * 02.01.2026
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freqMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        char[] tChars = t.toCharArray();
        for (char c : tChars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
        }
        return freqMap.values().stream().allMatch(i -> i == 0);
    }
}
