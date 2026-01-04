package ru.leetcode.hard.task239;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 04.01.2026
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int[] ints = new int[k];
        for (int i = 0; i < nums.length - k + 1; i++) {
            System.arraycopy(nums, i, ints, 0, k);
            Arrays.parallelSort(ints);
            result[i] = ints[k - 1];
        }
        return result;
    }
}
