package ru.leetcode.medium.task122;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxProfit(int[] prices) {
        Set<Integer> buyDay = new HashSet<>();
        Set<Integer> sellDay = new HashSet<>();
        int left = 1;
        if (prices.length < 2) return 0;
        if (prices[0] < prices[1]) {
            buyDay.add(0);
        }
        while (left < prices.length) {
            if (buyDay.size() > sellDay.size()) {
                while (left < prices.length - 1 && prices[left] <= prices[left + 1]) {
                    left++;
                    if (left == prices.length - 1) {
                        sellDay.add(left);
                        break;
                    }
                }
                sellDay.add(left);
            } else {
                while (left < prices.length - 1 && prices[left] >= prices[left + 1]) {
                    left++;
                }
                if (left < prices.length - 1) buyDay.add(left);
            }
            left++;
        }
        return getProfit(prices, buyDay, sellDay);
    }

    private int getProfit(int[] prices, Set<Integer> buyDay, Set<Integer> sellDay) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (sellDay.contains(i)) result = result + prices[i];
            if (buyDay.contains(i)) result = result - prices[i];
        }
        return result;
    }
}
