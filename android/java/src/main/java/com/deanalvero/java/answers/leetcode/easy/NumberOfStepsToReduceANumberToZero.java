package com.deanalvero.java.answers.leetcode.easy;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps (int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            result++;
        }
        return result;
    }
}
