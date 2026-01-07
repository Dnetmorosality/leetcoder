package ru.leetcode.hard.task23;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 *  * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 *  * Output: [1,1,2,3,4,4,5,6]
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node : lists) {
            while(node != null) {
                values.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(values);
        return createList(values);
    }

    private ListNode createList(List<Integer> values) {
        if (values == null || values.isEmpty()) return null;
        ListNode head = new ListNode(values.getFirst());
        ListNode current = head;
        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
        return head;
    }
}
