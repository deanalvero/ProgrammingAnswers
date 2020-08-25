package com.deanalvero.java.answers.leetcode.easy;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
//        return removeOuterParenthesesA(S);
        return removeOuterParenthesesB(S);
    }

    public String removeOuterParenthesesA(String S) {
        char[] charArray = S.toCharArray();

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c: charArray) {

            if (c == '(') {
                if (stack.size() > 0) {
                    result.append(c);
                }
                stack.add(c);
            } else if (c == ')') {
                stack.pop();

                if (stack.size() > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public String removeOuterParenthesesB(String S) {
        char[] charArray = S.toCharArray();

        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c: charArray) {

            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else if (c == ')') {
                count--;

                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
