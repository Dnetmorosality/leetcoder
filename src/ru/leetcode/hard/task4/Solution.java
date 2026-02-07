package ru.leetcode.hard.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = getSimpleMergeList(nums1, nums2);
        if (merge.isEmpty()) {
            merge = getHardMergeList(nums1, nums2);
        }
        return getMedian(merge);
    }

    private static List<Integer> getSimpleMergeList(int[] arr1, int[] arr2) {
        List<Integer> merge = new ArrayList<>();
        if (arr1.length == 0) {
            merge.addAll(IntStream.of(arr2).boxed().toList());
        } else if (arr2.length == 0) {
            merge.addAll(IntStream.of(arr1).boxed().toList());
        } else {
            if (arr1[0] < arr2[0]) {
                if (arr1[arr1.length - 1] < arr2[0]) {
                    merge.addAll(IntStream.of(arr1).boxed().toList());
                    merge.addAll(IntStream.of(arr2).boxed().toList());
                } else {
                    return new ArrayList<>();
                }
            } else {
                if (arr2[arr2.length - 1] < arr1[0]) {
                    merge.addAll(IntStream.of(arr2).boxed().toList());
                    merge.addAll(IntStream.of(arr1).boxed().toList());
                } else {
                    return new ArrayList<>();
                }
            }
        }
        return merge;
    }

    private static List<Integer> getHardMergeList(int[] arr1, int[] arr2) {
        int idx1 = 0;
        int idx2 = 0;
        List<Integer> merge = new ArrayList<>();
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] < arr2[idx2]) {
                merge.add(arr1[idx1++]);
            } else {
                merge.add(arr2[idx2++]);
            }
        }
        if (idx1 < arr1.length) {
            merge.addAll(Arrays.stream(arr1, idx1, arr1.length).boxed().toList());
        }
        if (idx2 < arr2.length) {
            merge.addAll(Arrays.stream(arr2, idx2, arr2.length).boxed().toList());
        }
        return merge;
    }

    private static double getMedian(List<Integer> merge) {
        int size = merge.size();
        return size % 2 == 0 ? (double) (merge.get(size / 2) + merge.get(size / 2 - 1)) / 2 : (double) merge.get(size / 2);
    }
}
