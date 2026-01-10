package ru.leetcode.medium.task113;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rus.sadykov
 * 09.01.2026
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        pathGetter(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void pathGetter(TreeNode node, int targetValue, List<Integer> values, List<List<Integer>> result) {
        if (node == null) return;
        if (node.left == null && node.right == null && node.val == targetValue) {
            values.add(node.val);
            result.add(new ArrayList<>(values));
            values.removeLast();
        }
        values.add(node.val);
        pathGetter(node.left, targetValue - node.val, values, result);
        pathGetter(node.right, targetValue - node.val, values, result);
        values.removeLast();
    }
}
