package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfGoodPairsTest {

    private NumberOfGoodPairs testee;

    @Before
    public void setUp() {
        testee = new NumberOfGoodPairs();
    }

    @Test
    public void numIdenticalPairs_inputExampleOne_returnCorrectOutput() {
        int expected = 4;
        int actual = testee.numIdenticalPairs(
                new int[] {1,2,3,1,1,3}
        );
        assertEquals(
                expected,
                actual
        );
    }

    @Test
    public void numIdenticalPairs_inputExampleTwo_returnCorrectOutput() {
        int expected = 6;
        int actual = testee.numIdenticalPairs(
                new int[] {1,1,1,1}
        );
        assertEquals(
                expected,
                actual
        );
    }

    @Test
    public void numIdenticalPairs_inputExampleThree_returnCorrectOutput() {
        int expected = 0;
        int actual = testee.numIdenticalPairs(
                new int[] {1,2,3}
        );
        assertEquals(
                expected,
                actual
        );
    }
}
