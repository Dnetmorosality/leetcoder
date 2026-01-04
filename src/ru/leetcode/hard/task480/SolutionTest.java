package ru.leetcode.hard.task480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.
 * <p>
 * For examples, if arr = [2,3,4], the median is 3.
 * For examples, if arr = [1,2,3,4], the median is (2 + 3) / 2 = 2.5.
 * You are given an integer array nums and an integer k. There is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * <p>
 * Return the median array for each window in the original array. Answers within 10-5 of the actual value will be accepted.
 * <p>
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
 * Explanation:
 * Window position                Median
 * ---------------                -----
 * [1  3  -1] -3  5  3  6  7        1
 * 1 [3  -1  -3] 5  3  6  7       -1
 * 1  3 [-1  -3  5] 3  6  7       -1
 * 1  3  -1 [-3  5  3] 6  7        3
 * 1  3  -1  -3 [5  3  6] 7        5
 * 1  3  -1  -3  5 [3  6  7]       6
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4,2,3,1,4,2], k = 3
 * Output: [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
 * <p>
 * Constraints:
 * 1 <= k <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 *
 * <a href="https://leetcode.com/problems/sliding-window-median/description/">...</a>
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] expected = new double[]{1.0, -1.0, -1.0, 3.0, 5.0, 6.0};
        double[] actual = solution.medianSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2};
        int k = 3;
        double[] expected = new double[]{2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0};
        double[] actual = solution.medianSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 4, 2, 3};
        int k = 4;
        double[] expected = new double[]{2.5};
        double[] actual = solution.medianSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        int[] nums = new int[]{2147483647, 2147483647};
        int k = 2;
        double[] expected = new double[]{2147483647.0};
        double[] actual = solution.medianSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void cornerCase2() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1};
        int k = 2;
        double[] expected = new double[]{1.0, 1.0, 1.0};
        double[] actual = solution.medianSlidingWindow(nums, k);
        assertArrayEquals(expected, actual);
    }
}