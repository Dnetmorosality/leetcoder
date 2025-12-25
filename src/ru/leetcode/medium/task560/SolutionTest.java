package ru.leetcode.medium.task560;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array of integers nums and an integer k,
 * return the total number of subarrays whose sum equals to k.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * <p>
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * <p>
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * <p>
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 */

class SolutionTest {
    @Test
    public void testLeetcodeExample1() {
        Solution solution = new Solution();
        int expected = 2;
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testLeetcodeExample2() {
        Solution solution = new Solution();
        int expected = 2;
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testLeetcodeExample3() {
        Solution solution = new Solution();
        int expected = 1;
        int[] nums = new int[]{-1, -1, 1};
        int k = 0;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testLeetcodeExample4() {
        Solution solution = new Solution();
        int expected = 4;
        int[] nums = new int[]{1, 2, 1, 2, 1};
        int k = 3;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testCommonCase() {
        Solution solution = new Solution();
        int expected = 4;
        int[] nums = new int[]{-5, -3, 0, 1, 2, 3, 4};
        int k = 3;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testCornerCase1() {
        Solution solution = new Solution();
        int expected = 1;
        int[] nums = new int[]{1};
        int k = 1;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testCornerCase2() {
        Solution solution = new Solution();
        int expected = 0;
        int[] nums = new int[]{1};
        int k = 2;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testCornerCase3() {
        Solution solution = new Solution();
        int expected = 6;
        int[] nums = new int[]{0, 0, 0};
        int k = 0;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    public void testCornerCase4() {
        Solution solution = new Solution();
        int expected = 9;
        int[] nums = new int[]{0, 0, 1, 0, 0};
        int k = 1;
        int actual = solution.subarraySum(nums, k);
        assertEquals(expected, actual);
    }
}