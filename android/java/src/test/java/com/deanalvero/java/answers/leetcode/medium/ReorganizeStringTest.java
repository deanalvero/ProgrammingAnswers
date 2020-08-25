package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReorganizeStringTest {
    private ReorganizeString testee;

    @Before
    public void setUp() {
        testee = new ReorganizeString();
    }

    @Test
    public void reorganizeString_inputExampleOne_returnCorrectOutput() {
        String expected = "aba";
        String actual = testee.reorganizeString("aab");
        assertEquals(expected, actual);
    }

    @Test
    public void reorganizeString_inputExampleTwo_returnCorrectOutput() {
        String expected = "";
        String actual = testee.reorganizeString("aaab");
        assertEquals(expected, actual);
    }

}
