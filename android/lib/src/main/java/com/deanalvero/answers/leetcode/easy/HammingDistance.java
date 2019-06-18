package com.deanalvero.answers.leetcode.easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;

        int result = 0;

        while (z > 0) {
            result = result + (z & 1);
            z = z >> 1;
        }

        return result;
    }
}
