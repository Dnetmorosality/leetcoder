package ru.leetcode.medium.task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testCornerCase() {
        Solution solution = new Solution();
        int[] height1 = {0, 0};
        int expected = 0;
        int actual = solution.maxArea(height1);
        assertEquals(expected, actual);

        int[] height2 = {0, 1};
        expected = 0;
        actual = solution.maxArea(height2);
        assertEquals(expected, actual);

        int[] height3 = {1, 0};
        expected = 0;
        actual = solution.maxArea(height3);
        assertEquals(expected, actual);

        int[] heigth4 = {1, 1};
        expected = 1;
        actual = solution.maxArea(heigth4);
        assertEquals(expected, actual);
    }

    @Test
    public void testCommonCase() {
        Solution solution = new Solution();
        int[] height2 = {8,7,2,1};
        int expected = 7;
        int actual = solution.maxArea(height2);
        assertEquals(expected, actual);
    }


}