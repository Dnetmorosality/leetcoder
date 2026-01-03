package ru.leetcode.easy.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * <p>
 * https://leetcode.com/problems/two-sum/description/
 */

class SolutionTest {
    @Test
    public void leetcodeCase1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};
        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};
        Solution solution = new Solution();
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}