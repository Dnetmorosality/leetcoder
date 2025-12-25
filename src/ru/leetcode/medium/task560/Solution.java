package ru.leetcode.medium.task560;

import java.util.Arrays;

/**
 * @author rus.sadykov
 * 24.12.2025
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int leftTemp = 0;
        int sum = 0;
        while (leftTemp <= right) {
            sum += nums[left];
            if (sum == k) {
                result++;
            }
            if (left < right){
                left++;
            } else {
                leftTemp++;
                left = leftTemp;
                sum = 0;
            }
        }
        return result;
    }
}
