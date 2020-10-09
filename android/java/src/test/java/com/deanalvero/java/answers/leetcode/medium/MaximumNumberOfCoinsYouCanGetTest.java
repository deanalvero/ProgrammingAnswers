package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberOfCoinsYouCanGetTest {

    private MaximumNumberOfCoinsYouCanGet testee;

    @Before
    public void setUp() {
        testee = new MaximumNumberOfCoinsYouCanGet();
    }

    @Test
    public void maxCoins_inputExampleOne_returnCorrectOutput() {
        int expected = 9;
        int actual = testee.maxCoins(
                new int[] {2, 4, 1, 2, 7, 8}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void maxCoins_inputExampleTwo_returnCorrectOutput() {
        int expected = 4;
        int actual = testee.maxCoins(
                new int[] {2, 4, 5}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void maxCoins_inputExampleThree_returnCorrectOutput() {
        int expected = 18;
        int actual = testee.maxCoins(
                new int[] {9, 8, 7, 6, 5, 1, 2, 3, 4}
        );
        assertEquals(expected, actual);
    }
}
