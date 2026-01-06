package ru.leetcode.medium.task714;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int dp[][] = new int[prices.length + 1][2];
        for (int j = 0; j < 2; j++) {
            dp[prices.length][j] = 0;
        }

        for (int idx = prices.length-1; idx >= 0; idx--) {
            for (int buy = 0; buy <= 1; buy++) {
                if (buy == 1) {
                    int buying = -prices[idx] + dp[idx + 1][0];
                    int notBuying = dp[idx + 1][1];
                    dp[idx][buy] = Math.max(buying, notBuying);
                } else {
                    int sell = prices[idx] - fee + dp[idx + 1][1];
                    int notSell = dp[idx + 1][0];
                    dp[idx][buy] = Math.max(sell, notSell);
                }
            }
        }
        return dp[0][1];
    }
}
