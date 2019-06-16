package com.deanalvero.answers.leetcode.easy;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {

            int itemLength = A[i].length;
            for (int j = 0; j < (itemLength+1) / 2; j++) {
                int temp = A[i][j];
                A[i][j] = invert(A[i][itemLength - 1 - j]);
                A[i][itemLength - 1 - j] = invert(temp);
            }

        }
        return A;
    }

    private int invert(int value) {
        if (value == 0) {
            return 1;
        }
        return 0;
    }
}
