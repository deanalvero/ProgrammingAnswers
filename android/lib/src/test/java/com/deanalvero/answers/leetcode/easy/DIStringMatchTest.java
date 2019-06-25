package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DIStringMatchTest {
    private DIStringMatch testee;

    @Before
    public void setUp() {
        testee = new DIStringMatch();
    }

    @Test
    public void diStringMatch_inputExampleOne_returnCorrectOutput() {
        int[] expected = {0,4,1,3,2};
        int[] actual = testee.diStringMatch(
                "IDID"
        );

        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void diStringMatch_inputExampleTwo_returnCorrectOutput() {
        int[] expected = {0,1,2,3};
        int[] actual = testee.diStringMatch(
                "III"
        );

        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void diStringMatch_inputExampleThree_returnCorrectOutput() {
        int[] expected = {3,2,0,1};
        int[] actual = testee.diStringMatch(
                "DDI"
        );

        assertArrayEquals(
                expected,
                actual
        );
    }
}
