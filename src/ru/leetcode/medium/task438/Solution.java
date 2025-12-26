package ru.leetcode.medium.task438;

import java.util.*;

/**
 * @author rus.sadykov
 * 26.12.2025
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(s.substring(i, p.length() + i), p)) result.add(i);
        }
        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        for (char c : s1chars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s2chars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) - 1);
        }
        return freqMap.entrySet().stream().noneMatch(item -> item.getValue() > 0);
    }
}
