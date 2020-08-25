package com.deanalvero.java.answers.leetcode.easy;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] result = new int[N + 1];

        int low = 0;
        int high = N;

        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case 'I':
                    result[i] = low++;
                    break;
                case 'D':
                    result[i] = high--;
                    break;
            }
        }
        result[N] = low;
        return result;
    }
}
