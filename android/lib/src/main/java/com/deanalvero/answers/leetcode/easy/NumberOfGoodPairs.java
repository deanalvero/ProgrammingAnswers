package com.deanalvero.answers.leetcode.easy;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] store = new int[101];
        int result = 0;
        for (int num: nums) {
            result += store[num]++;
        }
        return result;
    }
}
