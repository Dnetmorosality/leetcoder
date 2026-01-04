package ru.leetcode.hard.task480;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author rus.sadykov
 * 03.01.2026
 */
class Solution {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();
    int k;

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
            if (i >= k - 1) {
                res[i - k + 1] = getMedian(k);
                remove(nums[i - k + 1]);
            }
        }
        return res;
    }

    private void add(int num) {
        if (left.isEmpty() || num <= left.peek()) {
            left.offer(num);
        } else {
            right.add(num);
        }
        balance();
    }

    private void remove(int num) {
        if (num > left.peek()) {
            right.remove(num);
        } else {
            left.remove(num);
        }
        balance();
    }


    private void balance() {
        if (left.size() > right.size() + 1) {
            right.offer(left.poll());
        } else if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }

    private double getMedian(int k) {
        if (k % 2 == 0) {
            return (double) (left.peek() + right.peek()) / 2;
        } else {
            return (double) left.peek();
        }
    }
}
