package ru.leetcode.medium.task200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 * <p>
 * Example 2:
 * Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3
 * <p>
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int expected = 1;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        int expected = 3;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}};
        int expected = 1;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '1', '1'},
                {'0', '0', '0', '1', '0', '0'},
                {'1', '1', '0', '1', '0', '0'},
                {'1', '0', '0', '1', '0', '0'},
                {'1', '0', '0', '1', '0', '0'},
                {'1', '1', '1', '1', '1', '1'}};
        int expected = 1;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        char[][] grid = new char[][]{{'1'}};
        int expected = 1;
        int actual = solution.numIslands(grid);
        assertEquals(expected, actual);
    }


}