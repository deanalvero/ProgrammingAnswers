package com.deanalvero.answers.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ReorganizeString {
    public String reorganizeString(String S) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        char letter = ' ';

        for (char c: S.toCharArray()) {
            int value = 0;
            if (map.containsKey(c)) {
                value = map.get(c);
            }

            value++;
            map.put(c, value);

            if (value > max) {
                letter = c;
                max = value;
            }
        }

        if (max > (S.length() + 1) / 2) {
            return "";
        }

        int index = 0;
        char[] result = new char[S.length()];
        while (max != 0) {
            result[index] = letter;
            index += 2;
            max--;
        }

        for (Character key: map.keySet()) {
            if (key == letter) {
                continue;
            }

            for (int i = 0; i < map.get(key); i++) {
                if (index > S.length() - 1) {
                    index = 1;
                }
                result[index] = key;
                index += 2;
            }
        }
        return new String(result);
    }
}
