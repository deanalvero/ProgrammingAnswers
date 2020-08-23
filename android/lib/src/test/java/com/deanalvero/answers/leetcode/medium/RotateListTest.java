package com.deanalvero.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RotateListTest {
    private RotateList testee;

    @Before
    public void setUp() {
        testee = new RotateList();
    }

    @Test
    public void rotateRight_inputExampleOne_returnCorrectOutput() {
        RotateList.ListNode actual = testee.rotateRight(
                new RotateList.ListNode(
                        1,
                        new RotateList.ListNode(
                                2,
                                new RotateList.ListNode(
                                        3,
                                        new RotateList.ListNode(
                                                4,
                                                new RotateList.ListNode(
                                                        5,
                                                        null
                                                )
                                        )
                                )
                        )
                ),
                2
        );

        assertEquals(4, actual.val);
        assertEquals(5, actual.next.val);
        assertEquals(1, actual.next.next.val);
        assertEquals(2, actual.next.next.next.val);
        assertEquals(3, actual.next.next.next.next.val);
        assertNull(actual.next.next.next.next.next);
    }

    @Test
    public void rotateRight_inputExampleTwo_returnCorrectOutput() {
        RotateList.ListNode actual = testee.rotateRight(
                new RotateList.ListNode(
                        0,
                        new RotateList.ListNode(
                                1,
                                new RotateList.ListNode(
                                        2,
                                        null
                                )
                        )
                ),
                4
        );

        assertEquals(2, actual.val);
        assertEquals(0, actual.next.val);
        assertEquals(1, actual.next.next.val);
        assertNull(actual.next.next.next);
    }

}
