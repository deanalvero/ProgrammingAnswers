package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefangingAnIPAddressTest {

    private DefangingAnIPAddress testee;

    @Before
    public void setUp() {
        testee = new DefangingAnIPAddress();
    }

    @Test
    public void defangIPaddr_inputExampleOne_returnCorrectOutput() {
        String expected = "1[.]1[.]1[.]1";
        String actual = testee.defangIPaddr(
                "1.1.1.1"
        );
        assertEquals(expected, actual);
    }

    @Test
    public void defangIPaddr_inputExampleTwo_returnCorrectOutput() {
        String expected = "255[.]100[.]50[.]0";
        String actual = testee.defangIPaddr(
                "255.100.50.0"
        );
        assertEquals(expected, actual);
    }

}
