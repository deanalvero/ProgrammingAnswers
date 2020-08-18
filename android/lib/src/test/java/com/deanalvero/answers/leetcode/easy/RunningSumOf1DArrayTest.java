package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RunningSumOf1DArrayTest {
    private RunningSumOf1DArray testee;

    @Before
    public void setUp() {
        testee = new RunningSumOf1DArray();
    }

    @Test
    public void runningSum_inputExampleOne_returnCorrectOutput() {
        int[] expected = {1,3,6,10};
        int[] actual = testee.runningSum(
                new int[] {1,2,3,4}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void runningSum_inputExampleTwo_returnCorrectOutput() {
        int[] expected = {1,2,3,4,5};
        int[] actual = testee.runningSum(
                new int[] {1,1,1,1,1}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }


    @Test
    public void runningSum_inputExampleThree_returnCorrectOutput() {
        int[] expected = {3,4,6,16,17};
        int[] actual = testee.runningSum(
                new int[] {3,1,2,10,1}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }
}
