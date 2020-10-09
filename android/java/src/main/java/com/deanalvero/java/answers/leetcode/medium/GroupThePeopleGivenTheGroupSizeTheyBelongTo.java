package com.deanalvero.java.answers.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group the People Given the Group Size They Belong To
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = map.computeIfAbsent(groupSizes[i], l -> new ArrayList<>());
            list.add(i);

            if (list.size() == groupSizes[i]) {
                result.add(list);
                map.remove(groupSizes[i]);
            }
        }
        return result;
    }
}
