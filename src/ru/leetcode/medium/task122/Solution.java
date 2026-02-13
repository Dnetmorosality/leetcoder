package ru.leetcode.medium.task122;

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int result = 0;
        int r = prices.length - 1;
        boolean needSell = false;
        while (l < r) {
            while (l < r && prices[l] > prices[l + 1]) l++;
            if (l == r) {
                if (!needSell) {
                    return result;
                } else {
                    result = result + prices[l];
                }
            }
            if (l < prices.length) {
                result = result - prices[l];
                needSell = true;
            }
            l++;
            while (l < r && prices[l] < prices[l + 1]) l++;
            if (l < prices.length) {
                result = result + prices[l];
                needSell = false;
            }
            l++;
        }
        return result;
    }
}