package ru.leetcode.medium.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * Input: x = 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: x = -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: x = 120
 * Output: 21
 * <p>
 * Constraints:
 * -231 <= x <= 231 - 1
 * <p>
 * https://leetcode.com/problems/reverse-integer/description/
 */
class SolutionTest {
    @Test
    void leetcodeCase1() {
        Solution solution = new Solution();
        int x = 123;
        int expected = 321;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase2() {
        Solution solution = new Solution();
        int x = -123;
        int expected = -321;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase3() {
        Solution solution = new Solution();
        int x = 120;
        int expected = 21;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase4() {
        Solution solution = new Solution();
        int x = 1534236469;
        int expected = 0;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }

    @Test
    void leetcodeCase5() {
        Solution solution = new Solution();
        int x = -1563847412;
        int expected = 0;
        int actual = solution.reverse(x);
        assertEquals(expected, actual);
    }
}