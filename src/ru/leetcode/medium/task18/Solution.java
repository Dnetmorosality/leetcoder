package ru.leetcode.medium.task18;

import java.util.*;

/**
 * @author rus.sadykov
 * 02.01.2026
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return Collections.emptyList();
        Arrays.sort(nums);
        List<Integer> terms = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;

        while (left + 2 < right) {
            if (nums[left] + nums[left + 1] + nums[left + 2] + nums[right] > target) {
                right--;
            } else if ((long)nums[left] + nums[right - 2] + nums[right - 1] + nums[right] < target) {
                left++;
            } else {
                break;
            }
        }
        for (int i = left; i <= right; i++) {
            terms.add(nums[i]);
        }
        if (terms.stream().allMatch(item -> item == terms.getFirst()) && terms.getFirst() * 4 == target) {
            return List.of(List.of(terms.getFirst(), terms.getFirst(), terms.getFirst(), terms.getFirst()));
        }
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < terms.size() - 3; i++) {
            for (int j = i + 1; j < terms.size() - 2; j++) {
                for (int k = j + 1; k < terms.size() - 1; k++) {
                    for (int l = k + 1; l < terms.size(); l++) {
                        if (terms.get(i) + terms.get(j) + terms.get(k) + terms.get(l) == target) {
                            result.add(List.of(terms.get(i), terms.get(j), terms.get(k), terms.get(l)));
                        }
                    }
                }
            }
        }
        return result.stream().toList();
    }
}
