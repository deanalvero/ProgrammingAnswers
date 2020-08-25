package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTest {

    private NumberOfStepsToReduceANumberToZero testee;

    @Before
    public void setUp() {
        testee = new NumberOfStepsToReduceANumberToZero();
    }

    @Test
    public void numberOfSteps_inputExampleOne_returnCorrectOutput() {
        int expected = 6;
        int actual = testee.numberOfSteps(14);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfSteps_inputExampleTwo_returnCorrectOutput() {
        int expected = 4;
        int actual = testee.numberOfSteps(8);
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfSteps_inputExampleThree_returnCorrectOutput() {
        int expected = 12;
        int actual = testee.numberOfSteps(123);
        assertEquals(expected, actual);
    }
}
