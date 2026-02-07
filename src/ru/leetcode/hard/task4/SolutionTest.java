package ru.leetcode.hard.task4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Constraints:
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double expected = 2.0;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double expected = 2.5;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{0, 0};
        double expected = 0;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};
        double expected = 1;
        double actual = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }
}