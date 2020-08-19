package com.deanalvero.answers.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubrectangleQueriesTest {

    private SubrectangleQueries testee;

    @Test
    public void test_inputExampleOne_returnCorrectOutput() {
        testee = new SubrectangleQueries(
                new int[][] {
                        new int[]{1,2,1},
                        new int[]{4,3,4},
                        new int[]{3,2,1},
                        new int[]{1,1,1}
                }
        );
        // The initial rectangle (4x3) looks like:
        // 1 2 1
        // 4 3 4
        // 3 2 1
        // 1 1 1

        assertEquals(1, testee.getValue(0, 2));
        testee.updateSubrectangle(0, 0, 3, 2, 5);
        // After this update the rectangle looks like:
        // 5 5 5
        // 5 5 5
        // 5 5 5
        // 5 5 5

        assertEquals(5, testee.getValue(0, 2));
        assertEquals(5, testee.getValue(3, 1));
        testee.updateSubrectangle(3, 0, 3, 2, 10);
        // After this update the rectangle looks like:
        // 5   5   5
        // 5   5   5
        // 5   5   5
        // 10  10  10

        assertEquals(10, testee.getValue(3, 1));
        assertEquals(5, testee.getValue(0, 2));
    }

    @Test
    public void test_inputExampleTwo_returnCorrectOutput() {
        testee = new SubrectangleQueries(
                new int[][] {
                        new int[]{1,1,1},
                        new int[]{2,2,2},
                        new int[]{3,3,3}
                }
        );

        assertEquals(1, testee.getValue(0, 0));
        testee.updateSubrectangle(0, 0, 2, 2, 100);
        assertEquals(100, testee.getValue(0, 0));
        assertEquals(100, testee.getValue(2, 2));
        testee.updateSubrectangle(1, 1, 2, 2, 20);
        assertEquals(20, testee.getValue(2, 2));
    }

}
