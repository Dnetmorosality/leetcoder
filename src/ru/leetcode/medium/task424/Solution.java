package ru.leetcode.medium.task424;

import java.util.*;

/**
 * @author rus.sadykov
 * 05.01.2026
 */
class Solution {
    public int characterReplacement(String s, int k) {
        List<Integer> charsCode = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charsCode.add(s.charAt(i) - 'A');
        }
        int left = 0;
        int window = k + 1;
        int result = 0;
        Map<Integer, Integer> freqMap = getFreqMap(charsCode, left, window);
        while (left + window <= charsCode.size()) {
            Map.Entry<Integer, Integer> maxValueMap = getMaxValueMap(freqMap);
            if (maxValueMap != null && maxValueMap.getValue() + k >= window) {
                if (result < window) result = window;
                if (left + window < charsCode.size()) freqMap.put(charsCode.get(left + window), freqMap.getOrDefault(charsCode.get(left + window), 0) + 1);
                window++;
            } else {
                window = k + 1;
                left++;
                freqMap = getFreqMap(charsCode, left, left + window);
            }
        }
        return result;
    }

    private Map<Integer, Integer> getFreqMap(List<Integer> charsCode, int left, int right) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = left; i < right; i++) {
            freqMap.put(charsCode.get(i), freqMap.getOrDefault(charsCode.get(i), 0) + 1);
        }
        return freqMap;
    }

    private Map.Entry<Integer, Integer> getMaxValueMap(Map<Integer, Integer> map){
        Optional<Map.Entry<Integer, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            Map.Entry<Integer, Integer> entry = maxEntry.get();
            return entry;
        }
        return null;
    }
}
