package ru.leetcode.medium.task763;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rus.sadykov
 * 23.12.2025
 */
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<int[]> intervals = new ArrayList<>();
        int[] firstPositionArr = new int[26];
        int[] lastPositionArr = new int[26];
        int reverseCount = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            int indexChar = s.charAt(i) - 'a';
            if (firstPositionArr[indexChar] == 0) firstPositionArr[indexChar] = i + 1;
            int reversIndexChar = s.charAt(reverseCount) - 'a';
            if (lastPositionArr[reversIndexChar] == 0) lastPositionArr[reversIndexChar] = reverseCount + 1;
            reverseCount -= 1;
        }
        for (int i = 0; i < firstPositionArr.length; i++) {
            if (firstPositionArr[i] != 0) {
                intervals.add(new int[]{firstPositionArr[i], lastPositionArr[i]});
            }
        }
        List<Integer> result = new ArrayList<>();
        if (intervals.size() == 1) {
            result.add(intervals.get(0)[1]);
            return result;
        }
        intervals.sort((a,b) -> a[0] - b[0]);
        List<int[]> mergeArr = new ArrayList<>();
        mergeArr.add(intervals.getFirst());
        int mergeCount = 0;
        for (int i = 1; i < intervals.size(); i++) {
            if (mergeArr.get(mergeCount)[1] >= intervals.get(i)[0] && intervals.get(i)[1] > mergeArr.get(mergeCount)[1]) {
                mergeArr.set(mergeCount, new int[]{mergeArr.get(mergeCount)[0], intervals.get(i)[1]});
            } else if (mergeArr.get(mergeCount)[1] > intervals.get(i)[1]) {
                continue;
            } else {
                mergeCount++;
                mergeArr.add(intervals.get(i));
            }
        }
        result.add(mergeArr.get(0)[1]);
        for (int i = 1; i < mergeArr.size(); i++) {
            result.add(mergeArr.get(i)[1] - mergeArr.get(i-1)[1]);
        }
        return result;
    }
}
