package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    private IntegerToRoman testee;

    @Before
    public void setUp() {
        testee = new IntegerToRoman();
    }

    @Test
    public void intToRoman_inputExampleOne_returnCorrectOutput() {
        String expected = "III";
        String actual = testee.intToRoman(3);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_inputExampleTwo_returnCorrectOutput() {
        String expected = "IV";
        String actual = testee.intToRoman(4);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_inputExampleThree_returnCorrectOutput() {
        String expected = "IX";
        String actual = testee.intToRoman(9);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_inputExampleFour_returnCorrectOutput() {
        String expected = "LVIII";
        String actual = testee.intToRoman(58);
        assertEquals(expected, actual);
    }

    @Test
    public void intToRoman_inputExampleFive_returnCorrectOutput() {
        String expected = "MCMXCIV";
        String actual = testee.intToRoman(1994);
        assertEquals(expected, actual);
    }
}
