package com.deanalvero.java.answers.leetcode.medium;

import java.util.LinkedList;

/**
 * Queries on a Permutation With Key
 */
public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            list.add(i+1);
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = list.indexOf(queries[i]);
            result[i] = index;

            int item = list.remove(index);
            list.addFirst(item);

        }

        return result;
    }
}
