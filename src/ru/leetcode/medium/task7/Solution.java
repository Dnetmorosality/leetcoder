package ru.leetcode.medium.task7;

class Solution {
    public int reverse(int x) {
        long result = 0;
        while (Math.abs(x) > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return Math.abs(result) > Integer.MAX_VALUE ? 0 : (int) result;
    }
}
