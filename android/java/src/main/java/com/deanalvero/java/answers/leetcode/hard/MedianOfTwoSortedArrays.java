package com.deanalvero.java.answers.leetcode.hard;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int mid1 = 0;
        int mid2 = 0;

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i <= length/2; i++) {
            mid1 = mid2;
            if (i2 == nums2.length) {
                mid2 = nums1[i1];
                i1++;
            } else if (i1 == nums1.length) {
                mid2 = nums2[i2];
                i2++;
            } else if (nums1[i1] > nums2[i2]) {
                mid2 = nums2[i2];
                i2++;
            } else {
                mid2 = nums1[i1];
                i1++;
            }
        }

        if (length % 2 == 0) {
            return (mid1 + mid2) / 2.0;
        } else {
            return (double) mid2;
        }
    }

}
