package ru.leetcode.medium.task763;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.

 Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

 Return a list of integers representing the size of these parts.

 Example 1:

 Input: s = "ababcbacadefegdehijhklij"
 Output: [9,7,8]
 Explanation:
 The partition is "ababcbaca", "defegde", "hijhklij".
 This is a partition so that each letter appears in at most one part.
 A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 Example 2:

 Input: s = "eccbbbbdec"
 Output: [10]


 Constraints:

 1 <= s.length <= 500
 s consists of lowercase English letters.

 https://leetcode.com/problems/partition-labels/description/
 */

class SolutionTest {
    @Test
    public void testCornerCase() {
        Solution solution = new Solution();
        String s = "a";
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.partitionLabels(s);
        assertEquals(expected, actual);

        String s2 = "aa";
        List<Integer> expected2 = List.of(2);
        List<Integer> actual2 = solution.partitionLabels(s2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testLeetcodeCase() {
        Solution solution = new Solution();
        String s1 = "ababcbacadefegdehijhklij";
        List<Integer> expected1 = List.of(9, 7, 8);
        List<Integer> actual1 = solution.partitionLabels(s1);
        assertEquals(expected1, actual1);

        String s2 = "eccbbbbdec";
        List<Integer> expected2 = List.of(10);
        List<Integer> actual2 = solution.partitionLabels(s2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        String s = "caedbdedda";
        List<Integer> expected = List.of(1, 9);
        List<Integer> actual = solution.partitionLabels(s);
        assertEquals(expected, actual);
    }
}