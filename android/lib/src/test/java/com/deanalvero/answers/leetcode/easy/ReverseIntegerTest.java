package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    private ReverseInteger testee;

    @Before
    public void setUp() {
        testee = new ReverseInteger();
    }

    @Test
    public void reverse_defaultInput_returnCorrectOutput() {
        int expected = 321;

        int actual = testee.reverse(123);

        assertEquals(
                expected,
                actual
        );
    }

}
