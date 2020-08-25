package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class SortArrayByParityTest {
    private SortArrayByParity testee;

    @Before
    public void setUp() {
        testee = new SortArrayByParity();
    }

    @Test
    public void sortArrayByParity_defaultInput_returnCorrectOutput() {
        int[][] expected = {
                {4,2,3,1},
                {2,4,1,3},
                {4,2,1,3},
                {2,4,3,1}
        };

        int[] input = {3,1,2,4};

        int[] actual = testee.sortArrayByParity(input);

        boolean result = false;
        for (int i = 0; i < expected.length; i++) {
            if (Arrays.equals(actual, expected[i])) {
                result = true;
                break;
            }
        }

        assertTrue(result);
    }
}
