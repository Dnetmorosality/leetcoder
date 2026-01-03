package ru.leetcode.medium.task18;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * <p>
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * <p>
 * Example 2:
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 * <p>
 * Constraints:
 * 1 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * <p>
 * https://leetcode.com/problems/4sum/description/
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1));
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2));
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000};
        int target = 1000000000;
        List<List<Integer>> expected = List.of(List.of(0, 0, 0, 1000000000));
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase2() {
        Solution solution = new Solution();
        int[] nums = new int[]{0};
        int target = 0;
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase3() {
        Solution solution = new Solution();
        int[] nums = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase4() {
        Solution solution = new Solution();
        int[] nums = new int[]{-1000000000, -1000000000, 1000000000, -1000000000, -1000000000};
        int target = 294967296;
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }
}