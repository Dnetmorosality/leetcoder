package ru.leetcode.medium.m56;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author rus.sadykov
 * 30.12.2025
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[][] mergeArr = new int[intervals.length][1];
        int count = 0;
        mergeArr[0] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (mergeArr[count][1] >= intervals[i][0] && mergeArr[count][1] <= intervals[i][1]) {
                mergeArr[count][1] = intervals[i][1];
            } else if (mergeArr[count][0] <= intervals[i][0] && mergeArr[count][1] >= intervals[i][1]) {
                continue;
            } else {
                count++;
                mergeArr[count] = intervals[i];
            }
        }
        int[][] result = new int[++count][1];
        System.arraycopy(mergeArr, 0, result, 0, count);
        return result;
    }
}
