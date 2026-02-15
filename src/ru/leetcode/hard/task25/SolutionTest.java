package ru.leetcode.hard.task25;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * <p>
 * Example 1:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 * <p>
 * Example 2:
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 * <p>
 * Constraints:
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 5000
 * 0 <= Node.val <= 1000
 * <p>
 * https://leetcode.com/problems/reverse-nodes-in-k-group
 */
public class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] head = new int[]{1,2,3,4,5};
        int k = 2;
        int[] expected = new int[]{2,1,4,3,5};

        ListNode headNode = getListNodeFromArray(head);
        ListNode expectedNode = getListNodeFromArray(expected);
        ListNode actual = solution.reverseKGroup(headNode, k);
        assertTrue(sameNodes(expectedNode, actual));
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] head = new int[]{1,2,3,4,5};
        int k = 3;
        int[] expected = new int[]{3,2,1,4,5};

        ListNode headNode = getListNodeFromArray(head);
        ListNode expectedNode = getListNodeFromArray(expected);
        ListNode actual = solution.reverseKGroup(headNode, k);
        assertTrue(sameNodes(expectedNode, actual));
    }

    private ListNode getListNodeFromArray(int[] nums) {
        return nodeCreateHelper(nums, 0);
    }

    private ListNode nodeCreateHelper(int[] nums, int index) {
        if (index > nums.length - 1) return null;
        ListNode root = new ListNode(nums[index]);
        root.next = nodeCreateHelper(nums, ++index);
        return root;
    }

    private boolean sameNodes(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) return false;
            node1 = node1.next;
            node2 = node2.next;
            return sameNodes(node1, node2);
        }
        return true;
    }
}