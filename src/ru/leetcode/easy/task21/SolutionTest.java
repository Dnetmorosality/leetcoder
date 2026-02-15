package ru.leetcode.easy.task21;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * <p>
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * <p>
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * <p>
 * Constraints:
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 4};
        int[] nums2 = new int[]{1, 3, 4};
        int[] nums = new int[]{1, 1, 2, 3, 4, 4};
        ListNode node1 = getListNodeFromArray(nums1);
        ListNode node2 = getListNodeFromArray(nums2);
        ListNode expected = getListNodeFromArray(nums);
        ListNode actual = solution.mergeTwoLists(node1, node2);
        assertEquals(true, sameNodes(expected, actual));
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{2};
        int[] nums = new int[]{1, 2};
        ListNode node1 = getListNodeFromArray(nums1);
        ListNode node2 = getListNodeFromArray(nums2);
        ListNode expected = getListNodeFromArray(nums);
        ListNode actual = solution.mergeTwoLists(node1, node2);
        assertEquals(true, sameNodes(expected, actual));
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