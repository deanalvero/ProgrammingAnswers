package com.deanalvero.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleIITest {

    private PascalsTriangleII testee;

    @Before
    public void setUp() {
        testee = new PascalsTriangleII();
    }

    @Test
    public void getRow_defaultInput_returnCorrectOutput() {
        int[] expected = new int[] {
                1, 3, 3, 1
        };

        List<Integer> actual = testee.getRow(3);

        assertEquals(4, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertEquals(
                    expected[i],
                    (int) actual.get(i)
            );
        }
    }
}
