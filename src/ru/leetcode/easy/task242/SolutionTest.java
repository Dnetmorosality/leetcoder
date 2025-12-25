package ru.leetcode.easy.task242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
  * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
class SolutionTest {
    @Test
    void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "rat";
        String t = "car";
        boolean expected = false;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }
}