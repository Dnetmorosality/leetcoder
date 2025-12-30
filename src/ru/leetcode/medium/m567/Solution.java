package ru.leetcode.medium.m567;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 30.12.2025
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int size = s2.length() - s1.length();
        for (int i = 0; i <= size; i++) {
            if (isAnagram(s2.substring(i, s1.length() + i), s1)) return true;
        }
        return false;
    }

    private boolean isAnagram(String s1, String s2) {
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        boolean allEq = true;
        for (int i = 1; i < s1chars.length; i++) {
            if (s1chars[i] != s1chars[i - 1]) {
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

