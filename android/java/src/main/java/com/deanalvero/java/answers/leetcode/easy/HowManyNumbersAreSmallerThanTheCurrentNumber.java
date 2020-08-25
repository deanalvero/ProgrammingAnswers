package com.deanalvero.java.answers.leetcode.easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] store = new int[101];

        for (int num : nums) {
            store[num]++;
        }

        for (int i = 1; i < store.length; i++) {
            store[i] += store[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = store[nums[i] - 1];
            }
        }
        return result;
    }
}
