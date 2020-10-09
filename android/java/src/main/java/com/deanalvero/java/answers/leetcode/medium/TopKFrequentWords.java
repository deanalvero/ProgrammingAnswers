package com.deanalvero.java.answers.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Top K Frequent Words
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> count = new HashMap<>();
        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        Queue<String> queue = new PriorityQueue<>(
                (a, b) -> {
                    int aCount = count.get(a);
                    int bCount = count.get(b);

                    if (aCount == bCount) {
                        return a.compareTo(b);
                    } else {
                        return count.get(b) - count.get(a);
                    }
                }
        );

        queue.addAll(count.keySet());

        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
}
