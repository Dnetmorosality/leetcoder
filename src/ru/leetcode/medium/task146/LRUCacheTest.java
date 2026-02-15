package ru.leetcode.medium.task146;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {
    @Test
    public void leetcodeCase1() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        int expected1 = 1;
        int actual1 = lRUCache.get(1);
        assertEquals(expected1, actual1);
        lRUCache.put(3, 3);
        int expected2 = -1;
        int actual2 = lRUCache.get(2);
        assertEquals(expected2, actual2);
        lRUCache.put(4, 4);
        int expected3 = -1;
        int actual3 = lRUCache.get(1);
        assertEquals(expected3, actual3);
        int expected4 = 3;
        int actual4 = lRUCache.get(3);
        assertEquals(expected4, actual4);
        int expected5 = 4;
        int actual5 = lRUCache.get(4);
        assertEquals(expected5, actual5);
    }

}