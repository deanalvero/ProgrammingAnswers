package com.deanalvero.java.answers.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeSumOfBSTTest {

    private RangeSumOfBST testee;

    @Before
    public void setUp() {
        testee = new RangeSumOfBST();
    }

    @Test
    public void rangeSumBST_defaultInput_returnCorrectOutput() {
        int expected = 32;

        RangeSumOfBST.TreeNode tStart = new RangeSumOfBST.TreeNode(
                10
        );

        RangeSumOfBST.TreeNode tSLeft = new RangeSumOfBST.TreeNode(
                5
        );

        RangeSumOfBST.TreeNode tSRight = new RangeSumOfBST.TreeNode(
                15
        );

        RangeSumOfBST.TreeNode tSLLeft = new RangeSumOfBST.TreeNode(
                3
        );

        RangeSumOfBST.TreeNode tSLRight = new RangeSumOfBST.TreeNode(
                7
        );

        RangeSumOfBST.TreeNode tSRRight = new RangeSumOfBST.TreeNode(
                18
        );

        tStart.left = tSLeft;
        tStart.right = tSRight;

        tSLeft.left = tSLLeft;
        tSLeft.right = tSLRight;

        tSRight.left = null;
        tSRight.right = tSRRight;

        int actual = testee.rangeSumBST(
                tStart,
                7,
                15
        );

        assertEquals(expected, actual);
    }
}
