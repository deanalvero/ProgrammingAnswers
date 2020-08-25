package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NRepeatedElementInSize2NArrayTest {
    private NRepeatedElementInSize2NArray testee;

    @Before
    public void setUp() {
        testee = new NRepeatedElementInSize2NArray();
    }

    @Test
    public void repeatedNTimes_inputExampleOne_returnCorrectOutput() {
        int expected = 3;
        int actual = testee.repeatedNTimes(
                new int[]{1,2,3,3}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void repeatedNTimes_inputExampleTwo_returnCorrectOutput() {
        int expected = 2;
        int actual = testee.repeatedNTimes(
                new int[]{2,1,2,5,3,2}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void repeatedNTimes_inputExampleThree_returnCorrectOutput() {
        int expected = 5;
        int actual = testee.repeatedNTimes(
                new int[]{5,1,5,2,5,3,5,4}
        );
        assertEquals(expected, actual);
    }
}
