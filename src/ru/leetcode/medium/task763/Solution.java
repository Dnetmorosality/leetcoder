package ru.leetcode.medium.task763;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rus.sadykov
 * 23.12.2025
 */
class Solution {
    public List<Integer> partitionLabels(String s) {
        int left = 0;
        int right = s.length() - 1;
        List<Integer> result = new ArrayList<>();
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                right--;
            } else {
                int tempRight = right + 1;
                while (tempRight < s.length() - 1) {
                    if (s.substring(left, tempRight).contains(s.subSequence(tempRight, tempRight + 1))) {
                        tempRight++;
                    } else {
                        result.add(tempRight - left);
                        left = tempRight;
                        right = s.length() - 1;
                    }
                }
            }
        }
        return result;
    }
}
