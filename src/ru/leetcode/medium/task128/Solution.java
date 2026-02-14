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
            if (map.get(num) == 0) {
                while (map.containsKey(num + count)) {
                    int place = map.get(num + count);
                    if (place == 0) {
                        map.put(num + count, -num);
                        count++;
                    } else if (place < 0) {
                        count = count + map.get(-map.get(num + count)) + 1;
                    } else {
                        count = count + map.get(num + count);
                    }
                }
                map.put(num, count);
                result = Math.max(count, result);
                count = 1;
            }
        }
        return result;
    }
}
