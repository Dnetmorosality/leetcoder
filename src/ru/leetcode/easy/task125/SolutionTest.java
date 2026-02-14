package ru.leetcode.easy.task125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * <p>
 * Constraints:
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 * <p>
 * https://leetcode.com/problems/valid-palindrome
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean actual = solution.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "race a car";
        boolean expected = false;
        boolean actual = solution.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        String s = " ";
        boolean expected = true;
        boolean actual = solution.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        String s = "P0";
        boolean expected = false;
        boolean actual = solution.isPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase5() {
        Solution solution = new Solution();
        String s = "\"Marge, let's \\\"[went].\\\" I await {news} telegram.\"";
        boolean expected = false;
        boolean actual = solution.isPalindrome(s);
        assertEquals(expected, actual);
    }
}