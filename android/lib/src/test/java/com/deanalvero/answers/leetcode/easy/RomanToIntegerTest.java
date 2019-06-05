package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private RomanToInteger testee;

    @Before
    public void setUp() {
        testee = new RomanToInteger();
    }

    @Test
    public void romanToInt_defaultInput_returnCorrectOutput() {
        int expected = 4;

        int actual = testee.romanToInt("IV");

        assertEquals(
                expected,
                actual
        );
    }

}
