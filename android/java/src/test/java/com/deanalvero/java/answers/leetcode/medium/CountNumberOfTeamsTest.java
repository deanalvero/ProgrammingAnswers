package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumberOfTeamsTest {
    private CountNumberOfTeams testee;

    @Before
    public void setUp() {
        testee = new CountNumberOfTeams();
    }

    @Test
    public void numTeams_inputExampleOne_returnCorrectOutput() {
        int expected = 3;
        int actual = testee.numTeams(new int[] {
                2,5,3,4,1
        });
        assertEquals(expected, actual);
    }

    @Test
    public void numTeams_inputExampleTwo_returnCorrectOutput() {
        int expected = 0;
        int actual = testee.numTeams(new int[] {
                2,1,3
        });
        assertEquals(expected, actual);
    }

    @Test
    public void numTeams_inputExampleThree_returnCorrectOutput() {
        int expected = 4;
        int actual = testee.numTeams(new int[] {
                1,2,3,4
        });
        assertEquals(expected, actual);
    }
}
