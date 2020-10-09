package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxIncreaseToKeepCitySkylineTest {

    private MaxIncreaseToKeepCitySkyline testee;

    @Before
    public void setUp() {
        testee = new MaxIncreaseToKeepCitySkyline();
    }

    @Test
    public void maxIncreaseKeepingSkyline_defaultExample_returnCorrectOutput() {
        int expected = 35;
        int actual = testee.maxIncreaseKeepingSkyline(
                new int[][] {
                        new int[] {3,0,8,4},
                        new int[] {2,4,5,7},
                        new int[] {9,2,6,3},
                        new int[] {0,3,1,0}
                }
        );
        assertEquals(expected, actual);
    }
}
