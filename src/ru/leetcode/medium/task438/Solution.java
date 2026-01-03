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
        int size = s.length() - p.length();
        for (int i = 0; i <= size; i++) {
            if (isAnagram(s.substring(i, p.length() + i), p)) result.add(i);
        }
        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        boolean allEq = true;
        for (int i = 1; i < s2chars.length; i++) {
            if (s2chars[i] != s2chars[i - 1]) {
                allEq = false;
                break;
            }
        }
        if (allEq) {
            return Arrays.equals(s1chars, s2chars);
        } else {
            Arrays.sort(s1chars);
            Arrays.sort(s2chars);
            return Arrays.equals(s1chars, s2chars);
        }
    }
}
