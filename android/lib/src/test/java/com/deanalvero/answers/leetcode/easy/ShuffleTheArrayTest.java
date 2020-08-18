package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShuffleTheArrayTest {
    private ShuffleTheArray testee;

    @Before
    public void setUp() {
        testee = new ShuffleTheArray();
    }

    @Test
    public void shuffle_inputExampleOne_returnCorrectOutput() {
        int[] expected = {2,3,5,4,1,7};
        int[] actual = testee.shuffle(
                new int[] {2,5,1,3,4,7},
                3
        );
        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void shuffle_inputExampleTwo_returnCorrectOutput() {
        int[] expected = {1,4,2,3,3,2,4,1};
        int[] actual = testee.shuffle(
                new int[] {1,2,3,4,4,3,2,1},
                4
        );
        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void shuffle_inputExampleThree_returnCorrectOutput() {
        int[] expected = {1,2,1,2};
        int[] actual = testee.shuffle(
                new int[] {1,1,2,2},
                2
        );
        assertArrayEquals(
                expected,
                actual
        );
    }
}
