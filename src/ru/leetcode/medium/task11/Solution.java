package ru.leetcode.medium.task11;

/**
 * @author rus.sadykov
 * 19.12.2025
 */
public class Solution {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int volume = Math.min(height[left], height[right]) * (right - left);
            if (volume > maxVolume) maxVolume = volume;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}

