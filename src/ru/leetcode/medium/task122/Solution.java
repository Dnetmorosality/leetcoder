package ru.leetcode.medium.task122;

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int result = 0;
        boolean needSell = false;
        while (l < prices.length - 1) {
            while (l < prices.length - 1 && prices[l] > prices[l + 1]) l++;
            if (l == prices.length - 1 && result == 0) return 0;
            if (l < prices.length) {
                result = result - prices[l];
                needSell = true;
            }
            l++;
            while (l < prices.length - 1 && prices[l] < prices[l + 1]) l++;
            if (l < prices.length) {
                result = result + prices[l];
                needSell = false;
            }
            l++;
            if (l == prices.length - 1 && needSell) result = result + prices[l];
        }
        return result;
    }
}
