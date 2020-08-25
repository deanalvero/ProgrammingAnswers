package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class KidsWithTheGreatestNumberOfCandiesTest {

    private KidsWithTheGreatestNumberOfCandies testee;

    @Before
    public void setUp() {
        testee = new KidsWithTheGreatestNumberOfCandies();
    }

    @Test
    public void kidsWithCandies_inputExampleOne_returnCorrectOutput() {
        List<Boolean> expected = Arrays.asList(true,true,true,false,true);
        List<Boolean> actual = testee.kidsWithCandies(
                new int[] {2,3,5,1,3},
                3
        );

        assertEquals(
                expected,
                actual
        );
        assertNotSame(
                expected,
                actual
        );
    }

    @Test
    public void kidsWithCandies_inputExampleTwo_returnCorrectOutput() {
        List<Boolean> expected = Arrays.asList(true,false,false,false,false);
        List<Boolean> actual = testee.kidsWithCandies(
                new int[] {4,2,1,1,2},
                1
        );

        assertEquals(
                expected,
                actual
        );
        assertNotSame(
                expected,
                actual
        );
    }

    @Test
    public void kidsWithCandies_inputExampleThree_returnCorrectOutput() {
        List<Boolean> expected = Arrays.asList(true,false,true);
        List<Boolean> actual = testee.kidsWithCandies(
                new int[] {12,1,12},
                10
        );

        assertEquals(
                expected,
                actual
        );
        assertNotSame(
                expected,
                actual
        );
    }

}
