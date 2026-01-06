package ru.leetcode.medium.task122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.
 * Find and return the maximum profit you can achieve.
 * <p>
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 * <p>
 * Example 2:
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 * <p>
 * Example 3:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 * <p>
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */

class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 7;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int expected = 4;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}