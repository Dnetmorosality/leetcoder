package ru.leetcode.medium.task49;

import java.util.*;

/**
 * @author rus.sadykov
 * 02.01.2026
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                List<String> strings = map.get(key);
                strings.add(strs[i]);
                map.put(key, strings);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(strs[i]);
                map.put(key, strings);
            }
        }
        return new ArrayList<>(map.values());
    }
}
