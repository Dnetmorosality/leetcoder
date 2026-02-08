package ru.leetcode.easy.task27;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) idx.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!idx.contains(i)) {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = nums.length - idx.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
        return count;
    }
}
