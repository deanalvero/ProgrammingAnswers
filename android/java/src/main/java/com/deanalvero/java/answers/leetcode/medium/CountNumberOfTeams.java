package com.deanalvero.java.answers.leetcode.medium;

/**
 * Count Number of Teams
 */
public class CountNumberOfTeams {
    public int numTeams(int[] rating) {
        int result = 0;

        for (int i = 1; i < rating.length - 1; i++) {
            int preLess = 0;
            int preMore = 0;
            int posLess = 0;
            int posMore = 0;

            for (int j = 0; j < rating.length; j++) {
                if (i < j) {
                    if (rating[i] > rating[j]) {
                        posLess++;
                    } else {
                        posMore++;
                    }
                } else if (i > j) {
                    if (rating[i] > rating[j]) {
                        preLess++;
                    } else {
                        preMore++;
                    }
                }
            }
            result += preLess * posMore + preMore * posLess;
        }

        return result;
    }
}
