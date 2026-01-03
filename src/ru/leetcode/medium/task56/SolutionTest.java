package ru.leetcode.medium.task56;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Example 1:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * <p>
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * <p>
 * Example 3:
 * Input: intervals = [[4,7],[1,4]]
 * Output: [[1,7]]
 * Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 */

class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        int[][] actual = solution.merge(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};
        int[][] expected = new int[][]{{1, 5}};
        int[][] actual = solution.merge(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{4, 7}, {1, 4}};
        int[][] expected = new int[][]{{1, 7}};
        int[][] actual = solution.merge(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{4, 7}};
        int[][] expected = new int[][]{{4, 7}};
        int[][] actual = solution.merge(intervals);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void cornerCase2() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{1, 4}, {2, 3}};
        int[][] expected = new int[][]{{1, 4}};
        int[][] actual = solution.merge(intervals);
        assertArrayEquals(actual, expected);
    }
}