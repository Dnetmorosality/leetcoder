package ru.leetcode.hard.task30;

import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int window = words[0].length();
        if (window == 1 && s.length() > 1) return findCharSequence(s, words);
        int size = words.length;
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int idx = 0;
        while (idx + window * size <= s.length()) {
            String checkString = s.substring(idx, idx + window);
            if (!map.containsKey(checkString)) {
                idx++;
                continue;
            }
            int count = 0;
            HashMap<String, Integer> currentMap = new HashMap<>(map);
            while (count < size) {
                int i = idx + count * window;
                String substring = s.substring(i, i + window);
                if (currentMap.containsKey(substring)) {
                    currentMap.put(substring, currentMap.get(substring) - 1);
                }
                count++;
            }
            if (currentMap.values().stream().allMatch(item -> item == 0)) {
                result.add(idx);
            }
            idx++;
        }
        return result;
    }

    private List<Integer> findCharSequence(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.charAt(0) != words[0].charAt(0)) return result;
        int count = s.length() - words.length + 1;
        for (int i = 0; i < count; i++) {
            result.add(i);
        }
        return result;
    }
}
