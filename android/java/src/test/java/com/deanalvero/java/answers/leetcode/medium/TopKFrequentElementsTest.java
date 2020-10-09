package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {
    private TopKFrequentElements testee;

    @Before
    public void setUp() {
        testee = new TopKFrequentElements();
    }

    @Test
    public void topKFrequent_inputExampleOne_returnCorrectOutput() {
        int[] expected = new int[] {1, 2};
        int[] actual = testee.topKFrequent(
                new int[] {1, 1, 1, 2, 2, 3},
                2
        );
        assertArrayEquals(expected, actual);
    }

    @Test
    public void topKFrequent_inputExampleTwo_returnCorrectOutput() {
        int[] expected = new int[] {1};
        int[] actual = testee.topKFrequent(
                new int[] {1},
                1
        );
        assertArrayEquals(expected, actual);
    }
}
