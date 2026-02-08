package ru.leetcode.hard.task30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int window = words[0].length();
        int size = words.length;
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int idx = 0;
        while (idx + window * size <= s.length()) {
            int count = 0;
            HashMap<String, Integer> currentMap = new HashMap<>(map);
            while (count < size) {
                String substring = s.substring(idx + count * window, idx + window + count * window);
                if (currentMap.containsKey(substring)) {
                    currentMap.put(substring, currentMap.get(substring) - 1);
                }
                count++;
            }
            if (currentMap.values().stream().allMatch(item -> item == 0)) {
                result.add(idx);
                idx = idx + window;
            } else {
                idx++;
            }
        }
        return result;
    }
}
