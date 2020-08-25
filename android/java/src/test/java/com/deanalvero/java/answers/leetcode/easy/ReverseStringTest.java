package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    private ReverseString testee;

    @Before
    public void setUp() {
        testee = new ReverseString();
    }

    @Test
    public void reverseString_inputExampleOne_returnCorrectOutput() {
        char[] expected = new char[] {
                'o','l','l','e','h'
        };

        char[] actual = new char[] {
                'h','e','l','l','o'
        };
        testee.reverseString(
                actual
        );

        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void reverseString_inputExampleTwo_returnCorrectOutput() {
        char[] expected = new char[] {
                'h','a','n','n','a','H'
        };

        char[] actual = new char[] {
                'H','a','n','n','a','h'
        };
        testee.reverseString(
                actual
        );

        assertArrayEquals(
                expected,
                actual
        );
    }
}
