package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    private ToLowerCase testee;

    @Before
    public void setUp() {
        testee = new ToLowerCase();
    }

    @Test
    public void toLowerCase_defaultInput_returnCorrectOutput() {
        String expected = "hello";

        String actual = testee.toLowerCase("Hello");

        assertEquals(
                expected,
                actual
        );
    }
}
