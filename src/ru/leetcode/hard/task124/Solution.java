package ru.leetcode.hard.task124;

class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        setMaxValue(root);
        return Math.max(max, root.val);
    }

    private void setMaxValue(TreeNode node) {
        if (node == null) return;
        if (isLeaf(node.left) && !isLeaf(node.right)) setMaxValue(node.right);
        if (isLeaf(node.right) && !isLeaf(node.left)) setMaxValue(node.left);

        if (!isLeaf(node.left) && !isLeaf(node.right)) {
            setMaxValue(node.left);
            setMaxValue(node.right);
        }

        if (node.left == null && isLeaf(node.right)) {
            max = Math.max(node.val, max);
            max = Math.max(node.right.val, max);
            node.val += Math.max(node.right.val, 0);
            node.right = null;
            return;
        } else if (node.right == null && isLeaf(node.left)) {
            max = Math.max(node.val, max);
            max = Math.max(node.left.val, max);
            node.val += Math.max(node.left.val, 0);
            node.left = null;
            return;
        }
        if (isLeaf(node.left) && isLeaf(node.right)) {
            int leftVal = Math.max(node.left.val, 0);
            int rightVal = Math.max(node.right.val, 0);
            max = Math.max(max, node.left.val);
            max = Math.max(max, node.val);
            max = Math.max(max, node.right.val);
            max = Math.max(node.val + leftVal + rightVal, max);
            node.val += Math.max(leftVal, rightVal);
            node.left = null;
            node.right = null;
            return;
        }
        setMaxValue(node.left);
        setMaxValue(node.right);
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }
}
