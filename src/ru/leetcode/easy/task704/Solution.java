package ru.leetcode.easy.task704;

class Solution {
    public int search(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;
        if (nums[0] == target) return 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
