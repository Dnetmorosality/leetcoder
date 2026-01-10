package ru.leetcode.medium.task113;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
 *
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children. *
 *
 * Example 1:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 * Explanation: There are two paths whose sum equals targetSum:
 * 5 + 4 + 11 + 2 = 22
 * 5 + 8 + 4 + 5 = 22
 *
 * Example 2:
 * Input: root = [1,2,3], targetSum = 5
 * Output: []
 *
 * Example 3:
 * Input: root = [1,2], targetSum = 0
 * Output: []
 *
 * Constraints:
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 *
 * https://leetcode.com/problems/path-sum-ii/description/
 */


/**
 *  o1, l1, r1, ll2, lr2, rl2, rl2, lll3, llr3, lrl3, lrr3,
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
        List<Integer> src = new ArrayList<>(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1));
        TreeNode root = createTree(src);
        List<List<Integer>> expected = List.of(List.of(5,4,11,2), List.of(5,8,4,5));
        int targetSum = 22;
        List<List<Integer>> actual = solution.pathSum(root, targetSum);
        assertEquals(expected, actual);
    }
}