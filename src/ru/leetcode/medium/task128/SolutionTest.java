package ru.leetcode.medium.task128;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * <p>
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * <p>
 * Example 3:
 * Input: nums = [1,0,1,2]
 * Output: 3
 * <p>
 * Constraints:
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * <p>
 * https://leetcode.com/problems/longest-consecutive-sequence
 */
public class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int expected = 4;
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 0, 1, 2};
        int expected = 3;
        int actual = solution.longestConsecutive(nums);
        assertEquals(expected, actual);
    }
}