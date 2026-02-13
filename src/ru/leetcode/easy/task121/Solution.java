package ru.leetcode.easy.task121;

/**
 * @author rus.sadykov
 * 12.02.2026
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 2) {
            if (prices[0] < prices[1]) {
                return prices[1] - prices[0];
            } else {
                return 0;
            }
        }
        if (prices.length < 2) return 0;
        int[][] d = new int[prices.length][2];
        d[0][0] = 0;
        d[0][1] = prices[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            d[i][0] = Math.max(d[i - 1][1] - prices[prices.length - 1 - i], d[i - 1][0]);
            d[i][1] = Math.max(d[i - 1][1], prices[prices.length - 1 - i]);
        }
        return d[prices.length - 1][0];
    }
}
