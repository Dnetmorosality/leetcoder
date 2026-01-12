package ru.leetcode.easy.task1046;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author rus.sadykov
 * 12.01.2026
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            max.offer(stone);
        }
        while (max.size() > 1) {
            int first = max.poll();
            int second = max.poll();
            if (first != second) {
                max.add(first - second);
            }
        }
        return max.isEmpty() ? 0 : max.poll();
    }
}
