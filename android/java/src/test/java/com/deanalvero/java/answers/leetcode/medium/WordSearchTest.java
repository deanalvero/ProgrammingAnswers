package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

public class WordSearchTest {
    private WordSearch testee;

    @Before
    public void setUp() {
        testee = new WordSearch();
    }

    @Test
    public void exist_inputExampleOne_returnCorrectOutput() {
        boolean expected = true;
        testee.exist(
                new char[][] {
                        new char[] {'A','B','C','E'},
                        new char[] {'S','F','C','S'},
                        new char[] {'A','D','E','E'},
                },
                "ABCCED"
        );
    }

    @Test
    public void exist_inputExampleTwo_returnCorrectOutput() {
        boolean expected = true;
        testee.exist(
                new char[][] {
                        new char[] {'A','B','C','E'},
                        new char[] {'S','F','C','S'},
                        new char[] {'A','D','E','E'},
                },
                "SEE"
        );
    }

    @Test
    public void exist_inputExampleThree_returnCorrectOutput() {
        boolean expected = false;
        testee.exist(
                new char[][] {
                        new char[] {'A','B','C','E'},
                        new char[] {'S','F','C','S'},
                        new char[] {'A','D','E','E'},
                },
                "ABCB"
        );
    }
}
