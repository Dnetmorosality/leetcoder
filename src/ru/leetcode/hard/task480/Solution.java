package ru.leetcode.hard.task480;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 03.01.2026
 */
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int[] ints = new int[k];
        for (int i = 0; i < nums.length - k + 1; i++) {
            System.arraycopy(nums, i, ints, 0, k);
            Arrays.parallelSort(ints);
            if (k % 2 != 0) {
                result[i] = ints[k / 2];
            } else {
                result[i] = (double) ((long) ints[k / 2] + ints[k / 2 - 1]) / 2;
            }
        }
        return result;
    }
}
