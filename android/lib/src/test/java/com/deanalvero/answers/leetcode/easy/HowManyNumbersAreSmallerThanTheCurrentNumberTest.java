package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    private HowManyNumbersAreSmallerThanTheCurrentNumber testee;

    @Before
    public void setUp() {
        testee = new HowManyNumbersAreSmallerThanTheCurrentNumber();
    }

    @Test
    public void smallerNumbersThanCurrent_inputExampleOne_returnCorrectOutput() {
        int[] expected = {4,0,1,1,3};
        int[] actual = testee.smallerNumbersThanCurrent(
                new int[] {8,1,2,2,3}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }


    @Test
    public void smallerNumbersThanCurrent_inputExampleTwo_returnCorrectOutput() {
        int[] expected = {2,1,0,3};
        int[] actual = testee.smallerNumbersThanCurrent(
                new int[] {6,5,4,8}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }


    @Test
    public void smallerNumbersThanCurrent_inputExampleThree_returnCorrectOutput() {
        int[] expected = {0,0,0,0};
        int[] actual = testee.smallerNumbersThanCurrent(
                new int[] {7,7,7,7}
        );
        assertArrayEquals(
                expected,
                actual
        );
    }
}
