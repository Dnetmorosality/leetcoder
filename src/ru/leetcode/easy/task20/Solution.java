package ru.leetcode.easy.task20;

import java.util.LinkedList;

/**
 * @author rus.sadykov
 * 03.01.2026
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        LinkedList<Character> characters = new LinkedList<>();
        characters.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!characters.isEmpty()) {
                if (s.charAt(i) == ')' && characters.getLast() == '(') {
                    characters.removeLast();
                } else if (s.charAt(i) == ']' && characters.getLast() == '[') {
                    characters.removeLast();
                } else if (s.charAt(i) == '}' && characters.getLast() == '{') {
                    characters.removeLast();
                } else {
                    characters.add(s.charAt(i));
                }
            } else {
                characters.add(s.charAt(i));
            }
        }
        return characters.isEmpty();
    }
}
