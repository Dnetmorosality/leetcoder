package ru.leetcode.hard.task30;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
 * Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation:
 * The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
 * The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
 * <p>
 * Example 2:
 * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * Output: []
 * Explanation:
 * There is no concatenated substring.
 * <p>
 * Example 3:
 * Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * Output: [6,9,12]
 * Explanation:
 * The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"].
 * The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"].
 * The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"].
 * <p>
 * Constraints:
 * 1 <= s.length <= 104
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 30
 * s and words[i] consist of lowercase English letters.
 * <p>
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words/description
 */
public class SolutionTest {
    @Test
    public void leetcodeCase1() {
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};
        List<Integer> expected = List.of(0, 9);
        List<Integer> actual = solution.findSubstring(s, words);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase2() {
        Solution solution = new Solution();
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word", "good", "best", "word"};
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = solution.findSubstring(s, words);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase3() {
        Solution solution = new Solution();
        String s = "barfoofoobarthefoobarman";
        String[] words = new String[]{"bar", "foo", "the"};
        List<Integer> expected = List.of(6, 9, 12);
        List<Integer> actual = solution.findSubstring(s, words);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase4() {
        Solution solution = new Solution();
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word","good","best","good"};
        List<Integer> expected = List.of(8);
        List<Integer> actual = solution.findSubstring(s, words);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeCase5() {
        Solution solution = new Solution();
        String s = "aaa";
        String[] words = new String[]{"a","a"};
        List<Integer> expected = List.of(0,1);
        List<Integer> actual = solution.findSubstring(s, words);
        assertEquals(expected, actual);
    }
}