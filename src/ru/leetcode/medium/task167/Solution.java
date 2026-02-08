package ru.leetcode.medium.task167;

class Solution {
    public int[] twoSum(int[] n, int target) {
        int left = 0;
        int right = n.length - 1;
        while (left < right) {
            if (n[left] + n[right] == target) return new int[]{++left, ++right};
            if (n[left] + n[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}
