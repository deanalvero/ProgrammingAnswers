package com.deanalvero.answers.leetcode.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(length-1-i);

            int cValue = getValue(c);
            int pValue = 0;
            if (i != 0) {
                pValue = getValue(
                        s.charAt(length-i)
                );
            }
            if (cValue < pValue) {
                result -= cValue;
            } else {
                result += cValue;
            }
        }
        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
