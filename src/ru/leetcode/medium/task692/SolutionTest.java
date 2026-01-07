package ru.leetcode.medium.task692;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 * <p>
 * Example 1:
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 * <p>
 * Example 2:
 * Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
 * Output: ["the","is","sunny","day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 * <p>
 * <p>
 * Constraints:
 * 1 <= words.length <= 500
 * 1 <= words[i].length <= 10
 * words[i] consists of lowercase English letters.
 * k is in the range [1, The number of unique words[i]]
 * <p>
 * https://leetcode.com/problems/top-k-frequent-words/description/
 */
class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> expected = List.of("i", "love");
        List<String> actual = solution.topKFrequent(words, k);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> expected = List.of("the", "is", "sunny", "day");
        List<String> actual = solution.topKFrequent(words, k);
        assertEquals(expected, actual);
    }
}