package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RobotReturnToOriginTest {

    private RobotReturnToOrigin testee;

    @Before
    public void setUp() {
        testee = new RobotReturnToOrigin();
    }

    @Test
    public void judgeCircle_inputExampleOne_returnCorrectOutput() {
        boolean actual = testee.judgeCircle("UD");

        assertTrue(
                actual
        );
    }

    @Test
    public void judgeCircle_inputExampleTwo_returnCorrectOutput() {
        boolean actual = testee.judgeCircle("LL");

        assertFalse(
                actual
        );
    }
}
