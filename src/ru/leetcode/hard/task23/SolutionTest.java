package ru.leetcode.hard.task23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted linked list:
 * 1->1->2->3->4->4->5->6
 * <p>
 * Example 2:
 * Input: lists = []
 * Output: []
 * <p>
 * Example 3:
 * Input: lists = [[]]
 * Output: []
 * <p>
 * Constraints:
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 * <p>
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
class SolutionTest {
    private ListNode createList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private boolean listsEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    @Test
    public void testMergeKLists_EmptyArray() {
        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(new ListNode[0]);
        assertNull(result);
    }

    @Test
    public void testMergeKLists_ArrayWithNulls() {
        Solution solution = new Solution();
        ListNode[] lists = new ListNode[]{null, null, null};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void testMergeKLists_SingleList() {
        Solution solution = new Solution();
        ListNode[] lists = {createList(new int[]{1, 2, 3})};
        ListNode expected = createList(new int[]{1, 2, 3});
        assertTrue(listsEqual(expected, solution.mergeKLists(lists)));
    }

    @Test
    public void testMergeKLists_TwoLists() {
        Solution solution = new Solution();
        ListNode[] lists = {
                createList(new int[]{1, 4, 5}),
                createList(new int[]{1, 3, 4})
        };
        ListNode expected = createList(new int[]{1, 1, 3, 4, 4, 5});
        assertTrue(listsEqual(expected, solution.mergeKLists(lists)));
    }

    @Test
    public void testMergeKLists_ThreeLists() {
        Solution solution = new Solution();
        ListNode[] lists = {
                createList(new int[]{1, 4, 5}),
                createList(new int[]{1, 3, 4}),
                createList(new int[]{2, 6})
        };
        ListNode expected = createList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertTrue(listsEqual(expected, solution.mergeKLists(lists)));
    }

    @Test
    public void testMergeKLists_MixedWithEmptyLists() {
        Solution solution = new Solution();
        ListNode[] lists = {
                createList(new int[]{2}),
                null,
                createList(new int[]{1})
        };
        ListNode expected = createList(new int[]{1, 2});
        assertTrue(listsEqual(expected, solution.mergeKLists(lists)));
    }

    @Test
    public void testMergeKLists_AllEmptyLists() {
        Solution solution = new Solution();
        ListNode[] lists = {null, null};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }
}