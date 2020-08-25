package com.deanalvero.java.answers.leetcode.hard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays testee;

    @Before
    public void setUp() {
        testee = new MedianOfTwoSortedArrays();
    }

    @Test
    public void findMedianSortedArrays_inputExampleOne_returnCorrectOutput() {
        double expected = 2.00000;
        double actual = testee.findMedianSortedArrays(
                new int[] {1,3},
                new int[] {2}
        );
        assertEquals(
                expected,
                actual,
                0
        );
    }

    @Test
    public void findMedianSortedArrays_inputExampleTwo_returnCorrectOutput() {
        double expected = 2.50000;
        double actual = testee.findMedianSortedArrays(
                new int[] {1,2},
                new int[] {3,4}
        );
        assertEquals(
                expected,
                actual,
                0
        );
    }

    @Test
    public void findMedianSortedArrays_inputExampleThree_returnCorrectOutput() {
        double expected = 0.00000;
        double actual = testee.findMedianSortedArrays(
                new int[] {0,0},
                new int[] {0,0}
        );
        assertEquals(
                expected,
                actual,
                0
        );
    }

    @Test
    public void findMedianSortedArrays_inputExampleFour_returnCorrectOutput() {
        double expected = 1.00000;
        double actual = testee.findMedianSortedArrays(
                new int[] {},
                new int[] {1}
        );
        assertEquals(
                expected,
                actual,
                0
        );
    }

    @Test
    public void findMedianSortedArrays_inputExampleFive_returnCorrectOutput() {
        double expected = 2.00000;
        double actual = testee.findMedianSortedArrays(
                new int[] {2},
                new int[] {}
        );
        assertEquals(
                expected,
                actual,
                0
        );
    }
}
