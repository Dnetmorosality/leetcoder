package ru.leetcode.hard.task124;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * The path sum of a path is the sum of the node's values in the path.
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * <p>
 * Example 1:
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 * <p>
 * Example 2:
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 * <p>
 * Constraints:
 * The number of nodes in the tree is in the range [1, 3 * 104].
 * -1000 <= Node.val <= 1000
 * <p>
 * https://leetcode.com/problems/binary-tree-maximum-path-sum
 */
class SolutionTest {
    public TreeNode createTree(List<Integer> nums) {
        if (nums == null || nums.isEmpty() || nums.getFirst() == null) return null;
        TreeNode root = new TreeNode(nums.getFirst());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < nums.size()) {
            TreeNode curr = queue.poll();
            if (i < nums.size() && nums.get(i) != null) {
                curr.left = new TreeNode(nums.get(i));
                queue.offer(curr.left);
            }
            i++;

            if (i < nums.size() && nums.get(i) != null) {
                curr.right = new TreeNode(nums.get(i));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(1, 2, 3));
        TreeNode root = createTree(src);
        int expected = 6;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(-10, 9, 20, null, null, 15, 7));
        TreeNode root = createTree(src);
        int expected = 42;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,null,1));
        TreeNode root = createTree(src);
        int expected = 48;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase5() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(1,0,1,1,2,0,-1,0,1,-1,0,-1,0,1,0));
        TreeNode root = createTree(src);
        int expected = 4;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase6() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(-1,5,null,4,null,null,2,-4));
        TreeNode root = createTree(src);
        int expected = 11;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase7() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(9,6,-3,null,null,-6,2,null,null,2,null,-6,-6,-6));
        TreeNode root = createTree(src);
        int expected = 16;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase1() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(1, 2));
        TreeNode root = createTree(src);
        int expected = 3;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase2() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(2, -1));
        TreeNode root = createTree(src);
        int expected = 2;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }

    @Test
    public void cornerCase3() {
        Solution solution = new Solution();
        List<Integer> src = new ArrayList<>(Arrays.asList(-1, 0, 1));
        TreeNode root = createTree(src);
        int expected = 1;
        int actual = solution.maxPathSum(root);
        assertEquals(expected, actual);
    }
}