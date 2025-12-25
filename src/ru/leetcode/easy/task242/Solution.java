package ru.leetcode.easy.task242;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 25.12.2025
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}
