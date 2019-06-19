package com.deanalvero.answers.leetcode.easy;

public class FibonacciNumber {
    public int fib(int N) {
//        return fibA(N);
        return fibB(N);
    }

    public int fibA(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fibA(N-1) + fibA(N-2);
        }
    }

    //  for fibB(int N)
    private int[] storage = new int[31];

    public int fibB(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            if (storage[N] == 0) {
                storage[N] = fibB(N-1) + fibB(N-2);
            }
            return storage[N];
        }
    }
}
