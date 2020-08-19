package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleStringTest {

    private ShuffleString testee;

    @Before
    public void setUp() {
        testee = new ShuffleString();
    }

    @Test
    public void restoreString_inputExampleOne_returnCorrectOutput() {
        String expected = "leetcode";
        String actual = testee.restoreString(
            "codeleet",
            new int[] {4,5,6,7,0,2,1,3}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void restoreString_inputExampleTwo_returnCorrectOutput() {
        String expected = "abc";
        String actual = testee.restoreString(
                "abc",
                new int[] {0,1,2}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void restoreString_inputExampleThree_returnCorrectOutput() {
        String expected = "nihao";
        String actual = testee.restoreString(
                "aiohn",
                new int[] {3,1,4,2,0}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void restoreString_inputExampleFour_returnCorrectOutput() {
        String expected = "arigatou";
        String actual = testee.restoreString(
                "aaiougrt",
                new int[] {4,0,2,6,7,3,1,5}
        );
        assertEquals(expected, actual);
    }

    @Test
    public void restoreString_inputExampleFive_returnCorrectOutput() {
        String expected = "rat";
        String actual = testee.restoreString(
                "art",
                new int[] {1,0,2}
        );
        assertEquals(expected, actual);
    }
}
