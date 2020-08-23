package com.deanalvero.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseScheduleTest {

    private CourseSchedule testee;

    @Before
    public void setUp() {
        testee = new CourseSchedule();
    }

    @Test
    public void canFinish_inputExampleOne_returnCorrectOutput() {
        boolean expected = true;
        boolean actual = testee.canFinish(
                2,
                new int[][] {
                        new int[] {1,0}
                }
        );
        assertEquals(expected, actual);
    }

    @Test
    public void canFinish_inputExampleTwo_returnCorrectOutput() {
        boolean expected = false;
        boolean actual = testee.canFinish(
                2,
                new int[][] {
                        new int[] {1,0},
                        new int[] {0,1}
                }
        );
        assertEquals(expected, actual);
    }
    
}
