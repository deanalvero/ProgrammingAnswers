package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueMorseCodeWordsTest {
    private UniqueMorseCodeWords testee;

    @Before
    public void setUp() {
        testee = new UniqueMorseCodeWords();
    }

    @Test
    public void uniqueMorseRepresentations_defaultInput_returnCorrectOutput() {
        int expected = 2;

        int actual = testee.uniqueMorseRepresentations(new String[] {
                "gin", "zen", "gig", "msg"
        });

        assertEquals(
                expected,
                actual
        );
    }
}
