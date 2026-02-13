package ru.leetcode.easy.task121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * Constraints:
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 * <p>
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        int[] prices = new int[]{2, 1, 2, 1, 0, 1, 2};
        int expected = 2;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        int expected = 4;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}