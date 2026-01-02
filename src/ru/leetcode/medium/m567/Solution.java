package ru.leetcode.medium.m567;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rus.sadykov
 * 30.12.2025
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (s1map.equals(s2map)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);
            int left = i - s1.length();
            char removeChar = s2.charAt(left);
            s2map.put(removeChar, s2map.get(removeChar) - 1);
            if (s2map.get(removeChar) == 0) s2map.remove(removeChar);
            if (s1map.equals(s2map)) return true;
        }
        return false;
    }
}

