package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    private HammingDistance testee;

    @Before
    public void setUp() {
        testee = new HammingDistance();
    }

    @Test
    public void hammingDistance_defaultInput_returnCorrectOutput() {
        int expected = 2;
        int actual = testee.hammingDistance(1, 4);

        assertEquals(
                expected,
                actual
        );
    }
}
