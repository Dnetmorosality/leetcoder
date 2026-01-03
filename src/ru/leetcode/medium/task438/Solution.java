package ru.leetcode.medium.task438;

import java.util.*;

/**
 * @author rus.sadykov
 * 26.12.2025
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freqP, freqS)) result.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            int indexAdd = s.charAt(i) - 'a';
            int pos = i - p.length();
            int indexRemove = s.charAt(pos) - 'a';
            freqS[indexAdd]++;
            freqS[indexRemove]--;
            if (Arrays.equals(freqP, freqS)) result.add(pos + 1);
        }
        return result;
    }
}
