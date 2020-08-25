package com.deanalvero.java.answers.leetcode.easy;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[i+n];
        }
        return result;
    }
}
