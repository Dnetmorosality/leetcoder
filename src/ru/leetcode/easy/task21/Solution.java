package ru.leetcode.easy.task21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        return mergeTwoListsHelper(list1, list2);
    }

    public ListNode mergeTwoListsHelper(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        if (list1 == null && list2 == null) return node;
        if (list1 == null) {
            node.val = list2.val;
            node.next = list2.next;
            return node;
        }
        if (list2 == null) {
            node.val = list1.val;
            node.next = list1.next;
            return node;
        }
        if (list1.val < list2.val) {
            node.val = list1.val;
            list1 = list1.next;
        } else {
            node.val = list2.val;
            list2 = list2.next;
        }
        node.next = mergeTwoListsHelper(list1, list2);
        return node;
    }
}

