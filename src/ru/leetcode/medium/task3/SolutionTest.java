package ru.leetcode.medium.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 * <p>
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
class SolutionTest {
    @Test
    void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "bbbbb";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase3() {
        Solution solution = new Solution();
        String s = "pwwkew";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }
}