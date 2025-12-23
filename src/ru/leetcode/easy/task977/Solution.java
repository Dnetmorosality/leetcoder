package ru.leetcode.easy.task977;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 23.12.2025
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                pos--;
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                pos--;
                right--;
            }
        }
        return result;
    }
}
