package com.deanalvero.java.answers.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseCodeWords {

    private static final String[] LETTERS = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        List<String> result = new ArrayList<>();

        for (String word: words) {
            char[] charArray = word.toCharArray();

            StringBuilder item = new StringBuilder();
            for (char charItem: charArray) {
                int index = charItem - 97;
                item.append(LETTERS[index]);
            }

            String itemString = item.toString();
            if (!result.contains(itemString)) {
                result.add(itemString);
            }
        }

        return result.size();
    }
}
