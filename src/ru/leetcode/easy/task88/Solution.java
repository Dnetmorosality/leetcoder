package ru.leetcode.easy.task88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = nums1.length - 1;
        while (m > 0 && n > 0) {
            nums1[right] = nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];
            right--;
        }
        n--;
        if (n + 1 >= 0) System.arraycopy(nums2, 0, nums1, 0, n + 1);
    }
}
