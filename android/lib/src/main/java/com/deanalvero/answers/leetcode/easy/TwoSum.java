package com.deanalvero.answers.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
//        return twoSumA(nums, target);
//        return twoSumB(nums, target);
        return twoSumC(nums, target);
    }

    public int[] twoSumA(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {
                            i,
                            j
                    };
                }
            }
        }
        return null;
    }

    public int[] twoSumB(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                int j = map.get(difference);
                if (i != j) {
                    return new int[] {
                            i,
                            j
                    };
                }
            }
        }
        return null;
    }

    public int[] twoSumC(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                int j = map.get(difference);
                if (i != j) {
                    return new int[] {
                            i,
                            j
                    };
                }
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
