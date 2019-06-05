package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueCharacterInAStringTest {
    private FirstUniqueCharacterInAString testee;

    @Before
    public void setUp() {
        testee = new FirstUniqueCharacterInAString();
    }

    @Test
    public void firstUniqChar_defaultInput_returnCorrectOutput() {
        int expected = 0;

        int actual = testee.firstUniqChar(
                "leetcode"
        );

        assertEquals(
                expected,
                actual
        );
    }
}
