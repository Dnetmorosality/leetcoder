package ru.leetcode.medium.task424;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 * <p>
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * <p>
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achieve this answer too.
 * <p>
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 * <p>
 * https://leetcode.com/problems/longest-repeating-character-replacement/description/
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        int actual = solution.characterReplacement(s, k);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "AABABBA";
        int k = 1;
        int expected = 4;
        int actual = solution.characterReplacement(s, k);
        assertEquals(expected, actual);
    }
}