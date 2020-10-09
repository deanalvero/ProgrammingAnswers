package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QueriesOnAPermutationWithKeyTest {
    private QueriesOnAPermutationWithKey testee;

    @Before
    public void setUp() {
        testee = new QueriesOnAPermutationWithKey();
    }

    @Test
    public void processQueries_inputExampleOne_returnCorrectOutput() {
        int[] expected = new int[] {2,1,2,1};
        int[] actual = testee.processQueries(
                new int[] {3,1,2,1},
                5
        );
        assertArrayEquals(expected, actual);
    }

    @Test
    public void processQueries_inputExampleTwo_returnCorrectOutput() {
        int[] expected = new int[] {3,1,2,0};
        int[] actual = testee.processQueries(
                new int[] {4,1,2,2},
                4
        );
        assertArrayEquals(expected, actual);
    }

    @Test
    public void processQueries_inputExampleThree_returnCorrectOutput() {
        int[] expected = new int[] {6,5,0,7,5};
        int[] actual = testee.processQueries(
                new int[] {7,5,5,8,3},
                8
        );
        assertArrayEquals(expected, actual);
    }
}
