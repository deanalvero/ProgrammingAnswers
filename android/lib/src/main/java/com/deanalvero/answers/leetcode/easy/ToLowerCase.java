package com.deanalvero.answers.leetcode.easy;

public class ToLowerCase {
    public String toLowerCase(String str) {
        char[] result = str.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 65 && result[i] <= 90) {
                result[i] += 32;
            }
        }

        return new String(result);

    }
}
