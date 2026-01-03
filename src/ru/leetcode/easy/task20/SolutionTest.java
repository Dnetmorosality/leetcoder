package ru.leetcode.easy.task20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 *
 * Example 5:
 * Input: s = "([)]"
 * Output: false
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "()";
        boolean expected = true;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "()[]{}";
        boolean expected = true;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }
    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        String s = "([])";
        boolean expected = true;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }
    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        String s = "(]";
        boolean expected = false;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }
    @Test
    public void leetcodeCase5() {
        Solution solution = new Solution();
        String s = "([{)]";
        boolean expected = false;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        String s = "}{";
        boolean expected = false;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase2() {
        Solution solution = new Solution();
        String s = "(){}}{";
        boolean expected = false;
        boolean actual = solution.isValid(s);
        assertEquals(expected, actual);
    }
}