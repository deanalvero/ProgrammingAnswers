package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {
    private JewelsAndStones testee;

    @Before
    public void setUp() {
        testee = new JewelsAndStones();
    }

    @Test
    public void numJewelsInStones_defaultInput_returnCorrectOutput() {
        int expected = 3;

        int actual = testee.numJewelsInStones(
                "aA",
                "aAAbbbb"
        );
        assertEquals(expected, actual);
    }
}
