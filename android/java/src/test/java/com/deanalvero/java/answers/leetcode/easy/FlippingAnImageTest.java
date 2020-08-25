package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FlippingAnImageTest {

    private FlippingAnImage testee;

    @Before
    public void setUp() {
        testee = new FlippingAnImage();
    }

    @Test
    public void flipAndInvertImage_defaultInput_returnCorrectOutput() {
        int[][] expected = {{1,0,0},{0,1,0},{1,1,1}};

        int[][] input = {{1,1,0},{1,0,1},{0,0,0}};

        int[][] actual = testee.flipAndInvertImage(input);

        assertArrayEquals(
                expected,
                actual
        );
    }
}
