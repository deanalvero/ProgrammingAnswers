package com.deanalvero.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathSumTest {

    private MinimumPathSum testee;

    @Before
    public void setUp() {
        testee = new MinimumPathSum();
    }

    @Test
    public void minPathSum_defaultInput_returnCorrectOutput() {
        int expected = 7;
        int actual = testee.minPathSum(
                new int[][]{
                        new int[]{1, 3, 1},
                        new int[]{1, 5, 1},
                        new int[]{4, 2, 1}
                }
        );
        assertEquals(expected, actual);
    }
}
