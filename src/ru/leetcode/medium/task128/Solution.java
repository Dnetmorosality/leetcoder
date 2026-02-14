package ru.leetcode.medium.task128;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        int result = 0;
        int count = 1;
        for (int num : nums) {
            while (map.containsKey(num + count)) {
                count++;
            }
            result = Math.max(count, result);
            count = 1;
        }
        return result;
    }
}
