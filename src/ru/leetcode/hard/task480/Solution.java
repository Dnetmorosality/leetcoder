package ru.leetcode.hard.task480;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author rus.sadykov
 * 03.01.2026
 */
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int[] ints = new int[k];
        System.arraycopy(nums, 0, ints, 0, k);
        if (k > 10000) {
            Arrays.parallelSort(ints);
        } else {
            Arrays.sort(ints);
        }
        List<Integer> window = new ArrayList<>(k);
        for (int i : ints) {
            window.add(i);
        }
        result[0] = getMedian(window, k);
        for (int i = k; i < nums.length; i++) {
            int numRemove = nums[i - k];
            int numAdd = nums[i];
            int idxRemove = Collections.binarySearch(window, numRemove);
            window.remove(idxRemove);
            int idxAdd = Collections.binarySearch(window, numAdd);
            window.add(idxAdd >= 0 ? idxAdd : -idxAdd - 1, numAdd);
            result[i - k  + 1] = getMedian(window, k);
        }
        return result;
    }

    private double getMedian(List<Integer> window, int k) {
        if (k % 2 != 0) {
            return window.get(k / 2);
        } else {
            return (double) ((long) window.get(k / 2) + window.get(k / 2 - 1)) / 2;
        }
    }
}
