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
        int count = 0;
        int window = k + 1;
        int result = 0;
        while (count + window <= charsCode.size()) {
            List<Integer> subList = charsCode.subList(count, count + window);
            Map.Entry<Integer, Integer> maxValueMap = getMaxValueMap(getFreqMap(subList));
            if (maxValueMap != null && maxValueMap.getValue() + k >= window) {
                if (result < window) result = window;
                window++;
            } else {
                window = k + 1;
                count++;
            }
        }
        return result;
    }

    private Map<Integer, Integer> getFreqMap(List<Integer> charsCode) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < charsCode.size(); i++) {
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
