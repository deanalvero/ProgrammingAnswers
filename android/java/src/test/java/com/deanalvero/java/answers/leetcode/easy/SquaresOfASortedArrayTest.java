package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquaresOfASortedArrayTest {
    private SquaresOfASortedArray testee;

    @Before
    public void setUp() {
        testee = new SquaresOfASortedArray();
    }


    @Test
    public void sortedSquares_inputExampleOne_returnCorrectOutput() {
        int[] expected = {0,1,9,16,100};

        int[] actual = testee.sortedSquares(
                new int[]{-4,-1,0,3,10}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }

    @Test
    public void sortedSquares_inputExampleTwo_returnCorrectOutput() {
        int[] expected = {4,9,9,49,121};

        int[] actual = testee.sortedSquares(
                new int[]{-7,-3,2,3,11}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }

}
