package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {
    private FibonacciNumber testee;

    @Before
    public void setUp() {
        testee = new FibonacciNumber();
    }

    @Test
    public void fib_inputExampleOne_returnCorrectOutput() {
        int expected = 1;
        int actual = testee.fib(2);

        assertEquals(
                expected,
                actual
        );
    }

    @Test
    public void fib_inputExampleTwo_returnCorrectOutput() {
        int expected = 2;
        int actual = testee.fib(3);

        assertEquals(
                expected,
                actual
        );
    }

    @Test
    public void fib_inputExampleThree_returnCorrectOutput() {
        int expected = 3;
        int actual = testee.fib(4);

        assertEquals(
                expected,
                actual
        );
    }
}
