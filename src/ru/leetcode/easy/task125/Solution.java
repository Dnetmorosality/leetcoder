package ru.leetcode.easy.task125;

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String slc = s.toLowerCase();
        while (left <= right) {
            int lchar = slc.charAt(left) - 'a';
            int lnum = slc.charAt(left) - '0';
            if ((lchar < 0 || lchar > 26) && (lnum < 0 || lnum > 9)) {
                left++;
                continue;
            }

            int rchar = slc.charAt(right) - 'a';
            int rnum = slc.charAt(right) - '0';
            if ((rchar < 0 || rchar > 26) && (rnum < 0 || rnum > 9)) {
                right--;
                continue;
            }

            if (slc.charAt(left) != slc.charAt(right)) return false;
            left++;
            right--;
            System.out.println(slc.charAt(left));
        }
        return true;
    }
}
