package ru.leetcode.hard.task239;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author rus.sadykov
 * 04.01.2026
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
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
        result[0] = window.get(k - 1);
        for (int i = k; i < nums.length; i++) {
            int numRemove = nums[i - k];
            int numAdd = nums[i];
            int idxRemove = Collections.binarySearch(window, numRemove);
            window.remove(idxRemove);
            int idxAdd = Collections.binarySearch(window, numAdd);
            window.add(idxAdd >= 0 ? idxAdd : -idxAdd - 1, numAdd);
            result[i - k  + 1] = window.get(k - 1);
        }
        return result;
    }
}
