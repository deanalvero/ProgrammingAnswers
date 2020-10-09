package com.deanalvero.java.answers.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Top K Frequent Elements
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(
                (i1, i2) -> count.get(i2) - count.get(i1)
        );
        queue.addAll(count.keySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }
}
