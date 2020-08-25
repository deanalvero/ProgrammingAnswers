package com.deanalvero.java.answers.leetcode.easy;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {

                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }
}
