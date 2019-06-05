package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TwoSumTest {

    private TwoSum testee;

    @Before
    public void setUp() {
        testee = new TwoSum();
    }

    @Test
    public void twoSum_defaultInput_returnCorrectOutput() {
        List<Integer> expected = Arrays.asList(
                0, 1
        );

        int[] actualArray = testee.twoSum(
                new int[] {
                        2, 7, 11, 15
                },
                9
        );

        List<Integer> actual = new ArrayList<>();
        for (int actualItem: actualArray) {
            actual.add(actualItem);
        }

        assertThat(
                actual,
                containsInAnyOrder(
                        expected.toArray()
                )
        );
    }
}
