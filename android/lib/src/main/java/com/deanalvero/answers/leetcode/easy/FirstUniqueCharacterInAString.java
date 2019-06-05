package com.deanalvero.answers.leetcode.easy;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            int index = ((int) s.charAt(i)) - 97;

            if (letters[index] == 0) {
                letters[index] = i + 1;
            } else if (letters[index] > 0) {
                letters[index] = -1;
            }
        }

        for (int letter: letters) {

            if (letter > 0) {
                if (result == -1
                        || letter - 1 < result) {
                    result = letter -1;
                }
            }
        }
        return result;
    }
}
