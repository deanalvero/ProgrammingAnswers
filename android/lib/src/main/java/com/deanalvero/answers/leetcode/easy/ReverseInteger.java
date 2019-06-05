package com.deanalvero.answers.leetcode.easy;

public class ReverseInteger {

    public int reverse(int x) {
//        return reverseA(x);
        return reverseB(x);
    }

    public int reverseA(int x) {
        String input = String.valueOf(x);

        StringBuilder stringBuilder = new StringBuilder();
        if (x < 0) {
            stringBuilder.append("-");
        }

        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(length-1-i);
            if (c != '-') {
                stringBuilder.append(c);
            }
        }

        int result = 0;
        try {
            result = Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException ignored) {

        }

        return result;
    }

    public int reverseB(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10
                    || result < Integer.MIN_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && digit > 7)
                    || (result == Integer.MIN_VALUE / 10 && digit < -8)

            ) {

                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }

}
