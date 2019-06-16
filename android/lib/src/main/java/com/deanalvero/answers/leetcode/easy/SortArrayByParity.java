package com.deanalvero.answers.leetcode.easy;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int end = A.length;
        while (i < end) {
            if (A[i] % 2 == 0) {
                i++;
            } else {
                int temp = A[i];
                A[i] = A[end-1];
                A[end-1] = temp;
                end--;
            }
        }
        return A;
    }
}
