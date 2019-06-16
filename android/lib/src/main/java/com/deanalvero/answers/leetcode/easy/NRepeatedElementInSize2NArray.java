package com.deanalvero.answers.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int value = 0;
            int key = A[i];

            if (map.containsKey(key)) {
                value = map.get(key);
            }
            value++;
            map.put(key, value);

            if (value > 1) {
                return key;
            }
        }
        return -1;
    }
}
