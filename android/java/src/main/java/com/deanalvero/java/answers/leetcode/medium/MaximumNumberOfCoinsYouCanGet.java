package com.deanalvero.java.answers.leetcode.medium;

import java.util.Arrays;

/**
 * Maximum Number of Coins You Can Get
 */
public class MaximumNumberOfCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        int result = 0;
        int n = piles.length;
        Arrays.sort(piles);
        for (int i = n - 2; i >= n/3; i-=2) {
            result += piles[i];
        }
        return result;
    }
}
